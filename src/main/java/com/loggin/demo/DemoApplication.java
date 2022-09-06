package com.loggin.demo;

import com.loggin.demo.domain.Entity.Role;
import com.loggin.demo.domain.Entity.User;
import com.loggin.demo.domain.Service.UserService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.RestController;


@SpringBootApplication
@EnableWebSecurity
@RestController

public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@Bean
	PasswordEncoder passwordEncoder(){
		return new BCryptPasswordEncoder();
	}
	@Value("${spring.websecurity.debug:false}")
	boolean webSecurityDebug;

	@Bean
	CommandLineRunner commandLineRunner (UserService userService){
		return args -> {
			userService.saveUser(new User("tran ba hieu","hieu","123456",Role.ADMIN));
//			userService.saveUser(new User("nguyen van a","nva","123456",Role.ADMIN));
//			userService.saveUser(new User("le van b","lvb","123456",Role.USER));
//			userService.saveUser(new User("nguyen duc long","long","123456",Role.USER));
			userService.saveUser(new User("nguyen duc long","long","123456",Role.USER));
		};
	}


}
