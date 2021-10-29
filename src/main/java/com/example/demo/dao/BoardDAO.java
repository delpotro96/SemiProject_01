package com.example.demo.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import com.example.demo.paging.Criteria;
import com.example.demo.vo.BoardVO;

@Repository
@Mapper
public interface BoardDAO {
	public void postBoard(BoardVO boardVO);
	//게시판
	public List<BoardVO> selectAllBoard();
	
	//게시판 페이징
	public List<BoardVO> selectPageBoard(Criteria cri);
}
