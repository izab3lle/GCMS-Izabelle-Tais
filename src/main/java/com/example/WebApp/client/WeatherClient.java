package com.example.WebApp.client;

import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

import reactor.core.publisher.Mono;

@Service
public class WeatherClient {

	private final WebClient webClient;
	
	public WeatherClient(WebClient.Builder builder) {
		webClient = builder
						.baseUrl("https://wttr.in")
						.build();
	}
	
	public Mono<String> getWeatherInfo(String place) {
		return webClient.get().uri("/" + place)
				.retrieve()
				.bodyToMono(String.class);
	}
	

}
