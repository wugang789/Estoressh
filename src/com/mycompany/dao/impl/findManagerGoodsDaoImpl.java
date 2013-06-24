package com.mycompany.dao.impl;

import java.util.List;

import org.hibernate.Query;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.mycompany.dao.findManagerGoodsDao;
import com.mycompany.entity.GoodsEntity;
import com.mycompany.entity.SmallType;

public class findManagerGoodsDaoImpl extends HibernateDaoSupport implements findManagerGoodsDao {
     /**
      * 查询大类所有的商品名称
      */
	@SuppressWarnings("unchecked")
	public List findBigTypes() {
	List list=this.getHibernateTemplate().find("from BigType");
	System.out.println(list);
		return list;
	}
      /**
       * 查询小类所有商品的名称
       */
	@SuppressWarnings("unchecked")
	public List<SmallType> findSmallTypes() {
		List<SmallType> list=this.getHibernateTemplate().find("from SmallType");
		System.out.println(list);
		return list;
	}
	
	/**
	 * 删除商品
	 */
	public void deleteGoods(GoodsEntity goodsEntity) {
       this.getHibernateTemplate().delete(goodsEntity);
	}
        
	   /**
	    * 查询所有商品
	    */
	@SuppressWarnings("unchecked")
	public List findAllGoods() {
		System.out.println("........................");
		String HQL="select new com.mycompany.entity.GoodsAndSmallType(t.id,t.goodsname,t.discount, tb.bigname,ts.smallName)" +
				"from " +
				"GoodsEntity as t,BigType as tb,SmallType as ts " +
				"where " +
				" tb.id=t.bigid and ts.id=t.smallid";
		Query query=getSession().createQuery(HQL);
		List list=query.list();
		System.out.println("......./////"+list);
		return list;
	}
	
	/**
	 * 查询商品通过ID
	 */
	@SuppressWarnings("unchecked")
	public List findGoodsById(Integer id) {
	List list=this.getHibernateTemplate().find("from GoodsEntity where id="+id);
		return list;
	}
	
	/**
	 * 查询商品，类别
	 */
	@SuppressWarnings("unchecked")
	public List findGoodsUnion(String anygoods,String textvalue) {
		String HQL=null;
         if(anygoods.equals("大类别")){
        	 HQL="from BigType where bigname like"+"'%"+textvalue+"%'";
        	 
         }else if(anygoods.equals("小类别")){
        	 HQL="from SmallType where smallName like"+"'%"+textvalue+"%'";
         }else {
        	 HQL="from GoodsEntity where goodsname like"+"'%"+textvalue+"%'";
		}
		 Query query=getSession().createQuery(HQL);
		 List list=query.list();
         System.out.println(list);
		return list;
	}
	
	/**
	 * 删除管理员
	 */
	public void deleteManager(Integer id) {
     
	 String HQL="update UserEntity set isDelete=1  where id="+id;
	 System.out.println(HQL);
	 Query query=getSession().createQuery(HQL);
		query.executeUpdate();
	}
	
	/**
	 * 查询所有管理员
	 */
	
	@SuppressWarnings("unchecked")
	public List findManager() {
		String HQL="from UserEntity where isDelete=0 and ismanager=1";
		Query query=getSession().createQuery(HQL);
		List list=query.list();
		//System.out.println(list);
		//List list=this.getHibernateTemplate().find("from UserEntity where ismanager=1");
		return list;
	}

}
