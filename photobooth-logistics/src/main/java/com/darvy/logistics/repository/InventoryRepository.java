package com.darvy.logistics.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.darvy.logistics.entity.InventoryBean;

@Repository
public interface InventoryRepository extends JpaRepository<InventoryBean, Long>{

	InventoryBean findByPhotoid(Long photoid);

	
	
}
