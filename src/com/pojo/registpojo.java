package com.pojo;

public class registpojo {
	private String userId;
	private String userPsw;
	private String userEmail;
	public registpojo(String userId, String userPsw, String userEmail) {
		super();
		this.userId = userId;
		this.userPsw = userPsw;
		this.userEmail = userEmail;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getUserPsw() {
		return userPsw;
	}
	public void setUserPsw(String userPsw) {
		this.userPsw = userPsw;
	}
	public String getUserEmail() {
		return userEmail;
	}
	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}
	
}
