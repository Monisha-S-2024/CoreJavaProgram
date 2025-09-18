package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Item;
import com.example.demo.repository.ItemRepository;



@Service
public class ItemService {
	
	@Autowired
	public ItemRepository irepo;
	
	public Item addItem(Item item)
	{
		return irepo.save(item);
		
	}
	public List<Item>  getItem()
	{
		return irepo.findAll();
		
	}
	public void deleteItem(int id)
	{
		irepo.deleteById(id);
	}
	
	public Item updateItem(Item item)
	{
		Integer itemid=item.getItemid();
		Item item1=irepo.findById(itemid).get();
		item1.setIname(item.getIname());
		return irepo.save(item1);
	}
	
	}










