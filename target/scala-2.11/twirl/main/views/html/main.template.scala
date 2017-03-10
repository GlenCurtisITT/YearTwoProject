
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object main_Scope0 {
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

class main extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template3[String,models.users.User,Html,play.twirl.api.HtmlFormat.Appendable] {

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
"""),format.raw/*8.1*/("""<!DOCTYPE html>
<html lang="en">
    <head>
        """),format.raw/*11.62*/("""
        """),format.raw/*12.9*/("""<title>"""),_display_(/*12.17*/title),format.raw/*12.22*/("""</title>
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/font-awesome/4.5.0/css/font-awesome.min.css">
        <link rel="stylesheet" href="http://code.ionicframework.com/ionicons/2.0.1/css/ionicons.min.css">
        <link rel="shortcut icon" type="image/png" href=""""),_display_(/*16.59*/routes/*16.65*/.Assets.versioned("images/favicon.png")),format.raw/*16.104*/("""">
        <link rel="stylesheet" media="screen" href=""""),_display_(/*17.54*/routes/*17.60*/.Assets.versioned("stylesheets/bootstrap.css")),format.raw/*17.106*/("""">
        <link rel="stylesheet" media="screen" href=""""),_display_(/*18.54*/routes/*18.60*/.Assets.versioned("stylesheets/main.css")),format.raw/*18.101*/("""">
        <link href="https://fonts.googleapis.com/css?family=Audiowide" rel="stylesheet">
        <link href="https://fonts.googleapis.com/css?family=Ubuntu" rel="stylesheet">

    </head>
    <body>
        <nav class="navbar navbar-default" id="black-nav">
            <div class="container">
                    <!-- Brand and toggle get grouped for better mobile display -->
                <div class="navbar-header">
                    <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#navbar-collapse-2">
                        <span class="sr-only">Toggle navigation</span>
                        <span class="icon-bar"></span>
                        <span class="icon-bar"></span>
                        <span class="icon-bar"></span>
                    </button>
                    <a class="navbar-brand" id="blue-title" href=""""),_display_(/*34.68*/routes/*34.74*/.HomeController.index()),format.raw/*34.97*/("""" style="font-family: 'Audiowide', cursive;font-size: 25px; ">EMD Cinemas</a>
                </div>

                    <!-- Collect the nav links, forms, and other content for toggling -->
                <div class="collapse navbar-collapse" id="navbar-collapse-2">
                    <ul class="nav navbar-nav navbar-right">
                        <li><a href=""""),_display_(/*40.39*/routes/*40.45*/.HomeController.index()),format.raw/*40.68*/("""">Home</a></li>
                        <li><a href=""""),_display_(/*41.39*/routes/*41.45*/.HomeController.index()),format.raw/*41.68*/("""">Films</a></li>
                        <li><a href="#">Contact Us</a></li>
                        """),_display_(/*43.26*/if(user == null)/*43.42*/{_display_(Seq[Any](format.raw/*43.43*/("""
                            """),format.raw/*44.29*/("""<li><a href=""""),_display_(/*44.43*/routes/*44.49*/.HomeController.signUp()),format.raw/*44.73*/("""">Sign Up</a></li>
                            <li><a href=""""),_display_(/*45.43*/routes/*45.49*/.HomeController.login()),format.raw/*45.72*/("""">Sign In</a></li>
                        """)))}/*46.26*/else/*46.30*/{_display_(Seq[Any](format.raw/*46.31*/("""
                            """),format.raw/*47.29*/("""<li><a href=""""),_display_(/*47.43*/routes/*47.49*/.LoginController.logout()),format.raw/*47.74*/("""">Logout</a></li>
                        """)))}),format.raw/*48.26*/("""

                """),format.raw/*50.17*/("""</div><!-- /.navbar-collapse -->
            </div><!-- /.container -->
        </nav><!-- /.navbar -->

        <div class="container">
        """),_display_(/*55.10*/content),format.raw/*55.17*/("""
        """),format.raw/*56.9*/("""</div>



        <footer>
            <div class="container" id="footerid">
                <div class="row">
                    <div class="col-md-12">
                        <ul class="list-inline social-buttons" id="socialImages">
                            <li><a href="#"><i class="fa fa-twitter"></i></a>
                            </li>
                            <li><a href="#"><i class="fa fa-facebook"></i></a>
                            </li>
                            <li><a href="#"><i class="fa fa-linkedin"></i></a>
                            </li>
                        </ul>
                    </div>
                </div>
            </div>
        </footer>


        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
        <script src=""""),_display_(/*80.23*/routes/*80.29*/.Assets.versioned("javascripts/hello.js")),format.raw/*80.70*/("""" type="text/javascript"></script>
    </body>
</html>
"""))
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
object main extends main_Scope0.main
              /*
                  -- GENERATED --
                  DATE: Thu Mar 09 19:44:02 GMT 2017
                  SOURCE: C:/Users/Glen/Desktop/YearTwoProject/app/views/main.scala.html
                  HASH: 13155ae2447c11d92d8e7a096ab57538a4be5006
                  MATRIX: 1020->261|1170->316|1198->318|1281->426|1318->436|1353->444|1379->449|1807->850|1822->856|1883->895|1967->952|1982->958|2050->1004|2134->1061|2149->1067|2212->1108|3144->2013|3159->2019|3203->2042|3605->2417|3620->2423|3664->2446|3746->2501|3761->2507|3805->2530|3936->2634|3961->2650|4000->2651|4058->2681|4099->2695|4114->2701|4159->2725|4248->2787|4263->2793|4307->2816|4371->2861|4384->2865|4423->2866|4481->2896|4522->2910|4537->2916|4583->2941|4658->2985|4706->3005|4884->3156|4912->3163|4949->3173|5913->4110|5928->4116|5990->4157
                  LINES: 32->7|37->7|38->8|41->11|42->12|42->12|42->12|46->16|46->16|46->16|47->17|47->17|47->17|48->18|48->18|48->18|64->34|64->34|64->34|70->40|70->40|70->40|71->41|71->41|71->41|73->43|73->43|73->43|74->44|74->44|74->44|74->44|75->45|75->45|75->45|76->46|76->46|76->46|77->47|77->47|77->47|77->47|78->48|80->50|85->55|85->55|86->56|110->80|110->80|110->80
                  -- GENERATED --
              */
          