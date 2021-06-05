package com.darvy.logistics.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.darvy.logistics.entity.InventoryBean;

@Repository
public interface InventoryRepository extends JpaRepository<InventoryBean, Long>{

	InventoryBean findByPhotoid(long photoid);
	List<InventoryBean> findByCategory(String category);

	
	
}
