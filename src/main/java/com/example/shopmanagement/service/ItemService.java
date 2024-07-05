package com.example.shopmanagement.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.shopmanagement.model.Item;
import com.example.shopmanagement.repository.ItemRepository;

@Service
public class ItemService {
	
	
	@Autowired
	private ItemRepository itemRepository;

	public Item addItem(Item item) {
		return itemRepository.save(item);
		
	}

	
	public Item updateItem(Item item) {
	    Optional<Item> existingItem = itemRepository.findById(item.getId());
	    if (existingItem.isPresent()) {
	        Item updatedItem = existingItem.get();
	        updatedItem.setName(item.getName());
	        updatedItem.setPictureUrl(item.getPictureUrl());
	        updatedItem.setPurchaseQuantity(item.getPurchaseQuantity());
	        updatedItem.setCostPrice(item.getCostPrice());
	        updatedItem.setSellingPrice(item.getSellingPrice());
	        updatedItem.setRemainingQuantity(item.getRemainingQuantity());
	        return itemRepository.save(updatedItem); // Updates the existing item in the database
	    } else {
	        throw new RuntimeException("Item not found with id " + item.getId());
	    }
	}


	public void deleteItem(Long itemId) {
		Optional<Item> existingItem = itemRepository.findById(itemId);
		if(existingItem.isPresent()) {
			itemRepository.deleteById(itemId);
			
		}
		else {
			 throw new RuntimeException("Item not found with id " + itemId);
		}
	}


	public List<Item> getItemsByUser(Long userId) {
		return itemRepository.findByUserId(userId);
	}

	
	
	

}
