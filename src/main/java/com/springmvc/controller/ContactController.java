package com.springmvc.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.springmvc.model.User;
import com.springmvc.service.UserService;

@Controller
public class ContactController {
	
	@Autowired
	private UserService userService;
	
	@ModelAttribute
	public void commonDataForModel(Model model) {
		
		model.addAttribute("Header", "Learn Code");
        model.addAttribute("Desc", "Some Description about Project..");
		
		
	}

	@RequestMapping("/contact")
	public String showForm(Model model) {
		
		return "contact";
	}
	
	@RequestMapping(path = "/processform", method = RequestMethod.POST)
	public String handleForm(@ModelAttribute User user, Model model) {

		

		model.addAttribute("msg", "User Created With");
		this.userService.createUser(user);
		return "success";
	}

	/*
	 * @RequestMapping(path = "/processform", method = RequestMethod.POST) public
	 * String handleForm(@RequestParam("email") String
	 * email, @RequestParam("username") String username,
	 * 
	 * @RequestParam("password") String password, Model model) {
	 * 
	 * User user = new User(); user.setEmail(email); user.setUsername(username);
	 * user.setPassword(password);
	 * 
	 * 
	 * model.addAttribute("name", username); model.addAttribute("email", email);
	 * model.addAttribute("password", password);
	 * 
	 * 
	 * model.addAttribute("user", user);
	 * 
	 * return "success"; }
	 */

}
