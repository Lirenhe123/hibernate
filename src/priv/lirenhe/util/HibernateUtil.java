package priv.lirenhe.util;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;

public class HibernateUtil {
	private static SessionFactory sessionFactory;
static{
		try{
			  sessionFactory = new Configuration().configure().buildSessionFactory();
		  
		}catch(Exception e){
			e.printStackTrace();
		}
	}
	public static Session openSession(){
		Session session = sessionFactory.openSession();
		return session;
	}
	public static void close(Session session){
		if(session!=null){
			session.close();
		}
		
	}

}
