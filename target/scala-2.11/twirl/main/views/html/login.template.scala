
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object login_Scope0 {
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import java.lang._
import java.util._
import scala.collection.JavaConversions._
import scala.collection.JavaConverters._
import play.core.j.PlayMagicForJava._
import play.mvc._
import play.data._
import play.api.data.Field
import play.mvc.Http.Context.Implicit._

class login extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[Form[models.users.Login],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(loginForm: Form[models.users.Login]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
import helper._

Seq[Any](format.raw/*1.39*/("""
"""),_display_(/*3.2*/main("Login", null)/*3.21*/ {_display_(Seq[Any](format.raw/*3.23*/("""
  """),_display_(/*4.4*/if(flash().containsKey("error"))/*4.36*/{_display_(Seq[Any](format.raw/*4.37*/("""
    """),format.raw/*5.5*/("""<div class="row">
      <div class="col-xs-4">
        <div class="alert alert-danger">
          <strong>"""),_display_(/*8.20*/flash()/*8.27*/.get("error")),format.raw/*8.40*/("""</strong>
        </div>
      </div>
    </div>

  """)))}),format.raw/*13.4*/("""
  """),format.raw/*14.3*/("""<div class="row">
    <div class="col-xs-4">
      <div class="centered">
      """),_display_(/*17.8*/helper/*17.14*/.form(action = controllers.routes.LoginController.loginSubmit())/*17.78*/{_display_(Seq[Any](format.raw/*17.79*/("""
        """),format.raw/*18.9*/("""<div class="form-group">
        """),_display_(/*19.10*/inputText(loginForm("email"), '_label -> "", 'class -> "form-control input-xs", 'placeholder -> "Email")),format.raw/*19.114*/("""
        """),format.raw/*20.9*/("""</div>
        <div class="form-group">
        """),_display_(/*22.10*/inputPassword(loginForm("password"), '_label -> "", 'class -> "form-control input-xs", 'placeholder -> "Password")),format.raw/*22.124*/("""
        """),format.raw/*23.9*/("""</div>
        <div class="form-group">
          <input type="submit" value="Sign In" class="btn btn-primary">
        </div>
      """)))}),format.raw/*27.8*/("""
      """),format.raw/*28.7*/("""</div>
    </div>
  </div>

""")))}))
      }
    }
  }

  def render(loginForm:Form[models.users.Login]): play.twirl.api.HtmlFormat.Appendable = apply(loginForm)

  def f:((Form[models.users.Login]) => play.twirl.api.HtmlFormat.Appendable) = (loginForm) => apply(loginForm)

  def ref: this.type = this

}


}

/**/
object login extends login_Scope0.login
              /*
                  -- GENERATED --
                  DATE: Thu Mar 09 20:49:23 GMT 2017
                  SOURCE: C:/Users/Glen/Desktop/YearTwoProject/app/views/login.scala.html
                  HASH: 04e39e2f1767ddeccaa923876a08d235fa7d26d6
                  MATRIX: 763->1|910->38|938->59|965->78|1004->80|1034->85|1074->117|1112->118|1144->124|1280->234|1295->241|1328->254|1416->312|1447->316|1557->400|1572->406|1645->470|1684->471|1721->481|1783->516|1909->620|1946->630|2024->681|2160->795|2197->805|2365->943|2400->951
                  LINES: 27->1|32->1|33->3|33->3|33->3|34->4|34->4|34->4|35->5|38->8|38->8|38->8|43->13|44->14|47->17|47->17|47->17|47->17|48->18|49->19|49->19|50->20|52->22|52->22|53->23|57->27|58->28
                  -- GENERATED --
              */
          