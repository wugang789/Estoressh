package com.mycompany.service.impl;
import java.math.BigDecimal;

import com.mycompany.dao.addGoodsManager;
import com.mycompany.entity.BigType;
import com.mycompany.entity.GoodsEntity;
import com.mycompany.entity.SmallType;
import com.mycompany.service.managerAddGoodsService;

public class managerAddGoodsImpl implements managerAddGoodsService {
private addGoodsManager addGoodsManager;
 	
	/**
	 * 添加大类商品
	 */
   
	public void addBigtypeGoods(BigType bigType) {
         addGoodsManager.addBigtypeGoods(bigType);
	}
	
	
    /**
     * 添加商品
     */
	
	
	public void addGoods(GoodsEntity goodsEntity) {
        addGoodsManager.addGoods(goodsEntity);
	}
	
    /**
     * 添加小类商品
     */
	
	public void addSmalltypeGoods(SmallType smallType) {
        addGoodsManager.addSmalltypeGoods(smallType);
	}

	public void setAddGoodsManager(addGoodsManager addGoodsManager) {
		this.addGoodsManager = addGoodsManager;
	}

	/**
	 * 商品信息修改
	 * @param addGoodsManager
	 */
	public void modifyGoodsInfo(BigDecimal originalprice,
			BigDecimal currentprice, String discount, BigDecimal freight,
			Integer stock, String introduce, Integer id) {
      addGoodsManager.modifyGoodsInfo(originalprice, currentprice, discount, freight, stock, introduce, id);
		
	}

    /**
     * 商品信息删除
     */
	public void deleteGoodsInfo(Integer id) {
       addGoodsManager.deleteGoodsInfo(id);
		
	}
}
