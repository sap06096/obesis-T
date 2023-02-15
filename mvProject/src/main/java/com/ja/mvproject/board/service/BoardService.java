package com.ja.mvproject.board.service;

import java.util.ArrayList;
import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ja.mvproject.board.mapper.BoardSQLMapper;
import com.ja.mvproject.vo.BoardVo;
import com.ja.mvproject.vo.MemberVo;

@Service
public class BoardService {

	@Autowired
	private BoardSQLMapper boardSQLMapper;
	
	public void insertBoardVo(String bd_title, String bd_content, int mb_no) {
		
		boardSQLMapper.insertBoard(bd_title,bd_content,mb_no);
	}
	
	public ArrayList<HashMap<String, Object>> getBoardList(String searchType, String searchWord,int pageNum){
		
		ArrayList<HashMap<String, Object>> dataList = new ArrayList<HashMap<String, Object>>();
		ArrayList<BoardVo> boardList = boardSQLMapper.selectBoardVo(searchType,searchWord,pageNum);
		
		for(BoardVo boardVo : boardList) {
			
			int mb_no = boardVo.getMb_no();
			MemberVo memberVo = boardSQLMapper.selectMemberVoByMB_no(mb_no);
			
			HashMap<String, Object> map = new HashMap<>();
			map.put("memberVo", memberVo);
			map.put("boardVo", boardVo);
			dataList.add(map);
		}
		
		return dataList;
	}

}
