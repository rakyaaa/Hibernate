package com.spring.hibernet.Hibernet;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.spring.hibernet.Hibernet.Entity.Certificate;
import com.spring.hibernet.Hibernet.Entity.Student;

public class EmbeddedDemo {

	public static void main(String[] args) {
		SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
        System.out.println(factory);
        Session session = factory.openSession();
        session.beginTransaction();
        Certificate certi = new Certificate("Java", "3 months", "Pass");
        Student st1 = new Student("Rahul", 23, "Badlapur",certi);
        session.save(st1);
        System.out.println(st1);
        session.getTransaction().commit();
        session.close();

	}

}
