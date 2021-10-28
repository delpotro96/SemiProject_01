package com.example.demo.controller;

import javax.servlet.http.HttpSession;

import org.json.simple.JSONObject;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.demo.vo.MemberVO;

@Controller
public class MemberController {

	
	@RequestMapping("memberInsert")
	@ResponseBody
	public String memberInsert(MemberVO memberVO) {
		System.out.println("Try SignUp");
		return "<script>alert('환영합니다'); window.close();</script>";
	}
	
	@RequestMapping("login")
	@ResponseBody
	public String login(HttpSession session, MemberVO memberVO) {
		System.out.println("Try login");
		session.setAttribute("memberVO", memberVO);
		
		JSONObject jo = new JSONObject();
		jo.put("id", memberVO.getId());
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
		}catch(Exception e) {
			jo.put("msg", e.getMessage());
		}
		return jo.toJSONString();
	}
}
