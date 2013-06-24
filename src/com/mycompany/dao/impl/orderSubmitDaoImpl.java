package com.mycompany.dao.impl;

import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.hibernate.Query;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.mycompany.dao.orderSubmitDao;
import com.mycompany.entity.GoodsEntity;
import com.mycompany.entity.OrderDetailEntity;
import com.mycompany.entity.OrderEntity;
/**
 * 订单操作dao类
 * @author Administrator
 *
 */
public class orderSubmitDaoImpl extends HibernateDaoSupport implements
		orderSubmitDao {

	/**
	 * 订单提交
	 */

	@SuppressWarnings("unchecked")
	public void orderSubmit(OrderEntity orderEntity,
			Map<Integer, OrderDetailEntity> map) {
		// System.out.println(orderEntity);
		this.getHibernateTemplate().save(orderEntity);
		Iterator it = map.entrySet().iterator();
		while (it.hasNext()) {
			Map.Entry entry = (Map.Entry) it.next();
			OrderDetailEntity detailEntity = (OrderDetailEntity) entry
					.getValue();
		//	detailEntity.setOder_id(orderEntity.getOrderNumber());
			this.getHibernateTemplate().save(detailEntity);
		}
		System.out.println(map);
	}

	/**
	 * 查看已购买的订单
	 */
	@SuppressWarnings("unchecked")
	public List findAlreayBuyGoods(Integer id) {
		System.out.println(id);
		String HQL = "select new com.mycompany.entity.orderSubmitEntity(G.picture,O.dateTime,O.sign,O.orderNumber,T.price,T.number,T.goodsName)  "
				+ "from OrderEntity O ,OrderDetailEntity T ,GoodsEntity G where O.user_id="
				+ id
				+ " "
				+ "and"
				+ " O.orderNumber=T.oder_id and G.id=T.goodsId and O.isUserDeleteOrder=0";
		System.out.println(HQL);
		Query query = getSession().createQuery(HQL);
		List list = query.list();
		System.out.println(list);
		return list;
	}

	/**
	 *查询所有订单
	 */
	@SuppressWarnings("unchecked")
	public List findAllOrderList() {
		List list = this.getHibernateTemplate().find("from OrderEntity where isManagerDeleteOrder=0");
		return list;
	}

	/**
	 * 查看单个订单的详细信息
	 */

	@SuppressWarnings("unchecked")
	public List findSingleOrderList(String orderId) {
		String SQL = " select new com.mycompany.entity.detailOrderList(D.goodsName,D.number,D.price,G.picture,"
				+ "G.freight,E.reallyName,E.address,E.tel,E.bz)"
				+ "from OrderEntity E,OrderDetailEntity D ,GoodsEntity G where E.orderNumber="
				+ orderId + "and D.oder_id=" + orderId + " and D.goodsId=G.id";
		System.out.println(SQL);
		List list = this.getHibernateTemplate().find(SQL);
		return list;
	}

	/**
	 * 订单发货操作
	 */
	@SuppressWarnings("unchecked")
	public void sendGoods(String OrderId) {
		System.out.println(OrderId);
		// 1、更改订单中的发货标记
		String SQL = "update OrderEntity G set sign=" + "'" + '是' + "'"
				+ "where G.orderNumber=" + "'" + OrderId + "'";
		System.out.println(SQL);
		Query query = getSession().createQuery(SQL);
		System.out.println(SQL);
		query.executeUpdate();
		// 求的所有商品与 订单号的商品比较
		String sele = "from GoodsEntity";
		Query query1 = getSession().createQuery(sele);
		List list = query1.list();
		// 求得商品id
		String order = "from OrderDetailEntity where oder_id=" + "'" + OrderId
				+ "'";
		System.out.println(order);
		Query myorder = getSession().createQuery(order);
		List listorder = myorder.list();
		System.out.println("大小" + listorder.size());
		for (int i = 0; i < list.size(); i++) {
			GoodsEntity orderDetailEntity = (GoodsEntity) list.get(i);
			for (int j = 0; j < listorder.size(); j++) {
				OrderDetailEntity orderDetailEntity2 = (OrderDetailEntity) listorder
						.get(j);

//				//if (orderDetailEntity2.getGoodsId() == orderDetailEntity
//						.getId()) {
//					String MYHQL = "update  GoodsEntity E"
//							+ "  set E.stock=(select (E.stock-O.number) as a  from GoodsEntity E,OrderDetailEntity O where"
//							+ "  O.oder_id=" + "'" + OrderId + "'" + " and "
//							//+ " E.id=" + orderDetailEntity2.getGoodsId()
//							+ " and O.goodsId="
//							//+ orderDetailEntity2.getGoodsId() + ") "
//							//+ "where E.id=" + orderDetailEntity2.getGoodsId();
//					Query query2 = getSession().createQuery(MYHQL);
//					query2.executeUpdate();
//
//					String SHQL = "update  GoodsEntity E"
//							+ "  set E.number=(select (E.number+O.number) as d  from GoodsEntity E,OrderDetailEntity O where"
//							+ " O.oder_id=" + "'" + OrderId + "'"
//							+ " and E.id=" + orderDetailEntity2.getGoodsId()
//							+ "and O.goodsId="
//							+ orderDetailEntity2.getGoodsId() + ")"
//							+ " where E.id=" + orderDetailEntity2.getGoodsId();
//					Query query21 = getSession().createQuery(SHQL);
//					query21.executeUpdate();
	//			}

			}

		}

	}

	/**
	 * 查询已经发货的和未发货的订单
	 */
	@SuppressWarnings("unchecked")
	public List findAlreadySendOrder(String orderSign) {
		List list = this.getHibernateTemplate().find(
				"from OrderEntity where sign=" + "'" + orderSign + "'"+" and isManagerDeleteOrder=0");
		System.out.println(list);
		return list;
	}

	/**
	 * 管理员删除订单
	 */
	public void deleteOrderList(String orderId) {
		String QL = "update OrderEntity O set O.isManagerDeleteOrder=1 where O.orderNumber="+ "'"+ orderId+ "'";
		Query query1 = getSession().createQuery(QL);
		query1.executeUpdate();


	}
  /**
   *用户删除订单
   */
	public void userDeleteOrderList(String orderId) {
		String QL = "update OrderEntity O set O.isUserDeleteOrder=1 where O.orderNumber="+ "'"+ orderId+ "'";
		Query query1 = getSession().createQuery(QL);
		query1.executeUpdate();
		
	}

}
