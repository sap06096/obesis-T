package com.ja.mvproject.vo;

import java.util.Date;

public class MemberVo {
	
	private int mb_no;
	private String mb_id;
	private String mb_pw;
	private String mb_nick;
	private String mb_phone;
	private String mb_email;
	private Date mb_date;
	
	public MemberVo() {
		super();
	}

	public MemberVo(int mb_no, String mb_id, String mb_pw, String mb_nick, String mb_phone, String mb_email,
			Date mb_date) {
		super();
		this.mb_no = mb_no;
		this.mb_id = mb_id;
		this.mb_pw = mb_pw;
		this.mb_nick = mb_nick;
		this.mb_phone = mb_phone;
		this.mb_email = mb_email;
		this.mb_date = mb_date;
	}

	public int getMb_no() {
		return mb_no;
	}

	public void setMb_no(int mb_no) {
		this.mb_no = mb_no;
	}

	public String getMb_id() {
		return mb_id;
	}

	public void setMb_id(String mb_id) {
		this.mb_id = mb_id;
	}

	public String getMb_pw() {
		return mb_pw;
	}

	public void setMb_pw(String mb_pw) {
		this.mb_pw = mb_pw;
	}

	public String getMb_nick() {
		return mb_nick;
	}

	public void setMb_nick(String mb_nick) {
		this.mb_nick = mb_nick;
	}

	public String getMb_phone() {
		return mb_phone;
	}

	public void setMb_phone(String mb_phone) {
		this.mb_phone = mb_phone;
	}

	public String getMb_email() {
		return mb_email;
	}

	public void setMb_email(String mb_email) {
		this.mb_email = mb_email;
	}

	public Date getMb_date() {
		return mb_date;
	}

	public void setMb_date(Date mb_date) {
		this.mb_date = mb_date;
	}
	
	
}
