package com.mycompany.entity;

import java.math.BigDecimal;
import java.sql.Date;
import java.util.Set;

/**
 * 定义数据库商品信息实体类
 * 
 * */
public class GoodsEntity {
	/**
	 * 商品ID自动增长
	 */
	private Integer id;
	
//	/**
//	 * 大类ID
//	 */
//	private Integer bigid;
	
//	/**
//	 * 小类ID
//	 */
//	  private Integer smallid;
	  
	 /**
	  * 商品名称
	  */
	  private String  goodsname;
	  
	  /**
	   * 产地
	   */
	  private String goodsfrom;
	   
	  /**
	   * 上架时间
	   */
	  private Date createtime;
	  
	  /**
	   * 商品介绍
	   */
	  private String introduce;
	  
	  /**
	   * 原始价格
	   */
	  private BigDecimal originalprice;
	  
	  /**
	   * 当前价格
	   */
	  private BigDecimal currentprice;
	  
	  /**
	   * 以卖出商品数量
	   */
	  private Integer number;
	  
	  /**
	   * 商品图片地址
	   */
	  private String picture;
	  
	  /**
	   * 是否打折标志
	   */
	  private String discount;
	  
	  /**
	   * 邮费
	   * @return
	   */
	  private BigDecimal freight;
	  
	  /**
	   * 库存
	   * @return
	   */
	  private Integer stock;
	  
	  /**
	   * 订单明细
	   */
	  private Set orderDetail;

	public GoodsEntity() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "GoodsEntity [createtime=" + createtime + ", currentprice="
				+ currentprice + ", discount=" + discount + ", freight="
				+ freight + ", goodsfrom=" + goodsfrom + ", goodsname="
				+ goodsname + ", id=" + id + ", introduce=" + introduce
				+ ", number=" + number + ", orderDetail=" + orderDetail
				+ ", originalprice=" + originalprice + ", picture=" + picture
				+ ", stock=" + stock + "]";
	}

	public GoodsEntity(Integer id, String goodsname, String goodsfrom,
			Date createtime, String introduce, BigDecimal originalprice,
			BigDecimal currentprice, Integer number, String picture,
			String discount, BigDecimal freight, Integer stock, Set orderDetail) {
		super();
		this.id = id;
		this.goodsname = goodsname;
		this.goodsfrom = goodsfrom;
		this.createtime = createtime;
		this.introduce = introduce;
		this.originalprice = originalprice;
		this.currentprice = currentprice;
		this.number = number;
		this.picture = picture;
		this.discount = discount;
		this.freight = freight;
		this.stock = stock;
		this.orderDetail = orderDetail;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getGoodsname() {
		return goodsname;
	}

	public void setGoodsname(String goodsname) {
		this.goodsname = goodsname;
	}

	public String getGoodsfrom() {
		return goodsfrom;
	}

	public void setGoodsfrom(String goodsfrom) {
		this.goodsfrom = goodsfrom;
	}

	public Date getCreatetime() {
		return createtime;
	}

	public void setCreatetime(Date createtime) {
		this.createtime = createtime;
	}

	public String getIntroduce() {
		return introduce;
	}

	public void setIntroduce(String introduce) {
		this.introduce = introduce;
	}

	public BigDecimal getOriginalprice() {
		return originalprice;
	}

	public void setOriginalprice(BigDecimal originalprice) {
		this.originalprice = originalprice;
	}

	public BigDecimal getCurrentprice() {
		return currentprice;
	}

	public void setCurrentprice(BigDecimal currentprice) {
		this.currentprice = currentprice;
	}

	public Integer getNumber() {
		return number;
	}

	public void setNumber(Integer number) {
		this.number = number;
	}

	public String getPicture() {
		return picture;
	}

	public void setPicture(String picture) {
		this.picture = picture;
	}

	public String getDiscount() {
		return discount;
	}

	public void setDiscount(String discount) {
		this.discount = discount;
	}

	public BigDecimal getFreight() {
		return freight;
	}

	public void setFreight(BigDecimal freight) {
		this.freight = freight;
	}

	public Integer getStock() {
		return stock;
	}

	public void setStock(Integer stock) {
		this.stock = stock;
	}

	public Set getOrderDetail() {
		return orderDetail;
	}

	public void setOrderDetail(Set orderDetail) {
		this.orderDetail = orderDetail;
	}



}
