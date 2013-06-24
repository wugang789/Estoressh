package com.mycompany.entity;

import java.util.Date;

public class orderSubmitEntity {
	/**
	 * 图片地址
	 */
	private String picture;
	
	/**
	 * 订货时间
	 */
	private Date dateTime;
	
	/**
	 * 是否发货
	 */
	private String sign;
	
	/**
	 * 订单号
	 */
	private String orderNumber;
	
	/**
	 * 价格
	 */
	private Float price;
	
	/**
	 * 数量
	 */
	private Integer number;
    /**
     * 商品名称
     */
	private String goodsName;
	public orderSubmitEntity() {
	}
	public orderSubmitEntity(String picture, Date dateTime, String sign,
			String orderNumber, Float price, Integer number, String goodsName) {
		super();
		this.picture = picture;
		this.dateTime = dateTime;
		this.sign = sign;
		this.orderNumber = orderNumber;
		this.price = price;
		this.number = number;
		this.goodsName = goodsName;
	}
	@Override
	public String toString() {
		return "orderSubmitEntity [dateTime=" + dateTime + ", goodsName="
				+ goodsName + ", number=" + number + ", orderNumber="
				+ orderNumber + ", picture=" + picture + ", price=" + price
				+ ", sign=" + sign + "]";
	}
	public String getPicture() {
		return picture;
	}
	public void setPicture(String picture) {
		this.picture = picture;
	}
	public Date getDateTime() {
		return dateTime;
	}
	public void setDateTime(Date dateTime) {
		this.dateTime = dateTime;
	}
	public String getSign() {
		return sign;
	}
	public void setSign(String sign) {
		this.sign = sign;
	}
	public String getOrderNumber() {
		return orderNumber;
	}
	public void setOrderNumber(String orderNumber) {
		this.orderNumber = orderNumber;
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

	
	
	

}
