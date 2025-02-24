package com.jsL.test.mybatisWeather;


import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.jsL.test.mybatisWeather.domain.Weather;
import com.jsL.test.mybatisWeather.service.WeatherService;


@Controller

@RequestMapping("/mvc/weather")

public class WeatherController {

	@Autowired

	private WeatherService weatherService;

	
	

	@GetMapping("/create")
	public String createWheather(
			@DateTimeFormat(pattern="yyyy년M월d일")@RequestParam("date")String date
			,@RequestParam("weather")String weather
			,@RequestParam("temperatures")double temperatures
			,@RequestParam("precipitation")double precipitation
			,@RequestParam("microDust")String microDust
			,@RequestParam("windSpeed")String windSpeed
			,Model model) {



		Weather weatherInsert = new Weather();
		weatherInsert.setDate(date);
		weatherInsert.setWeather(weather);
		weatherInsert.setTemperatures(temperatures);
		weatherInsert.setPrecipitation(precipitation);
		weatherInsert.setMicroDust(microDust);
		weatherInsert.setWindSpeed(windSpeed);

	

		int count = weatherService.insertWeatherByObject(weatherInsert);


		List<Weather> weatherByList = weatherService.addWeather();
		model.addAttribute("weatherHistory", weatherByList);

		

		return "thymeleaf/mvc/weatherHistoryInfo";

	}

	

	

	

	@GetMapping("/input")
	public String input() {

		return "thymeleaf/mvc/weatherHistoryInput";

	}

	

	

	

	

	

	

	

	

	

	

}
