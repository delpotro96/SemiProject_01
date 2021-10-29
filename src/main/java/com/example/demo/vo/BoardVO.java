package com.example.demo.vo;

import java.util.Date;

public class BoardVO {

	private int bNo;
	private String title, content, name;
	private Date date;

	
	public BoardVO() {
		super();
		// TODO Auto-generated constructor stub
	}


	public BoardVO(int bNo, String title, String content, String name, Date date) {
		setbNo(bNo);
		setTitle(title);
		setContent(content);
		setName(name);
		setDate(date);
		
	}


	public int getbNo() {
		return bNo;
	}


	public void setbNo(int bNo) {
		this.bNo = bNo;
	}


	public String getTitle() {
		return title;
	}


	public void setTitle(String title) {
		if(title!=null||!title.equals("")) {
			this.title = title;
		}else {
			System.out.println("제목을 작성해주세요");
		}
		
	}


	public String getContent() {
		return content;
	}


	public void setContent(String content) {
		if(content!=null||!content.equals("")) {
			this.content = content;
		}else {		
			System.out.println("내용을 작성해주세요");
		}
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		if(name!=null||!name.equals("")) {
			this.name = name;
		}else {
			System.out.println("작성자 명을 작성해주세요");
		}
	}


	public Date getDate() {
		return date;
	}


	public void setDate(Date date) {
		this.date = date;
	}


	@Override
	public String toString() {
		return "BoardVO [bNo=" + bNo + ", title=" + title + ", content=" + content + ", name=" + name + ", date=" + date
				+ "]";
	}
	
	
}
