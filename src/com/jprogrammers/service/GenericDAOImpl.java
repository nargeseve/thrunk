package com.jprogrammers.service;

import java.util.List;

import com.jprogrammers.util.HibernateUtil;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 * Created by Vahid Forghani
 */

public class GenericDAOImpl<T> implements GenericDAO<T> {

	protected Session getSession() {
        return HibernateUtil.getSession();
    }
	
	protected void closeSession(Session session) {
		session.flush();
		session.close();
	}
 
    public void save(T entity, Session session) {

        if(session == null){
            session = getSession();
            Transaction transaction = session.getTransaction();
            transaction.begin();
            session.saveOrUpdate(entity);
            transaction.commit();
            closeSession(session);
        } else {
            session.saveOrUpdate(entity);
        }

    }
 
    public void delete(T entity, Session session) {

        if(session == null){
            session = getSession();
            Transaction transaction = session.getTransaction();
            transaction.begin();
            session.delete(entity);
            transaction.commit();
            closeSession(session);
        } else {
            session.delete(entity);
        }

    }
 
    @SuppressWarnings("unchecked")
	public List<T> findMany(String query, Session session) {

        if(session == null){
            session = getSession();
    	    Query HQLQuery = session.createQuery(query);
    	    List<T> t;
            t = (List<T>) HQLQuery.list();
            closeSession(session);
            return t;
        } else {
            Query HQLQuery = session.createQuery(query);
            List<T> t;
            t = (List<T>) HQLQuery.list();
            return t;
        }
    }
 
    @SuppressWarnings("unchecked")
	public T findOne(String query, Session session) {

        if(session == null){
            session = getSession();
            Query HQLQuery = session.createQuery(query);
            T t;
            t = (T) HQLQuery.uniqueResult();
            closeSession(session);
            return t;
        } else {
            Query HQLQuery = session.createQuery(query);
            T t;
            t = (T) HQLQuery.uniqueResult();
            return t;
        }

    }

}
