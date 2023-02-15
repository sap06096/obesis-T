package com.ja.mvproject.member.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ja.mvproject.member.mapper.MemberSQLMapper;
import com.ja.mvproject.vo.MemberVo;

@Service
public class MemberService {

	@Autowired
	private MemberSQLMapper memberSQLMapper;
	
	public void insertMemberVo(MemberVo memberVo) {
		
		memberSQLMapper.insertMember(memberVo);
	}
	
	public MemberVo login(MemberVo memberVo) {
		
		return memberSQLMapper.getMemberInfo(memberVo);
	}
}
