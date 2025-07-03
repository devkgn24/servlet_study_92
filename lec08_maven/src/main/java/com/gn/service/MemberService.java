package com.gn.service;

import com.gn.dao.MemberDao;
import com.gn.dto.Member;

public class MemberService {
	private MemberDao dao = new MemberDao();
	
	public int insertMember(String memberId, String memberPw) {
		Member param = new Member();
		param.setMemberId(memberId);
		param.setMemberPw(memberPw);
		
		int result = dao.insert(param);
		return result;
	}
	
	// 1. service : 바구니 옮겨담아서 dao 한테 전달하기
	// 2. dao : 인터페이스한테 db 연결 요청하기
	// 3. Mapper : mapper.xml한테 쿼리 호출하기
	// 4. xml : select * 쿼리 구성 + resultMap (memberResultMap)
	public Member selectMember(String id, String pw) {
		Member param = new Member();
		param.setMemberId(id);
		param.setMemberPw(pw);
		
		Member result = dao.selectMember(param);
		return result;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
