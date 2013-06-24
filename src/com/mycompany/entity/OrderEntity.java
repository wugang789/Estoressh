package com.mycompany.entity;
import java.util.Date;
import java.util.Set;
/**
 * 订单实体类
 * @author Administrator
 *
 */
public class OrderEntity {
	/**
	 * 订单ID
	 */
	 private Integer id;
	
	
	 /**
	   * 订单编号
	   */
	  private String orderNumber;
	
	/**
	 * 昵称
	 */
	 private String name;
	 
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
	  * 邮寄方式
	  */
	private String post;
	
	/**
	 * 付款方式
	 */
	private String pay;
	
	/**
	 * 备注
	 */
	 private String bz;
	 
	 /**
	  *   是否已发货
	  */
	 private String sign;
	 
	 /**
	  * 订单与订单明细关系：一对多 one to many 表现为:数据库中：订单明细表有个订单表的外键
	  */
      private Set<OrderDetailEntity> orderDetailEntities;
    
      /**
       * 订单提交时间
       * @return
       */
      private Date dateTime;
      
      /**
       * 管理员是否删除订单，0为删除，1删除。默认0
       */
      private Integer isManagerDeleteOrder;
      /**
       * 用户是否删除订单，0为删除，1删除。默认0
       */
      private Integer isUserDeleteOrder;
	public OrderEntity() {
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getOrderNumber() {
		return orderNumber;
	}
	public void setOrderNumber(String orderNumber) {
		this.orderNumber = orderNumber;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
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
	public String getPost() {
		return post;
	}
	public void setPost(String post) {
		this.post = post;
	}
	public String getPay() {
		return pay;
	}
	public void setPay(String pay) {
		this.pay = pay;
	}
	public String getBz() {
		return bz;
	}
	public void setBz(String bz) {
		this.bz = bz;
	}
	public String getSign() {
		return sign;
	}
	public void setSign(String sign) {
		this.sign = sign;
	}
	public Set<OrderDetailEntity> getOrderDetailEntities() {
		return orderDetailEntities;
	}
	public void setOrderDetailEntities(Set<OrderDetailEntity> orderDetailEntities) {
		this.orderDetailEntities = orderDetailEntities;
	}
	public Date getDateTime() {
		return dateTime;
	}
	public void setDateTime(Date dateTime) {
		this.dateTime = dateTime;
	}
	public Integer getIsManagerDeleteOrder() {
		return isManagerDeleteOrder;
	}
	public void setIsManagerDeleteOrder(Integer isManagerDeleteOrder) {
		this.isManagerDeleteOrder = isManagerDeleteOrder;
	}
	public Integer getIsUserDeleteOrder() {
		return isUserDeleteOrder;
	}
	public void setIsUserDeleteOrder(Integer isUserDeleteOrder) {
		this.isUserDeleteOrder = isUserDeleteOrder;
	}
	@Override
	public String toString() {
		return "OrderEntity [address=" + address + ", bz=" + bz + ", dateTime="
				+ dateTime + ", id=" + id + ", isManagerDeleteOrder="
				+ isManagerDeleteOrder + ", isUserDeleteOrder="
				+ isUserDeleteOrder + ", name=" + name
				+ ", orderDetailEntities=" + orderDetailEntities
				+ ", orderNumber=" + orderNumber + ", pay=" + pay + ", post="
				+ post + ", reallyName=" + reallyName + ", sign=" + sign
				+ ", tel=" + tel + "]";
	}
	public OrderEntity(Integer id, String orderNumber, String name,
			String reallyName, String address, String tel, String post,
			String pay, String bz, String sign,
			Set<OrderDetailEntity> orderDetailEntities, Date dateTime,
			Integer isManagerDeleteOrder, Integer isUserDeleteOrder) {
		super();
		this.id = id;
		this.orderNumber = orderNumber;
		this.name = name;
		this.reallyName = reallyName;
		this.address = address;
		this.tel = tel;
		this.post = post;
		this.pay = pay;
		this.bz = bz;
		this.sign = sign;
		this.orderDetailEntities = orderDetailEntities;
		this.dateTime = dateTime;
		this.isManagerDeleteOrder = isManagerDeleteOrder;
		this.isUserDeleteOrder = isUserDeleteOrder;
	}

	
	
}
