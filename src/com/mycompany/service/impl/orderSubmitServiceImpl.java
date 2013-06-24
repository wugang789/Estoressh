package com.mycompany.service.impl;

import java.util.List;
import java.util.Map;

import com.mycompany.dao.orderSubmitDao;
import com.mycompany.entity.OrderDetailEntity;
import com.mycompany.entity.OrderEntity;
import com.mycompany.service.orderSubmitService;
/**
 * 订单service
 * @author Administrator
 *
 */
public class orderSubmitServiceImpl implements orderSubmitService {
	private orderSubmitDao odersubmit;

	/**
	 * 订单提交
	 */
	public void orderSubmit(OrderEntity orderEntity,
			Map<Integer, OrderDetailEntity> map) {
		odersubmit.orderSubmit(orderEntity, map);
	}

	public void setOdersubmit(orderSubmitDao odersubmit) {
		this.odersubmit = odersubmit;
	}

	public orderSubmitDao getOdersubmit() {
		return odersubmit;
	}

	/**
	 * 查看已经买到的宝贝
	 */
	@SuppressWarnings("unchecked")
	public List findAlreayBuyGoods(Integer id) {
		List list = odersubmit.findAlreayBuyGoods(id);
		return list;
	}

	/**
	 * 查询所有的订单
	 */
	@SuppressWarnings("unchecked")
	public List findAllOrderList() {
		List list = odersubmit.findAllOrderList();
		return list;
	}

	/**
	 * 查看单个订单信息
	 */
	@SuppressWarnings("unchecked")
	public List findSingleOrderList(String orderId) {
		List list = odersubmit.findSingleOrderList(orderId);
		return list;
	}

	public void sendGoods(String OrderId) {
		odersubmit.sendGoods(OrderId);
	}

	/**
	 * 查询已经发货和未发货的订单
	 */
	@SuppressWarnings("unchecked")
	public List findAlreadySendOrder(String orderSign) {
		List list = odersubmit.findAlreadySendOrder(orderSign);
		return list;
	}

	/**
	 *管理员 删除订单
	 */
	public void deleteOrderList(String orderId) {
	    odersubmit.deleteOrderList(orderId);
	}
  /**
   * 用户删除订单
   */
	public void userDeleteOrderList(String orderId) {
		odersubmit.userDeleteOrderList(orderId);
	}

}
