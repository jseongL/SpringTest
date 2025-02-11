package com.jsL.test.database;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

//request, response 처리
@Controller
public class usedGoodsController {
	
	//used_goods 테이블의 모든 행으로 response에 담는다.
	
	@RequestMapping("db/usedgoods/list")
	public usedGoodsList(){
		//중고물품 게시글 정보 얻어오기
		
	}

}
