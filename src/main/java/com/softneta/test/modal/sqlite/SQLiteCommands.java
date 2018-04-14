package com.softneta.test.modal.sqlite;


import com.softneta.test.modal.ImageEntity;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;

import java.util.ArrayList;
import java.util.List;


public class SQLiteCommands {
    private static SessionFactory sessionFactory = null;
    private static ServiceRegistry serviceRegistry = null;

    private void configureSessionFactory() throws HibernateException {
        try
        {
            Configuration configuration = new Configuration().configure();

            serviceRegistry = new ServiceRegistryBuilder().applySettings(configuration.getProperties()).buildServiceRegistry();
            sessionFactory = configuration.buildSessionFactory(serviceRegistry);
        }
        catch (HibernateException he)
        {
            throw new ExceptionInInitializerError(he);
        }
    }

    public List<ImageEntity> getList(){
        configureSessionFactory();

        Session session = null;
        Transaction tx=null;

        List<ImageEntity> pictureList = new ArrayList<ImageEntity>();

        try {
            session = sessionFactory.openSession();
            tx = session.beginTransaction();

            pictureList = session.createQuery("from image").list();
        } catch (Exception ex) {
            ex.printStackTrace();
            tx.rollback();
        }
        return pictureList;
    }


}
