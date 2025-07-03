package com.gn.dao;

import org.apache.ibatis.session.SqlSession;

import com.gn.common.sql.SqlSessionTemplate;
import com.gn.dto.Member;

public class MemberDao {
	public int insert(Member param) {
		SqlSession session = SqlSessionTemplate.getSqlSession(true);
		int result = session.insert("com.gn.mapper.MemberMapper.insertMember",param);
		session.close();
		return result;
	}
}
