package com.domain.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.Api;

@Api(
  tags = "Hello", 
  description = "Hello Test"
)
@RestController
public class HelloController {
  
  @GetMapping("/")
  public String hello() {
    return "Hello Guys";
  }
}
