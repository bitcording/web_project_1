package com.web1.mapper;

import com.web1.model.MemberVO;

public interface MemberMapper {
	
	//회원등록 insert쿼리를 실행시켜 줄 메서드
	public void memberJoin(MemberVO member);

	public int idCheck(String id);

}
