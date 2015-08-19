package com.bit2015.springex2.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class SpringexController {
    @RequestMapping("/index")
    public String index(){
    	System.out.println(1);
    	
    	return "/WEB-INF/views/index.jsp";
    }
} 
