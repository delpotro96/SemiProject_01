package com.example.demo.controller;

import javax.servlet.http.HttpSession;

import org.json.simple.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.demo.service.MemberService;
import com.example.demo.vo.MemberVO;

@Controller
public class MemberController {

    @Autowired
    MemberService memberService;

    @RequestMapping("/memberInsert")
    @ResponseBody
    public String memberInsert(MemberVO memberVO) {
        System.out.println("Try SignUp");

        if (memberVO.getId() == null || memberVO.getId().equals("") ||
                memberVO.getPw() == null || memberVO.getPw().equals("")
                || memberVO.getEmail() == null || memberVO.getEmail().equals("")) {

            return "<script>alert('입력한 정보를 확인하세요'); window.close();</script>";
        }
        try {
            memberService.memberInsert(memberVO);
            return "<script>alert('환영합니다'); window.close();</script>";
        } catch (DataAccessException e) {
            return "에러 발생";
        }
    }

    @RequestMapping("login")
    @ResponseBody
    public String login(HttpSession session, MemberVO memberVO) {
        System.out.println("Try login");
        session.setAttribute("memberVO", memberVO);
        JSONObject jo = new JSONObject();

        if (memberVO.getId() == null || memberVO.getId().equals("") ||
                memberVO.getPw() == null || memberVO.getPw().equals("")) {
            jo.put("msg", "입력한 정보를 확인하세요");
            return jo.toJSONString();
        }

        try {
            MemberVO vo = memberService.login(memberVO);
            if (vo != null) {
                session.setAttribute("memberVO", memberVO);
                jo.put("id", vo.getId());
            } else {
                jo.put("msg", "id와 pw를 확인하세요");
            }
        } catch (DataAccessException e) {
            jo.put("msg", e.getMessage());
        }

        return jo.toJSONString();
    }

    @RequestMapping("logout")
    @ResponseBody
    public String logout(HttpSession session) {
        System.out.println("Try logout");
        JSONObject jo = new JSONObject();
        try {
            session.invalidate();
            jo.put("msg", "ok");
        } catch (Exception e) {
            jo.put("msg", e.getMessage());
        }
        return jo.toJSONString();
    }


}
