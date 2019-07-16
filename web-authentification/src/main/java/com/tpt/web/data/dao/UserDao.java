package com.tpt.web.data.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tpt.web.data.entity.User;

@Repository
public interface UserDao extends JpaRepository<User, Long> {
	User findByUsername(String username);
}
