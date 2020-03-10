package com.service;

import com.dao.UserDao;
import com.pojo.registpojo;

public class UserService {
		UserDao ud = new UserDao();
		public registpojo finduser(String userId) {
			return ud.finduser(userId);
		}
}
