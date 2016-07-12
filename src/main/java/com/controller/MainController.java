package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by eight on 2016-07-12.
 * 메인 컨트롤러
 */
@Controller
public class MainController{

  @GetMapping("/")
  public @ResponseBody String index(){
    return "index";
  }
  @GetMapping("/hello")
  public @ResponseBody String hello(){
    return "index";
  }
}
