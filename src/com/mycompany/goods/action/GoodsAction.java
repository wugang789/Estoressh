package com.mycompany.goods.action;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.struts2.interceptor.ServletRequestAware;

import com.mycompany.entity.GoodsEntity;
import com.mycompany.service.GoodsDaoService;
/**
 * 商品action
 * @author Administrator
 *
 */
@SuppressWarnings("serial")
public class GoodsAction extends BaseAction  implements ServletRequestAware {
	private static final String ALLGOODS="allgoods";
	private static final String SEARCHGOODS="searchgoods";
	private static final String SEARCHFAIL="searchfail";
	private static final String SPECIAL="special";
	private HttpServletRequest request = null;
	 private GoodsDaoService goodsservice;
	 private String index;
     private String goodsName;
	
	/**
	  * 查询所有的商品
	  * @return
	  */
	@SuppressWarnings("unchecked")
	public String FindAllGoods(){
		HttpSession session=request.getSession();
		List<GoodsEntity> list1 = new ArrayList<GoodsEntity>();
	List list=goodsservice.SelectAllGoodsServlet();
	System.out.println(list);
       for (int i = 0; i <list.size(); i++) {
		GoodsEntity goodsEntity=(GoodsEntity)list.get(i);
		list1.add(goodsEntity);
	   }	
       session.setAttribute("list",list1);
		return ALLGOODS;
	}
	
	
	/**
	 * 查询单个商品
	 * @return
	 */
	private static int j=0;
     @SuppressWarnings("unchecked")
	public String SearchGoods(){
    	 HttpSession session=request.getSession();
    	 int currentPage = 1;//当前页
 		int pageSize = 4;//每页显示记录数
 		int count = 0;//总条数
 		int pageCount = 0;//总页数
	String index = request.getParameter("index");
	System.out.println(index+"????");
       String goodsName=request.getParameter("goodsName"); 
      if(goodsName==null){
      	goodsName=(String) session.getAttribute("goodsName");
      	
      }
        if(j!=0){
        	
        	if((String) session.getAttribute("goodsName")!=goodsName){
        		System.out.println("执行////");
        		 session.removeAttribute("goodsName");
        		System.out.println(goodsName);
        		 session.setAttribute("goodsName",goodsName);
        	}
        	}
     System.out.println(j);
       if(j==0){
       session.setAttribute("goodsName",goodsName);
         ++j;
       }
       
       System.out.println(goodsName);
 		List list1=goodsservice.searchGoods(goodsName);
 		System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
 		System.out.println(list1);
 		if(list1.size()==0){
          return  SEARCHFAIL;			
 		}
 		List<GoodsEntity> list = new ArrayList<GoodsEntity>();
		if(index!=null){
 			currentPage = Integer.valueOf(index);//记录当前页
		}
 		if(list1!=null){
 			for(int i =pageSize*currentPage-pageSize;i<(pageSize*currentPage>list1.size()?list1.size():pageSize*currentPage);i++) {
 					list.add((GoodsEntity)list1.get(i));
 			}
 			count = list1.size();
 		}
 		System.out.println(list);
 		if(list!=null){
 			System.out.println("<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<////////////");
 			pageCount = (count + pageSize -1)/pageSize;//通过总记录数计算总页数
 			session.setAttribute("mylist", list);
 			session.setAttribute("index", new Integer(currentPage));
 			session.setAttribute("pageCount", new Integer(pageCount));
 			session.setAttribute("count", new Integer(count));		
 		}
 		
    	 return SEARCHGOODS;
     }
	
     /**
      * 查询特价商品【首页】
      */
     @SuppressWarnings("unchecked")
	public String searchSpecialGoods(){
    	 HttpSession session=request.getSession();
 		List<GoodsEntity> list2 = new ArrayList<GoodsEntity>();
 		System.out.println(list2);
        List list=goodsservice.searchSpecialGoods();
        for (int i = 0; i <list.size(); i++) {
    		GoodsEntity goodsEntity=(GoodsEntity)list.get(i);
    		list2.add(goodsEntity);
    	   }	
         session.setAttribute("mylist2",list2);
	 	 return SPECIAL;
     }  
     
    
     
	public void setServletRequest(HttpServletRequest request) {
		this.request=request;
	}

	public void setGoodsservice(GoodsDaoService goodsservice) {
		this.goodsservice = goodsservice;
	}

	public GoodsDaoService getGoodsservice() {
		return goodsservice;
	}
    public HttpServletRequest getRequest() {
		return request;
	}

	public void setRequest(HttpServletRequest request) {
		this.request = request;
	}

	public String getIndex() {
		return index;
	}

	public void setIndex(String index) {
		this.index = index;
	}

	public String getGoodsName() {
		return goodsName;
	}

	public void setGoodsName(String goodsName) {
		this.goodsName = goodsName;
	}


}
