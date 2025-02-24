package com.jsL.test.mybatisStore;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.jsL.test.mybatisStore.domain.Store;
import com.jsL.test.mybatisStore.service.StoreService;

@Controller
@RequestMapping("/mvc/store")
public class StoreController {
	
	@Autowired
	private StoreService storeService;
	
	
	@GetMapping("/create")
	public String createStore(
			Model model
			) {		
		
		
		List<Store> storeList = storeService.selectStoreByObject();
		
		
		
		model.addAttribute("storeList", storeList);
		
		return "thymeleaf/mvc/storeInfo";
	}
	
	
	
	
	@GetMapping("/review")
	public String createReview(
			@RequestParam("name")String name
			,Model model
			) {
		
		
		model.addAttribute("name", name);
		return "thymeleaf/mvc/reviewInfo";
	}
	
	

	
	
	

}




