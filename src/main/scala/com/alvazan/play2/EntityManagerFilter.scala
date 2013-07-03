package com.alvazan.play2

import play.api.mvc._
import play.api.libs.concurrent.Execution.Implicits._

object EntityManagerFilter extends Filter {
   def apply(next: (RequestHeader) => Result)(rh: RequestHeader):Result = {
      // get entity manager factory
      val factory = NoSqlForPlay2.getEntityManagerFactory()
      if (factory != null) {
         // bind it to current thread
         println("binding em to thread")
         NoSqlForPlay2.bindForCurrentThread(factory.createEntityManager())
      }
      // call next filter in chain
      next(rh) match {
         case plain: PlainResult => println("got plain result"); 
                                    NoSqlForPlay2.clearContext(); 
                                    plain
         case async: AsyncResult => println("got async result");
                                    async.transform( ( f:PlainResult ) => { println("unbinding")
                                                              NoSqlForPlay2.clearContext();
                                                              f } 
                                                   )
      }
   }
}