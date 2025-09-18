package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Item;
import com.example.demo.service.ItemService;

@RestController
public class ItemController {
	
	@Autowired
	public ItemService iser;
	
	@PostMapping("/additem")
	public Item regItem(@RequestBody Item item)
	{
		return iser.addItem(item);
		
	}
	@GetMapping ("/getitem")
	public List<Item> getItem()
	{
		return iser.getItem();
	}
	
	@DeleteMapping("/deleteitem/{id}")
	public void deleteItem(@PathVariable Integer id)
	{
		iser.deleteItem(id);
	}
	
	@PostMapping("/updateitem")
	public Item updateItem(@RequestBody Item item)
	{
		return iser.updateItem(item);
	}
}




