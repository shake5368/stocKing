package com.stocking.application.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StockController {

  @RequestMapping("/")
  public String index() {
    return "King";
  }
  
}
