
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object signUp_Scope0 {
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

class signUp extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template2[Form[models.users.User],String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(addUserForm: Form[models.users.User], error: String):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
import helper._

Seq[Any](format.raw/*1.55*/("""
"""),format.raw/*3.1*/("""
"""),_display_(/*4.2*/main("Sign Up Page", null)/*4.28*/ {_display_(Seq[Any](format.raw/*4.30*/("""
    """),format.raw/*5.5*/("""<div class="row">
        <div class="col-lg-5">
            """),_display_(/*7.14*/if(error != null)/*7.31*/{_display_(Seq[Any](format.raw/*7.32*/("""
                """),format.raw/*8.17*/("""<div class="alert alert-warning">
                    <strong>"""),_display_(/*9.30*/error),format.raw/*9.35*/("""</strong>
                </div>
            """)))}),format.raw/*11.14*/("""
        """),_display_(/*12.10*/helper/*12.16*/.form(action = controllers.routes.HomeController.addUserSubmit(), 'class -> "form-horizontal", 'role -> "form")/*12.127*/ {_display_(Seq[Any](format.raw/*12.129*/("""
            """),_display_(/*13.14*/inputText(addUserForm("email"), '_label -> "Email", 'class -> "form-control")),format.raw/*13.91*/("""
            """),_display_(/*14.14*/inputText(addUserForm("name"), '_label -> "Name", 'class -> "form-control")),format.raw/*14.89*/("""
            """),_display_(/*15.14*/select(addUserForm("role"), options("select" -> "--- Please Select ---", "Admin" -> "Admin", "Customer" -> "Customer"), '_label -> "Role")),format.raw/*15.152*/("""
            """),_display_(/*16.14*/inputPassword(addUserForm("password"), '_label -> "Password", 'class -> "form-control")),format.raw/*16.101*/("""
            """),_display_(/*17.14*/inputPassword(addUserForm("passwordConfirm"), '_label -> "Confirm Password", 'class -> "form-control")),format.raw/*17.116*/("""
            """),format.raw/*18.13*/("""<div class="actions" id="margBottom">
                <input type="submit" value="Add User" class="btn btn-primary">
                <a href=""""),_display_(/*20.27*/routes/*20.33*/.HomeController.index()),format.raw/*20.56*/("""" <button class="btn btn-warning">Cancel</button></a>
            </div>
        </div>
    </div>
    """)))}),format.raw/*24.6*/("""
""")))}))
      }
    }
  }

  def render(addUserForm:Form[models.users.User],error:String): play.twirl.api.HtmlFormat.Appendable = apply(addUserForm,error)

  def f:((Form[models.users.User],String) => play.twirl.api.HtmlFormat.Appendable) = (addUserForm,error) => apply(addUserForm,error)

  def ref: this.type = this

}


}

/**/
object signUp extends signUp_Scope0.signUp
              /*
                  -- GENERATED --
                  DATE: Thu Mar 09 19:43:33 GMT 2017
                  SOURCE: C:/Users/Glen/Desktop/YearTwoProject/app/views/signUp.scala.html
                  HASH: de422e93b21a3140372ff4a65e6d1cafa2dff51f
                  MATRIX: 771->1|934->54|962->74|990->77|1024->103|1063->105|1095->111|1185->175|1210->192|1248->193|1293->211|1383->275|1408->280|1487->328|1525->339|1540->345|1661->456|1702->458|1744->473|1842->550|1884->565|1980->640|2022->655|2182->793|2224->808|2333->895|2375->910|2499->1012|2541->1026|2713->1171|2728->1177|2772->1200|2910->1308
                  LINES: 27->1|32->1|33->3|34->4|34->4|34->4|35->5|37->7|37->7|37->7|38->8|39->9|39->9|41->11|42->12|42->12|42->12|42->12|43->13|43->13|44->14|44->14|45->15|45->15|46->16|46->16|47->17|47->17|48->18|50->20|50->20|50->20|54->24
                  -- GENERATED --
              */
          