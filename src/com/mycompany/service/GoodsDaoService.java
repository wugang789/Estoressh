package com.mycompany.service;

import java.util.List;
/**
 * 商品的service
 * @author Administrator
 *
 */
public interface GoodsDaoService {
	
	/**
	 * 查询所有的商品信息
	 * @return
	 */
	
	@SuppressWarnings("unchecked")
	public abstract List SelectAllGoodsServlet();
	
	/**
	 * 商品信息里面的搜索
	 */
	
	@SuppressWarnings("unchecked")
	public abstract List searchGoods(String goodsName);
	
	/**
	 * 查看单个商品的详细信息
	 */
	@SuppressWarnings("unchecked")
	public abstract List FindSingleGoodsInfo(Integer id);

      /**
       * 查询特价商品【首页】
       */
   @SuppressWarnings("unchecked")
public abstract List  searchSpecialGoods();
   

}
