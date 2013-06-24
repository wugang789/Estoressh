package com.mycompany.dao.impl;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.mycompany.dao.addManagerDao;
import com.mycompany.entity.UserEntity;

public class addManagerImpl extends HibernateDaoSupport implements addManagerDao {

	public void addManager(UserEntity userEntity) {
         this.getHibernateTemplate().save(userEntity);	
	}

}
