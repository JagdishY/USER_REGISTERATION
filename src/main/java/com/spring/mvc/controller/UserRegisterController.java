package com.spring.mvc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.spring.mvc.dto.UserRegisterDTO;
import com.spring.mvc.services.UserRegisterService;

import jakarta.servlet.http.HttpServletRequest;

@Controller
public class UserRegisterController {
	
	@Autowired
	UserRegisterService userRegisterService;

	@GetMapping("/user/index")
	public String getUserRegisterIndexPage()
	{
		System.out.println("User Registeration Index Page Executed...");
		return "index";
	}
	
	@GetMapping("/register")
	public String getUserRegister()
	{
		System.out.println("User Registeration Page Executed...");
		return "register";
	}
	
	@GetMapping("/login")
	public String getUserLogin()
	{
		System.out.println("User Login Page Executed...");
		return "login";
	}
	
	
	@RequestMapping("user/register")
	public ModelAndView getRegisterationData(HttpServletRequest request)
	{
		UserRegisterDTO registerDTO =new UserRegisterDTO();
		registerDTO.setName(request.getParameter("name"));
		registerDTO.setEmail(request.getParameter("email"));
		registerDTO.setContact(request.getParameter("contact"));
		registerDTO.setGender(request.getParameter("gender"));
		registerDTO.setPassword(request.getParameter("password"));
		
		String result=userRegisterService.getUserRegisterData(registerDTO);
		
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("result");
		modelAndView.addObject("message", result);
		
		
		
		return modelAndView;
		
		
	}
	
	
	
	@PostMapping("user/login")
	public ModelAndView getLoginData(HttpServletRequest httpServletRequest)
	{
		UserRegisterDTO dto =new UserRegisterDTO();
		dto.setEmail(httpServletRequest.getParameter("email"));
		dto.setPassword(httpServletRequest.getParameter("password"));
		
		String loginresult=userRegisterService.getLoginDataFormFromDto(dto);
		
		
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("loginresult");
		modelAndView.addObject("info", loginresult);
		
		return modelAndView;
		
	}
	
	
	
}
