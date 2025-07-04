package com.gn.service;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.gn.common.sql.SqlSessionTemplate;
import com.gn.dao.BoardDao;
import com.gn.dto.Attach;
import com.gn.dto.Board;

public class BoardService {
	private BoardDao boardDao = new BoardDao();
	
	public List<Board> selectBoardList(Board param){
		return boardDao.selectBoardList(param);
	}
	
	public int selectBoardCount(Board param) {
		return boardDao.selectBoardCount(param);
	}
	
	// 게시글 + 파일 트랜젝션 처리
	public int createBoardWithAttach(Board board, Attach attach) {
		SqlSession session = SqlSessionTemplate.getSqlSession(false);
		int result = 0;
		try {
			// 1. 게시글 등록
			result = boardDao.insertBoard(session,board);
			
			// 2. 파일 정보 등록
			if(attach != null && result > 0) {
				attach.setBoardNo(board.getBoardNo());
				result = boardDao.insertAttach(session,attach);
			}
			
			// 3. commit 또는 rollback
			if(result > 0) {
				session.commit();
			} else {
				session.rollback();
			}
		}catch(Exception e) {
			e.printStackTrace();
			session.rollback();
		}finally {
			session.close();
		}
		return result;
	}
	
	public Board selectBoardOne(int boardNo) {
		return boardDao.selectBoardOne(boardNo);
	}
	
	public Attach selectAttachByBoardNo(int boardNo) {
		return boardDao.selectAttachByBoardNo(boardNo);
	}
	
	
	
	
}
