package com.gn.board.service;

import static com.gn.common.SessionTemplate.getSqlSession;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.gn.board.dao.BoardDao;
import com.gn.board.vo.Board;

public class BoardService {
	
	public int deleteBoard(int boardNo) {
		SqlSession session = getSqlSession();
		int result = new BoardDao().deleteBoard(session, boardNo);
		session.close();
		return result;
	}
	
	public List<Board> selectBoardList(Board option){
		SqlSession session = getSqlSession();
		List<Board> resultList = new BoardDao().selectBoardList(session,option);
		session.close();
		return resultList;
	}
	
	public int selectBoardCount(Board option) {
		SqlSession session = getSqlSession();
		int count = new BoardDao().selectBoardCount(session,option);
		session.close();
		return count;
	}
	
	public Board selectBoardOne(int boardNo) {
		SqlSession session = getSqlSession();
		Board detail = new BoardDao().selectBoardOne(session,boardNo);
		session.close();
		return detail;
	}
	
	public int updateDetail(Board bd){
		SqlSession session = getSqlSession();
		int resultList = new BoardDao().updateDetail(session,bd);
		session.close();
		return resultList;
	}
	
	public int boardInsert(Board bd) {
		SqlSession session = getSqlSession();
		int resultList = new BoardDao().boardInsert(session,bd);
		session.close();
		return resultList;
	}
}
