package com.jsL.test.mybatisWeather.repository;

import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import com.jsL.test.mybatisWeather.domain.Weather;


@Mapper
public interface WeatherRepository {


	public List<Weather> selectWeather();


	public int insertWeather(Weather weatherInsert);

}


