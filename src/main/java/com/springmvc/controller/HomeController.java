package com.springmvc.controller;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {

	@RequestMapping(path="/home", method = RequestMethod.GET)
	public String home(Model model) {
		System.out.println("This is home URL");
		model.addAttribute("name", "Santosh Kumar Madani");
		model.addAttribute("id", 45);

		List<String> friends = new ArrayList();
		friends.add("Kundan");
		friends.add("Vikesh");
		friends.add("Sundar");

		model.addAttribute("friends", friends);
		return "index";
	}

	@RequestMapping("/about")
	public String about() {
		System.out.println("This is about URL");
		return "about";
	}

	@RequestMapping("/help")
	public ModelAndView help() {
		System.out.println("This is help URL");

		//Model and Views
		ModelAndView modelAndView = new ModelAndView();
		
		//Set Data
		modelAndView.addObject("name", "Uttam");
		modelAndView.addObject("rollno", 1845);
		LocalDateTime now = LocalDateTime.now();
		modelAndView.addObject("time", now);
		
		List<Integer> list=new ArrayList<Integer>();
		list.add(12);
		list.add(13);
		list.add(14);
		
		modelAndView.addObject("marks",list);
		
		//Setting View
		modelAndView.setViewName("help");

		return modelAndView;
	}
	
	
	

}
