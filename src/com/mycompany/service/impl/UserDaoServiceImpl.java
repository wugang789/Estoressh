package com.mycompany.service.impl;

import java.util.List;

import com.mycompany.dao.UserDao;
import com.mycompany.entity.UserEntity;
import com.mycompany.service.UserDaoService;

public class UserDaoServiceImpl implements UserDaoService {
private UserDao userDao;
/**
 * 用户注册
 */
	public void RegisterUser(UserEntity userEntity) {
      try {
		userDao.RegisterUser(userEntity);
	} catch (Exception e) {
        e.printStackTrace();
	}
		
	}
	/**
	 * 用户登录
	 */
@SuppressWarnings("unchecked")
public List UserLogin(String name, String password) {
       List list=null;
       try {
		list=userDao.UserLogin(name, password);
	} catch (Exception e) {
       e.printStackTrace();
	}
	
	return list;
}
    /**
     * 查询用户是否存在
     */
	@SuppressWarnings("unchecked")
	public List FindUserExist(String username) {
		List list=null;
		try {
			list=userDao.FindUserExist(username);
		} catch (Exception e) {
          e.printStackTrace();
		}
		return list;
	}
	
	/**
	 * 确认用户修改密码
	 */
	public void ModifyPassword(String username,
			UserEntity userEntity) {
            try {
				userDao.ModifyPassWord(username, userEntity);
			} catch (Exception e) {
              e.printStackTrace();
			}
            
	}
	public UserDao getUserDao() {
		return userDao;
	}
	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}
	/**
	 * 后台用户登录
	 */
	@SuppressWarnings("unchecked")
	public List loginManager(String username, String password) {
		List list=userDao.loginManager(username, password);
		return list;
	}
}
