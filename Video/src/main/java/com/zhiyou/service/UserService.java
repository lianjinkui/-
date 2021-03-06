package com.zhiyou.service;

import java.util.List;

import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Service;

import com.zhiyou.model.User;

@Service
public interface UserService {
	void add(User user); // 方法名保持与对应mapper中的id一致

	void update(User user); // 参数与mapper中的parameterType一致

	List<User> selectAll(); // 返回值与mapper中的resultType一致

	User selectById(int id);

	User selectByAccounts(String email, String accounts, HttpServletResponse response);
}
