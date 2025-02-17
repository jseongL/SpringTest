package com.jsL.test.mybatisSeller.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jsL.test.mybatisSeller.domain.Seller;
import com.jsL.test.mybatisSeller.repository.SellerRepository;

@Service
public class SellerService {
	
	@Autowired
	private SellerRepository sellerRepository;
	
	public Seller selectGetLastUser() {
		Seller seller = sellerRepository.selectLastUser();
		
		return seller;
	}

}
