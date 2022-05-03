package com.spring.hibernet.Hibernet;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.spring.hibernet.Hibernet.Entity.Student;

public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World! Project Started...." );
        SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
        System.out.println(factory);
        Student st1 = new Student("Rakesh", 2, "Badlapur");
        Student st2 = new Student("Rahul", 2, "Ambernath");
        Session session = factory.openSession();
        session.beginTransaction();
        session.save(st1);
        session.save(st2);
        session.getTransaction().commit();
        session.close();
    }
}
