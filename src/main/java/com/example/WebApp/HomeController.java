package com.example.WebApp;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HomeController {
	@RequestMapping("/")
	public @ResponseBody String greeting() {
		return "Hello, World!";
	}
	
	@RequestMapping("/izabelle")
	public @ResponseBody String greetingIza() {
		return "Hello, Izabelle!";
	}
	
	@RequestMapping("/axolotl")
	public @ResponseBody String greetingAxolotl() {
		return "glub glob glub!";
	}
	
	@RequestMapping("/lorem")
	public @ResponseBody String greetingLorem() {
		return "Lorem ipsum dolor sit amet, consectetur"
				+ " adipiscing elit, sed do eiusmod tempor"
				+ " incididunt ut labore et dolore magna aliqua.";
	}
}