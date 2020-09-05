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
	
	@GetMapping("hello")
	public String message()
	{
		return "Hello";
	}
	
	@GetMapping("ThirdMessahe")
	public String message()
	{
		return "ThirdMessahe";
	}
	
}
