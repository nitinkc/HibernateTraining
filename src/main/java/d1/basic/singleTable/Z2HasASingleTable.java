package d1.basic.singleTable;

/**
 * HAS-A Relationship between User class and Address Class
 * One Table for all the classes  
 */

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;

import d1.basic.singleTable.H1Address;
import d1.basic.singleTable.H1User;

public class Z2HasASingleTable {
	public static void main(String[] args) {
		
		/* 3 address that are used in the User Class*/
		H1Address address1=new H1Address();
		address1.setPincode(112233);
		address1.setCity("New Delhi");
		
		H1Address address2=new H1Address();
		address2.setPincode(998877);
		address2.setCity("Mumbai");
		
		H1Address address3=new H1Address();
		address3.setPincode(774411);
		address3.setCity("Chennai");
		
		
		H1User user1=new H1User();
		//U_id is automatically set
		user1.setuName("Nitin");
		user1.setuAddress(address1);
		
		H1User user2=new H1User();
		user2.setuName("Sangram");
		user2.setuAddress(address2);
		
		H1User user3=new H1User();
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
		
		//Retreiving the data - Difference between get and load
		H1User h1User=(H1User)session.load(H1User.class, 1);
		System.out.println(h1User.getuId() + " - " + h1User.getuName() +" - "+ h1User.getuAddress().getCity());
		
		session.getTransaction().commit();
		session.close();		
		
	}
}

