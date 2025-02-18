package com.jsL.test.mybatisSeller.repository;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.jsL.test.mybatisSeller.domain.Seller;

@Mapper
public interface SellerRepository {
	
	public int insertSeller(
			@Param("nickname")String nickname
			,@Param("profileImage")String profileImage
			,@Param("temperature")double temperature
			);
	public Seller selectLastSeller();
	
	public Seller selectSearchSeller(@Param("id")int id);
}
