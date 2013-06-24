import java.util.Iterator;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Transaction;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;


public class ExerciseTest extends HibernateDaoSupport{
	
	
	public ExerciseTest(){
		//String sql="select name,sex from UserEntity";
		//Query query=staticSession.getsSession().createQuery("from UserEntity");
		/**
		 * 绑定参数
		 */
//		String sql="from UserEntity where name=:name";
//		//String sql="select count(*) from UserEntity";
//		Query query=staticSession.getsSession().createQuery(sql);
//		System.out.println(query.uniqueResult());
//		List list=query.list();
//		Iterator it=list.iterator();
//		int i=0;
//      while(it.hasNext()){
//       Object[] user=(Object[])it.next();	  
//    	System.out.println(user[1]);  
//       
//       
//      }
		Transaction tx=null;
		try {
			tx=staticSession.getsSession().beginTransaction();
			Query query=staticSession.getsSession().getNamedQuery("ww");
			System.out.println("...................................................");
		    System.out.println(query.list()); 
			System.out.println("...............................<<<<<....................");
			System.out.println("......<<<<<<<<<<<<<<<<<<<<<<<,.................................");
//			Iterator it=list.iterator();
//			tx.commit();
//			while (it.hasNext()) {
//				Object[] object = (Object[]) it.next();
//				System.out.println(object[1]);
//				
//			}
		} catch (Exception e) {
			e.printStackTrace();
			if(tx!=null){
				tx.rollback();
			}
		}finally{
			staticSession.getsSession().close();
		}
	}
public static void main(String[] args) {
	new ExerciseTest();
	
}
}
