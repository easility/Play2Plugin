package com.alvazan.play2

import play.api.mvc._
import com.alvazan.orm.api.base.NoSqlEntityManager

object ActionHelpers {

  def withEntityManager(action: NoSqlEntityManager => EssentialAction):EssentialAction = {

     EssentialAction { request =>
         action(NoSqlForPlay2.getEntityManagerFactory().createEntityManager())(request)
     }
  }
}