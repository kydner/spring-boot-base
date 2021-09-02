package com.domain.interfaces;

import java.util.List;

import com.domain.models.entities.User;


public interface UserServiceInterface {
  List<User> findAll();

  User findById(String id);

  User update(String id, User userModel);

  User create(User userModel);
  
  void deleteById(String id);
}
