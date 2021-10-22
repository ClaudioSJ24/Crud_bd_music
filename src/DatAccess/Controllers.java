/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DatAccess;

import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;

/**
 *
 * @author Claudio Sánchez Juárez
 */
public class Controllers {

    //Session session = HibernateUtil.getSessionFactory().openSession();
    private Session session;

    public void startSession() {
        SessionFactory sessionFactory = new AnnotationConfiguration().configure().buildSessionFactory();
        session = sessionFactory.openSession();
        session.beginTransaction();
    }

    public void endSession() {
        session.getTransaction().commit();
        session.close();
    }

    public void saveGenres(Genres genres) {
        startSession();
        session.save(genres);
        endSession();
    }

    public void updateGenres(Genres genres) {
        startSession();
        session.update(genres);
        endSession();
    }

    public void deleteGenres(Genres genres) {
        startSession();
        session.delete(genres);
        endSession();
    }

    public Genres SearchGenres(int id) {

        startSession();
        Genres genres = null;
        genres = (Genres) session.get(Genres.class, id);

        endSession();
        return genres;
    }

    public void saveAlbum(Albums album) {
        startSession();
        session.save(album);
        endSession();
    }

    public List<Genres> selectAll() {
        startSession();
        List<Genres> selectAll = null;
        selectAll = session.createQuery("FROM Genres").list();
        endSession();
        return selectAll;
    }

    public void updateAlbums(Albums album) {
        startSession();
        session.update(album);
        endSession();
    }

    public void deleteAlbums(Albums album) {
        startSession();
        session.delete(album);
        endSession();
    }

    public Albums SearchAlbums(int id) {

        startSession();
        Albums album = null;
        album = (Albums) session.get(Albums.class, id);

        endSession();
        return album;
    }

    public List<Albums> selectAllA() {
        startSession();
        List<Albums> selectAll = null;
        selectAll = session.createQuery("FROM Albums").list();
        endSession();
        return selectAll;
    }

}
