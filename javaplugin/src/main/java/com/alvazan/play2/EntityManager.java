package com.alvazan.play2;

import play.mvc.*;
import play.mvc.Http.Context;

/**
  Adds NoSqlEntityManager to "em" Context parameter
  @see Context
  @see com.alvazan.orm.api.base.NoSqlEntityManager
*/
public class EntityManager extends Action.Simple {

   public Result call(Context ctx) throws Throwable {
      ctx.args.put("em", NoSqlForPlay2.getEntityManagerFactory().createEntityManager());
      return delegate.call(ctx);
   }
}