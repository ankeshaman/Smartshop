package com.aman.springboot.web.model;

import java.util.Date;

import javax.validation.constraints.Digits;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class Todo {
	@Size(min=3,max=20,message="please enter product name less than size of 10")
	@NotNull
    private String ProductName;
    @Digits(integer=10,fraction=0,message="number of items must be an integer")
    @NotNull(message="please enter inyeger value")
    private int NumberOfItemsAvailable;
    @NotNull
    private String DateOfManufacturing;
    @NotNull
    private String DateOfExpiry;
    
    
	
	@Override
	public String toString() {
		return "Todo [ProductName=" + ProductName + ", NumberOfItemsAvailable=" + NumberOfItemsAvailable
				+ ", DateOfManufacturing=" + DateOfManufacturing + ", DateOfExpiry=" + DateOfExpiry + "]";
	}
	
	public Todo() {
		super();
	}
	
	public Todo(String productName, int numberOfItemsAvailable, String dateOfManufacturing, String dateOfExpiry) {
		super();
		ProductName = productName;
		NumberOfItemsAvailable = numberOfItemsAvailable;
		DateOfManufacturing = dateOfManufacturing;
		DateOfExpiry = dateOfExpiry;
	}
	public String getProductName() {
		return ProductName;
	}
	public void setProductName(String productName) {
		ProductName = productName;
	}
	public int getNumberOfItemsAvailable() {
		return NumberOfItemsAvailable;
	}
	public void setNumberOfItemsAvailable(int numberOfItemsAvailable) {
		NumberOfItemsAvailable = numberOfItemsAvailable;
	}
	public String getDateOfManufacturing() {
		return DateOfManufacturing;
	}
	public void setDateOfManufacturing(String dateOfManufacturing) {
		DateOfManufacturing = dateOfManufacturing;
	}
	public String getDateOfExpiry() {
		return DateOfExpiry;
	}
	public void setDateOfExpiry(String dateOfExpiry) {
		DateOfExpiry = dateOfExpiry;
	}


}