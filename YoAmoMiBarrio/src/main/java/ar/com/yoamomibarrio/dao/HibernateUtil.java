/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ar.com.yoamomibarrio.dao;

import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.SessionFactory;

/**
 * Hibernate Utility class with a convenient method to get Session Factory
 * object.
 *
 * @author Matias
 */
public class HibernateUtil {

    private static final SessionFactory sessionFactory;
    
    static {
        try {            
            sessionFactory = new AnnotationConfiguration().configure().buildSessionFactory();
        } catch (Throwable ex) {
            System.err.println("Initial SessionFactory creation failed." + ex);
            throw new ExceptionInInitializerError(ex);
        }
    }
    
    public static SessionFactory getSessionFactory() {
        return sessionFactory;
    }
}
