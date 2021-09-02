package com.domain.services;

import java.util.List;

import com.domain.interfaces.UserServiceInterface;
import com.domain.models.UserModel;
import com.domain.repositories.UserRepository;

import org.springframework.beans.factory.annotation.Autowired;

public class UserService implements UserServiceInterface {

  @Autowired
  UserRepository repository;
  @Override
  public UserModel create(UserModel userModel) {
    return repository.save(userModel);
  }

  @Override
  public void deleteById(String id) {
    repository.deleteById(id);
  }

  @Override
  public List<UserModel> findAll() {
    return repository.findAll();
  }

  @Override
  public UserModel findById(String id) {
    return repository.getById(id);
  }

  @Override
  public UserModel update(String id, UserModel userModel) {
    userModel.getId();
    return repository.save(userModel);
  }
  
}
