package test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import entity.Person;
import entity.User; 

public class Test {

	/**
	 * @param args
	 */
	
	public static void main(String[] args) {		
		
		ApplicationContext ct= new ClassPathXmlApplicationContext("applicationContext.xml");
		
		/*User sUser= (User) ct.getBean("user");
		System.out.println(sUser);*/
		
		/*User sUser= (User) ct.getBean("user2");
		System.out.println(sUser);*/
		
		/*User sUser= (User) ct.getBean("user3");
		System.out.println(sUser);*/
		
		/*Person ps=(Person) ct.getBean("person");
		System.out.println(ps);*/
		
		Person ps=(Person) ct.getBean("person2");
		System.out.println(ps);
		
		//≤‚ ‘
	}

}
