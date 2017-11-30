package priv.lirenhe.dao.impl;

import org.hibernate.Session;
import org.hibernate.Transaction;

import priv.lirenhe.dao.PersonDAO;
import priv.lirenhe.model.Person;
import priv.lirenhe.util.HibernateUtil;

public class PersonDAOImpl implements PersonDAO{

	@Override
	public void savePerson(Person person) {
		Session session=HibernateUtil.openSession();
		Transaction tx=session.beginTransaction();
		try{
			session.save(person);
			tx.commit();
			
		}catch(Exception e){
			if(tx!=null){
				tx.rollback();
			}
			
		}finally{
			HibernateUtil.close(session);
		}
	}
	
}
