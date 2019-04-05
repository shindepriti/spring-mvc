package com.bridgelab.service;

import com.bridgelab.model.Login;
import com.bridgelab.model.User;

public interface UserService {

  void register(User user);

  User validateUser(Login login);
}
