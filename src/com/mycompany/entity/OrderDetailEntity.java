package com.mycompany.entity;

import java.util.Set;

/**
 * 商品详细信息
 * @author Administrator
 *
 */
public class OrderDetailEntity {
//	/**
//	 * 商品编号
//	 */
//  private Integer goodsId;
  
  /**
   * id
   */
  private Integer id;
  
 
  /**
   * 商品价格
   */
  private Float price;
  
  /**
   * 购买数量
   */
  private Integer number;
  
  /**
   * 商品名称
   */
  private String goodsName;
  /**
   * 集合类goods
   */
  private Set goods;
public OrderDetailEntity() {
}
@Override
public String toString() {
	return "OrderDetailEntity [goods=" + goods + ", goodsName=" + goodsName
			+ ", id=" + id + ", number=" + number + ", price=" + price + "]";
}
public OrderDetailEntity(Integer id, Float price, Integer number,
		String goodsName, Set goods) {
	super();
	this.id = id;
	this.price = price;
	this.number = number;
	this.goodsName = goodsName;
	this.goods = goods;
}
public Integer getId() {
	return id;
}
public void setId(Integer id) {
	this.id = id;
}
public Float getPrice() {
	return price;
}
public void setPrice(Float price) {
	this.price = price;
}
public Integer getNumber() {
	return number;
}
public void setNumber(Integer number) {
	this.number = number;
}
public String getGoodsName() {
	return goodsName;
}
public void setGoodsName(String goodsName) {
	this.goodsName = goodsName;
}
public Set getGoods() {
	return goods;
}
public void setGoods(Set goods) {
	this.goods = goods;
}


}
