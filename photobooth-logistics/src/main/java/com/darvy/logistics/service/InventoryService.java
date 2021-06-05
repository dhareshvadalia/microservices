package com.darvy.logistics.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.darvy.logistics.entity.InventoryBean;
import com.darvy.logistics.repository.InventoryRepository;

@Service
public class InventoryService {
	
	@Autowired
	private InventoryRepository inventoryRepos;

	public InventoryBean savePhoto(InventoryBean photobean) {
		// TODO Auto-generated method stub
		
		return inventoryRepos.save(photobean);
	}

	public InventoryBean getPhotoByID(long photoid) {
		// TODO Auto-generated method stub
		
		return inventoryRepos.findByPhotoid(photoid);
	}

	public InventoryBean getPhotoByMemberID(long member) {
		// TODO Auto-generated method stub
		return inventoryRepos.findByMemberid(member);
	}
	
}
