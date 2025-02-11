package com.jsL.test.lifecycle;

import java.util.HashMap;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/test")
public class TestController {
	
	@ResponseBody
	@RequestMapping("/1")
	public String printString() {
		return "<h1>테스트 프로젝트 완성</h1>"
				+ "<h3>해당 프로젝트를 통해서 문제 풀이를 진행합니다</h3>";
	}
	
	@ResponseBody //자동으로 해줌
	@RequestMapping("/2")
	public Map<String, Integer> entityResponse() {
		
		Map<String, Integer> scoreMap = new HashMap<>();
		scoreMap.put("국어", 95);
		scoreMap.put("수학", 80);
		scoreMap.put("영어", 85);
		
		return scoreMap;
		
		
//		Score score = new Score(80, 95, 85);
//		
//		ResponseEntity<Score> entity = new ResponseEntity<Score>(score, HttpStatus.INTERNAL_SERVER_ERROR);
//		
//		return entity;
	}
	

}












