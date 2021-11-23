package codegym.service;


import codegym.model.MusicApp;
import org.hibernate.HibernateException;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.springframework.stereotype.Service;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.TypedQuery;
import java.util.List;

@Service
public class HiMusicApp implements IMusic {
    private static SessionFactory sessionFactory;
    private static EntityManager entityManager;

    static {
        try {
            sessionFactory = new Configuration()
                    .configure("hibernate.conf.xml")
                    .buildSessionFactory();
            entityManager = sessionFactory.createEntityManager();
        } catch (HibernateException e) {
            e.printStackTrace();
        }
    }


//    static {
//    try {
//        SessionFactory sessionFactory = new Configuration()
//                .configure("hibernate.conf.xml")
//                .buildSessionFactory();
//        sessionFactory.close();
//    } catch (HibernateException e) {
//        e.printStackTrace();
//    }
//}


    @Override
    public List<MusicApp> findAll() {
        String string = "select s from MusicApp s";
        TypedQuery<MusicApp> query = entityManager.createQuery(string, MusicApp.class);
        return query.getResultList();
    }

    @Override
    public MusicApp findOne(Integer id) {
        return entityManager.find(MusicApp.class, id);
    }

    @Override
    public void save(MusicApp musicApp) {
        EntityTransaction entityTransaction = entityManager.getTransaction();
        entityTransaction.begin();
        //merge cập nhật
        entityManager.persist(musicApp);
        entityTransaction.commit();
    }


    @Override
    public boolean exists(Long id) {
        return false;
    }

    @Override
    public List<MusicApp> findAll(List<Long> ids) {
        return null;
    }

    @Override
    public long count() {
        return 0;
    }

    @Override
    public void delete(Integer id) {
        EntityTransaction entityTransaction = entityManager.getTransaction();
        entityTransaction.begin();
        entityManager.remove(findOne(id));
        entityTransaction.commit();
    }

    @Override
    public void delete(MusicApp MusicApp) {

    }

    @Override
    public void delete(List<MusicApp> MusicApps) {

    }

    @Override
    public void deleteAll() {

    }
}
