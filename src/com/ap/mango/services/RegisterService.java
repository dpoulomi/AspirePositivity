package com.ap.mango.services;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.springframework.security.core.userdetails.User;

import com.ap.mango.entity.Users;
import com.ap.mango.utils.HibernateUtil;
public class RegisterService {
     
public boolean register(final Users user){
     final Session session = HibernateUtil.openSession();
     if(isUserExists(user)) return false;  
     
     Transaction tx = null;
     try {
         tx = session.getTransaction();
         tx.begin();
         session.saveOrUpdate(user);       
         tx.commit();
     } catch (final Exception e) {
         if (tx != null) {
             tx.rollback();
         }
         e.printStackTrace();
     } finally {
         session.close();
     } 
     return true;
}
 
public boolean isUserExists(final Users user){
     final Session session = HibernateUtil.openSession();
     boolean result = false;
     Transaction tx = null;
     try{
         tx = session.getTransaction();
         tx.begin();
         final Query query = session.createQuery("from User where userId='"+user.getUserId()+"'");
         final User u = (User)query.uniqueResult();
         tx.commit();
         if(u!=null) result = true;
     }catch(final Exception ex){
         if(tx!=null){
             tx.rollback();
         }
     }finally{
         session.close();
     }
     return result;
}
}
