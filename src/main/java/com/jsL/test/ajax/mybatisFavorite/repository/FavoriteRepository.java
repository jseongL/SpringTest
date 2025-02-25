package com.jsL.test.ajax.mybatisFavorite.repository;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.jsL.test.ajax.mybatisFavorite.domain.Favorite;

@Mapper
public interface FavoriteRepository {
	
	public int insertFavorite(String name, String url);
	
}
