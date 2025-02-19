package com.jsL.test.mybatisRealtor.repository;

import org.apache.ibatis.annotations.Mapper;

import com.jsL.test.mybatisRealtor.domain.Realtor;

@Mapper
public interface RealtorRepository {
	
	//public int insertRealtor(insertRealtor);

	
	public int insertRealtorByObject(Realtor realtor);

}
