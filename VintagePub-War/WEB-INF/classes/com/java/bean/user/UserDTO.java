package com.java.bean.user;

public class UserDTO {
	
	private int userSeq;
	private String userName;
	private String userId;
	private String userPw;
	private String userEmail;
	private String userTel;
	private String addr;
	private String detailAddr;
	private String postNum;
	
	public int getUserSeq() {
		return userSeq;
	}
	public void setUserSeq(int userSeq) {
		this.userSeq = userSeq;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getUserPw() {
		return userPw;
	}
	public void setUserPw(String userPw) {
		this.userPw = userPw;
	}
	public String getUserEmail() {
		return userEmail;
	}
	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}
	public String getUserTel() {
		return userTel;
	}
	public void setUserTel(String userTel) {
		this.userTel = userTel;
	}
	public String getAddr() {
		return addr;
	}
	public void setAddr(String addr) {
		this.addr = addr;
	}
	public String getDetailAddr() {
		return detailAddr;
	}
	public void setDetailAddr(String detailAddr) {
		this.detailAddr = detailAddr;
	}
	public String getPostNum() {
		return postNum;
	}
	public void setPostNum(String postNum) {
		this.postNum = postNum;
	}
	public void setUserInfo(String userName, String userId, String userPw, String userEmail, String userTel, String addr, String detailAddr, String postNum) {
		this.userName = userName;
		this.userId = userId;
		this.userPw = userPw;
		this.userEmail = userEmail;
		this.userTel = userTel;
		this.addr = addr;
		this.detailAddr = detailAddr;
		this.postNum = postNum;
	}
}