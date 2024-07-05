package com.example.shopmanagement.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.shopmanagement.model.Sale;
import com.example.shopmanagement.service.SaleService;

@RestController
@RequestMapping("/api/sales")
public class SaleController {

	
	@Autowired
	private SaleService saleService;
	
	
	@PostMapping
	public Sale addSale(@RequestBody Sale sale) {
		 return saleService.addSale(sale);
		
	}
	
	
	@GetMapping("/item/{itemId}")
    public List<Sale> getSalesByItem(@PathVariable Long itemId) {
        return saleService.getSalesByItem(itemId); // Calls the getSalesByItem method in the service layer
    }
	
}
