package day1.data.tester;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;

import day2.data.entity.Apple;
import day2.data.entity.Student;

public class ObjectStateTester {
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
		session.close();

	}
}
