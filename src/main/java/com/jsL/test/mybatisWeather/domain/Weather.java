package com.jsL.test.mybatisWeather.domain;


import java.time.LocalDateTime;


public class Weather {

	private String date;
	private String weather;
	private double temperatures;
	private double precipitation;
	private String microDust;
	private String windSpeed;
	private LocalDateTime createdAt;
	private LocalDateTime updatedAt;
	public String getDate() {

		return date;

	}

	public void setDate(String date) {

		this.date = date;

	}

	public String getWeather() {

		return weather;

	}

	public void setWeather(String weather) {

		this.weather = weather;

	}

	public double getTemperatures() {

		return temperatures;

	}

	public void setTemperatures(double temperatures) {

		this.temperatures = temperatures;

	}

	public double getPrecipitation() {

		return precipitation;

	}

	public void setPrecipitation(double precipitation) {

		this.precipitation = precipitation;

	}

	public String getMicroDust() {

		return microDust;

	}

	public void setMicroDust(String microDust) {

		this.microDust = microDust;

	}

	public String getWindSpeed() {

		return windSpeed;

	}

	public void setWindSpeed(String windSpeed) {

		this.windSpeed = windSpeed;

	}

	public LocalDateTime getCreatedAt() {

		return createdAt;

	}

	public void setCreatedAt(LocalDateTime createdAt) {

		this.createdAt = createdAt;

	}

	public LocalDateTime getUpdatedAt() {

		return updatedAt;

	}

	public void setUpdatedAt(LocalDateTime updatedAt) {

		this.updatedAt = updatedAt;

	}

	

	


}

