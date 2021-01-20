package web.com.main.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import lombok.extern.slf4j.Slf4j;

@Controller
@Slf4j
public class MainController {

	@GetMapping("/main")
	public String main() {
		log.debug("============== main started =============== ");
		System.out.println("@@@@@@@@@@@@@@@@@@@ main started @@@@@@@@@@@@@@@@@@@@@");
		return "main";
	}
	
	@GetMapping("/home")
	public ModelAndView home() {
		log.debug("============== home started =============== ");
		return new ModelAndView("main");
	}
}
