package com.darvy.members.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class InventoryBean {

	private String photoid;
	private String category;
	private String memberid;
	private String value;
	private String dimension;
	
}
