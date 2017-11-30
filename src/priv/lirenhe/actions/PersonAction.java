package priv.lirenhe.actions;

import java.sql.Date;

import priv.lirenhe.model.Person;
import priv.lirenhe.service.PersonService;
import priv.lirenhe.service.impl.PersonServiceImpl;

public class PersonAction {
	
	private String username;
	private String password;
	private int age;
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	public String savePerson() throws Exception{
		System.out.println("********************************");
		Person person=new Person();
		person.setUsername(username);
		person.setPassword(password);
		person.setAge(age);
		Date registerDate=
				new Date(new java.util.Date().getTime());
		
		person.setRegisterDate(registerDate);
		System.out.println("********************************");
		try{
			System.out.println("********************************");
			PersonService personService =new PersonServiceImpl();
			personService.savePerson(person);
		}catch(Exception e){
			e.printStackTrace();
			System.out.println("=====================================================");
		}
		return "success";
		
	}


}
