package com.jsL.test.database.repository;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.jsL.test.database.domain.UsedGoods;

//데이터베이스 관련 처리
//Mybatis Framework
@Mapper
public interface UsedGoodsRepository {

	// used_goods 테이블 모든 행 조회
	public List<UsedGoods> selectUsedGoodsList();
	
}
