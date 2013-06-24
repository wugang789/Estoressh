package com.mycompany.dao;

import java.math.BigDecimal;

import com.mycompany.entity.BigType;
import com.mycompany.entity.GoodsEntity;
import com.mycompany.entity.SmallType;

public interface addGoodsManager {
   /**
    * 添加大类商品
    */
	public abstract void addBigtypeGoods(BigType bigType);
	
	
	/**
	 * 添加小类商品
	 */
	public abstract void addSmalltypeGoods(SmallType smallType);
	
	/**
	 * 添加商品
	 */
	public abstract void addGoods(GoodsEntity goodsEntity);
	
	/**
	 * 商品信息修改
	 */
	public abstract void modifyGoodsInfo(BigDecimal originalprice,BigDecimal currentprice,String discount,
			BigDecimal freight,Integer stock,String introduce,Integer id);



   /**
    *  商品信息删除
    */
    public abstract void deleteGoodsInfo(Integer id);




}
