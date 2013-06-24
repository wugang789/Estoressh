package com.mycompany.dao.impl;

import java.sql.SQLException;
import java.util.List;

import org.hibernate.Query;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.mycompany.dao.UserDao;
import com.mycompany.entity.UserEntity;

public class UserDaoimpl extends HibernateDaoSupport implements UserDao{
    /**
     * 注册会员
     * @throws SQLException 
     */
	public void RegisterUser(UserEntity userEntity) {
      System.out.println("////");
      this.getHibernateTemplate().setFlushMode(HibernateTemplate.FLUSH_COMMIT);
		this.getHibernateTemplate().save(userEntity);
		
	
	}

	/**
	 * 用户登录
	 */
	@SuppressWarnings("unchecked")
	public List UserLogin(String UserName,
			String passWord) {
		String sql="FROM UserEntity WHERE name='"+UserName+"'AND password='"+passWord+"'"
		+"and ismanager=0 and isDelete=0" ;
		Query query=getSession().createQuery(sql);
		List list=query.list();
		return list;
	}
     /**
      * 查询此用户是否存在
     * @throws Exception 
      */
	@SuppressWarnings("unchecked")
	public List FindUserExist(String username){
		String sql="FROM UserEntity where name='"+username+"'";
		System.out.println(sql);
		List list=this.getHibernateTemplate().find(sql);
		return list;
	}
/**
 * 确认密码修改
 * @throws SQLException 
 */
	public void ModifyPassWord(String username,UserEntity userEntity) throws SQLException {
    String sql="update UserEntity set password=? where  name="+"'"+username+"'";
    System.out.println(sql);
    Query query=getSession().createQuery(sql);
    query.setString(0,userEntity.getPassword());
    query.executeUpdate();
    
    
	}
/**
 * 后台用户登录
 */
@SuppressWarnings("unchecked")
public List loginManager(String username,String password) {
	String HQL="from UserEntity where name="+"'"+username+"'"+" and "+"password="+"'"+password+"'"+"and ismanager=1 and isDelete=0";
	System.out.println(HQL);
	Query query=getSession().createQuery(HQL);
	List list=query.list();
	System.out.println(list);
	return list;
}

}
