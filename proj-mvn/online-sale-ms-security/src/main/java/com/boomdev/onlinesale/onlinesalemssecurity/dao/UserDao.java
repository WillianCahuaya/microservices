package com.boomdev.onlinesale.onlinesalemssecurity.dao;


import com.boomdev.onlinesale.onlinesalebeanbusiness.entity.security.User;

public interface UserDao {
	
	User getUser(String username);

}
