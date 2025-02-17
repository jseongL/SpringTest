package com.jsL.test.mybatisSeller.repository;

import org.apache.ibatis.annotations.Mapper;

import com.jsL.test.mybatisSeller.domain.Seller;

@Mapper
public interface SellerRepository {
	
	public Seller selectLastUser();

}
