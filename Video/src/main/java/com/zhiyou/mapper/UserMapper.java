package com.zhiyou.mapper;

import java.util.List;

import com.zhiyou.model.User;

public interface UserMapper {
	void add(User user);// 方法名与对应mapper中的id保持一致

	void update(User user);// 参数与mapper中的parameterType保持一致

	List<User> selectAll();// 返回参数与mapper中的resultType一致

	User selectById(int id);

	User selectByAccounts(String email);

}
