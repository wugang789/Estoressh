package com.mycompany.dao.impl;

import java.util.List;

import org.hibernate.Query;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.mycompany.dao.memberManager;

/**
 * 会员操作DAO
 * 
 * @author Administrator
 * 
 */
public class memberManagerDaoImpl extends HibernateDaoSupport implements
		memberManager {
	/**
	 * 查询所有的会员
	 */
	@SuppressWarnings("unchecked")
	public List findAllMember() {
		String HQL = "from UserEntity where ismanager=0 and isDelete=0";
		System.out.println(HQL);
		List list = this.getHibernateTemplate().find(HQL);
		System.out.println(HQL);
		return list;
	}

	/**
	 * 删除会员
	 */
	public void deleteMember(String name) {
		String HQL = "update UserEntity set isDelete=1 where name=" + "'"
				+ name + "'" + "and ismanager=0";
		System.out.println(HQL);
		Query query = getSession().createQuery(HQL);
		query.executeUpdate();
	}

	/**
	 * 查询会员
	 */
	@SuppressWarnings("unchecked")
	public List findMember(String name) {
		String HQL = "from UserEntity where isDelete=0 and name=" + "'" + name
				+ "'" + "and ismanager=0";
		Query query = getSession().createQuery(HQL);
		List list = query.list();
		return list;
	}

}
