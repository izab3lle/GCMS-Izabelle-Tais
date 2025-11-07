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
		return "glub glub glub!";
	}
}