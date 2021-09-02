package com.domain.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.Api;

@Api(
  tags = "Users", 
  description = "Users"
)
@RestController
public class UserController {


  @GetMapping("api/users")
  String findAll() {
    return "userService.findAll()";
  }
}
