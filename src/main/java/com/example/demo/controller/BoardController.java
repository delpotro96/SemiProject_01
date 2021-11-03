package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.example.demo.paging.Criteria;
import com.example.demo.paging.PageMakerDTO;
import com.example.demo.service.BoardService;
import com.example.demo.vo.BoardVO;

@Controller
@RequestMapping("/board/*")
public class BoardController {

    @Autowired
    private BoardService boardService;

    /* 게시판 목록 all
     *
    @GetMapping("/list")
    public void boardListGet(Model model) {
        System.out.println("게시판 목록 진입");
        model.addAttribute("list", boardService.getList());
    }
    */
    @GetMapping("/list")
    public void boardListGet(Model model, Criteria cri) {
        System.out.println("게시판 목록 진입");
        model.addAttribute("list", boardService.getListPaging(cri));
        int total = boardService.getTotal();
        PageMakerDTO pageMakerDTO = new PageMakerDTO(cri, total);
        model.addAttribute("pageMakerDTO", pageMakerDTO);
    }

    @GetMapping("enroll")
    public void boardEnrollGet() {
        System.out.println("게시판 등록 진입");
    }

    /* 게시판 등록 */
    @PostMapping("/enroll")
    public String boardEnrollPost(BoardVO boardVO, RedirectAttributes rttr) {
        System.out.println("게시판 등록");
        if (boardVO.getTitle() != null && !boardVO.getTitle().equals("") &&
                boardVO.getContent() != null && !boardVO.getContent().equals("") &&
                boardVO.getWriter() != null && !boardVO.getWriter().equals("")) {
            rttr.addFlashAttribute("result", "enrol success");
            boardService.enroll(boardVO);
            return "redirect:/board/list";
        } else {
            rttr.addFlashAttribute("result", "enrol fail");
            return "redirect:/board/list";
        }
    }

    /* 게시판 조회 */
    @GetMapping("/get")
    public void boardGetPageGET(int bno, Model model) {
        model.addAttribute("pageInfo", boardService.getPage(bno));
    }
}
