
// @GENERATOR:play-routes-compiler
// @SOURCE:C:/Users/Glen/Desktop/YearTwoProject/conf/routes
// @DATE:Thu Mar 09 23:27:54 GMT 2017


package router {
  object RoutesPrefix {
    private var _prefix: String = "/"
    def setPrefix(p: String): Unit = {
      _prefix = p
    }
    def prefix: String = _prefix
    val byNamePrefix: Function0[String] = { () => prefix }
  }
}
