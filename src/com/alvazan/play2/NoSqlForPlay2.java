package com.alvazan.play2;

import play.Application;
import play.Play;

import com.alvazan.orm.api.base.NoSqlEntityManager;
import com.alvazan.orm.api.base.NoSqlEntityManagerFactory;
import com.alvazan.play.NoSqlInterface;

public class NoSqlForPlay2 implements NoSqlInterface {
	private static NoSqlEntityManagerFactory entityManagerFactory = null;
	
    private static ThreadLocal<NoSqlEntityManager> entityManager = new ThreadLocal<NoSqlEntityManager>();
  
    /**
     * Get the default EntityManager for this thread.
     */
    public NoSqlEntityManager em() {
        NoSqlEntityManager em = entityManager.get();
        if(em != null)
            return em;
        
        if(entityManagerFactory == null) {
            throw new RuntimeException("No NoSqlEntityManagerFactory configured");
        }
        return entityManagerFactory.createEntityManager();
    }

    /**
     * Bind an NoSqlEntityManager to the current thread.
     */
    public static void bindForCurrentThread(NoSqlEntityManager em) {
    	entityManager.set(em);
    }

	public static NoSqlEntityManagerFactory getEntityManagerFactory() {
		return entityManagerFactory;
	}

	static void setEntityManagerFactory(NoSqlEntityManagerFactory factory) {
		entityManagerFactory = factory;
	}

	static void clearContext() {
		entityManager.remove();
	}
}
