package com.jsL.test.database;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.jsL.test.database.domain.UsedGoods;
import com.jsL.test.database.service.UsedGoodsService;

//request, response 처리
@Controller
public class usedGoodsController {
	
	@Autowired
	private UsedGoodsService usedGoodsService;
	
	//used_goods 테이블의 모든 행으로 response에 담는다.
	@ResponseBody
	@RequestMapping("/db/usedgoods/list")
	public List<UsedGoods> usedGoodsList(){
		//중고물품 게시글 정보 얻어오기
		List<UsedGoods> usedGoodsList = usedGoodsService.getUsedGoodsList();
		
		return usedGoodsList;
		
	}

}
