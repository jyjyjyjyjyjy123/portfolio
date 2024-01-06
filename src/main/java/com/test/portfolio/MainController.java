package com.test.portfolio;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {

	@GetMapping(value="/portfolio.do")
	public String portfolio(Model model) {
		
		return "portfolio";
	}

}
