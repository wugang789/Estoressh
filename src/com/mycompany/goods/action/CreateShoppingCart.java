package com.mycompany.goods.action;

import java.io.IOException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import javax.servlet.ServletException;

import com.mycompany.entity.OrderDetailEntity;
import com.mycompany.entity.OrderEntity;
import com.mycompany.service.orderSubmitService;

/**
 * 后台订单,查询,删除等操作的action
 * 
 * @author Administrator
 * 
 */
@SuppressWarnings("serial")
public class CreateShoppingCart extends BaseAction {
	private OrderDetailEntity orderDetailEntity;
	private float totalMoney = 0.0f;
	private static final String SUBMITORDER = "submitorder";
	private orderSubmitService ordersubmitservice;
	private static final String CLEAR = "clear";
	private static final String FINDALLORDERLIST = "findallorderlist";
	private String orderId;
	private static final String FINDSINGLEORDERLIST = "findsingleorderlist";
	private static final String SENDGOODS = "sendgoods";
	private String orderSign;

	/**
	 * 订单实体
	 */
	private OrderEntity orderEntity;

	/**
	 * 立即购买
	 * 
	 * @throws IOException
	 * @throws ServletException
	 */
	@SuppressWarnings("unchecked")
	public String immediatelyBuyGoods() throws IOException, ServletException {
		// 1.判断用户是否登录

		String jsonString = "{\"a\":\"未登录\"}";
		if (getSession().getAttribute("username") != null) {
//			// 2.已登录检查购物车session中是否有商品
//			Map<Integer, OrderDetailEntity> map = (Map<Integer, OrderDetailEntity>) getSession()
//					.getAttribute("myshoppingcart");
//			if (map == null) {
//				// 购物车为空。创建购物车，跳转到购物车
//				map = new HashMap<Integer, OrderDetailEntity>();
//				map.put(orderDetailEntity.getGoodsId(), orderDetailEntity);
//				totalMoney = totalMoney + orderDetailEntity.getNumber()
//						* orderDetailEntity.getPrice();
//				// 保存总金额
//				System.out.println(totalMoney);
//				getSession().setAttribute("mytotal", totalMoney);
//				getSession().setAttribute("myshoppingcart", map);
//				String jsonLogin = "{\"a\":\"登录\"}";
//				getResponse().getWriter().write(jsonLogin);
//			} else {
//				Iterator it = map.entrySet().iterator();
//				while (it.hasNext()) {
//					Map.Entry entry = (Map.Entry) it.next();
//					System.out.println(entry.getValue());
//					// 购物车没有该商品
//					if (orderDetailEntity.getGoodsId() != entry.getKey()) {
//						map.put(orderDetailEntity.getGoodsId(),
//								orderDetailEntity);
//						getSession().setAttribute("myshoppingcart", map);
//						// 跳转到购物车
//
//						Iterator maps = map.entrySet().iterator();
//						while (maps.hasNext()) {
//							Map.Entry ent = (Map.Entry) maps.next();
//							System.out.println(ent.getValue());
//							OrderDetailEntity oEntity = (OrderDetailEntity) ent
//									.getValue();
//							totalMoney = totalMoney + oEntity.getNumber()
//									* oEntity.getPrice();
//						}
//						System.out.println(totalMoney);
//						getSession().setAttribute("mytotal", totalMoney);
//						String jsonLogin = "{\"a\":\"登录\"}";
//						getResponse().getWriter().write(jsonLogin);
//
//					}
//				}
//			}

		} else {
			// 提示登录
			getResponse().getWriter().write(jsonString);
		}

		return null;
	}

