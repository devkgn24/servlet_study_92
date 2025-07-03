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
}
