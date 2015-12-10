package d1.basic.singleTable;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;

public class LoadVsGet {

	/**
	 * 1. Load method Throws Exception orgghibernate.ObjectNotFoundException
	 *    if the Id is not found. Get methods returns null
	 * 
	 * 2. Load method returns a Proxy by default and DB won't hit until proxy is first invoked
	 *    while get method hits the DB everytime
	 *    
	 * 3. If sure that the id exists, use Load else use get   */
	public static void main(String[] args) {
		
		Plant plant=new Plant();
		plant.setpName("SunFlower");
		
		SessionFactory sessionFactory = new AnnotationConfiguration()
				.configure().buildSessionFactory();
		
		Session session=sessionFactory.openSession();
		
		session.beginTransaction();

		//session.save(plant);
		
		//select * from Plant where id 1;
		//Plant plant2=(Plant)session.load(Plant.class,1);
		
		
		Plant plant2=(Plant)session.load(Plant.class,1);
		System.out.println("Name of plant : "+plant2.getpName());
		
		session.getTransaction().commit();
		session.close();
	}

}
