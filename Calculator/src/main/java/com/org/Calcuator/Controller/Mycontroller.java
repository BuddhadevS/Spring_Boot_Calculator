package com.org.Calcuator.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class Mycontroller {
	

	@GetMapping("/")
	public String Home() {
		return "home.html";
	}
	
	@GetMapping("add")
	@ResponseBody
	public String Add(@RequestParam int num1, @RequestParam int num2)
	{
		return "<h1>The sum of 2 number is "+ (num1+num2)+"</h1>";
	}
	@GetMapping("sub")
	@ResponseBody
	public String Sub(@RequestParam int num1, @RequestParam int num2)
	{
		return "<h1>The sub of 2 number is "+ (num1-num2)+"</h1>";
	}
	@GetMapping("mul")
	@ResponseBody
	public String Mul(@RequestParam int num1, @RequestParam int num2)
	{
		return "<h1>The mul of 2 number is "+ (num1*num2)+"</h1>";
	}
	@GetMapping("div")
	@ResponseBody
	public String Div(@RequestParam int num1, @RequestParam int num2)
	{
		return "<h1>The div of 2 number is "+ (num1/num2)+"</h1>";
	}

}
