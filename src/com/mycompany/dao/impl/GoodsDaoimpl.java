package com.mycompany.dao.impl;
import java.util.List;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.mycompany.dao.GoodsDao;
import com.mycompany.entity.GoodsEntity;
/**
 * 商品接口的实现
 * @author Administrator
 *
 */
public class GoodsDaoimpl extends HibernateDaoSupport implements GoodsDao{
    /**
     * 查看所有的商品（未打折商品）
     */
	@SuppressWarnings("unchecked")
	public List SelectAllGoods(){
		List list = this.getHibernateTemplate().find("from GoodsEntity where discount='否'order by id DESC");
		return list;
	}
	
     /**
      *查看打折的商品 
      */
	
	public List<GoodsEntity> SelectGoodsDiscount(
			Integer discount) {
		// TODO Auto-generated method stub
		return null;
	}
       
	/**
	 * 查看单个商品的详细信息
	 * @throws Exception 
	 */
	
	@SuppressWarnings("unchecked")
	public List SelectGoodsSingleDetail(Integer id){
        String sql="from GoodsEntity where id="+id;
        List list=this.getHibernateTemplate().find(sql);
		return list;
	}
	
	
	public List<GoodsEntity> selectGoodsByName(String GoodsName) {
		return null;
	}
	
          /**
            *首页的商品搜索 
         * @throws Exception 
            */
	
	@SuppressWarnings("unchecked")
	public List searchGoods(String goodsName){
		String sql="from GoodsEntity where goodsName like '%"+goodsName+"%'";
		List list=this.getHibernateTemplate().find(sql);
		return list;
	}
         /**
          * 查询特价商品【首页】
          */
		@SuppressWarnings("unchecked")
		public List searchSpecialGoods() {
		 List list=this.getHibernateTemplate().find("from GoodsEntity where discount='是'order by id DESC");	
		 System.out.println(list);
			return list;
		}

		

}
