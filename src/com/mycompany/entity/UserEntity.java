package com.mycompany.entity;

import java.sql.Date;
import java.util.Set;

/**
 * 注册会员信息
 * @author Administrator
 *
 */
public class UserEntity {
	/**
	 * 出生日期
	 */
	private Date age;
	/**
	 * 电子邮件
	 */
	private String email="";
	/**
	 * Id数据库自动编号
	 */
	private Integer id=1;
	/**
	 * 会员名称
	 */
	private String name="";
	/**
	 * 会员密码
	 */
	private String password="";
	/**
	 * 会员职业
	 */
	private String profession="";
	/**
	 * 找回密码问题
	 */
	private String question="";
	/**
	 * 真实姓名
	 */
	private String reallyname="";
	/**
	 * 找回密码答案
	 */
	private String result="";
	/**
	 * 性别
	 * @return
	 */
	private String sex;
	
	/**
	 * 订单表中有个会员表外键
	 */
	private Set<OrderEntity> orderEntities;
    
	/**
	 * 是否是管理员
	 */
	private Integer ismanager;
	
    /**
     * 管理员是否删除
     * @return
     */
	private Integer isDelete;

	public Date getAge() {
		return age;
	}

	public void setAge(Date age) {
		this.age = age;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getProfession() {
		return profession;
	}

	public void setProfession(String profession) {
		this.profession = profession;
	}

	public String getQuestion() {
		return question;
	}

	public void setQuestion(String question) {
		this.question = question;
	}

	public String getReallyname() {
		return reallyname;
	}

	public void setReallyname(String reallyname) {
		this.reallyname = reallyname;
	}

	public String getResult() {
		return result;
	}

	public void setResult(String result) {
		this.result = result;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public Set<OrderEntity> getOrderEntities() {
		return orderEntities;
	}

	public void setOrderEntities(Set<OrderEntity> orderEntities) {
		this.orderEntities = orderEntities;
	}

	public Integer getIsmanager() {
		return ismanager;
	}

	public void setIsmanager(Integer ismanager) {
		this.ismanager = ismanager;
	}

	public Integer getIsDelete() {
		return isDelete;
	}

	public void setIsDelete(Integer isDelete) {
		this.isDelete = isDelete;
	}

	

	@Override
	public String toString() {
		return "UserEntity [age=" + age + ", email=" + email + ", id=" + id
				+ ", isDelete=" + isDelete + ", ismanager=" + ismanager
				+ ", name=" + name + ", orderEntities=" + orderEntities
				+ ", password=" + password + ", profession=" + profession
				+ ", question=" + question + ", reallyname=" + reallyname
				+ ", result=" + result + ", sex=" + sex + "]";
	}

	public UserEntity() {
	}

	public UserEntity(Date age, String email, Integer id, String name,
			String password, String profession, String question,
			String reallyname, String result, String sex,
			Set<OrderEntity> orderEntities, Integer ismanager, Integer isDelete) {
		super();
		this.age = age;
		this.email = email;
		this.id = id;
		this.name = name;
		this.password = password;
		this.profession = profession;
		this.question = question;
		this.reallyname = reallyname;
		this.result = result;
		this.sex = sex;
		this.orderEntities = orderEntities;
		this.ismanager = ismanager;
		this.isDelete = isDelete;
	}
	
	
	
}
