package com.jsL.test.mybatisWeather.service;


import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;


import com.jsL.test.mybatisWeather.domain.Weather;

import com.jsL.test.mybatisWeather.repository.WeatherRepository;


@Service

public class WeatherService {

	@Autowired
	private WeatherRepository weatherRepository;

	

	public List<Weather> addWeather() {
		List<Weather> weather = weatherRepository.selectWeather();
		return weather;
	}

	

	

	public int insertWeatherByObject(Weather weatherInsert) {
		int count = weatherRepository.insertWeather(weatherInsert);
		return count;
	}

	

	

}

