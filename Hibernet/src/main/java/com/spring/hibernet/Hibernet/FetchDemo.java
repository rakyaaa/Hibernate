package com.spring.hibernet.Hibernet;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.spring.hibernet.Hibernet.Entity.Address;
import com.spring.hibernet.Hibernet.Entity.Student;

public class FetchDemo {
	
	public static void main(String[] args) {
		
		SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
        System.out.println(factory);
        Session session = factory.openSession();
        session.beginTransaction();
        Student st1 = session.get(Student.class, 1);
        System.out.println(st1);
        Address ad1 = session.get(Address.class, 3);
        System.out.println(ad1.getImage());
        session.getTransaction().commit();
        session.close();
	}

}
