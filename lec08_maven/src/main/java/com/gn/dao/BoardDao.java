package com.gn.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.gn.common.sql.SqlSessionTemplate;
import com.gn.dto.Attach;
import com.gn.dto.Board;

public class BoardDao {
	
	public List<Board> selectBoardList(Board param){
		SqlSession session = SqlSessionTemplate.getSqlSession(true);
		List<Board> list = session.selectList("com.gn.mapper.BoardMapper.selectBoardList",param);
		session.close();
		return list;
	}
	
	public int selectBoardCount(Board param) {
		SqlSession session = SqlSessionTemplate.getSqlSession(true);
		int count = session.selectOne("com.gn.mapper.BoardMapper.selectBoardCount",param);
		session.close();
		return count;
	}
	
	public int insertBoard(SqlSession session, Board board) {
		int result = session.insert("com.gn.mapper.BoardMapper.insertBoard",board);
		return result;
	}
	
	public int insertAttach(SqlSession session,Attach attach) {
		int result = session.insert("com.gn.mapper.BoardMapper.insertAttach",attach);
		return result;
	}
	
	public Board selectBoardOne(int boardNo) {
		SqlSession session = SqlSessionTemplate.getSqlSession(true);
		Board board = session.selectOne("com.gn.mapper.BoardMapper.selectBoardOne",boardNo);
		session.close();
		return board;
	}
	
	public Attach selectAttachByBoardNo(int boardNo) {
		SqlSession session = SqlSessionTemplate.getSqlSession(true);
		Attach attach = session.selectOne("com.gn.mapper.BoardMapper.selectAttachByBoardNo",boardNo);
		session.close();
		return attach;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
