package com.mapping.OneToOne;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class MappingMain {
	
	public static void main(String[] args) {
		
		SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
        System.out.println(factory);
        Session session = factory.openSession();
        session.beginTransaction();
        Answer ans1 = new Answer(1, "Java is programming language");
        Question q1 = new Question(1, "What is java?",ans1);

        session.save(q1);
        session.save(ans1);
        System.out.println(q1);
        session.getTransaction().commit();
        
        //get question
        Question qq1 =session.get(Question.class, 1);
        System.out.println(qq1);
        System.out.println(qq1.getAns());
        
        //get answer
        
        Answer ans2 = session.get(Answer.class, 1);
        System.out.println(ans2);
        System.out.println(ans2);
        
        session.close();

	}

}
