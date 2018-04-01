package com.playanetworks.springmvc.VO;

import java.util.Date;

public class MemberVO {
	private String userId;
	private String userPw;
	private String userName;
	private String email;
	private Date regDate;
	private Date updatedDate;
	
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getUserId() {
		return this.userId;
	}
	
	
	public void setUserPw(String userPw) {
		this.userPw = userPw;
	}
	public String getUserPw() {
		return this.userPw;
	}
	
	
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getUserName() {
		return this.userName;
	}
	
	
	public void setEmail(String email) {
		this.email = email;
	}
	public String getEmail() {
		return this.email;
	}
	
	
	public void setRegDate(Date regDate) {
		this.regDate = regDate;
	}
	public Date getRegDate() {
		return this.regDate;
	}
	
	
	public void setUpdatedDate(Date updatedDate) {
		this.updatedDate = updatedDate;
	}
	public Date getUpdatedDate() {
		return this.updatedDate;
	}
	
	@Override
	public String toString() {
		return "MemberVO [userId=" + this.userId + 
				", userPw=" + this.userPw +
				", userName=" + this.userName +
				", email=" + this.email +
				", regDate=" + this.regDate +
				", updatedDate=" + this.updatedDate +
				"]";
	}
}
