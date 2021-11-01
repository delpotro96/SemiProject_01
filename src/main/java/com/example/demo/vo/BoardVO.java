package com.example.demo.vo;

import java.util.Date;

public class BoardVO {

	private int bno;
	private String title, content, writer;
	private Date regdate;

	
	
	
	public BoardVO(int bno, String title, String content, String writer, Date regdate) {
		super();
		setBno(bno);
		setTitle(title);
		setContent(content);
		setWriter(writer);
		setRegdate(regdate);
		
	}




	public BoardVO() {
		super();
		// TODO Auto-generated constructor stub
	}




	public int getBno() {
		return bno;
	}




	public void setBno(int bno) {
		this.bno = bno;
	}




	public String getTitle() {
		return title;
	}




	public void setTitle(String title) {
		this.title = title;
	}




	public String getContent() {
		return content;
	}




	public void setContent(String content) {
		this.content = content;
	}




	public String getWriter() {
		return writer;
	}




	public void setWriter(String writer) {
		this.writer = writer;
	}




	public Date getRegdate() {
		return regdate;
	}




	public void setRegdate(Date regdate) {
		this.regdate = regdate;
	}




	@Override
	public String toString() {
		return "BoardVO [bno=" + bno + ", title=" + title + ", content=" + content + ", writer=" + writer + ", regdate="
				+ regdate + "]";
	}







}

