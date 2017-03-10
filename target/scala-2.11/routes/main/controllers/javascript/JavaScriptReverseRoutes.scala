
// @GENERATOR:play-routes-compiler
// @SOURCE:C:/Users/Glen/Desktop/YearTwoProject/conf/routes
// @DATE:Thu Mar 09 23:27:54 GMT 2017

import play.api.routing.JavaScriptReverseRoute
import play.api.mvc.{ QueryStringBindable, PathBindable, Call, JavascriptLiteral }
import play.core.routing.{ HandlerDef, ReverseRouteContext, queryString, dynamicString }


import _root_.controllers.Assets.Asset
import _root_.play.libs.F

// @LINE:6
package controllers.javascript {
  import ReverseRouteContext.empty

  // @LINE:25
  class ReverseAssets(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:25
    def versioned: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Assets.versioned",
      """
        function(file1) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "assets/" + (""" + implicitly[PathBindable[Asset]].javascriptUnbind + """)("file", file1)})
        }
      """
    )
  
  }

  // @LINE:8
  class ReverseAdminController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:14
    def updateMovie: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.AdminController.updateMovie",
      """
        function(title0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "updateMovie/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("title", encodeURIComponent(title0))})
        }
      """
    )
  
    // @LINE:18
    def addFilmSubmit: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.AdminController.addFilmSubmit",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "addFilmSubmit"})
        }
      """
    )
  
    // @LINE:9
    def adminAddFilm: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.AdminController.adminAddFilm",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "adminAddFilm"})
        }
      """
    )
  
    // @LINE:8
    def adminFilm: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.AdminController.adminFilm",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "adminFilm"})
        }
      """
    )
  
    // @LINE:15
    def deleteMovie: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.AdminController.deleteMovie",
      """
        function(title0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "delMovie/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("title", encodeURIComponent(title0))})
        }
      """
    )
  
  }

  // @LINE:20
  class ReverseCountController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:20
    def count: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.CountController.count",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "count"})
        }
      """
    )
  
  }

  // @LINE:6
  class ReverseHomeController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:10
    def signUp: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.signUp",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "signUp"})
        }
      """
    )
  
    // @LINE:7
    def film: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.film",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "film"})
        }
      """
    )
  
    // @LINE:16
    def addUserSubmit: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.addUserSubmit",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "addUserSubmit"})
        }
      """
    )
  
    // @LINE:13
    def viewMovie: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.viewMovie",
      """
        function(title0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "viewMovie/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("title", encodeURIComponent(title0))})
        }
      """
    )
  
    // @LINE:6
    def index: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.index",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + """"})
        }
      """
    )
  
    // @LINE:11
    def login: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.login",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "login"})
        }
      """
    )
  
  }

  // @LINE:22
  class ReverseAsyncController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:22
    def message: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.AsyncController.message",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "message"})
        }
      """
    )
  
  }

  // @LINE:12
  class ReverseLoginController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:17
    def loginSubmit: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.LoginController.loginSubmit",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "loginSubmit"})
        }
      """
    )
  
    // @LINE:12
    def logout: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.LoginController.logout",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "logout"})
        }
      """
    )
  
  }


}
