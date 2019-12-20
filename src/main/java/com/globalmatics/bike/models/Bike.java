package com.globalmatics.bike.models;

import java.math.BigDecimal;
import java.sql.Date;

public class Bike {
	
	private String name;
	private String email;
	private String phone;
	private String model;
	private String serialNumnber;
	private BigDecimal purchasePrice;
	private Date purchaseDate;
	private boolean contact;

	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getSerialNumnber() {
		return serialNumnber;
	}
	public void setSerialNumnber(String serialNumnber) {
		this.serialNumnber = serialNumnber;
	}
	public BigDecimal getPurchasePrice() {
		return purchasePrice;
	}
	public void setPurchasePrice(BigDecimal purchasePrice) {
		this.purchasePrice = purchasePrice;
	}
	public Date getPurchaseDate() {
		return purchaseDate;
	}
	public void setPurchaseDate(Date purchaseDate) {
		this.purchaseDate = purchaseDate;
	}
	public boolean isContact() {
		return contact;
	}
	public void setContact(boolean contact) {
		this.contact = contact;
	}
	

}
