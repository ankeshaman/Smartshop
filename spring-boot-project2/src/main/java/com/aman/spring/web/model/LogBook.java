package com.aman.spring.web.model;

public class LogBook {
	private String UserId;
	private String PetName;
	private String Color;
	
	public LogBook(String userId, String petName, String color) {
		super();
		UserId = userId;
		PetName = petName;
		Color = color;
	}
	
	public String getUserId() {
		return UserId;
	}
	public void setUserId(String userId) {
		UserId = userId;
	}
	public String getPetName() {
		return PetName;
	}
	public void setPetName(String petName) {
		PetName = petName;
	}
	public String getColor() {
		return Color;
	}
	public void setColor(String color) {
		Color = color;
	}

	@Override
	public String toString() {
		return "LogBook [UserId=" + UserId + ", PetName=" + PetName + ", Color=" + Color + "]";
	}
	
	

}
