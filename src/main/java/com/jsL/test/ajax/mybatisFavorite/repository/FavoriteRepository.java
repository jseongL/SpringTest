package com.jsL.test.ajax.mybatisFavorite.repository;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.jsL.test.ajax.mybatisFavorite.domain.Favorite;

@Mapper
public interface FavoriteRepository {
	
	public int insertFavorite(Favorite fvorite);
	
	public List<Favorite> selectFavorite();
	
	public int selectCountByUrl(@Param("url")String url);
	
	public int deleteFavorite(@Param("id")int id);
	
}
