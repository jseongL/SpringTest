package com.jsL.test.database.domain;

import java.time.LocalDateTime;

//Domain, Entity class
public class UsedGoods {
	
	//used_goods 테이블의 컬럼이름과 정확히 일치하는 멤버변수를 가진 클래스
	//used_goods 테에블의 한행의 정보를 저장하기 위한 목적
	
	private int id;
	private String title;
	private int price;
	private String description;
	private LocalDateTime createdAt;
	private LocalDateTime updatedAt;
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public LocalDateTime getCreatedAt() {
		return createdAt;
	}
	public void setCreatedAt(LocalDateTime createdAt) {
		this.createdAt = createdAt;
	}
	public LocalDateTime getUpdatedAt() {
		return updatedAt;
	}
	public void setUpdatedAt(LocalDateTime updatedAt) {
		this.updatedAt = updatedAt;
	}
	
	
}
