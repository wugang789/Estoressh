package com.mycompany.service;

import java.util.List;
import java.util.Map;

import com.mycompany.entity.OrderDetailEntity;
import com.mycompany.entity.OrderEntity;

public interface orderSubmitService {
 /**
  * 订单提交
  */
	public abstract void orderSubmit(OrderEntity orderEntity,Map<Integer,OrderDetailEntity> map);
	
	/**
	 *查看已经买到的宝贝
	 */
	@SuppressWarnings("unchecked")
	public abstract List findAlreayBuyGoods(Integer id);
	
	/**
	 * 查询所有订单
	 */
	@SuppressWarnings("unchecked")
	public abstract List findAllOrderList();
	
	/**
	 * 查看单个订单信息
	 */
	@SuppressWarnings("unchecked")
	public abstract List findSingleOrderList(String orderId);
	
	/**
	 * 订单发送
	 */
	public abstract void sendGoods(String OrderId);
	
	/**
	 * 查询已经出货和未出货的商品
	 * 
	 */
	@SuppressWarnings("unchecked")
	public abstract List findAlreadySendOrder(String orderSign);
	/**
	 * 管理员删除订单
	 */
	public abstract void deleteOrderList(String orderId);
	/**
	 * 用户删除订单
	 */
	public abstract void userDeleteOrderList(String orderId);
	
}
