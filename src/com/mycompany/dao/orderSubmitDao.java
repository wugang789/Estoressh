package com.mycompany.dao;

import java.util.List;
import java.util.Map;

import com.mycompany.entity.OrderDetailEntity;
import com.mycompany.entity.OrderEntity;

public interface orderSubmitDao {
 /**
  * 订单提交	
  */
	public abstract void orderSubmit(OrderEntity orderEntity,Map<Integer,OrderDetailEntity> map);
	
/**
 * 查看已经购买到的宝贝
 */
	@SuppressWarnings("unchecked")
	public abstract List findAlreayBuyGoods(Integer id);
	
	/**
	 * 查询所有订单
	 */
	@SuppressWarnings("unchecked")
	public abstract List findAllOrderList();
	
	/**
	 * 查看单个订单的详细信息
	 */
	@SuppressWarnings("unchecked")
	public abstract List findSingleOrderList(String orderId);
	/**
	 * 发货操作
	 */
	public abstract void sendGoods(String OrderId);
	
	/**
	 * 查询已出货订单
	 */
	@SuppressWarnings("unchecked")
	public abstract List findAlreadySendOrder(String orderSign);
	
	/**
	 * 管理员订单删除
	 */
	public abstract void deleteOrderList(String orderId);
	
	/**
	 * 用户删除已经发货的订单
	 */
	public abstract void userDeleteOrderList(String orderId);
	
}
