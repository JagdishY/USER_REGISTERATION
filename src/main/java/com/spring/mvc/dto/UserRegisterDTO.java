package com.spring.mvc.dto;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.spring.mvc.services.UserRegisterService;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Component
@Data
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class UserRegisterDTO {
	
	@Autowired
	UserRegisterService service;
	
	private String name;
	private String Email;
	private String contact;
	private String gender;
	private String password;
	
}
