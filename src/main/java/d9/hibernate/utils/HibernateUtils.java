package d9.hibernate.utils;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;

public class HibernateUtils {
		private static SessionFactory sessionFactory = createSessionFactory();

		private static SessionFactory createSessionFactory() {
			try {
				sessionFactory = new AnnotationConfiguration().configure()
						.buildSessionFactory();
			} catch (Exception e) {
				e.printStackTrace();
			}
			return sessionFactory;
		}

		public static Session createSession() {
			return sessionFactory.openSession();
		}
}
