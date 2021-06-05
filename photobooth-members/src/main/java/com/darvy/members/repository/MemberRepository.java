package com.darvy.members.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.darvy.members.entity.MemberBean;

@Repository
public interface MemberRepository extends JpaRepository<MemberBean, Long>{

	MemberBean getByMemberid(long memberid);

}
