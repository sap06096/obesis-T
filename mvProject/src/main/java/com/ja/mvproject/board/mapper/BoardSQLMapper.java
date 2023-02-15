package com.ja.mvproject.board.mapper;

import java.util.ArrayList;

import org.apache.ibatis.annotations.Param;

import com.ja.mvproject.vo.BoardVo;
import com.ja.mvproject.vo.MemberVo;

public interface BoardSQLMapper {

	public void insertBoard(
			@Param("bd_title") String bd_title,
			@Param("bd_content") String bd_content,
			@Param("mb_no") int mb_no
			);
	
	public ArrayList<BoardVo> selectBoardVo(
			@Param("searchType")String searchType,
			@Param("searchWord")String searchWord,
			@Param("pageNum")int pageNum
			);
	
	public MemberVo selectMemberVoByMB_no(int mb_no);
	
}
