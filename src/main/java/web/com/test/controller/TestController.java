package web.com.test.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

	@GetMapping("/test")
	public String main() {
		System.out.println("test ========================= ");
		return "test";
	} 
}
