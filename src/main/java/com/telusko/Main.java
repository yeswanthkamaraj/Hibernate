package com.telusko;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Main {
    static void main(String[] args) {
        Alien a1 = new Alien();
        a1.setAid(104);
        a1.setAname("Kiran");
        a1.setTech("AI/ML");


        Configuration config = new Configuration();
        config.addAnnotatedClass(com.telusko.Alien.class);
        config.configure();

       SessionFactory factory = config.buildSessionFactory();
        Session session = factory.openSession();
        Transaction transaction= session.beginTransaction();

        // Alien a5= session.find(Alien.class,103);
        // System.out.println(a5);
        Alien a5=session.find(Alien.class,104);
        session.remove(a5);
        transaction.commit();
        session.close();
        factory.close();
    }
}
