package com.mycompany.entity;

public class GoodsAndSmallType {
	private int id;
	private String goodsname;
	private String discount;
	private String bigame;
	private String smallName;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getGoodsname() {
		return goodsname;
	}
	public void setGoodsname(String goodsname) {
		this.goodsname = goodsname;
	}
	public String getDiscount() {
		return discount;
	}
	public void setDiscount(String discount) {
		this.discount = discount;
	}
	public String getBigame() {
		return bigame;
	}
	public void setBigame(String bigame) {
		this.bigame = bigame;
	}
	public String getSmallName() {
		return smallName;
	}
	public void setSmallName(String smallName) {
		this.smallName = smallName;
	}
	@Override
	public String toString() {
		return "GoodsAndSmallType [bigame=" + bigame + ", discount=" + discount
				+ ", goodsname=" + goodsname + ", id=" + id + ", smallName="
				+ smallName + "]";
	}
	public GoodsAndSmallType(int id, String goodsname, String discount,
			String bigame, String smallName) {
		super();
		this.id = id;
		this.goodsname = goodsname;
		this.discount = discount;
		this.bigame = bigame;
		this.smallName = smallName;
	}
	public GoodsAndSmallType() {
	}
	
	
	
	

}
