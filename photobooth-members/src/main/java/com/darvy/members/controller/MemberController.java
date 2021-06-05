package com.darvy.members.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.darvy.members.entity.MemberBean;
import com.darvy.members.models.ResponseBean;
import com.darvy.members.service.MemberServices;

@RestController
@RequestMapping("/member")
public class MemberController {

	@Autowired
	private MemberServices memberServ;
	
	@PostMapping("/")
	public MemberBean addNewMember(@RequestBody MemberBean member) {
		
		return memberServ.addMember(member);	
	}
	
	@GetMapping("/{id}")
	public ResponseBean getMember(@PathVariable("id") long memberid) {
		
		return memberServ.getMemberByID(memberid);	
	}
	
}
