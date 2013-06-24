package com.mycompany.dao;

import java.util.List;

public interface memberManager {
 /**
  * 查询所有会员
  */
	@SuppressWarnings("unchecked")
	public abstract  List findAllMember();
	
	/**
	 * 删除会员
	 */
	public abstract void deleteMember(String username);
	
	/**
	 * 查询会员
	 */
	 @SuppressWarnings("unchecked")
	public abstract List findMember(String name);
	
}
