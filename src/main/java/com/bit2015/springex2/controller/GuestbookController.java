package com.bit2015.springex2.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/guestbook/*")
public class GuestbookController {

	@ResponseBody
	@RequestMapping
	public String list(){
		return "guestbookController:list()";
	}
}
