package com.login.service;
 
import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.hibernate.util.HibernateUtil;
import com.login.model.user;
 
public class LoginService {
 
    public boolean authenticateUser(final String userId, final String password) {
        final user user = getUserByUserId(userId);         
        if(user!=null && user.getUserId().equals(userId) && user.getPassword().equals(password)){
            return true;
        }else{
            return false;
        }
    }
 
    public user getUserByUserId(final String userId) {
        final Session session = HibernateUtil.openSession();
        Transaction tx = null;
        user user = null;
        try {
            tx = session.getTransaction();
            tx.begin();
            final Query query = session.createQuery("from User where userId='"+userId+"'");
            user = (user)query.uniqueResult();
            tx.commit();
        } catch (final Exception e) {
            if (tx != null) {
                tx.rollback();
            }
            e.printStackTrace();
        } finally {
            session.close();
        }
        return user;
    }
     
    public List<user> getListOfUsers(){
        List<user> list = new ArrayList<user>();
        final Session session = HibernateUtil.openSession();
        Transaction tx = null;       
        try {
            tx = session.getTransaction();
            tx.begin();
            list = session.createQuery("from User").list();                       
            tx.commit();
        } catch (final Exception e) {
            if (tx != null) {
                tx.rollback();
            }
            e.printStackTrace();
        } finally {
            session.close();
        }
        return list;
    }
}
