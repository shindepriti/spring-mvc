package com.bridgelab.dao;

import com.bridgelab.model.Login;
import com.bridgelab.model.User;

public interface UserDao {

	  void register(User user);

	  User validateUser(Login login);
	}
