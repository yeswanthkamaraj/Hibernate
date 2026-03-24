package com.telusko;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Main {
    static void main(String[] args) {
        Alien a1 = new Alien();
        a1.setAid(101);
        a1.setAname("Yeswanth");
        a1.setTech("java");


        Configuration config = new Configuration();
        config.addAnnotatedClass(com.telusko.Alien.class);
        config.configure();
        SessionFactory factory = config.buildSessionFactory();
        Session session = factory.openSession();
        Transaction transaction= session.beginTransaction();
        session.persist(a1);
        transaction.commit();
    }
}