	/**
	 * 创建购物车保存到 session中
	 * 
	 * @throws IOException
	 */
	@SuppressWarnings("unchecked")
	public String saveShoppingCart() throws IOException {
		String jsonString = "{\"a\":\"添加购物车成功！\"}";
		Map<Integer, OrderDetailEntity> map = (Map<Integer, OrderDetailEntity>) getSession()
				.getAttribute("myshoppingcart");
		if (map == null) {
//			map = new HashMap<Integer, OrderDetailEntity>();
//			map.put(orderDetailEntity.getGoodsId(), orderDetailEntity);
//			getSession().setAttribute("myshoppingcart", map);
//			getResponse().getWriter().write(jsonString);
//		} else {
//			Iterator it = map.entrySet().iterator();
//			while (it.hasNext()) {
//				Map.Entry entry = (Map.Entry) it.next();
//				if (orderDetailEntity.getGoodsId() != entry.getKey()) {
//					map.put(orderDetailEntity.getGoodsId(), orderDetailEntity);
//					getSession().setAttribute("myshoppingcart", map);
//					getResponse().getWriter().write(jsonString);
//				} else {
//					String newjsonStr = "{\"a\":\"购物车已有此商品！\"}";
//					getResponse().getWriter().write(newjsonStr);
//				}
	//		}

		}

		return null;
	}

	/**
	 * 页面显示购物车商品数量
	 * 
	 * @return
	 * @throws IOException
	 */
	@SuppressWarnings("unchecked")
	public String getShoppingCartNum() throws IOException {
		Map<Integer, OrderDetailEntity> map = (Map<Integer, OrderDetailEntity>) getSession()
				.getAttribute("myshoppingcart");
		PrintWriter out = getResponse().getWriter();
		if (map == null) {
			out.print("0");
		} else {
			out.print(map.size());
		}
		return null;
	}

	/**
	 * 订单提交
	 */
	@SuppressWarnings("unchecked")
	public String submitOrderList() {
		Map<Integer, OrderDetailEntity> map = (Map<Integer, OrderDetailEntity>) getSession()
				.getAttribute("myshoppingcart");
		Iterator it = map.entrySet().iterator();
		while (it.hasNext()) {
			Map.Entry entry = (Map.Entry) it.next();
			OrderDetailEntity detailEntity = (OrderDetailEntity) entry
					.getValue();
			//detailEntity.setOder_id(orderEntity.getOrderNumber());
		}
		ordersubmitservice.orderSubmit(orderEntity, map);
		getSession().removeAttribute("myshoppingcart");
		getSession().removeAttribute("mytotal");
		return SUBMITORDER;
	}

	/**
	 * 判断购物车是否为空， 以及是否登录
	 * 
	 * @param orderDetailEntity
	 * @throws IOException
	 */
	@SuppressWarnings("unchecked")
	public String checkShoppingCart() throws IOException {
		String jsonS = "{\"b\":\"无购物车,请选择够商品！\"}";
		String js = "{\"b\":\"未登录\"}";
		if (getSession().getAttribute("username") != null) {
			Map<Integer, OrderDetailEntity> map = (Map<Integer, OrderDetailEntity>) getSession()
					.getAttribute("myshoppingcart");
			if (map == null) {
				getResponse().getWriter().write(jsonS);
			} else {
				String json = "{\"b\":\"有购物车\"}";
				getResponse().getWriter().write(json);
			}
		} else {
			getResponse().getWriter().write(js);
		}
		return null;
	}

	/**
	 * 清空购物车
	 * 
	 * @return
	 */
	public String clearShoppingCart() {
		getSession().removeAttribute("myshoppingcart");
		getSession().removeAttribute("mytotal");
		return CLEAR;
	}

	/**
	 * 查看已买到的宝贝
	 * 
	 * @param orderDetailEntity
	 * @throws IOException
	 */
	@SuppressWarnings("unchecked")
	public String findAlreayBuyGoods() throws IOException {
		String js = "{\"b\":\"未登录\"}";
		String bs = "{\"b\":\"登录\"}";
		if (getSession().getAttribute("username") != null) {
			Integer id = (Integer) getSession().getAttribute("userid");
			System.out.println("?????" + id);
			List list = ordersubmitservice.findAlreayBuyGoods(id);
			System.out.println(list);
			getSession().setAttribute("list1", list);
			getResponse().getWriter().write(bs);
		} else {
			getResponse().getWriter().write(js);
		}
		return null;
	}

