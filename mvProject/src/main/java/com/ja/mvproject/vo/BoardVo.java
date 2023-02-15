package com.ja.mvproject.vo;

import java.util.Date;

public class BoardVo {

	private int bd_no;
	private int mb_no;
	private int bd_readcount;
	private String bd_title;
	private String bd_content;
	private Date bd_writedate;
	
	public BoardVo() {
		super();
	}

	public BoardVo(int bd_no, int mb_no, int bd_readcount, String bd_title, String bd_content, Date bd_writedate) {
		super();
		this.bd_no = bd_no;
		this.mb_no = mb_no;
		this.bd_readcount = bd_readcount;
		this.bd_title = bd_title;
		this.bd_content = bd_content;
		this.bd_writedate = bd_writedate;
	}

	public int getBd_no() {
		return bd_no;
	}

	public void setBd_no(int bd_no) {
		this.bd_no = bd_no;
	}

	public int getMb_no() {
		return mb_no;
	}

	public void setMb_no(int mb_no) {
		this.mb_no = mb_no;
	}

	public int getBd_readcount() {
		return bd_readcount;
	}

	public void setBd_readcount(int bd_readcount) {
		this.bd_readcount = bd_readcount;
	}

	public String getBd_title() {
		return bd_title;
	}

	public void setBd_title(String bd_title) {
		this.bd_title = bd_title;
	}

	public String getBd_content() {
		return bd_content;
	}

	public void setBd_content(String bd_content) {
		this.bd_content = bd_content;
	}

	public Date getBd_writedate() {
		return bd_writedate;
	}

	public void setBd_writedate(Date bd_writedate) {
		this.bd_writedate = bd_writedate;
	}
	
	
}
