package com.example.githubactionsdemo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

	@GetMapping(value = "getThisMan")
	public DemoModel getThisMan() {
		    System.out.println("asdf");return new DemoModel();

	}

}
