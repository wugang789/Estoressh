package com.mycompany.service;

import java.util.List;

public interface memberManagerDaoService {
	
	/**
	 * 查询所有的会员
	 */
   @SuppressWarnings("unchecked")
public abstract List findAllMember();
   
   /**
    * 删除会员
    */
   public void deleteMember(String username);
   
   /**
    * 查询会员
    */
   @SuppressWarnings("unchecked")
public abstract List findMember(String name);
}
