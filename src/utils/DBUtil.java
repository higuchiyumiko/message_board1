package utils;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class DBUtil {
	private static final String PERSISTENCE_UNIT_NAME="message_board1";
	private static EntityManagerFactory emf;

	public static EntityManager createEntiryManager() {
		return getEntityManagerFactory().createEntityManager();
	}
	private static EntityManagerFactory getEntityManagerFactory() {
		if(emf==null) {
			emf=Persistence.createEntityManagerFactory(PERSISTENCE_UNIT_NAME);
		}
		return emf;
	}
}
