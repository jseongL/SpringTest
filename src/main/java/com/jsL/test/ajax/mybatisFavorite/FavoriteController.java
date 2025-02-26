package com.jsL.test.ajax.mybatisFavorite;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.jsL.test.ajax.mybatisFavorite.domain.Favorite;
import com.jsL.test.ajax.mybatisFavorite.service.FavoriteService;

@Controller
@RequestMapping("/ajax/favorite")
public class FavoriteController {
	
	@Autowired
	private FavoriteService favoriteService;
	
	@ResponseBody
	@PostMapping("/create")
	public Map<String, String> favoriteCreate(
				@RequestParam("name")String name
				,@RequestParam("url")String url
			) {
		
		Favorite favorite = new Favorite();
		favorite.setName(name);
		favorite.setUrl(url);
		
		
		
		
		int count = favoriteService.addFavorite(favorite);
		
		
		
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
	public String favoriteInfo(Model model) {
		
		List<Favorite> favoriteList = favoriteService.getselectFavorite();
		
		model.addAttribute("favoriteList", favoriteList);
		
		return "ajax/favoriteInfo";
	}
	
	
	@ResponseBody
	@GetMapping("/isDuplicate")
	public Map<String, Boolean> isDuplicateCreate(
			@RequestParam("url")String url
			){
		boolean isDuplicate = favoriteService.isDuplicateUrl(url);
		
		Map<String, Boolean> resultType = new HashMap<>();
		
		if(isDuplicate) {
			resultType.put("isDuplicate", true);
		}
		else {
			resultType.put("isDuplicate", false);
		}
		
		return resultType;
		
	}
	
	
	@ResponseBody
	@GetMapping("/deleteFavorite")
	public Map<String, Boolean> deleteFavorite(@RequestParam("id")int id){
		
		boolean isDelete = favoriteService.isDeleteFavorite(id);
		
		Map<String, Boolean> resultType = new HashMap<>();
		
		if(isDelete) {
			resultType.put("isDelete", true);
		}
		else {
			resultType.put("isDelete", false);
		}
		
		return resultType;
		
	}
	
	
	
	
	

}
