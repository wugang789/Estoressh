package com.mycompany.manager.action;

import com.mycompany.entity.BigType;
import com.mycompany.entity.GoodsEntity;
import com.mycompany.entity.SmallType;
import com.mycompany.service.managerAddGoodsService;
/**
 * manager 添加商品action
 * @author Administrator
 *
 */
public class managerAddGoodsAction {
	private static final String ADDSUCCESS="addsuccess";
	private static final String SMALLSUCCESS="smallsuccess";
	private static final String GOODS="goods";
	private static final String MODIFYSUCCESS="modifysuccess";
	private static final String DELETESUCCESS="deletesuccess";
	private managerAddGoodsService managerAddGoodsService;
	private BigType bigType;
	private SmallType smallType;
	private GoodsEntity goodsEntity;
	private Integer id;

	
/**
 * 添加大类商品
 * @return
 */
	
	public String addBigtypeGoods(){
        managerAddGoodsService.addBigtypeGoods(bigType);		
		return ADDSUCCESS;
	}
   
	/**
	 *   添加小类商品
	 * @return
	 */
	
	public String addSmalltypeGoods(){
		managerAddGoodsService.addSmalltypeGoods(smallType);
		return SMALLSUCCESS;
	}
	
	
	/**
	 * 添加商品
	 * @return
	 */
	
	public String addGoods(){
		goodsEntity.setPicture("goodsPicture/"+goodsEntity.getPicture());
		System.out.println(goodsEntity.getPicture());
		managerAddGoodsService.addGoods(goodsEntity);
		return GOODS;
	}

	/**
	 * 商品信息修改
	 * @return
	 */
	public String modifyGoodsInfo(){
		System.out.println(goodsEntity.getId());
		managerAddGoodsService.modifyGoodsInfo(goodsEntity.getOriginalprice(),
				goodsEntity.getCurrentprice(),goodsEntity.getDiscount(),
				goodsEntity.getFreight(),goodsEntity.getStock(),
				goodsEntity.getIntroduce(),goodsEntity.getId());
		
		
		return MODIFYSUCCESS;
	}
	
	/**
	 * 商品信息删除
	 * @return
	 */
	public String deleteGoodsInfo(){
		managerAddGoodsService.deleteGoodsInfo(getId());
		return DELETESUCCESS;
	}
	
	
	public GoodsEntity getGoodsEntity() {
		return goodsEntity;
	}

	public void setGoodsEntity(GoodsEntity goodsEntity) {
		this.goodsEntity = goodsEntity;
	}
	
	public void setManagerAddGoodsService(managerAddGoodsService managerAddGoodsService) {
		this.managerAddGoodsService = managerAddGoodsService;
	}

	public managerAddGoodsService getManagerAddGoodsService() {
		return managerAddGoodsService;
	}
	public BigType getBigType() {
		return bigType;
	}

	public void setBigType(BigType bigType) {
		this.bigType = bigType;
	}
	public SmallType getSmallType() {
		return smallType;
	}

	public void setSmallType(SmallType smallType) {
		this.smallType = smallType;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getId() {
		return id;
	}

}
