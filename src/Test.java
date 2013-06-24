import org.hibernate.cfg.Configuration;
import org.hibernate.tool.hbm2ddl.SchemaExport;


public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
//		Configuration con = new Configuration().configure();
//System.out.println(con.buildSessionFactory().openSession().connection());
//		SchemaExport se = new 		SchemaExport(con);
//		se.create(true, true);
Configuration con=new Configuration().configure();
SchemaExport se=new SchemaExport(con);
se.create(true, true);
	}

}
