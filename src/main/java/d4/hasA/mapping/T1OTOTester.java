package d4.hasA.mapping;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;

public class T1OTOTester {
	public static void main(String[] args) {
		
		M1SSNCard card = new M1SSNCard();
		card.setSsn(123456789);
		card.setIssuedBy("Ohio");
		
		M1Resident person = new M1Resident();
		person.setName("Nitin");
		person.setSsn(card);
		
		SessionFactory sessionFactory = new AnnotationConfiguration()
				.configure().buildSessionFactory();

		Session session = sessionFactory.openSession();
		session.beginTransaction();

		session.save(card);
		session.save(person);

		session.getTransaction().commit();
		session.close();
		
		
	}

}
