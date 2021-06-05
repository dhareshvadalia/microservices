package com.darvy.members.entity;

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
public class MemberBean {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long memberid;
	private String name;
	private String membership_type;
	private int age;
	private String gender;
}
