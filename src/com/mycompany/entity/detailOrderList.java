package com.mycompany.entity;

import java.math.BigDecimal;

public class detailOrderList {
	/**
	 * 商品名称
	 */
	private String goodsName;
	/**
	 * 购买数量
	 */
	private Integer number;
	/**
	 * 商品价格
	 */
	private Float price;
	/**
	 * 商品图片地址
	 */
	private String picture;
	/**
	 * 邮费
	 * 
	 * @return
	 */
	private BigDecimal freight;

	 /**
	  * 真实姓名
	  */
	 private String reallyName;
	/**
	 * 联系地址
	 */
	private String address;
	/**
	 * 联系电话
	 */
	private String tel;
	/**
	 * 备注
	 */
	private String bz;
	public String getGoodsName() {
		return goodsName;
	}
	public void setGoodsName(String goodsName) {
		this.goodsName = goodsName;
	}
	public Integer getNumber() {
		return number;
	}
	public void setNumber(Integer number) {
		this.number = number;
	}
	public Float getPrice() {
		return price;
	}
	public void setPrice(Float price) {
		this.price = price;
	}
	public String getPicture() {
		return picture;
	}
	public void setPicture(String picture) {
		this.picture = picture;
	}
	public BigDecimal getFreight() {
		return freight;
	}
	public void setFreight(BigDecimal freight) {
		this.freight = freight;
	}
	public String getReallyName() {
		return reallyName;
	}
	public void setReallyName(String reallyName) {
		this.reallyName = reallyName;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	public String getBz() {
		return bz;
	}
	public void setBz(String bz) {
		this.bz = bz;
	}
	public detailOrderList(String goodsName, Integer number, Float price,
			String picture, BigDecimal freight, String reallyName,
			String address, String tel, String bz) {
		super();
		this.goodsName = goodsName;
		this.number = number;
		this.price = price;
		this.picture = picture;
		this.freight = freight;
		this.reallyName = reallyName;
		this.address = address;
		this.tel = tel;
		this.bz = bz;
	}
	@Override
	public String toString() {
		return "detailOrderList [address=" + address + ", bz=" + bz
				+ ", freight=" + freight + ", goodsName=" + goodsName
				+ ", number=" + number + ", picture=" + picture + ", price="
				+ price + ", reallyName=" + reallyName + ", tel=" + tel + "]";
	}
	public detailOrderList() {
	}
	
	
}
