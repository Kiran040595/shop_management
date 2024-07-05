package com.example.shopmanagement.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.shopmanagement.model.Item;
import com.example.shopmanagement.service.ItemService;

@RestController
@RequestMapping("/api/items")

public class ItemController {
	
	@Autowired
	private ItemService itemService;
	
	@PostMapping
	public Item addItem(@RequestBody Item item) {
		return itemService.addItem(item);
	}
	
	@PutMapping
	public Item updateItem(@RequestBody Item item) {
		
		return itemService.updateItem(item);
		
	}
	
	@DeleteMapping("/{itemId}")
	public void deleteItem(@PathVariable Long itemId ) {
		itemService.deleteItem(itemId);
	}
	
	@GetMapping("/user/{userId}")
	public List<Item> getItemsByUser(@PathVariable Long userId){
		return itemService.getItemsByUser(userId);
		
	}
	
	

}
