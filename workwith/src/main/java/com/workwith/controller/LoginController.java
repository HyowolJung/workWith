package com.workwith.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.workwith.vo.MemberVO;

@Controller
public class LoginController {
	@RequestMapping("/login")
	public String login() {
		return "login.do";
	}
	
	@RequestMapping(value = "login.do", method = RequestMethod.POST)
	public String loginAction(@RequestParam("userId") String userId, @RequestParam("userPw")String userPw, Model model, MemberVO vo) {
			System.out.println(userId);
			model.addAttribute("userId", userId);
			model.addAttribute("userPw", userPw);
			
			System.out.println(model.addAttribute("userId", userId));
	
		return "Home";
			
	}

}
