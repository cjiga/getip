package net.viralpatel.spring3.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloWorldController {
	

	@RequestMapping("/hello")
	public ModelAndView helloWorld(HttpServletRequest req) {
		
		String ip = req.getRemoteAddr();
		String message = "Your IP :::::::::::" +ip;
		System.out.println(message);
		return new ModelAndView("hello", "message", message);
	}

}
