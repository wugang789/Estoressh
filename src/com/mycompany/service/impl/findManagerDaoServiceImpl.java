package com.mycompany.service.impl;

import java.util.List;

import com.mycompany.dao.findManagerGoodsDao;
import com.mycompany.entity.BigType;
import com.mycompany.entity.GoodsEntity;
import com.mycompany.entity.SmallType;
import com.mycompany.service.findManagerDaoService;
/**
 * 查找商品
 * @author Administrator
 *
 */
public class findManagerDaoServiceImpl implements findManagerDaoService {
    private findManagerGoodsDao findManagerGoodsDao;
	/**
     * 查找大类商品
     */
	public List<BigType> findBigtypeGoods() {
        List<BigType> list= findManagerGoodsDao.findBigTypes();
         
         return list;
		
	}
	
	/**
	 * 查找小类商品
	 */
	public List<SmallType> findSmalltypeGoods() {
        List<SmallType> list=findManagerGoodsDao.findSmallTypes();
		return list;
	}
	
	/**
	 * 删除商品
	 * @param findManagerGoodsDao
	 */
	public void deleteGoods(GoodsEntity goodsEntity) {
            findManagerGoodsDao.deleteGoods(goodsEntity);		
	}
	
	
	
	
	
	
	
	public void setFindManagerGoodsDao(findManagerGoodsDao findManagerGoodsDao) {
		this.findManagerGoodsDao = findManagerGoodsDao;
	}
	public findManagerGoodsDao getFindManagerGoodsDao() {
		return findManagerGoodsDao;
	}
	
	
    /**
     * 查询所有商品
     */
	@SuppressWarnings("unchecked")
	public List findAllGoods() {
		List list=findManagerGoodsDao.findAllGoods();
		return list;
	}

	/**
	 * 通过ID查询商品信息
	 */
	@SuppressWarnings("unchecked")
	public List findGoodsById(Integer id) {
          List list=findManagerGoodsDao.findGoodsById(id);
		return list;
	}
    
	
	/**
	 * 查询商品，类别信息
	 */
	@SuppressWarnings("unchecked")
	public List findGoodsUnion(String anygoods, String textvalue) {
       List list=findManagerGoodsDao.findGoodsUnion(anygoods, textvalue);
		return list;
	}

	 /**
	  * 删除管理员
	  */
	public void deleteManger(Integer id) {
         findManagerGoodsDao.deleteManager(id);		
	}
  /**
   * 查询所有管理员
   */
	@SuppressWarnings("unchecked")
	public List findManager() {
		List list=findManagerGoodsDao.findManager();
		return list;
	}


}
