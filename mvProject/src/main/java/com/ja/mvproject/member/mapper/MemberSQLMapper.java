package com.ja.mvproject.member.mapper;

import com.ja.mvproject.vo.MemberVo;

public interface MemberSQLMapper {

	public void insertMember(MemberVo memberVo);
	
	public MemberVo getMemberInfo(MemberVo memberVo);
}
