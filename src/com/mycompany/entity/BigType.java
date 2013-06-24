package com.mycompany.entity;

import java.util.Set;

/**
 * 大类
 * @author Administrator
 *
 */
public class BigType {
	/**
	 * 大类ID
	 */
	private  Integer id;
	
	/**
	 * 大类名称
	 */
   private String bigname;
   
   /**
    * 商品实体引用
    * @return
    */
   /**
   private Set<GoodsEntity> goodsEntity;
   */
   
   /**
    * 小类的引用
    * @return
    */
   private Set<SmallType> smallTypes;

public Integer getId() {
	return id;
}

public void setId(Integer id) {
	this.id = id;
}

public String getBigname() {
	return bigname;
}

public void setBigname(String bigname) {
	this.bigname = bigname;
}


public Set<SmallType> getSmallTypes() {
	return smallTypes;
}

public void setSmallTypes(Set<SmallType> smallTypes) {
	this.smallTypes = smallTypes;
}

public BigType() {
}

public BigType(Integer id, String bigname,
		Set<SmallType> smallTypes) {
	super();
	this.id = id;
	this.bigname = bigname;
	this.smallTypes = smallTypes;
}

@Override
public String toString() {
	return "BigType [bigname=" + bigname + "," +
			" id=" + id + ", smallTypes=" + smallTypes + "]";
}


  
   
}
