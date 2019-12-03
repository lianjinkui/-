package com.zhiyou.service.impl;

import java.io.IOException;
import java.util.List;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zhiyou.mapper.UserMapper;
import com.zhiyou.model.User;
import com.zhiyou.service.UserService;

@Service
public class UserServiceImpl implements UserService {
	@Autowired
	UserMapper mapper;

	public void add(User user) {
		mapper.add(user);

	}

	public void update(User user) {
		mapper.update(user);

	}

	public List<User> selectAll() {
		// TODO Auto-generated method stub
		return mapper.selectAll();
	}

	public User selectById(int id) {
		// TODO Auto-generated method stub
		return mapper.selectById(id);
	}

	public User selectByAccounts(String email, String password, HttpServletResponse response) {

		response.setCharacterEncoding("utf-8");
		User user = mapper.selectByAccounts(email);

		if (user != null) {
			if (email.equals(user.getAccounts()) && password.equals(user.getPassword())) {
				try {
					response.getWriter().write("success");
					return user;

				} catch (IOException e) {
					e.printStackTrace();
				}
			} else {

				try {
					response.getWriter().write("用户名或密码错误");
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		} else {
			try {
				response.getWriter().write("用户名不存在");
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		return null;

	}

}
