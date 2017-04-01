package com.ap.mango.services;
 
import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.ap.mango.entity.Users;
import com.ap.mango.utils.HibernateUtil;
 
public class LoginService {
 
    public boolean authenticateUser(final String username, final String password) {
        final Users user = getUserByUserName(username);         
        if(user!=null && user.getUsername().equals(username)){
            return true;
        }else{
            return false;
        }
    }
 
    public Users getUserByUserName(final String username) {
        final Session session = HibernateUtil.openSession();
        Transaction tx = null;
        Users user = null;
        try {
            tx = session.getTransaction();
            tx.begin();
            final Query query = session.createQuery("from Users where username='"+username+"'");
            user = (Users)query.uniqueResult();
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
     
	public List<Users> getListOfUsers() {
		List<Users> list = new ArrayList<>();
		final Session session = HibernateUtil.openSession();
		Transaction tx = null;
		try {
			tx = session.getTransaction();
			tx.begin();
			list = session.createQuery("from Users").list();
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
