package com.mycompany.dao;

import java.util.List;

import com.mycompany.entity.BigType;
import com.mycompany.entity.GoodsEntity;
import com.mycompany.entity.SmallType;

public interface findManagerGoodsDao {

	/**
	 * 查询所有的大类商品名称
	 */
	 public abstract List<BigType> findBigTypes();
	 
	 /**
	  * 查找所有的大类商品
	  */
	public abstract List<SmallType> findSmallTypes();
	
	/**
	 * 商品删除
	 */
	 public abstract void deleteGoods(GoodsEntity  goodsEntity);

    /**
     * 查询所有商品
     */
    @SuppressWarnings("unchecked")
	public abstract List findAllGoods();

    /**
     * 通过ID查询商品信息
     */
    
    @SuppressWarnings("unchecked")
	public abstract List findGoodsById(Integer id);
    
    /**
     * 商品，类别查询
     */
    @SuppressWarnings("unchecked")
	public abstract List findGoodsUnion(String anygoods,String textvalue);
    
    /**
     * 查询管理员
     */
    @SuppressWarnings("unchecked")
	public abstract List findManager();
    
    
    /**
     *  查找管理员【管理员删除】
     */
     public abstract void deleteManager(Integer id);
    
    

}
