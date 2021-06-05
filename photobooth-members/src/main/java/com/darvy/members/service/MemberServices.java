package com.darvy.members.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.darvy.members.entity.MemberBean;
import com.darvy.members.models.InventoryBean;
import com.darvy.members.models.ResponseBean;
import com.darvy.members.repository.MemberRepository;

@Service
public class MemberServices {
	
	@Autowired
	private MemberRepository memberRepos;
	@Autowired
	private RestTemplate restTemplate;

	public MemberBean addMember(MemberBean member) {
		// TODO Auto-generated method stub
		return memberRepos.save(member);
	}

	public ResponseBean getMemberByID(long memberid) {
		// TODO Auto-generated method stub
		ResponseBean response = new ResponseBean();
		MemberBean member = memberRepos.getByMemberid(memberid);
		InventoryBean inventory =  restTemplate.getForObject("http://localhost:9001/logistic/member/"+memberid, InventoryBean.class);
		
		response.setMember(member);
		response.setInventory(inventory);
		
		return response;
	}
}
