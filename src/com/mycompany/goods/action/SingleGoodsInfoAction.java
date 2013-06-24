package com.mycompany.goods.action;

import java.util.ArrayList;
import java.util.List;

import com.mycompany.entity.GoodsEntity;
import com.mycompany.service.GoodsDaoService;

/**
 * 用户详细信息action
 * @author Administrator
 *
 */
public class SingleGoodsInfoAction extends  BaseAction {
	private static final long serialVersionUID = -7351154169409043131L;
	private static final String FINDDETAIL="finddetail";
	private GoodsDaoService goodsservice;

	/**
     * 每个商品ID
     */
	private Integer id;

	
	/**
	 * 查看商品详细信息
	 */
    @SuppressWarnings("unchecked")
	public String FindSingledetail(){
    	List<GoodsEntity> list1=new ArrayList<GoodsEntity>();
    	List list=goodsservice.FindSingleGoodsInfo(id);
    	for (int i = 0; i <list.size(); i++) {
    		GoodsEntity goodsEntity=(GoodsEntity)list.get(i);
    		list1.add(goodsEntity);
			
		}
          getSession().setAttribute("list",list1);
    	return FINDDETAIL;
    }
    
    public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}
	public GoodsDaoService getGoodsservice() {
		return goodsservice;
	}

	public void setGoodsservice(GoodsDaoService goodsservice) {
		this.goodsservice = goodsservice;
	}
	
}
