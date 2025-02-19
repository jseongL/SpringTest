package com.jsL.test.mybatisRealtor.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jsL.test.mybatisRealtor.domain.Realtor;
import com.jsL.test.mybatisRealtor.repository.RealtorRepository;

@Service
public class RealtorService {
	@Autowired
	private RealtorRepository realtorRepository;
	
	

	public int addRealtorByObject(Realtor realtor) {
		int count = realtorRepository.insertRealtorByObject(realtor);
		return count;
	}

}






