package com.aman.spring.web.model;

public class UserPointsInformation {
	private int UserId;
	private String UserName;
	private int Point;
	
	public UserPointsInformation() {
		super();
	}
	
	public UserPointsInformation(int userId, String userName, int point) {
		super();
		UserId = userId;
		UserName = userName;
		Point = point;
	}
	
	public int getUserId() {
		return UserId;
	}
	public void setUserId(int userId) {
		UserId = userId;
	}
	public String getUserName() {
		return UserName;
	}
	public void setUserName(String userName) {
		UserName = userName;
	}
	public int getPoint() {
		return Point;
	}
	public void setPoint(int point) {
		Point = point;
	}
	
	@Override
	public String toString() {
		return "UserPointsInformation [UserId=" + UserId + ", UserName=" + UserName + ", Point=" + Point + "]";
	}

}
