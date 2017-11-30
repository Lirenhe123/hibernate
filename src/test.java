import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


public class test {
	private static SessionFactory sessionFactory;

	public static void main(String agrs[]){
		try{
			System.out.println("lsdflaslfl");
			  sessionFactory = new Configuration().configure().buildSessionFactory();
			  System.out.println("lsdflaslfl");
			  Session session = sessionFactory.openSession();
			  session.close();
			  System.out.println("lsdflaslfl");
			  if(session instanceof Session)
					System.out.println("lsdflaslfl");
		}catch(Exception e){
			e.printStackTrace();
		}
	}

}
