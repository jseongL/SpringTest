package com.jsL.test.ajax.mybatisFavorite.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jsL.test.ajax.mybatisFavorite.domain.Favorite;
import com.jsL.test.ajax.mybatisFavorite.repository.FavoriteRepository;

@Service
public class FavoriteService {
	
	@Autowired
	private FavoriteRepository favoriteRepository;
	
	public int addFavorite(Favorite favorite) {
		int count = favoriteRepository.insertFavorite(favorite);
		return count;
	}
	
	
	public List<Favorite> getselectFavorite(){
		List<Favorite> favorite = favoriteRepository.selectFavorite();
		return favorite;
 	}
	
	public boolean isDuplicateUrl(String url) {
		int count = favoriteRepository.selectCountByUrl(url);
//		if(count > 0) {
//			return true;
//		}
//		return false;
		
		return count != 0;
	}
	
	public boolean isDeleteFavorite(int id) {
		int count = favoriteRepository.deleteFavorite(id);
		if(count > 0) {
			return true;
		}
		return false;
	}
	
	

}
