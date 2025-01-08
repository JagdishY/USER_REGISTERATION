package com.spring.mvc.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.mvc.dto.UserRegisterDTO;
import com.spring.mvc.entity.UserRegisterEntity;
import com.spring.mvc.repository.UserRegisterRepository;

@Service
public class UserRegisterService {

	@Autowired
	UserRegisterRepository userRegisterRepository;

	public String getUserRegisterData(UserRegisterDTO registerDTO) {
		
		UserRegisterEntity userRegisterEntity = new UserRegisterEntity();
		userRegisterEntity.setName(registerDTO.getName());
		userRegisterEntity.setEmail(registerDTO.getEmail());
		userRegisterEntity.setContact(registerDTO.getContact());
		userRegisterEntity.setGender(registerDTO.getGender());
		userRegisterEntity.setPassword(registerDTO.getPassword());
		
		userRegisterRepository.save(userRegisterEntity);
		
		return "User Registered Successfully...."+userRegisterEntity.getEmail();
	} 
	
	
	public String getLoginDataFormFromDto(UserRegisterDTO registerDTO)
	{
		UserRegisterEntity userRegisterEntity = new UserRegisterEntity();
		userRegisterEntity.setEmail(registerDTO.getEmail());
		userRegisterEntity.setPassword(registerDTO.getPassword());
		
		return "Login successfully ..."+userRegisterEntity.getEmail();
		
	}
}
