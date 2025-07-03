package com.gn.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.gn.common.sql.SqlSessionTemplate;
import com.gn.dto.Attach;
import com.gn.dto.Board;

public class BoardDao {
	
	public List<Board> selectBoardList(){
		SqlSession session = SqlSessionTemplate.getSqlSession(true);
		List<Board> list = session.selectList("com.gn.mapper.BoardMapper.selectBoardList");
		session.close();
		return list;
	}
	
	public int insertBoard(SqlSession session, Board board) {
		int result = session.insert("com.gn.mapper.BoardMapper.insertBoard",board);
		return result;
	}
	
	public int insertAttach(SqlSession session,Attach attach) {
		int result = session.insert("com.gn.mapper.BoardMapper.insertAttach",attach);
		return result;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
