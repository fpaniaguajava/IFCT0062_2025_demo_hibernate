package com.fernandopaniagua.demo.repository;

import com.fernandopaniagua.demo.model.Genre;
import com.fernandopaniagua.demo.model.Videogame;
import com.fernandopaniagua.demo.persistence.HibernateUtil;
import org.hibernate.Session;

public class GenreDAO {
    public static void create(Genre genre) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        session.persist(genre);
        session.getTransaction().commit();
        session.close();
    }

    public static Genre read(int id) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Genre genre = session.get(Genre.class, id);
        session.close();
        return genre;
    }
}

