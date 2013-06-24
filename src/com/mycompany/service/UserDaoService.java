package com.mycompany.service;

import java.util.List;

import com.mycompany.entity.UserEntity;

public interface UserDaoService {
/**
 * 用户注册
 * @param userEntity
 */
 public abstract void RegisterUser(UserEntity userEntity);
 
 /**
  * 用户登录
  */
 @SuppressWarnings("unchecked")
public abstract List UserLogin(String name,String password);
	/**
	 * 查询此用户是否存在
	 * 
	 */
 public abstract List<UserEntity> FindUserExist(String username);
 /**
  * 确认密码修改
  */
 public abstract void ModifyPassword(String username,UserEntity userEntity);
 
 /**
  * 后台用户登录
  */
 @SuppressWarnings("unchecked")
public abstract List loginManager(String username,String password);
}
