package com.zhiyou.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor

public class User {
	private int id;
	private String accounts;
	private String phone;
	private String password;
	private String nickname;
	private String sex;
	private String birthday;
	private String address;
	private String imgurl;
	private Data createtime;

}
