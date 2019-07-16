package com.tpt.web.service.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;

import com.tpt.web.data.dao.UserDao;
import com.tpt.web.data.entity.User;
import com.tpt.web.service.AuthenticationService;

public class AuthenticationServiceImpl implements AuthenticationService {

	@Autowired
	private UserDao userDao;

	@Autowired
	private AuthenticationManager authenticationManager;

	@Override
	public User login(User user) {
		Authentication authentication = authenticationManager
				.authenticate(new UsernamePasswordAuthenticationToken(user.getUsername(), user.getPassword()));
		User userToLog = (User) authentication.getPrincipal();
		SecurityContextHolder.getContext().setAuthentication(authentication);
		if (null != userToLog) {
			return userToLog;
		} else {
			return null;
		}
	}

	@Override
	public void inscription(User user) {
		userDao.save(user);
	}

	@Override
	public void logout() {
		// TODO Auto-generated method stub

	}

}
