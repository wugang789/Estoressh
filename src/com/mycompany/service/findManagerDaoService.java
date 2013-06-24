package com.mycompany.service;

import java.util.List;

import com.mycompany.entity.BigType;
import com.mycompany.entity.GoodsEntity;
import com.mycompany.entity.SmallType;

/**
 * 查找商品
 * @author Administrator
 *
 */
public interface findManagerDaoService {
	/**
	 * 查找大类商品
	 */
	public List<BigType> findBigtypeGoods();

	/**
	 *  查找小类商品
	 */
	public List<SmallType> findSmalltypeGoods();
	
	/**
	 * 删除商品
	 */
	public void deleteGoods(GoodsEntity goodsEntity);
	
	/**
	 * 查找所有商品
	 */
	
	@SuppressWarnings("unchecked")
	public List findAllGoods();
	
	/**
	 * 通过ID查询商品
	 */
	
	@SuppressWarnings("unchecked")
	public List findGoodsById(Integer id);
	
    /**
     * 查找类，商品信息	
     */
	@SuppressWarnings("unchecked")
	public List findGoodsUnion(String anygoods,String textvalue);
	
	/**
	 * 查找所有的管理员
	 */
	@SuppressWarnings("unchecked")
	public List findManager();
	
	/**
	 * 删除管理员
	 */
	public abstract void deleteManger(Integer id);
	
	
	
	
}
