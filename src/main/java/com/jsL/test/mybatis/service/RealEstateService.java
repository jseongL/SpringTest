package com.jsL.test.mybatis.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jsL.test.mybatis.domain.RealEstate;
import com.jsL.test.mybatis.repository.RealEstateRepository;

@Service
public class RealEstateService {
	
	@Autowired
	private RealEstateRepository realEstateRepository;
	public List<RealEstate> getRealEstate(int id) {
		List<RealEstate> realEstate = realEstateRepository.selectRealEstate(id);
		return realEstate;
	}
	
	
	
	@Autowired
	private RealEstateRepository realEstateRepositoryRentPrice;
	public List<RealEstate> getRealEstateRentPrice(int rentPrice) {
		List<RealEstate> realEstate = realEstateRepositoryRentPrice.selectRealEstateRentPrice(rentPrice);
		return realEstate;
	}
	
	@Autowired
	private RealEstateRepository realEstateRepositoryTest3;
	public List<RealEstate> getRealEstateTest3(int area, int price) {
		List<RealEstate> realEstate = realEstateRepositoryTest3.selectRealEstateTest3(area, price);
		return realEstate;
	}

}
