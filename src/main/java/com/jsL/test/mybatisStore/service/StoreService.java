package com.jsL.test.mybatisStore.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jsL.test.mybatisStore.domain.Store;
import com.jsL.test.mybatisStore.repository.StoreRepository;

@Service
public class StoreService {
	
	@Autowired
	private StoreRepository storeRepository;
	
	public List<Store> selectStoreByObject() {
		List<Store> store = storeRepository.selectStore();
		return store;
	}
	
	

}
