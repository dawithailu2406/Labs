package edu.miu.cs.cs425.spring.eRegistrar.Collector;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomePageCollector {
	@GetMapping
public String displayhomepage() {
		return "home/index";
		
	}
}
