package com.baidu.service;

import com.baidu.domain.User;

public class UserServiceImpl {
	public static void main(String[] args) {
		User user = new User();
		user.setName("Avocado");
		user.setAge(12);
		user.show();
	}
}
