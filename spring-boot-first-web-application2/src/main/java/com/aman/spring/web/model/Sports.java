package com.aman.spring.web.model;


public class Sports {
	private int ProductCode;
	private String ProductName;
	private int NumberOfItemsAvailable;
	
	public Sports() {
		super();
	}
	
	@Override
	public String toString() {
		return "Sports [ProductCode=" + ProductCode + ", ProductName=" + ProductName + ", NumberOfItemsAvailable="
				+ NumberOfItemsAvailable + "]";
	}
	public Sports(int productCode, java.lang.String productName, int numberOfItemsAvailable) {
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
