package com.web1.model;

public class MemberVO {
	
	public String getId() {
		return Id;
	}


	public void setId(String id) {
		Id = id;
	}


	public String getPw() {
		return Pw;
	}


	public void setPw(String pw) {
		Pw = pw;
	}


	public String getName() {
		return Name;
	}


	public void setName(String name) {
		Name = name;
	}


	public String getMail() {
		return Mail;
	}


	public void setMail(String mail) {
		Mail = mail;
	}


	public String getAddr1() {
		return Addr1;
	}


	public void setAddr1(String addr1) {
		Addr1 = addr1;
	}


	public String getAddr2() {
		return Addr2;
	}


	public void setAddr2(String addr2) {
		Addr2 = addr2;
	}


	public String getAddr3() {
		return Addr3;
	}


	public void setAddr3(String addr3) {
		Addr3 = addr3;
	}


	public int getAdminCk() {
		return adminCk;
	}


	public void setAdminCk(int adminCk) {
		this.adminCk = adminCk;
	}


	public int getRegDate() {
		return regDate;
	}


	public void setRegDate(int regDate) {
		this.regDate = regDate;
	}


	private String Id;
	private String Pw;
	private String Name;
	private String Mail;
	private String Addr1;
	private String Addr2;
	private String Addr3;
	private int adminCk;
	private int regDate;
	
	
	@Override
	public String toString() {
		return "MemberVO [Id=" + Id + ", Pw=" + Pw + ", Name=" + Name + ", Mail=" + Mail + ", Addr1=" + Addr1
				+ ", Addr2=" + Addr2 + ", Addr3=" + Addr3 + ", adminCk=" + adminCk + ", regDate=" + regDate + "]";
	}
}
