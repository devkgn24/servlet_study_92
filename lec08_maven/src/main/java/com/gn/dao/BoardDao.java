package com.gn.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.gn.common.sql.SqlSessionTemplate;
import com.gn.dto.Board;

public class BoardDao {
	
	public List<Board> selectBoardList(){
		SqlSession session = SqlSessionTemplate.getSqlSession(true);
		List<Board> list = session.selectList("com.gn.mapper.BoardMapper.selectBoardList");
		session.close();
		return list;
	}
}
