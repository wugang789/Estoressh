package com.mycompany.entity;

import java.util.Set;

/**
 * 小类
 * @author Administrator
 *
 */
public class SmallType {
 /**
  * 小类ID
  */
	private Integer id;
	
	/**
	 * 小类名称
	 */
	private String smallName;
     
//	/**
//	 * 大类Id
//	 */
//	private Integer bigid;
	/**
	 * 商品实体引用
	 */
	private Set<GoodsEntity> goodsEntity;

	@Override
	public String toString() {
		return "SmallType [goodsEntity=" + goodsEntity + ", id=" + id
				+ ", smallName=" + smallName + "]";
	}

	public SmallType(Integer id, String smallName, Set<GoodsEntity> goodsEntity) {
		super();
		this.id = id;
		this.smallName = smallName;
		this.goodsEntity = goodsEntity;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getSmallName() {
		return smallName;
	}

	public void setSmallName(String smallName) {
		this.smallName = smallName;
	}

	public Set<GoodsEntity> getGoodsEntity() {
		return goodsEntity;
	}

	public void setGoodsEntity(Set<GoodsEntity> goodsEntity) {
		this.goodsEntity = goodsEntity;
	}
	
	
}
