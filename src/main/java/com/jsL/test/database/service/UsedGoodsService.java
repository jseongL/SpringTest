package com.jsL.test.database.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jsL.test.database.domain.UsedGoods;
import com.jsL.test.database.repository.UsedGoodsRepository;

// 로직(business)담당
//데이터 가공
//그외 복잡한 기능 수행
//Controller에서 필요한 기능 수행
@Service
public class UsedGoodsService {
	
	@Autowired
	private UsedGoodsRepository usedgooodsRepoitory;
	
	//중고물품 게시글 모두 얻어오기
	public List<UsedGoods> getUsedGoodsList(){
		//used_goods 테이블 모든 행 조회
		
		List<UsedGoods> usedGoodsList =  usedgooodsRepoitory.selectUsedGoodsList();
		//데이터 가공
		return usedGoodsList;
	}
	
}
