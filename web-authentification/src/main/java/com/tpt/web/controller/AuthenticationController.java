package com.tpt.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.tpt.web.data.entity.User;
import com.tpt.web.service.AuthenticationService;

@Controller 
public class AuthenticationController {
	
	@Autowired
	AuthenticationService auth;

	@RequestMapping("login")
	@ResponseBody()
	private User login(User user) {
		User loggedUser = this.auth.login(user);
		return loggedUser;
	}
}
