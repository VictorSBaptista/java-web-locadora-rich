package br.com.foursys.locadora.util;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;

/**
 * Classe respons�vel por efetuar a conex�o com o banco de dados
 *
 * @author Victor Baptista
 * @since 27/04/2021
 * @version 1.0
 */
public class HibernateUtil {

    //atributo para armazenar a sess�o de comunica��o
    private static final SessionFactory sessionFactory = buildSessionFactory();

    /*
     * M�todo respons�vel por criar um se��o de conex�o com o banco de dados
     */
    private static SessionFactory buildSessionFactory() {
        return new AnnotationConfiguration().configure().buildSessionFactory();
    }

    //m�todo para acessar o atributo de conex�o e se��o com o banco de dados
    public static SessionFactory getSessionFactory() {
        return sessionFactory;
    }
    
}
