package com.jsL.test.lifecycle;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/lifecycle/test")
public class testRestController {

	
	@ResponseBody
	@RequestMapping("/1")
	public List<Map<String, Object>> listMapResponse() {
		
		List<Map<String, Object>> movieList = new ArrayList<>();
		
		Map<String, Object> movieMap = new HashMap<>();
		movieMap.put("title", "기생충");
		movieMap.put("director", "봉준호");
		movieMap.put("time", "131");
		movieMap.put("rate", "15");
		
		movieList.add(movieMap);
		
		movieMap = new HashMap<>();//저장 가능
		movieMap.put("title", "인생은 아름다워");
		movieMap.put("director", "로베르토 베니니");
		movieMap.put("time", "116");
		movieMap.put("rate", "0");
		
		movieList.add(movieMap);
		
		movieMap = new HashMap<>();//저장 가능
		movieMap.put("title", "인셉션");
		movieMap.put("director", "크리스퍼 놀란");
		movieMap.put("time", "116");
		movieMap.put("rate", "0");
		
		movieList.add(movieMap);
		
		return movieList;	
		
	}
	
	@RequestMapping("/2")
	public List<Post> listObjectResponse() {
		
		List<Post> postList = new ArrayList<>();
		Post post = new Post("안녕하세요", "dlawltjd", "잘부탁드립니다");
		postList.add(post);
		
		postList.add(new Post("헐 대박", "바다", "오늘 화요일이었어"));
		postList.add(new Post("오늘 데이터흔 이야기 해드릴게요", "dulumary", "...."));
	
	
		return postList;
	}
	
	@RequestMapping("/3")
	public ResponseEntity<Post> entityResponse() {
		Post post = new Post("안녕하세요", "dlawltjd", "잘부탁드립니다");
		
		ResponseEntity<Post> entity = new ResponseEntity<>(post, HttpStatus.INTERNAL_SERVER_ERROR);
		
		return entity;
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
