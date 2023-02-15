package com.ja.mvproject.board.controller;

import java.util.ArrayList;
import java.util.HashMap;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.ja.mvproject.board.service.BoardService;
import com.ja.mvproject.vo.MemberVo;

@Controller
@RequestMapping("/board/*")
public class BoardController {

	@Autowired
	private BoardService boardService;
	
	@RequestMapping("mainPage")
	public String mainPage(Model model, String searchType, String searchWord, @RequestParam(value = "pageNum" , defaultValue = "1")int pageNum) {
		
		ArrayList<HashMap<String, Object>> dataList = boardService.getBoardList(searchType,searchWord,pageNum);
		
		model.addAttribute("dataList", dataList);
		
		return "board/mainPage";
	}
	
	@RequestMapping("writeContentProcess")
	public String writeContentProcess(String bd_title,String bd_content, HttpSession session) {
		MemberVo memberVo = (MemberVo)session.getAttribute("sessionUserInfo");
		int mb_no = memberVo.getMb_no();
		boardService.insertBoardVo(bd_title,bd_content,mb_no);
		
		return "redirect:./mainPage";
	}
}
