package com.darvy.members.models;

import com.darvy.members.entity.MemberBean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ResponseBean {

	private MemberBean member;
	private InventoryBean inventory;
	
	public MemberBean getMember() {
		return member;
	}
	public void setMember(MemberBean member) {
		this.member = member;
	}
	public InventoryBean getInventory() {
		return inventory;
	}
	public void setInventory(InventoryBean inventory) {
		this.inventory = inventory;
	}
}
