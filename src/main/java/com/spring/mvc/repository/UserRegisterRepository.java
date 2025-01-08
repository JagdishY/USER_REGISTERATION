package com.spring.mvc.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spring.mvc.entity.UserRegisterEntity;

public interface UserRegisterRepository extends JpaRepository<UserRegisterEntity , String>{

}
