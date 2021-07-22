package com.aman.spring.web.model;

import javax.validation.constraints.Digits;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class Stationary {
	@Digits(integer=10,fraction=0,message="number of items must be an integer")
    @NotNull(message="please enter inyeger value")
	private int ProductCode;
	@Size(min=3,max=20,message="please enter product name less than size of 10")
	@NotNull
	private String ProductName;
	@Digits(integer=10,fraction=0,message="number of items must be an integer")
    @NotNull(message="please enter inyeger value")
	private int NumberOfItemsAvailable; 
	
	@Override
	public String toString() {
		return "Stationary [ProductCode=" + ProductCode + ", ProductName=" + ProductName + ", NumberOfItemsAvailable="
				+ NumberOfItemsAvailable + "]";
	}
	
	public Stationary() {
		super();
	}
	
	public Stationary(int productCode, String productName, int numberOfItemsAvailable) {
		super();
		ProductCode = productCode;
		ProductName = productName;
		NumberOfItemsAvailable = numberOfItemsAvailable;
	}
	public int getProductCode() {
		return ProductCode;
	}
	public void setProductCode(int productCode) {
		ProductCode = productCode;
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

}
