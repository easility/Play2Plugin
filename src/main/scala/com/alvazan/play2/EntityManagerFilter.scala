package com.alvazan.play2

import play.api.mvc._

object EntityManagerFilter extends Filter {
   def apply(next: (RequestHeader) => Result)(rh: RequestHeader):Result = {
      // get entity manager factory
      val factory = NoSqlForPlay2.getEntityManagerFactory()
      if (factory != null) {
         // bind it to current thread
         NoSqlForPlay2.bindForCurrentThread(factory.createEntityManager())
      }
      // call next filter in chain
      val rc = next(rh)
      // unbind entity manager from current thread
      NoSqlForPlay2.clearContext()
      rc
   }
}