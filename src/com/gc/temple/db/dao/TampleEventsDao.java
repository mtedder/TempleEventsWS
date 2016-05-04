/**
 * 
 */
package com.gc.temple.db.dao;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Iterator;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.gc.temple.db.dto.Events;

/**
 * @author Maurice
 *
 */
public class TampleEventsDao {
	private static SessionFactory factory;

	/*
	 * Main method used to test other methods in this class.
	 * Comment out before deployment.
	 */
//	public static void main(String[] args) {
//		TampleEventsDao dao = new TampleEventsDao();
//		dao.listEvents();
//	}

	/**
	 * Default constructor
	 */
	public TampleEventsDao() {
		try {
			/**Load the hibernate.cfg.xml from the classpath**/
			Configuration cfg = new Configuration();
			cfg.setProperty("hibernate.connection.url", System.getenv("DATABASE_URL_PARAMS"));
			cfg.setProperty("hibernate.connection.username", System.getenv("DATABASE_USERNAME"));
			cfg.setProperty("hibernate.connection.password", System.getenv("DATABASE_PWD"));
			
			factory = cfg.configure().buildSessionFactory();
		} catch (Throwable ex) {
			System.err.println("Failed to create sessionFactory object." + ex);
			throw new ExceptionInInitializerError(ex);
		}
	}

	/*
	 * List all event from events table
	 */
	public List<Events> listEvents() {
		Session session = factory.openSession();
		Transaction tx = null;
		List<Events> events =null;
		try {
			tx = session.beginTransaction();
			Criteria crit = session.createCriteria(Events.class);
			crit.setMaxResults(50);
			events = crit.list();
//			List events = session.createQuery("FROM events").list();//hibernate query langauge
//			for(Events event:events){
//				System.out.println(event.getEventdesc());
//				System.out.println(event.getEventname());
//				System.out.println(event.getEventlocation());
//			}
			tx.commit();
		} catch (HibernateException e) {
			if (tx != null)
				tx.rollback();
			e.printStackTrace();
		} finally {
			session.close();
		}
		return events;
	}
}
