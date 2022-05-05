package com.spring.hibernet.Hibernet;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.spring.hibernet.Hibernet.Entity.Address;
import com.spring.hibernet.Hibernet.Entity.Student;

public class App 
{
    public static void main( String[] args ) throws IOException
    {
        System.out.println( "Hello World! Project Started...." );
        SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
        System.out.println(factory);
        Student st1 = new Student("Rakesh", 2, "Badlapur");
        Student st2 = new Student("Rahul", 2, "Ambernath");
        Address add1 = new Address("yadav nagar", "Badlapur", false, 421503,new Date());
        //reading file i.e image
        FileInputStream fis = new FileInputStream("src/main/java/images/rakesh.png");
        byte[] data = new byte[fis.available()];
        fis.read(data);
        add1.setImage(data);
        fis.close();
        Session session = factory.openSession();
        session.beginTransaction();
        session.save(st1);
        session.save(st2);
        session.save(add1);
        session.getTransaction().commit();
        session.close();
    }
}
