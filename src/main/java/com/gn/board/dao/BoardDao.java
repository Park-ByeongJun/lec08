package com.gn.board.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.gn.board.vo.Board;

public class BoardDao {
	
	public List<Board> selectBoardList(SqlSession session, Board option){
		return session.selectList("boardMapper.selectBoardList", option);
	}
	
	public int selectBoardCount(SqlSession session , Board option) {
		return session.selectOne("boardMapper.selectBoardCount" , option);
	}
	
	public Board selectBoardOne(SqlSession session, int boardNo) {
		return session.selectOne("boardMapper.selectBoardOne", boardNo);
	}
	
	public int updateDetail(SqlSession session , Board option){
		return session.update("boardMapper.selectBoardUpdate", option);
	}
	
	public int deleteBoard(SqlSession session , int boardNo) {
		return session.delete("boardMapper.selectBoardDelete", boardNo);
	}
	
	public int boardInsert(SqlSession session , Board boardNo) {
		return session.insert("boardMapper.selectBoardInsert", boardNo);
	}
}
