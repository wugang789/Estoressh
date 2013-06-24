package com.mycompany.service.impl;

import java.util.List;

import com.mycompany.dao.GoodsDao;
import com.mycompany.service.GoodsDaoService;

public class GoodsDaoServiceImpl implements GoodsDaoService{
 private GoodsDao goodsDao;
/**
  * 查询所有的商品信息
  */
	@SuppressWarnings("unchecked")
	public List SelectAllGoodsServlet() {
     List list=goodsDao.SelectAllGoods();
     System.out.println(list);
		return list;
	}
	/**
	 * 首页的商品搜索
	 */
	@SuppressWarnings("unchecked")
	public List searchGoods(String goodsName) {
         List list=null;
         try {
			list=goodsDao.searchGoods(goodsName);
		} catch (Exception e) {
            e.printStackTrace();
		}
		return list;
	}
	
	/**
	 * 查看单个商品的详细信息
	 */
	
	@SuppressWarnings("unchecked")
	public List FindSingleGoodsInfo(Integer id) {
        List list=null;
        try {
			list=goodsDao.SelectGoodsSingleDetail(id);
		} catch (Exception e) {
           e.printStackTrace();
		}
		return list;
	}

	
	 public GoodsDao getGoodsDao() {
			return goodsDao;
		}
		public void setGoodsDao(GoodsDao goodsDao) {
			this.goodsDao = goodsDao;
		}
		/**
		 * 查询特价商品【首页】
		 */
		@SuppressWarnings("unchecked")
		public List searchSpecialGoods() {
             List list= goodsDao.searchSpecialGoods();
			return list;
		}
		
}
