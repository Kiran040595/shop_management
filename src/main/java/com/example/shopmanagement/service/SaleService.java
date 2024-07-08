package com.example.shopmanagement.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.shopmanagement.model.Item;
import com.example.shopmanagement.model.Sale;
import com.example.shopmanagement.repository.ItemRepository;
import com.example.shopmanagement.repository.SaleRepository;

@Service
public class SaleService {
			
	
	@Autowired
	private SaleRepository saleRepository;
	@Autowired
	private ItemRepository itemRepository;
	
	public Sale addSale(Sale sale) {
		
		Optional<Item> existingItem = itemRepository.findById(sale.getItem().getId());
		
		
		if(existingItem.isPresent()) {
			Item item = existingItem.get();
			item.setRemainingQuantity(item.getRemainingQuantity()-sale.getQuantitySold());
			itemRepository.save(item);
			return	saleRepository.save(sale);
		}
		else {
	        throw new RuntimeException("Item not found with id " + sale.getItem().getId());

		}
		
		
		
	}
	
	public List<Sale> getSalesByItem(Long itemId) {
        return saleRepository.findByItemId(itemId); // Calls the findByItemId method in the repository layer
    }

}
