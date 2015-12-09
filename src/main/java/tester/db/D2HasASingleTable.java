package tester.db;

/**
 * HAS-A Relationship between User class and Address Class
 * One Table for all the classes  
 */

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;

import d2.data.hasA.singleTable.Address;
import d2.data.hasA.singleTable.User;

public class D2HasASingleTable {
	public static void main(String[] args) {
		
		/* 3 address that are used in the User Class*/
		Address address1=new Address();
		address1.setPincode(112233);
		address1.setCity("New Delhi");
		
		Address address2=new Address();
		address2.setPincode(998877);
		address2.setCity("Mumbai");
		
		Address address3=new Address();
		address3.setPincode(774411);
		address3.setCity("Chennai");
		
		
		User user1=new User();
		//U_id is automatically set
		user1.setuName("Nitin");
		user1.setuAddress(address1);
		
		User user2=new User();
		user2.setuName("Sangram");
		user2.setuAddress(address2);
		
		User user3=new User();
		user3.setuName("Biloo");
		user3.setuAddress(address3);
				
		
		//loading the hibernate.cfg.xml file details
		SessionFactory sessionFactory = new AnnotationConfiguration()
				.configure().buildSessionFactory();
		
		//create a Session interface ref for all the transaction
		Session session=sessionFactory.openSession();
		
		
		//Starting the transaction for DB operations
		session.beginTransaction();		
		
		//Asking the HB to persist these objects in DB
		// save() will fire Insert query
		session.save(user1);
		session.save(user2);
		session.save(user3);
		
		// Retreiving the data - Difference between get and load
		User user=(User)session.load(User.class, 1);
		System.out.println(user.getuId() + " - " + user.getuName() +" - "+ user.getuAddress().getCity());
		
		session.getTransaction().commit();
		session.close();		
		
	}
}

