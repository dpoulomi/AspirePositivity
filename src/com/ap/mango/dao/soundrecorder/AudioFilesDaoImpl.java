package com.ap.mango.dao.soundrecorder;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.ap.mango.entity.AudioFiles;
import com.ap.mango.utils.HibernateUtil;
import com.google.common.collect.Lists;
import com.google.inject.Singleton;

@Singleton
public class AudioFilesDaoImpl implements AudioFilesDao {

	  @Override
	  public List<AudioFiles> getAllAudioFiles()
	  {
			List<AudioFiles> list = Lists.newArrayList();
			final Session session = HibernateUtil.openSession();
			Transaction tx = null;
			try {
				tx = session.getTransaction();
				tx.begin();
				list = session.createQuery("from AudioFiles").list();
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
		  

	  @Override
	public void addNewAudioFile(final AudioFiles audioFiles) {
		final Session session = HibernateUtil.openSession();
		Transaction tx = null;
		AudioFiles audioFile = null;
		try {
			tx = session.getTransaction();
			tx.begin();
			final Query query = session.createQuery("");
			audioFile = (AudioFiles) query.uniqueResult();
			tx.commit();
		} catch (final Exception e) {
			if (tx != null) {
				tx.rollback();
			}
			e.printStackTrace();
		} finally {
			session.close();
		}

	}
	  
	  @Override
	public AudioFiles getAudioFile( final int audioFile_Id )
	  {

	        final Session session = HibernateUtil.openSession();
	        Transaction tx = null;
	        AudioFiles audioFile= null;
	        try {
	            tx = session.getTransaction();
	            tx.begin();
	            final Query query = session.createQuery("from Users where audioFile_Id='"+audioFile_Id+"'");
	            audioFile = (AudioFiles)query.uniqueResult();
	            tx.commit();
	        } catch (final Exception e) {
	            if (tx != null) {
	                tx.rollback();
	            }
	            e.printStackTrace();
	        } finally {
	            session.close();
	        }
	        return audioFile;
	    
	  }
	  

	  /*@Override
	  public void updateAudioFile( final AudioFiles audioFiles )
	  {
	   
		  final Session session = HibernateUtil.openSession();
	        Transaction tx = null;
	        AudioFiles audioFile = null;
	        try {
	            tx = session.getTransaction();
	            tx.begin();
	            final Query query = session.createQuery("update audioFile set filePath=" + "'" + employee.getName() + "'" + "where employee_id="
	                    + employee.getEmployeeId());
	            audioFile = (AudioFiles)query.uniqueResult();
	            tx.commit();
	        } catch (final Exception e) {
	            if (tx != null) {
	                tx.rollback();
	            }
	            e.printStackTrace();
	        } finally {
	            session.close();
	        }
	  }*/

	 /* @Override
	  public void deleteAudioFile( final int  audioFile_Id )
	  {
	    Connection dbConnection = null;
	    Statement statement = null;

	    final String sql = "delete from employee where employee_Id="+ employeeId;

	    try
	    {
	      final DataSource dataSource = new DataSource();
	      dbConnection = dataSource.createConnection();
	      statement = dbConnection.prepareStatement(sql);
	      statement.executeUpdate(sql);

	      System.out.println("Record is deleted from Employee table for Employee id : "
	                      + employeeId);

	    }
	    catch( final SQLException e )
	    {

	      e.printStackTrace();

	    }
	    finally
	    {

	      if( statement != null )
	      {
	        try
	        {
	          statement.close();
	        }
	        catch( final SQLException e )
	        {
	          e.printStackTrace();
	        }
	      }

	      if( dbConnection != null )
	      {
	        try
	        {
	          dbConnection.close();
	        }
	        catch( final SQLException e )
	        {
	          e.printStackTrace();
	        }
	      }

	    }
	  }
*/
	}



