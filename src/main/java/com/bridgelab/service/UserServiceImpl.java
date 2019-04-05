package com.bridgelab.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.bridgelab.dao.UserDao;
import com.bridgelab.model.Login;
import com.bridgelab.model.User;

public  class UserServiceImpl implements UserService {

  @Autowired
  public UserDao userDao;

  public void register(User user) {
    userDao.register(user);
  }

  public User validateUser(Login login) {
    return userDao.validateUser(login);
  }

}
