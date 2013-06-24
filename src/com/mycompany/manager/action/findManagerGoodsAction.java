package com.mycompany.manager.action;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.mycompany.entity.BigType;
import com.mycompany.entity.GoodsAndSmallType;
import com.mycompany.entity.GoodsEntity;
import com.mycompany.entity.SmallType;
import com.mycompany.entity.UserEntity;
import com.mycompany.service.findManagerDaoService;

/**
 * 查找商品
 * 
 * @author Administrator
 * 
 */
@SuppressWarnings("serial")
public class findManagerGoodsAction extends BaseAction {
	private static final String SUCCESS = "success";
	private static final String SLSUCCESS = "slsuccess";
	private static final String FINDGOODS = "findgoods";
	private static final String DELETEGOODS = "deletegoods";
	private static final String DELETESUCCESS="deletesuccess";
	private static final String FINDSUCCESS = "findsuccess";
	private static final String FINDBIG = "findbig";
	private static final String FINDSMALL = "findsmall";
	private findManagerDaoService findManagerDaoService;
	private String anygoods;
	private String textvalue;
	private Integer id;

	/**
	 * 查找大类商品AJAX
	 * 
	 * @return
	 * @throws IOException
	 */
	@SuppressWarnings("unchecked")
	public String findBigtypeGoods() throws IOException {
		List list = findManagerDaoService.findBigtypeGoods();
		Map<Integer, String> map = new HashMap<Integer, String>();
		System.out.println(list);
		for (int i = 0; i < list.size(); i++) {
			BigType bigType = (BigType) list.get(i);
			map.put(bigType.getId(), bigType.getBigname());

		}

		System.out.println(map);
		getSession().setAttribute("map", map);
		return SUCCESS;
	}

	/**
	 * 查找小类商品Ajax
	 * 
	 * @param findManagerDaoService
	 */
	@SuppressWarnings("unchecked")
	public String findSmalltypeGoods() {
		List list = findManagerDaoService.findSmalltypeGoods();
		Map<Integer, String> map1 = new HashMap<Integer, String>();
		System.out.println(list);
		for (int i = 0; i < list.size(); i++) {
			SmallType smallType = (SmallType) list.get(i);
			map1.put(smallType.getId(), smallType.getSmallName());

		}
		getSession().setAttribute("mymap", map1);
		return SLSUCCESS;
	}

	/**
	 * 删除商品
	 * 
	 * @param findManagerDaoService
	 */

	public String deleteGoods(GoodsEntity goodsEntity) {
		findManagerDaoService.deleteGoods(goodsEntity);
		return DELETEGOODS;
	}

	/**
	 * 查询所有商品
	 * 
	 * @param findManagerDaoService
	 */
	@SuppressWarnings("unchecked")
	public String findAllGoods() {
		System.out.println("<<<<<<<<<<<<<,");
		List<GoodsAndSmallType> list1 = new ArrayList<GoodsAndSmallType>();
		List<GoodsAndSmallType> list = findManagerDaoService.findAllGoods();
		System.out.println(list);
		for (int i = 0; i < list.size(); i++) {
			GoodsAndSmallType goodsAndSmallType = (GoodsAndSmallType) list
					.get(i);
			list1.add(goodsAndSmallType);
		}
		getSession().setAttribute("mapgoods", list1);
		System.out.println(".............???/");
		return FINDGOODS;
	}

	/**
	 * 查询商品信息根据ID【商品详细信息】
	 * 
	 * @return
	 */
	@SuppressWarnings("unchecked")
	public String findGoodsById() {
		List list = findManagerDaoService.findGoodsById(id);
		List<GoodsEntity> list2 = new ArrayList<GoodsEntity>();
		for (int i = 0; i < list.size(); i++) {
			GoodsEntity goodsEntity = (GoodsEntity) list.get(i);
			list2.add(goodsEntity);
		}
		System.out.println(list2);
		getSession().setAttribute("findgoodsbyid", list2);
		return FINDSUCCESS;
	}

	/**
	 * 查询商品，类别信息
	 * 
	 * @param findManagerDaoService
	 */

	@SuppressWarnings("unchecked")
	public String findGoodsUnion() {
		System.out.println(anygoods + textvalue);
		List mylist = new ArrayList();
		List list = findManagerDaoService.findGoodsUnion(anygoods, textvalue);
		System.out.println(list);
		if (anygoods.equals("大类别")) {
			for (int i = 0; i < list.size(); i++) {
				BigType bgsgoods = (BigType) list.get(i);
				mylist.add(bgsgoods);
			}
			getSession().setAttribute("goodsbigsmall", mylist);
			return FINDBIG;
		} else if (anygoods.equals("小类别")) {
			for (int i = 0; i < list.size(); i++) {
				SmallType bgsgoods = (SmallType) list.get(i);
				mylist.add(bgsgoods);
			}
			getSession().setAttribute("goodsbigsmall", mylist);
			return FINDSMALL;
		} else {
			for (int i = 0; i < list.size(); i++) {
				GoodsEntity bgsgoods = (GoodsEntity) list.get(i);
				mylist.add(bgsgoods);
			}
			getSession().setAttribute("goodsbigsmall", mylist);
			return FINDSUCCESS;
		}

	}
	   /**
	    * 
	    * 查询所有的管理员
	    * @return
	    */
        @SuppressWarnings("unchecked")
		public String findManager(){
         List<UserEntity> list2=new ArrayList<UserEntity>();        	
        List list=findManagerDaoService.findManager();
        for (int i = 0; i <list.size(); i++) {
			UserEntity userEntity=(UserEntity)list.get(i);
			list2.add(userEntity);
		}	
        System.out.println(list2);
        getSession().setAttribute("myManager", list2);
        	return FINDSUCCESS;
        }
	
        /**
         * 删除管理员
         * @param findManagerDaoService
         */
     public String deleteManager(){
    	 System.out.println(id);
    	 
    	findManagerDaoService.deleteManger(id) ;
    	 
    	return DELETESUCCESS;
     }
        
	

	public void setFindManagerDaoService(
			findManagerDaoService findManagerDaoService) {
		this.findManagerDaoService = findManagerDaoService;
	}

	public findManagerDaoService getFindManagerDaoService() {
		return findManagerDaoService;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getAnygoods() {
		return anygoods;
	}

	public void setAnygoods(String anygoods) {
		this.anygoods = anygoods;
	}

	public String getTextvalue() {
		return textvalue;
	}

	public void setTextvalue(String textvalue) {
		this.textvalue = textvalue;
	}

}
