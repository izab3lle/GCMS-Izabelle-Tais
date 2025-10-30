package com.example.WebApp;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.WebApp.client.WeatherClient;

import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/weather")
public class WeatherController {
	
	private WeatherClient client;
	
	public WeatherController(WeatherClient client) {
		this.client = client;
	}
	
	@GetMapping("/")
	public @ResponseBody Mono<String> getWeather() {
		return client.getWeatherInfo("recife");
	}
}
