import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


public class staticSession {
	private static SessionFactory factory;
	private static Configuration con;
	private static ThreadLocal<Session> tl = new ThreadLocal<Session>();
	static{
		con=new Configuration().configure();
		factory=con.buildSessionFactory();
	}
	public static Session getsSession(){
		Session session = tl.get();//以当前线程的id作为Key，取出一个Session对象
		  if (session == null) {
		   session =factory.openSession();//如果为空，则获取一个新的Session对象，并存入tl中
		   tl.set(session);
		  }
		return session;
		
	}
public static void CloseSession(){
	Session session=tl.get();
	if(session!=null){
		session.close();
		tl.set(null);
	}
}
}
