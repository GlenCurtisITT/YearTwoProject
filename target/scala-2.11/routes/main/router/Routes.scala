
// @GENERATOR:play-routes-compiler
// @SOURCE:C:/Users/Glen/Desktop/YearTwoProject/conf/routes
// @DATE:Thu Mar 09 23:27:54 GMT 2017

package router

import play.core.routing._
import play.core.routing.HandlerInvokerFactory._
import play.core.j._

import play.api.mvc._

import _root_.controllers.Assets.Asset
import _root_.play.libs.F

class Routes(
  override val errorHandler: play.api.http.HttpErrorHandler, 
  // @LINE:6
  HomeController_2: controllers.HomeController,
  // @LINE:8
  AdminController_0: controllers.AdminController,
  // @LINE:12
  LoginController_5: controllers.LoginController,
  // @LINE:20
  CountController_1: controllers.CountController,
  // @LINE:22
  AsyncController_3: controllers.AsyncController,
  // @LINE:25
  Assets_4: controllers.Assets,
  val prefix: String
) extends GeneratedRouter {

   @javax.inject.Inject()
   def this(errorHandler: play.api.http.HttpErrorHandler,
    // @LINE:6
    HomeController_2: controllers.HomeController,
    // @LINE:8
    AdminController_0: controllers.AdminController,
    // @LINE:12
    LoginController_5: controllers.LoginController,
    // @LINE:20
    CountController_1: controllers.CountController,
    // @LINE:22
    AsyncController_3: controllers.AsyncController,
    // @LINE:25
    Assets_4: controllers.Assets
  ) = this(errorHandler, HomeController_2, AdminController_0, LoginController_5, CountController_1, AsyncController_3, Assets_4, "/")

  import ReverseRouteContext.empty

  def withPrefix(prefix: String): Routes = {
    router.RoutesPrefix.setPrefix(prefix)
    new Routes(errorHandler, HomeController_2, AdminController_0, LoginController_5, CountController_1, AsyncController_3, Assets_4, prefix)
  }

  private[this] val defaultPrefix: String = {
    if (this.prefix.endsWith("/")) "" else "/"
  }

  def documentation = List(
    ("""GET""", this.prefix, """controllers.HomeController.index"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """film""", """controllers.HomeController.film"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """adminFilm""", """controllers.AdminController.adminFilm"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """adminAddFilm""", """controllers.AdminController.adminAddFilm"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """signUp""", """controllers.HomeController.signUp"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """login""", """controllers.HomeController.login"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """logout""", """controllers.LoginController.logout"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """viewMovie/""" + "$" + """title<[^/]+>""", """controllers.HomeController.viewMovie(title:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """updateMovie/""" + "$" + """title<[^/]+>""", """controllers.AdminController.updateMovie(title:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """delMovie/""" + "$" + """title<[^/]+>""", """controllers.AdminController.deleteMovie(title:String)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """addUserSubmit""", """controllers.HomeController.addUserSubmit"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """loginSubmit""", """controllers.LoginController.loginSubmit"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """addFilmSubmit""", """controllers.AdminController.addFilmSubmit"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """count""", """controllers.CountController.count"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """message""", """controllers.AsyncController.message"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """assets/""" + "$" + """file<.+>""", """controllers.Assets.versioned(path:String = "/public", file:Asset)"""),
    Nil
  ).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
    case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
    case l => s ++ l.asInstanceOf[List[(String,String,String)]]
  }}


  // @LINE:6
  private[this] lazy val controllers_HomeController_index0_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix)))
  )
  private[this] lazy val controllers_HomeController_index0_invoker = createInvoker(
    HomeController_2.index,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "index",
      Nil,
      "GET",
      """ An example controller showing a sample home page""",
      this.prefix + """"""
    )
  )

  // @LINE:7
  private[this] lazy val controllers_HomeController_film1_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("film")))
  )
  private[this] lazy val controllers_HomeController_film1_invoker = createInvoker(
    HomeController_2.film,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "film",
      Nil,
      "GET",
      """""",
      this.prefix + """film"""
    )
  )

  // @LINE:8
  private[this] lazy val controllers_AdminController_adminFilm2_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("adminFilm")))
  )
  private[this] lazy val controllers_AdminController_adminFilm2_invoker = createInvoker(
    AdminController_0.adminFilm,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.AdminController",
      "adminFilm",
      Nil,
      "GET",
      """""",
      this.prefix + """adminFilm"""
    )
  )

  // @LINE:9
  private[this] lazy val controllers_AdminController_adminAddFilm3_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("adminAddFilm")))
  )
  private[this] lazy val controllers_AdminController_adminAddFilm3_invoker = createInvoker(
    AdminController_0.adminAddFilm,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.AdminController",
      "adminAddFilm",
      Nil,
      "GET",
      """""",
      this.prefix + """adminAddFilm"""
    )
  )

  // @LINE:10
  private[this] lazy val controllers_HomeController_signUp4_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("signUp")))
  )
  private[this] lazy val controllers_HomeController_signUp4_invoker = createInvoker(
    HomeController_2.signUp,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "signUp",
      Nil,
      "GET",
      """""",
      this.prefix + """signUp"""
    )
  )

  // @LINE:11
  private[this] lazy val controllers_HomeController_login5_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("login")))
  )
  private[this] lazy val controllers_HomeController_login5_invoker = createInvoker(
    HomeController_2.login,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "login",
      Nil,
      "GET",
      """""",
      this.prefix + """login"""
    )
  )

  // @LINE:12
  private[this] lazy val controllers_LoginController_logout6_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("logout")))
  )
  private[this] lazy val controllers_LoginController_logout6_invoker = createInvoker(
    LoginController_5.logout,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.LoginController",
      "logout",
      Nil,
      "GET",
      """""",
      this.prefix + """logout"""
    )
  )

  // @LINE:13
  private[this] lazy val controllers_HomeController_viewMovie7_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("viewMovie/"), DynamicPart("title", """[^/]+""",true)))
  )
  private[this] lazy val controllers_HomeController_viewMovie7_invoker = createInvoker(
    HomeController_2.viewMovie(fakeValue[String]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "viewMovie",
      Seq(classOf[String]),
      "GET",
      """""",
      this.prefix + """viewMovie/""" + "$" + """title<[^/]+>"""
    )
  )

  // @LINE:14
  private[this] lazy val controllers_AdminController_updateMovie8_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("updateMovie/"), DynamicPart("title", """[^/]+""",true)))
  )
  private[this] lazy val controllers_AdminController_updateMovie8_invoker = createInvoker(
    AdminController_0.updateMovie(fakeValue[String]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.AdminController",
      "updateMovie",
      Seq(classOf[String]),
      "GET",
      """""",
      this.prefix + """updateMovie/""" + "$" + """title<[^/]+>"""
    )
  )

  // @LINE:15
  private[this] lazy val controllers_AdminController_deleteMovie9_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("delMovie/"), DynamicPart("title", """[^/]+""",true)))
  )
  private[this] lazy val controllers_AdminController_deleteMovie9_invoker = createInvoker(
    AdminController_0.deleteMovie(fakeValue[String]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.AdminController",
      "deleteMovie",
      Seq(classOf[String]),
      "GET",
      """""",
      this.prefix + """delMovie/""" + "$" + """title<[^/]+>"""
    )
  )

  // @LINE:16
  private[this] lazy val controllers_HomeController_addUserSubmit10_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("addUserSubmit")))
  )
  private[this] lazy val controllers_HomeController_addUserSubmit10_invoker = createInvoker(
    HomeController_2.addUserSubmit,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "addUserSubmit",
      Nil,
      "POST",
      """""",
      this.prefix + """addUserSubmit"""
    )
  )

  // @LINE:17
  private[this] lazy val controllers_LoginController_loginSubmit11_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("loginSubmit")))
  )
  private[this] lazy val controllers_LoginController_loginSubmit11_invoker = createInvoker(
    LoginController_5.loginSubmit,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.LoginController",
      "loginSubmit",
      Nil,
      "POST",
      """""",
      this.prefix + """loginSubmit"""
    )
  )

  // @LINE:18
  private[this] lazy val controllers_AdminController_addFilmSubmit12_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("addFilmSubmit")))
  )
  private[this] lazy val controllers_AdminController_addFilmSubmit12_invoker = createInvoker(
    AdminController_0.addFilmSubmit,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.AdminController",
      "addFilmSubmit",
      Nil,
      "POST",
      """""",
      this.prefix + """addFilmSubmit"""
    )
  )

  // @LINE:20
  private[this] lazy val controllers_CountController_count13_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("count")))
  )
  private[this] lazy val controllers_CountController_count13_invoker = createInvoker(
    CountController_1.count,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.CountController",
      "count",
      Nil,
      "GET",
      """ An example controller showing how to use dependency injection""",
      this.prefix + """count"""
    )
  )

  // @LINE:22
  private[this] lazy val controllers_AsyncController_message14_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("message")))
  )
  private[this] lazy val controllers_AsyncController_message14_invoker = createInvoker(
    AsyncController_3.message,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.AsyncController",
      "message",
      Nil,
      "GET",
      """ An example controller showing how to write asynchronous code""",
      this.prefix + """message"""
    )
  )

  // @LINE:25
  private[this] lazy val controllers_Assets_versioned15_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("assets/"), DynamicPart("file", """.+""",false)))
  )
  private[this] lazy val controllers_Assets_versioned15_invoker = createInvoker(
    Assets_4.versioned(fakeValue[String], fakeValue[Asset]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Assets",
      "versioned",
      Seq(classOf[String], classOf[Asset]),
      "GET",
      """ Map static resources from the /public folder to the /assets URL path""",
      this.prefix + """assets/""" + "$" + """file<.+>"""
    )
  )


  def routes: PartialFunction[RequestHeader, Handler] = {
  
    // @LINE:6
    case controllers_HomeController_index0_route(params) =>
      call { 
        controllers_HomeController_index0_invoker.call(HomeController_2.index)
      }
  
    // @LINE:7
    case controllers_HomeController_film1_route(params) =>
      call { 
        controllers_HomeController_film1_invoker.call(HomeController_2.film)
      }
  
    // @LINE:8
    case controllers_AdminController_adminFilm2_route(params) =>
      call { 
        controllers_AdminController_adminFilm2_invoker.call(AdminController_0.adminFilm)
      }
  
    // @LINE:9
    case controllers_AdminController_adminAddFilm3_route(params) =>
      call { 
        controllers_AdminController_adminAddFilm3_invoker.call(AdminController_0.adminAddFilm)
      }
  
    // @LINE:10
    case controllers_HomeController_signUp4_route(params) =>
      call { 
        controllers_HomeController_signUp4_invoker.call(HomeController_2.signUp)
      }
  
    // @LINE:11
    case controllers_HomeController_login5_route(params) =>
      call { 
        controllers_HomeController_login5_invoker.call(HomeController_2.login)
      }
  
    // @LINE:12
    case controllers_LoginController_logout6_route(params) =>
      call { 
        controllers_LoginController_logout6_invoker.call(LoginController_5.logout)
      }
  
    // @LINE:13
    case controllers_HomeController_viewMovie7_route(params) =>
      call(params.fromPath[String]("title", None)) { (title) =>
        controllers_HomeController_viewMovie7_invoker.call(HomeController_2.viewMovie(title))
      }
  
    // @LINE:14
    case controllers_AdminController_updateMovie8_route(params) =>
      call(params.fromPath[String]("title", None)) { (title) =>
        controllers_AdminController_updateMovie8_invoker.call(AdminController_0.updateMovie(title))
      }
  
    // @LINE:15
    case controllers_AdminController_deleteMovie9_route(params) =>
      call(params.fromPath[String]("title", None)) { (title) =>
        controllers_AdminController_deleteMovie9_invoker.call(AdminController_0.deleteMovie(title))
      }
  
    // @LINE:16
    case controllers_HomeController_addUserSubmit10_route(params) =>
      call { 
        controllers_HomeController_addUserSubmit10_invoker.call(HomeController_2.addUserSubmit)
      }
  
    // @LINE:17
    case controllers_LoginController_loginSubmit11_route(params) =>
      call { 
        controllers_LoginController_loginSubmit11_invoker.call(LoginController_5.loginSubmit)
      }
  
    // @LINE:18
    case controllers_AdminController_addFilmSubmit12_route(params) =>
      call { 
        controllers_AdminController_addFilmSubmit12_invoker.call(AdminController_0.addFilmSubmit)
      }
  
    // @LINE:20
    case controllers_CountController_count13_route(params) =>
      call { 
        controllers_CountController_count13_invoker.call(CountController_1.count)
      }
  
    // @LINE:22
    case controllers_AsyncController_message14_route(params) =>
      call { 
        controllers_AsyncController_message14_invoker.call(AsyncController_3.message)
      }
  
    // @LINE:25
    case controllers_Assets_versioned15_route(params) =>
      call(Param[String]("path", Right("/public")), params.fromPath[Asset]("file", None)) { (path, file) =>
        controllers_Assets_versioned15_invoker.call(Assets_4.versioned(path, file))
      }
  }
}
