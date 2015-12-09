package tester.db;

/**
 * HAS-A Relationship between User class and Address Class
 * One Table for all the classes  
 */

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;

import d2.data.hasA.singleTable.H2AddressHas_A;
import d2.data.hasA.singleTable.H2User;;

public class D3HasASingTabMultCol {
	public static void main(String[] args) {
		
		/* 3 address that are used in the User Class*/
		H2AddressHas_A myOfficeAddress=new H2AddressHas_A();
		myOfficeAddress.setPincode(112233);
		myOfficeAddress.setCity("New Delhi");
		
		H2AddressHas_A homeAddress=new H2AddressHas_A();
		homeAddress.setPincode(998877);
		homeAddress.setCity("Mumbai");
		
		H2AddressHas_A hisOfficeAddress=new H2AddressHas_A();
		hisOfficeAddress.setPincode(774411);
		hisOfficeAddress.setCity("Chennai");
		
		
		H2User user1=new H2User();
		//U_id is automatically set
		user1.setuName("Nitin");
		user1.setHomeAddress(homeAddress);
		user1.setuAddress(myOfficeAddress);
		
		H2User user2=new H2User();
		user2.setuName("Sangram");
		user2.setuAddress(homeAddress);
		
		H2User user3=new H2User();
		user3.setuName("Biloo");
		user3.setuAddress(hisOfficeAddress);
				
		
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
		H1User h1User=(H1User)session.load(H1User.class, 1);
		System.out.println(h1User.getuId() + " - " + h1User.getuName() +" - "+ h1User.getuAddress().getCity());
		
		session.getTransaction().commit();
		session.close();		
		
	}
}

