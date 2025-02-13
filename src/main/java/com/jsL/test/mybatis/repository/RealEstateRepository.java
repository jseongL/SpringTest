package com.jsL.test.mybatis.repository;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.jsL.test.mybatis.domain.RealEstate;

@Mapper
public interface RealEstateRepository {
											//xml에서 쓰기위한 방법
	public List<RealEstate> selectRealEstate(@Param("id")int id);
	
	public List<RealEstate> selectRealEstateRentPrice(@Param("rentPrice")int rentPrice);
	
	public List<RealEstate> selectRealEstateTest3(@Param("area")int area, 
														@Param("price")int price);

}
