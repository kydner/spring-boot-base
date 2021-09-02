package com.domain.interfaces;

import java.util.List;

import com.domain.models.UserModel;

public interface UserServiceInterface {
  List<UserModel> findAll();

  UserModel findById(String id);

  UserModel update(String id, UserModel userModel);

  UserModel create(UserModel userModel);
  
  void deleteById(String id);
}
