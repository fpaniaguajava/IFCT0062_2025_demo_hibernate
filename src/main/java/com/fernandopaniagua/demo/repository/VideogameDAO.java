package com.fernandopaniagua.demo.repository;

import com.fernandopaniagua.demo.model.Videogame;
import com.fernandopaniagua.demo.persistence.HibernateUtil;
import jakarta.persistence.Query;
import jakarta.persistence.TypedQuery;
import org.hibernate.Session;

import java.util.List;

public class VideogameDAO {
    public static void create(Videogame videogame) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        session.persist(videogame);
        session.getTransaction().commit();
        session.close();
    }

    public static Videogame read(int id) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Videogame vg = session.get(Videogame.class, id);
        session.close();
        return vg;
    }

    public static void update(Videogame videogame) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        session.merge(videogame);
        session.getTransaction().commit();
        session.close();
    }

    public static void delete(Videogame videogame) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        session.remove(videogame);
        session.getTransaction().commit();
        session.close();
    }

    public static List<Videogame> getAll() {
        Session session = HibernateUtil.getSessionFactory().openSession();
        TypedQuery<Videogame> query = session.createQuery("FROM Videogame", Videogame.class);
        List<Videogame> videogames = query.getResultList();
        session.close();
        return videogames;
    }

    public static List<Videogame> findByPlatform(String platform) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Query query = session.createNamedQuery("findByPlatform", Videogame.class);
        query.setParameter("platform", platform);
        List<Videogame> videogames = query.getResultList();
        session.close();
        return videogames;
    }
}

