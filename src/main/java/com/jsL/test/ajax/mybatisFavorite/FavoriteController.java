package com.jsL.test.ajax.mybatisFavorite;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.jsL.test.ajax.mybatisFavorite.service.FavoriteService;

@Controller
@RequestMapping("/ajax/favorite")
public class FavoriteController {
	
	private FavoriteService favoriteService;
	
	@GetMapping("/create")
	public Map<String, String> favoriteCreate(
				@RequestParam("name")String name
				,@RequestParam("url")String url
			) {
		

		
		int count = favoriteService.addFavorite(name, url);
		
		Map<String, String> resultMap = new HashMap<>();
		//성공 {"result":"success"}
		//실패 {"result":"fail"}
		if(count == 1) {
			//성공
			resultMap.put("result", "success");
		}
		else {
			//실패
			resultMap.put("result", "fail");
		}
		
		return resultMap;
	
	}
	
	
	@GetMapping("/input")
	public String favoriteInput() {
		return "ajax/favoriteInput";
	}
	
	
	
	@GetMapping("/info")
	public String favoriteInfo() {
		return "ajax/favoriteInfo";
	}
	
	

}
