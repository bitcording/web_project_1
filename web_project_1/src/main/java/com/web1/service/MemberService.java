package com.web1.service;

import com.web1.model.MemberVO;

public interface MemberService {
	//회원가입
		public void memberJoin(MemberVO member) throws Exception;

	//아이디 중복검사
		public int idCheck(String id) throws Exception;
}
