package fr.mc.app;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import fr.mc.app.hibernate.entities.OrdersEntity;

public class DraftClass {

	private static SessionFactory factory;
	public static void main(String[] args) {
		
		try {
			System.out.println("Chargement de la config...");
			factory = new Configuration().configure().addPackage("fr.mc.app.hibernate.entities").addAnnotatedClass(OrdersEntity.class).buildSessionFactory();
			
			System.out.println("Lancement de la requête...");
			listOrders();
			System.out.println("Fin.");
			
		} catch (Throwable e) {
			System.out.println(e.toString());
		}
		
		
		
		
	}
	
	public static void listOrders() {
		Session session = factory.openSession();
		Transaction tx = null;
		
		try {
			tx = session.beginTransaction();
			List orders_list = session.createQuery("FROM OrdersEntity").list();
			
			for (Iterator iterator = orders_list.iterator(); iterator.hasNext();) {
				OrdersEntity order = (OrdersEntity) iterator.next();
				
				System.out.println(order.toString());
			}
			tx.commit();
		} catch (Exception e) {
			if(tx!=null) tx.rollback();
			e.printStackTrace();
		} finally {
			session.close();
		}
	}
}
