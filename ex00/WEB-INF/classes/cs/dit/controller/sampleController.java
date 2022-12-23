package cs.dit.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import lombok.extern.log4j.Log4j;

@Controller
@RequestMapping("/sample/*")
@Log4j

public class sampleController {

	@GetMapping("/basic01")
	public void basic() {
		log.info("basic01.................................");
	}
	@GetMapping("/basic02")
	public String basic02() {
		log.info("basic02.................................");
		return "redirect:/sample/basic02";
	}
	@GetMapping("/ex01")
	public String ex01() {
		log.info("ex01.................................");
		return "/sample/ex01";
	}
	@GetMapping("/ex02")
	public String ex02(String name) {
		log.info("ex02.................................");
		log.info("name : " + name);
		return "/sample/ex02";
	}
	@GetMapping("/ex03")
	public void ex03(@RequestParam("id") String name) {
		log.info("basic02.................................");
		log.info("name : " + name);
	}
}
