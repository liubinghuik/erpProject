package com.accp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class testController {

	@GetMapping("/hello1")
    @ResponseBody
    public String hello1(){
        return "hello1";
   	}
	
    @PostMapping("/hello2")
    @ResponseBody
    public String hello2(String username,int password){
        return username;
    }
}
