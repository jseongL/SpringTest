package com.jsL.test.mybatisStore.repository;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.jsL.test.mybatisStore.domain.Store;

@Mapper
public interface StoreRepository {
	
	public List<Store> selectStore();

}
