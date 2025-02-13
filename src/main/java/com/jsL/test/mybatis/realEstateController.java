package com.jsL.test.mybatis;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.jsL.test.mybatis.domain.RealEstate;
import com.jsL.test.mybatis.service.RealEstateService;

@Controller
@RequestMapping("/mybatis/realEstate")
public class realEstateController {
	
	@Autowired
	private RealEstateService realEstateService;
	@ResponseBody
	@RequestMapping("/1")
	public List<RealEstate> realEstate(@RequestParam("id")int id) {
		List<RealEstate> realEstate = realEstateService.getRealEstate(id);
		return realEstate;
	}
	
	
	
	
	@Autowired
	private RealEstateService realEstateServiceRentPrice;
	@ResponseBody
	@RequestMapping("/2")
	public List<RealEstate> rentPrice(@RequestParam("rentPrice")int rentPrice) {
		List<RealEstate> realEstate = realEstateServiceRentPrice.getRealEstateRentPrice(rentPrice);
		return realEstate;
	}
	
	
	
	
	@Autowired
	private RealEstateService realEstateServiceTest3;
	@ResponseBody
	@RequestMapping("/3")
	public List<RealEstate> test3(@RequestParam("area")int area,
						@RequestParam("price")int price) {
		List<RealEstate> test3 = realEstateServiceTest3.getRealEstateTest3(area, price);
		return test3;
	}
	
	
	

}
