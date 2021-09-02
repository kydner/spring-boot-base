package com.domain.services;

import java.util.List;

import javax.transaction.Transactional;

import com.domain.interfaces.UserServiceInterface;
import com.domain.models.entities.User;
import com.domain.repositories.UserRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class UserService implements UserServiceInterface {

  @Autowired
  private UserRepository repository;

  @Override
  public User create(User user) {
    return repository.save(user);
  }

  @Override
  public void deleteById(String id) {
    repository.deleteById(id);
  }

  @Override
  public List<User> findAll() {
    return repository.findAll();
  }

  @Override
  public User findById(String id) {
    return repository.getById(id);
  }

  @Override
  public User update(String id, User user) {
    user.getId();
    return repository.save(user);
  }
  
}
