package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.BoardDAO;
import com.example.demo.paging.Criteria;
import com.example.demo.vo.BoardVO;

@Service
public class BoardService {

	@Autowired
	BoardDAO boardDAO;
	
	public void postBoard(BoardVO boardVO) {
		boardDAO.postBoard(boardVO);
	}
	public List<BoardVO> selectAllBoard() {
		return boardDAO.selectAllBoard();
	}
	public List<BoardVO> selectPageBoard(Criteria cri){
		return boardDAO.selectPageBoard(cri);
	}
}
