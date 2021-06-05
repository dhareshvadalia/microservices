package com.darvy.logistics.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class InventoryBean {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long photoid;
	private String category;
	private String owner;
	private String value;
	private String dimension;
}
