package com.spring.mvc.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Getter
@Setter
@Entity
@Table(name = "USER_REGISTER")
public class UserRegisterEntity {

	@Column(name = "Name")
	private String name;
	@Id
	@Column(name = "Email")
	private String Email;
	
	@Column
	private String contact;
	
	@Column
	private String gender;
	
	@Column
	private String password;

}
