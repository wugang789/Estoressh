package com.mycompany.dao.impl;

import java.math.BigDecimal;

import org.hibernate.Query;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.mycompany.dao.addGoodsManager;
import com.mycompany.entity.BigType;
import com.mycompany.entity.GoodsEntity;
import com.mycompany.entity.SmallType;
/**
 * 管理员添加商品impl
 * @author Administrator
 *
 */
public class addGoodsManagerImpl extends HibernateDaoSupport implements addGoodsManager {
  /**
   * 添加大类商品
   */
	public void addBigtypeGoods(BigType bigType) {
		this.getHibernateTemplate().save(bigType);

	}

	/**
	 * 添加商品
	 */
	public void addGoods(GoodsEntity goodsEntity) {
           this.getHibernateTemplate().save(goodsEntity);
	}

	/**
	 * 添加小类商品
	 */
	
	public void addSmalltypeGoods(SmallType smallType) {
           this.getHibernateTemplate().save(smallType);
	}

     /**
      * 商品信息修改
      */
	public void modifyGoodsInfo(BigDecimal originalprice,
			BigDecimal currentprice, String discount, BigDecimal freight,
			Integer stock, String introduce,Integer id) {
		System.out.println(originalprice);
		  String HQL="update GoodsEntity" +
	 		" set originalprice="+originalprice+","+
	 		"currentprice="+currentprice+","+
	 		"discount="+"'"+discount+"'"+","+
	 		"freight="+freight+","+
	 		"stock="+stock+","+
	 		"introduce="+"'"+introduce+"'"+"where id="+id;
		  System.out.println(HQL);
		 Query query=getSession().createQuery(HQL);
		  query.executeUpdate();		
	}
     
	/**
	 * 商品信息删除
	 */
	public void deleteGoodsInfo(Integer id) {
      String HQL="delete  from GoodsEntity where id="+id;
      Query query=getSession().createQuery(HQL);
		query.executeUpdate();
	}

}
