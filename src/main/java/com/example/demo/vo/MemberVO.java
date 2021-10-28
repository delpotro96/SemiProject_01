package com.example.demo.vo;

public class MemberVO {

	private String email, id, pw;

	
	
	public MemberVO(String email, String id, String pw) {
		setEmail(email);
		setId(id);
		setPw(pw);
	}



	public MemberVO() {
		super();
		// TODO Auto-generated constructor stub
	}



	public String getEmail() {
		return email;
	}



	public void setEmail(String email) {
		this.email = email;
	}



	public String getId() {
		return id;
	}



	public void setId(String id) {
		this.id = id;
	}



	public String getPw() {
		return pw;
	}



	public void setPw(String pw) {
		this.pw = pw;
	}



	@Override
	public String toString() {
		return "MemberVO [email=" + email + ", id=" + id + ", pw=" + pw + "]";
	}	
	

}
