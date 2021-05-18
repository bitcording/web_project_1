package com.web1.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.web1.mapper.MemberMapper;
import com.web1.model.MemberVO;

@Service
public class MemberServiceImpl implements MemberService{

	@Autowired
	MemberMapper membermapper;

	@Override
	public void memberJoin(MemberVO member) throws Exception {
		
		membermapper.memberJoin(member);
	}

	@Override
	public int idCheck(String Id) throws Exception  {
		
		return membermapper.idCheck(Id);
	}
}
