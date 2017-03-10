
package views.html.adminPages

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object adminAddFilm_Scope0 {
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

class adminAddFilm extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template3[Form[models.Film],models.users.User,String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(addFilmForm: Form[models.Film], user: models.users.User, error: String):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
import helper._

Seq[Any](format.raw/*1.74*/("""
"""),format.raw/*3.1*/("""
"""),_display_(/*4.2*/adminPages/*4.12*/.adminMain("Add Film", user)/*4.40*/{_display_(Seq[Any](format.raw/*4.41*/("""
  """),_display_(/*5.4*/if(error != null)/*5.21*/{_display_(Seq[Any](format.raw/*5.22*/("""
    """),format.raw/*6.5*/("""<div class="alert alert-warning">
      <strong>"""),_display_(/*7.16*/error),format.raw/*7.21*/("""</strong>
    </div>
  """)))}),format.raw/*9.4*/("""
  """),_display_(/*10.4*/helper/*10.10*/.form(action = controllers.routes.AdminController.addFilmSubmit(), 'class -> "form-horizontal", 'role -> "form", 'enctype -> "multipart/form-data")/*10.157*/ {_display_(Seq[Any](format.raw/*10.159*/("""
    """),_display_(/*11.6*/inputText(addFilmForm("title"), '_label -> "Title", 'class -> "form-control")),format.raw/*11.83*/("""
    """),_display_(/*12.6*/inputText(addFilmForm("director"), '_label -> "Director", 'class -> "form-control")),format.raw/*12.89*/("""
    """),_display_(/*13.6*/inputText(addFilmForm("trailerURL"), '_label -> "Trailer (Embedded URL Link)", 'class -> "form-control")),format.raw/*13.110*/("""
    """),_display_(/*14.6*/inputText(addFilmForm("duration"), '_label -> "Duration (Mins)", 'class -> "form-control")),format.raw/*14.96*/("""
    """),_display_(/*15.6*/inputText(addFilmForm("summery"), '_label -> "Description", 'class -> "form-control")),format.raw/*15.91*/("""
    """),format.raw/*16.5*/("""<label>Poster Upload</label>
    <input class="btn-sm btn-default" id="margBottom" type="file" name="upload">


    <div class="actions" id="margBottom">
      <input type="submit" value="Add Film" class="btn btn-primary">
      <a href=""""),_display_(/*22.17*/routes/*22.23*/.AdminController.adminFilm()),format.raw/*22.51*/("""" <button class="btn btn-warning">Cancel</button></a>
    </div>
  """)))}),format.raw/*24.4*/("""
""")))}))
      }
    }
  }

  def render(addFilmForm:Form[models.Film],user:models.users.User,error:String): play.twirl.api.HtmlFormat.Appendable = apply(addFilmForm,user,error)

  def f:((Form[models.Film],models.users.User,String) => play.twirl.api.HtmlFormat.Appendable) = (addFilmForm,user,error) => apply(addFilmForm,user,error)

  def ref: this.type = this

}


}

/**/
object adminAddFilm extends adminAddFilm_Scope0.adminAddFilm
              /*
                  -- GENERATED --
                  DATE: Thu Mar 09 23:13:40 GMT 2017
                  SOURCE: C:/Users/Glen/Desktop/YearTwoProject/app/views/adminPages/adminAddFilm.scala.html
                  HASH: 58c6753450a5dd3aec2dab8479ffed5dffccbcaf
                  MATRIX: 806->1|988->73|1016->93|1044->96|1062->106|1098->134|1136->135|1166->140|1191->157|1229->158|1261->164|1337->214|1362->219|1417->245|1448->250|1463->256|1620->403|1661->405|1694->412|1792->489|1825->496|1929->579|1962->586|2088->690|2121->697|2232->787|2265->794|2371->879|2404->885|2676->1130|2691->1136|2740->1164|2840->1234
                  LINES: 27->1|32->1|33->3|34->4|34->4|34->4|34->4|35->5|35->5|35->5|36->6|37->7|37->7|39->9|40->10|40->10|40->10|40->10|41->11|41->11|42->12|42->12|43->13|43->13|44->14|44->14|45->15|45->15|46->16|52->22|52->22|52->22|54->24
                  -- GENERATED --
              */
          