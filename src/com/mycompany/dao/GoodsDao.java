package com.mycompany.dao;
import java.util.List;
import com.mycompany.entity.GoodsEntity;
public interface GoodsDao {
	/**
	 * 查询所有的商品
	 * @param conn
	 * @return
	 * @throws Exception 
	 */
	@SuppressWarnings("unchecked")
	public abstract List SelectAllGoods();
	 /**
	  * 查询折扣商品，1打折的商品。0新品
	  * @param conn
	  * @param discount
	  * @return
	  */
	
	public abstract List<GoodsEntity> SelectGoodsDiscount(Integer discount);
	
  /**
   * 按名字查询商品信息
   */
	
	public abstract List<GoodsEntity> selectGoodsByName(String GoodsName);
	/**
	 * 查询单个商品的详细信息
	 * @param conn
	 * @param id
	 * @return
	 * @throws Exception 
	 */
	
	@SuppressWarnings("unchecked")
	public abstract List SelectGoodsSingleDetail(Integer id);
	
	/**
	 * 首页的商品搜索
	 * @param conn
	 * @param goodsName
	 * @return
	 * @throws Exception 
	 */
	 @SuppressWarnings("unchecked")
	public List searchGoods(String goodsName);

     /**
      * 首页显示特价商品【查询特价商品】
      */
   
	 @SuppressWarnings("unchecked")
	public List searchSpecialGoods();
	 

}
