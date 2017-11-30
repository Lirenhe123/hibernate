package priv.lirenhe.service.impl;

import priv.lirenhe.dao.PersonDAO;
import priv.lirenhe.dao.impl.PersonDAOImpl;
import priv.lirenhe.model.Person;
import priv.lirenhe.service.PersonService;

public class PersonServiceImpl implements PersonService{

	@Override
	public void savePerson(Person person) {
		PersonDAO personDAO=new PersonDAOImpl();
		personDAO.savePerson(person);
		
		
	}
		
}
