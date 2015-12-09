package day1.data.tester;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;

import day2.data.entity.Address;
import day2.data.entity.Student;
import day2.data.entity.User;

public class UserTester {
	public static void main(String[] args) {
		
		Address address=new Address();
		address.setPincode(112233);
		address.setCity("New Delhi");
		
		Address address2=new Address();
		address2.setPincode(998877);
		address2.setCity("Mumbai");
		
		
		Address address3=new Address();
		address3.setPincode(774411);
		address3.setCity("Chennai");
		
		List<Address> addresses=new ArrayList<Address>();
		addresses.add(address);
		addresses.add(address2);
		addresses.add(address3);
		
		User user=new User();
		user.setuName("Nitin");
		//user.setuAddress(address);
		
		/*user.setOfficeAddress(address);
		user.setHomeAddress(address2);*/
		
		
		/*User user2=new User();
		user2.setuName("Sangram");
		user2.setuAddress(address2);*/
		
		user.setListOfAddresses(addresses);
		
		
		//loading the hibernate.cfg.xml file details
		SessionFactory sessionFactory = new AnnotationConfiguration()
				.configure().buildSessionFactory();
		
		//create a Session interface ref for all the transaction
		Session session=sessionFactory.openSession();
		
		
		//Starting the transaction for DB operations
		session.beginTransaction();		
		
		//Asking the HB to persist these objects in DB
		// save() will fire Insert query
		session.save(user);
		//session.save(user2);
		
		
		User user2=(User)session.load(User.class, 1);
		System.out.println(user2.getListOfAddresses().get(0).getCity());
		
		session.getTransaction().commit();
		session.close();		
		
	}
}

