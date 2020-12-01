package com.tanky.service.impl;

import java.util.List;

import javax.inject.Inject;

import com.tanky.DAO.IUserDAO;
import com.tanky.model.UserModel;
import com.tanky.service.IUserService;

public class UserService implements IUserService {

	@Inject
	private IUserDAO userDAO;
	
	@Override
	public List<UserModel> fillAll() {
		
		
	return userDAO.fillAll();
		
	}

	
	
}
