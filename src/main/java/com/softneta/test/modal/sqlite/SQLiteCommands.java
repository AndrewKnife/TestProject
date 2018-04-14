package com.softneta.test.modal.sqlite;


import com.softneta.test.modal.ImageEntity;
import com.softneta.test.modal.PatientEntity;
import com.softneta.test.modal.SeriesEntity;
import com.softneta.test.modal.StudyEntity;
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
            System.out.println("*****************");
            System.out.println(he.toString());
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

    public List<PatientEntity> getPatientList(){
        configureSessionFactory();

        Session session = null;
        Transaction tx=null;

        List<PatientEntity> patientList = new ArrayList<PatientEntity>();

        try {
            session = sessionFactory.openSession();
            tx = session.beginTransaction();

            patientList = session.createQuery("from patient").list();
        } catch (Exception ex) {
            ex.printStackTrace();
            tx.rollback();
        }
        return patientList;
    }

    public List<SeriesEntity> getSeriesList(){
        configureSessionFactory();

        Session session = null;
        Transaction tx=null;

        List<SeriesEntity> seriesList = new ArrayList<SeriesEntity>();

        try {
            session = sessionFactory.openSession();
            tx = session.beginTransaction();

            seriesList = session.createQuery("from series").list();
        } catch (Exception ex) {
            ex.printStackTrace();
            tx.rollback();
        }
        return seriesList;
    }

    public List<StudyEntity> getStudyList(){
        configureSessionFactory();

        Session session = null;
        Transaction tx=null;

        List<StudyEntity> studyList = new ArrayList<StudyEntity>();

        try {
            session = sessionFactory.openSession();
            tx = session.beginTransaction();

            studyList = session.createQuery("from study").list();
        } catch (Exception ex) {
            ex.printStackTrace();
            tx.rollback();
        }
        return studyList;
    }
}
