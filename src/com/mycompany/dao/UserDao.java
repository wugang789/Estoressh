package com.mycompany.dao;

import java.sql.SQLException;
import java.util.List;

import com.mycompany.entity.UserEntity;

public interface UserDao {
/**
 * 会员注册	
 * @throws SQLException 
 */
	public void RegisterUser(UserEntity userEntity);
/**
 * 会员登录
 * @throws Exception 
 */
  @SuppressWarnings("unchecked")
public List UserLogin(String UserName,String passWord);
	/**
	 * 查询此会员是否存在
	 * @throws Exception 
	 */
  @SuppressWarnings("unchecked")
public List FindUserExist(String username);
 
  /**
   * 密码确认修改
 * @throws SQLException 
   */
  public void ModifyPassWord(String username,UserEntity userEntity) throws SQLException;

  /**
   * 后台管理登录
   */
  @SuppressWarnings("unchecked")
public List loginManager(String username,String password);
  
  
}