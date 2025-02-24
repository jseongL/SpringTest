package com.jsL.test.mybatisStore.domain;

import java.time.LocalDateTime;

public class Store {
	
	private String name;
	private String phoneNumber;
	private String address;
	private String businessNumber;
	private String introduce;
	private LocalDateTime createdAt;
	private LocalDateTime updaedAt;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getBusinessNumber() {
		return businessNumber;
	}
	public void setBusinessNumber(String businessNumber) {
		this.businessNumber = businessNumber;
	}
	public String getIntroduce() {
		return introduce;
	}
	public void setIntroduce(String introduce) {
		this.introduce = introduce;
	}
	public LocalDateTime getCreatedAt() {
		return createdAt;
	}
	public void setCreatedAt(LocalDateTime createdAt) {
		this.createdAt = createdAt;
	}
	public LocalDateTime getUpdaedAt() {
		return updaedAt;
	}
	public void setUpdaedAt(LocalDateTime updaedAt) {
		this.updaedAt = updaedAt;
	}
	

}
