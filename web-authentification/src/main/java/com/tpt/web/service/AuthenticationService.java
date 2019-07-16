package com.tpt.web.service;

import com.tpt.web.data.entity.User;

public interface AuthenticationService {
	
	public User login(User user);

	public void inscription(User user);

	public void logout();

}
