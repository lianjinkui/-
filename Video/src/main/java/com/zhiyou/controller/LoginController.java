package com.zhiyou.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.zhiyou.model.User;
import com.zhiyou.service.UserService;

@Controller
public class LoginController {

	@Autowired
	UserService userService;

	@RequestMapping("/loginUser")
	public void loginUser(String email, String password, HttpServletRequest request, HttpServletResponse response) {

		User user = userService.selectByAccounts(email, password, response);
		if (user != null) {

			request.getSession().setAttribute("user", user.getAccounts());
		}
	}

}
