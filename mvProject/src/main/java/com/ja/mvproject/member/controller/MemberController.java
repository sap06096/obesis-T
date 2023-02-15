package com.ja.mvproject.member.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ja.mvproject.member.service.MemberService;
import com.ja.mvproject.vo.MemberVo;

@Controller
@RequestMapping("/member/*")
public class MemberController {

	@Autowired
	private MemberService memberservice;
	
	@RequestMapping("loginPage")
	public String loginPage() {
		
		return "member/loginPage";
	}
	
	@RequestMapping("registerPage")
	public String registerPage() {
		
		return "member/registerPage";
	}
	
	@RequestMapping("registerProcess")
	public String registerProcess(MemberVo memberVo) {
		
		System.out.println(memberVo.getMb_id());
		memberservice.insertMemberVo(memberVo);
		
		
		return "member/registerSuccessPage";
	}
	
	@RequestMapping("loginProcess")
	public String loginProcess(MemberVo memberVo, HttpSession session) {
		
		MemberVo sessionUserInfo = memberservice.login(memberVo);
		
		if(sessionUserInfo != null) {
			session.setAttribute("sessionUserInfo", sessionUserInfo);
			
			return "redirect:../board/mainPage";
			
		}else {
			return "member/loginFailPage";
		}
		
	}
}