	/**
	 *查询所有的订单
	 * 
	 * @param orderDetailEntity
	 */
	@SuppressWarnings("unchecked")
	public String findAllOrderList() {
		List list = ordersubmitservice.findAllOrderList();
		getSession().setAttribute("myorderlist", list);
		return FINDALLORDERLIST;
	}

	/**
	 * 查看单个订单信息
	 * 
	 * @param orderDetailEntity
	 */
	@SuppressWarnings("unchecked")
	public String findSingleOrderList() {
		System.out.println(orderId);
		List list = ordersubmitservice.findSingleOrderList(orderId);
		System.out.println(list);
		getSession().setAttribute("myorderlist", list);
		return FINDSINGLEORDERLIST;
	}

	/**
	 * 发货操作
	 * 
	 * @param orderDetailEntity
	 */
	public String sendGoods() {
		ordersubmitservice.sendGoods(orderId);
		return SENDGOODS;
	}

	/**
	 * 查询已经发货的订单
	 * 
	 * @param orderDetailEntity
	 * @throws UnsupportedEncodingException
	 */
	@SuppressWarnings("unchecked")
	public String findAlreadySendOrder() throws UnsupportedEncodingException {
		String sign = new String(orderSign.getBytes("ISO8859-1"), "UTF-8");
		List list = ordersubmitservice.findAlreadySendOrder(sign);
		getSession().setAttribute("areadysend", list);
		return SENDGOODS;
	}

	/**
	 * 查询未发货的订单
	 * 
	 * @param orderDetailEntity
	 * @throws UnsupportedEncodingException
	 */
	@SuppressWarnings("unchecked")
	public String findNotSendOrder() throws UnsupportedEncodingException {
		String sign = new String(orderSign.getBytes("ISO8859-1"), "UTF-8");
		List list = ordersubmitservice.findAlreadySendOrder(sign);
		System.out.println(list);
		getSession().setAttribute("notsend", list);
		return SENDGOODS;
	}

	/**
	 * 管理员删除订单
	 * 
	 * @param orderDetailEntity
	 */
	public String deleteOrderList(){
		ordersubmitservice.deleteOrderList(orderId);
		return SENDGOODS;
	}
	/**
	 * 用户删除订单
	 * @param orderDetailEntity
	 */
	public String userDeleteOrderList(){
		ordersubmitservice.userDeleteOrderList(orderId);
		return SUCCESS;
	}
	
	/**
	 * 删除订单跳转
	 * @param orderDetailEntity
	 */
	@SuppressWarnings("unchecked")
	public String findDeleteAlreadyBuyGoods(){
		Integer id = (Integer) getSession().getAttribute("userid");
		List list = ordersubmitservice.findAlreayBuyGoods(id);
		System.out.println(list);
		getSession().setAttribute("list1", list);
		return SUCCESS;
	}
	public void setOrderDetailEntity(OrderDetailEntity orderDetailEntity) {
		this.orderDetailEntity = orderDetailEntity;
	}

	public OrderDetailEntity getOrderDetailEntity() {
		return orderDetailEntity;
	}

	public void setOrderEntity(OrderEntity orderEntity) {
		this.orderEntity = orderEntity;
	}

	public OrderEntity getOrderEntity() {
		return orderEntity;
	}

	public void setOrdersubmitservice(orderSubmitService ordersubmitservice) {
		this.ordersubmitservice = ordersubmitservice;
	}

	public orderSubmitService getOrdersubmitservice() {
		return ordersubmitservice;
	}

	public String getOrderId() {
		return orderId;
	}

	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}

	public String getOrderSign() {
		return orderSign;
	}

	public void setOrderSign(String orderSign) {
		this.orderSign = orderSign;
	}

}
