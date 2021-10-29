package com.example.demo.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.example.demo.paging.Criteria;
import com.example.demo.service.BoardService;
import com.example.demo.vo.BoardVO;

@Controller
@RequestMapping("/board/*")
public class BoardController {
	
	@Autowired
	BoardService boardService;

	private static final Logger log = LoggerFactory.getLogger(BoardController.class);
	
	//게시판
//	@GetMapping("/list")
//	public void boardList(Model model) {
//		log.info("게시판 목록 진입");
//		model.addAttribute("list", boardService.selectAllBoard());
//	}
	//페이징
	@GetMapping("/list")
	public void boardPagingList(Model model, Criteria cri) {
		log.info("게시판 페이징 진입");
		model.addAttribute("list", boardService.selectPageBoard(cri));
	}
	
	@GetMapping("/post")
	public void boardPost() {
		log.info("게시판 등록 페이지 진입");
	}
	
	//RedirectAttribute를 사용하여 redirect 시 alert가 뜨도록
	@PostMapping("/post")
	public String boardPostWithPost(BoardVO boardVO, RedirectAttributes rttr) {
		log.info("BoardVO : " + boardVO);
		
		if(boardVO.getTitle()!=null&&!boardVO.getTitle().equals("")&&
				boardVO.getContent()!=null&&!boardVO.getContent().equals("")&&
				boardVO.getName()!=null&&!boardVO.getName().equals("")) {
			rttr.addFlashAttribute("result", "post success");		
			boardService.postBoard(boardVO);
			return "redirect:/board/list";
		}else {
			rttr.addFlashAttribute("result", "post fail");
			return "redirect:/board/list";
		}
	}
}
