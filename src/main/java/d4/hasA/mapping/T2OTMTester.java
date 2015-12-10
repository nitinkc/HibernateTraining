package d4.hasA.mapping;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;

public class T2OTMTester {

	public static void main(String[] args) {
		/* In this example the primary key is not declared to be int
		 * String type is set and manually set. It works*/
		
		M2CellPhone cell1 = new M2CellPhone();
		//Forcing the Primary key
		cell1.setModelNo("A1B1");
		cell1.setModel("Nexus 5");
		//SET USER AFTER IT HAS BEEN INSTANTIATED
		
		M2CellPhone cell2 = new M2CellPhone();
		//Forcing the Primary key
		cell2.setModelNo("A1B2");
		cell2.setModel("Samsung 6");
		
		M2CellPhone cell3 = new M2CellPhone();
		//Forcing the Primary key
		cell3.setModelNo("A1B3");
		cell3.setModel("iPhone 4");
		
		List<M2CellPhone> cellList = new ArrayList<M2CellPhone>();
		cellList.add(cell1);
		cellList.add(cell2);
		cellList.add(cell3);
		
		M2CellUser user = new M2CellUser();
		user.setUser("nitin");
		user.setCells(cellList);
		
		//Now set the users
		cell1.setUser(user);
		cell2.setUser(user);
		cell3.setUser(user);
		
		SessionFactory sessionFactory = new AnnotationConfiguration()
				.configure().buildSessionFactory();

		Session session = sessionFactory.openSession();
		session.beginTransaction();

		session.save(cell1);
		session.save(cell2);
		session.save(cell3);
		session.save(user);

		session.getTransaction().commit();
		session.close();
	}
}
