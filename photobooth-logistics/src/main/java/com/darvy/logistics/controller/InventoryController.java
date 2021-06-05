package com.darvy.logistics.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.darvy.logistics.entity.InventoryBean;
import com.darvy.logistics.service.InventoryService;

@RestController
@RequestMapping("/logistic")
public class InventoryController {
	
	@Autowired
	private InventoryService inventoryServ;
	
	@PostMapping("/")
	public InventoryBean addPhototoInventory(@RequestBody InventoryBean photobean) {
		return inventoryServ.savePhoto(photobean);
	}
	
	@GetMapping("/photo/{id}")
	public InventoryBean getFromInvetoryByID(@PathVariable("id") long photoid) {
		return inventoryServ.getPhotoByID(photoid);
	}
	
	@GetMapping("/member/{memberid}")
	public InventoryBean getFromInvetoryByCategory(@PathVariable("memberid") long member) {
		return inventoryServ.getPhotoByMemberID(member);
	}
}
