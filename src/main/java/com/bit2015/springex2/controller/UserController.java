package com.bit2015.springex2.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.bit2015.springex2.vo.UserVo;

@Controller
@RequestMapping("/user")
public class UserController {
    
	
	/*@RequestMapping("joinform")*/
	@RequestMapping(value="join",method = RequestMethod.GET)  /*여기는 get방식*/
	public String joinform(){
      return "/WEB-INF/views/user/joinform.jsp";
    }
	
	@RequestMapping(value="join",method = RequestMethod.POST)       /*여기는 post방식*/
	public String join(@ModelAttribute UserVo vo){
		System.out.println(vo);
		return "redirect:/index";
	}
	
	@RequestMapping("login")
	@ResponseBody
	public String login(){
		return "login page";
	}
}
