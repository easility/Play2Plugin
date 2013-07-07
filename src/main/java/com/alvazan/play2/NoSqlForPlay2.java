package com.alvazan.play2;

import play.Application;
import play.Play;

import com.alvazan.orm.api.base.NoSqlEntityManager;
import com.alvazan.orm.api.base.NoSqlEntityManagerFactory;
import com.alvazan.play.NoSqlInterface;

public class NoSqlForPlay2 implements NoSqlInterface {
	private static NoSqlEntityManagerFactory entityManagerFactory = null;
	
    /**
     * Get the new NoSqlEntityManager instance.
     */
    public NoSqlEntityManager em() {
        if(entityManagerFactory == null) {
            throw new RuntimeException("No NoSqlEntityManagerFactory configured");
        }
        NoSqlEntityManager em = entityManagerFactory.createEntityManager();
        return em;
    }

	public static NoSqlEntityManagerFactory getEntityManagerFactory() {
		return entityManagerFactory;
	}

	static void setEntityManagerFactory(NoSqlEntityManagerFactory factory) {
		entityManagerFactory = factory;
	}
}
