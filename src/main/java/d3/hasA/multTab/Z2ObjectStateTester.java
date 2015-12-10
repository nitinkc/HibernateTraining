package d3.hasA.multTab;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;

public class Z2ObjectStateTester {
	public static void main(String[] args) {

		Apple apple=new Apple();
		//apple is transient now
		apple.setAppleId(101);
		apple.setAppleLocation("Kashmir");
		
		SessionFactory sessionFactory = new AnnotationConfiguration()
				.configure().buildSessionFactory();
		Session session = sessionFactory.openSession();
		session.beginTransaction();

		session.save(apple);
		
		session.getTransaction().commit();
		//Detached object
		session.close();

	}
}
