package com.fernandopaniagua.demo.repository;

import com.fernandopaniagua.demo.model.Genre;
import com.fernandopaniagua.demo.model.Studio;
import com.fernandopaniagua.demo.model.StudioPK;
import com.fernandopaniagua.demo.persistence.HibernateUtil;
import org.hibernate.Session;

public class StudioDAO {
    public static void create(Studio studio) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        session.persist(studio);
        session.getTransaction().commit();
        session.close();
    }

    public static Studio read(StudioPK pk) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Studio studio = session.get(Studio.class, pk);
        session.close();
        return studio;
    }
}

