
package views.html.adminPages

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object adminMain_Scope0 {
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

class adminMain extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template3[String,models.users.User,Html,play.twirl.api.HtmlFormat.Appendable] {

  /*
* This template is called from the `index` template. This template
* handles the rendering of the page header and body tags. It takes
* two arguments, a `String` for the title of the page and an `Html`
* object to insert into the body of the page.
*/
  def apply/*7.2*/(title: String, user: models.users.User)(content: Html):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*7.57*/("""

"""),format.raw/*9.1*/("""<!DOCTYPE html>
<html lang="en">
    <head>
        """),format.raw/*12.62*/("""
        """),format.raw/*13.9*/("""<title>"""),_display_(/*13.17*/title),format.raw/*13.22*/("""</title>
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/font-awesome/4.5.0/css/font-awesome.min.css">
        <link rel="stylesheet" href="http://code.ionicframework.com/ionicons/2.0.1/css/ionicons.min.css">
        <link rel="shortcut icon" type="image/png" href=""""),_display_(/*17.59*/routes/*17.65*/.Assets.versioned("images/favicon.png")),format.raw/*17.104*/("""">
        <link rel="stylesheet" media="screen" href=""""),_display_(/*18.54*/routes/*18.60*/.Assets.versioned("stylesheets/bootstrap.css")),format.raw/*18.106*/("""">
        <link rel="stylesheet" media="screen" href=""""),_display_(/*19.54*/routes/*19.60*/.Assets.versioned("stylesheets/main.css")),format.raw/*19.101*/("""">
        <link href="https://fonts.googleapis.com/css?family=Audiowide" rel="stylesheet">
        <link href="https://fonts.googleapis.com/css?family=Ubuntu" rel="stylesheet">

    </head>
    <body>

        <div class="container">
            <div class="row">
                <div class="col-lg-8">
                    """),_display_(/*29.22*/if(user != null)/*29.38*/{_display_(Seq[Any](format.raw/*29.39*/("""
                        """),format.raw/*30.25*/("""<h1>Welcome to the Admin Portal: """),_display_(/*30.59*/user/*30.63*/.getName),format.raw/*30.71*/("""</h1>
                    """)))}),format.raw/*31.22*/("""
                """),format.raw/*32.17*/("""</div>
                <div class="col-lg-4">
                    <p><a class="btn btn-lg btn-primary" id="right-btn" href=""""),_display_(/*34.80*/routes/*34.86*/.LoginController.logout()),format.raw/*34.111*/("""" role="button">Logout</a></p>
                </div>
            </div>


            """),_display_(/*39.14*/content),format.raw/*39.21*/("""
        """),format.raw/*40.9*/("""</div>



        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
        <script src=""""),_display_(/*46.23*/routes/*46.29*/.Assets.versioned("javascripts/hello.js")),format.raw/*46.70*/("""" type="text/javascript"></script>
    </body>
</html>"""))
      }
    }
  }

  def render(title:String,user:models.users.User,content:Html): play.twirl.api.HtmlFormat.Appendable = apply(title,user)(content)

  def f:((String,models.users.User) => (Html) => play.twirl.api.HtmlFormat.Appendable) = (title,user) => (content) => apply(title,user)(content)

  def ref: this.type = this

}


}

/*
* This template is called from the `index` template. This template
* handles the rendering of the page header and body tags. It takes
* two arguments, a `String` for the title of the page and an `Html`
* object to insert into the body of the page.
*/
object adminMain extends adminMain_Scope0.adminMain
              /*
                  -- GENERATED --
                  DATE: Thu Mar 09 20:17:15 GMT 2017
                  SOURCE: C:/Users/Glen/Desktop/YearTwoProject/app/views/adminPages/adminMain.scala.html
                  HASH: 331b9702139e44206bc90c0068538e18eee9d4a1
                  MATRIX: 1041->261|1191->316|1221->320|1304->428|1341->438|1376->446|1402->451|1830->852|1845->858|1906->897|1990->954|2005->960|2073->1006|2157->1063|2172->1069|2235->1110|2597->1445|2622->1461|2661->1462|2715->1488|2776->1522|2789->1526|2818->1534|2877->1562|2923->1580|3077->1707|3092->1713|3139->1738|3259->1831|3287->1838|3324->1848|3586->2083|3601->2089|3663->2130
                  LINES: 32->7|37->7|39->9|42->12|43->13|43->13|43->13|47->17|47->17|47->17|48->18|48->18|48->18|49->19|49->19|49->19|59->29|59->29|59->29|60->30|60->30|60->30|60->30|61->31|62->32|64->34|64->34|64->34|69->39|69->39|70->40|76->46|76->46|76->46
                  -- GENERATED --
              */
          