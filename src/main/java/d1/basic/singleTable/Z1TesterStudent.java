package d1.basic.singleTable;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;

public class Z1TesterStudent {

	public static void main(String[] args) {
		Student student1=new Student();
		student1.setId(101);
		student1.setName("Nitin");
		
		Student student2=new Student();
		student2.setId(102);
		student2.setName("Sangram");
		
		//loading the hibernate.cfg.xml file details
		SessionFactory sessionFactory = new AnnotationConfiguration()
				.configure().buildSessionFactory();
		
		//create a Session interface ref for all the transaction
		Session session=sessionFactory.openSession();
		
		//Starting the transaction for DB operations
		session.beginTransaction();		
		
		//Asking the HB to persist these objects in DB
		// save() will fire Insert query
		session.save(student1);
		session.save(student2);
		
		//Commit the data before saving
		session.getTransaction().commit();

		
		// Fetching the data from the database (BEFORE COMMITTING)
		Student student=(Student)session.get(Student.class, 2);
		System.out.println("User name is : "+student.getName());
		
		//Finish the session
		session.close();		
	}
}
