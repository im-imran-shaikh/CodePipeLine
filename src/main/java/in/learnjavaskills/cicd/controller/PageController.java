package in.learnjavaskills.cicd.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PageController
{
	@GetMapping("message")
	public String message()
	{
		return "Hello, Welcome to learnjavaskills.in";
	}
	
	
}
