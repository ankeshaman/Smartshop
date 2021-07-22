package com.aman.spring.web.model;


public class Clothes {
	private int ProductCode;
	private String ProductName;
	private int NumberOfItemsAvailable;
	
	
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
	public Clothes() {
		super();
	}
	public Clothes(int productCode, String productName, int numberOfItemsAvailable) {
		super();
		ProductCode = productCode;
		ProductName = productName;
		NumberOfItemsAvailable = numberOfItemsAvailable;
	}
	@Override
	public String toString() {
		return "Clothes [ProductCode=" + ProductCode + ", ProductName=" + ProductName + ", NumberOfItemsAvailable="
				+ NumberOfItemsAvailable + "]";
	}

}
