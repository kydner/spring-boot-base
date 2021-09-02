package com.domain.controllers;

import java.util.List;

import com.domain.models.user.User;
import com.domain.services.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.Api;

@Api(
  tags = "Users", 
  description = "Users"
)
@RestController
@RequestMapping("api/users")
public class UserController {

  @Autowired
  private UserService userService;

  @GetMapping("/")
  List<User> findAll() {
    return userService.findAll();
  }
}
