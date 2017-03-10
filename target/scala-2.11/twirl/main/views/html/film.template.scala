
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object film_Scope0 {
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

class film extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template3[models.users.User,models.Film,play.api.Environment,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(user: models.users.User, film: models.Film, env: play.api.Environment):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.73*/("""
"""),_display_(/*2.2*/main("Film", user)/*2.20*/ {_display_(Seq[Any](format.raw/*2.22*/("""
    """),_display_(/*3.6*/if(film != null)/*3.22*/{_display_(Seq[Any](format.raw/*3.23*/("""
    """),format.raw/*4.5*/("""<!-- Portfolio Item Heading -->
        <div class="row">
            <div class="col-lg-12">
                <h1 class="page-header">"""),_display_(/*7.42*/film/*7.46*/.getTitle),format.raw/*7.55*/("""</h1>
            </div>
        </div>
        <div class="row">
            <div class="col-lg-3 col-sm-12" id="posterSize">
            """),_display_(/*12.14*/if(env.resource("public/images/FilmPosters/" + film.getTitle + ".jpg").isDefined)/*12.95*/{_display_(Seq[Any](format.raw/*12.96*/("""
                """),format.raw/*13.17*/("""<img src="/assets/images/FilmPosters/"""),_display_(/*13.55*/(film.getTitle + ".jpg")),format.raw/*13.79*/("""" />
            """)))}/*14.14*/else/*14.18*/{_display_(Seq[Any](format.raw/*14.19*/("""
                """),format.raw/*15.17*/("""<img src="/assets/images/FilmPosters/noImage.jpg" />
            """)))}),format.raw/*16.14*/("""
            """),format.raw/*17.13*/("""</div>
            <div class="col-lg-9">
                <p><b>Description: """),_display_(/*19.37*/film/*19.41*/.getSummery),format.raw/*19.52*/("""</b></p>
                <p><b>Director: """),_display_(/*20.34*/film/*20.38*/.getDirector),format.raw/*20.50*/("""</b></p>
                <p><b>Duration: """),_display_(/*21.34*/film/*21.38*/.getDuration),format.raw/*21.50*/("""</b></p>
                <p><a class="btn btn-lg btn-primary" href="#" role="button">Buy Now</a></p>

            </div>
        </div>
        <div class="row">
            <div class="col-lg-12">
                <h1 class="page-header">Trailer</h1>
            </div>
        </div>
            <!-- /.row -->
            <!-- 16:9 aspect ratio -->

        <div class="embed-responsive embed-responsive-16by9">
            <iframe class="embed-responsive-item" src=""""),_display_(/*35.57*/film/*35.61*/.getTrailerURL),format.raw/*35.75*/(""""></iframe>
        </div>
            <!-- Portfolio Item Row -->
         <!-- Dates & times pulled from db when clicked brought to buy page where qty and purchase is done-->
        <div class="row">
            <div class="col-lg-12">
                <h3 class="page-header">Showings</h3>
                <!--<h3>Tuesday 11th March</h3>
                <a href="#about" class="btn btn-primary btn-md page-scroll" style=" background-color: #6EC2F6;">19:00</a>
                <a href="#about" class="btn btn-primary btn-md page-scroll" style=" background-color: #6EC2F6;">19:00</a>
                <a href="#about" class="btn btn-primary btn-md page-scroll" style=" background-color: #6EC2F6;">19:00</a>
                <a href="#about" class="btn btn-primary btn-md page-scroll" style=" background-color: #6EC2F6;">19:00</a>
                <a href="#about" class="btn btn-primary btn-md page-scroll" style=" background-color: #6EC2F6;">19:00</a>
                <a href="#about" class="btn btn-primary btn-md page-scroll" style=" background-color: #6EC2F6;">19:00</a>
                <a href="#about" class="btn btn-primary btn-md page-scroll" style=" background-color: #6EC2F6;">19:00</a>
                <a href="#about" class="btn btn-primary btn-md page-scroll" style=" background-color: #6EC2F6;">19:00</a>
                <a href="#about" class="btn btn-primary btn-md page-scroll" style=" background-color: #6EC2F6;">19:00</a>
                <a href="#about" class="btn btn-primary btn-md page-scroll" style=" background-color: #6EC2F6;">19:00</a>
                <a href="#about" class="btn btn-primary btn-md page-scroll" style=" background-color: #6EC2F6;">19:00</a>
                <a href="#about" class="btn btn-primary btn-md page-scroll" style=" background-color: #6EC2F6;">19:00</a>

                <h3>Tuesday 12th March</h3>
                <a href="#about" class="btn btn-primary btn-md page-scroll" style=" background-color: #6EC2F6;">19:00</a>
                <a href="#about" class="btn btn-primary btn-md page-scroll" style=" background-color: #6EC2F6;">19:00</a>
                <a href="#about" class="btn btn-primary btn-md page-scroll" style=" background-color: #6EC2F6;">19:00</a>
                <a href="#about" class="btn btn-primary btn-md page-scroll" style=" background-color: #6EC2F6;">19:00</a>
                <a href="#about" class="btn btn-primary btn-md page-scroll" style=" background-color: #6EC2F6;">19:00</a>
                <a href="#about" class="btn btn-primary btn-md page-scroll" style=" background-color: #6EC2F6;">19:00</a>
                <a href="#about" class="btn btn-primary btn-md page-scroll" style=" background-color: #6EC2F6;">19:00</a>
                <a href="#about" class="btn btn-primary btn-md page-scroll" style=" background-color: #6EC2F6;">19:00</a>
                <a href="#about" class="btn btn-primary btn-md page-scroll" style=" background-color: #6EC2F6;">19:00</a>
                <a href="#about" class="btn btn-primary btn-md page-scroll" style=" background-color: #6EC2F6;">19:00</a>
                <a href="#about" class="btn btn-primary btn-md page-scroll" style=" background-color: #6EC2F6;">19:00</a>
                <a href="#about" class="btn btn-primary btn-md page-scroll" style=" background-color: #6EC2F6;">19:00</a>


            </div>-->
        </div>
    """)))}/*73.6*/else/*73.10*/{_display_(Seq[Any](format.raw/*73.11*/("""
        """),format.raw/*74.9*/("""<h1>Movie Not Found</h1>
    """)))}),format.raw/*75.6*/("""
""")))}),format.raw/*76.2*/("""
"""))
      }
    }
  }

  def render(user:models.users.User,film:models.Film,env:play.api.Environment): play.twirl.api.HtmlFormat.Appendable = apply(user,film,env)

  def f:((models.users.User,models.Film,play.api.Environment) => play.twirl.api.HtmlFormat.Appendable) = (user,film,env) => apply(user,film,env)

  def ref: this.type = this

}


}

/**/
object film extends film_Scope0.film
              /*
                  -- GENERATED --
                  DATE: Thu Mar 09 23:15:20 GMT 2017
                  SOURCE: C:/Users/Glen/Desktop/YearTwoProject/app/views/film.scala.html
                  HASH: d95d073558b92f808e824fe8df6ae8691e34b504
                  MATRIX: 787->1|953->72|981->75|1007->93|1046->95|1078->102|1102->118|1140->119|1172->125|1336->263|1348->267|1377->276|1549->421|1639->502|1678->503|1724->521|1789->559|1834->583|1872->602|1885->606|1924->607|1970->625|2068->692|2110->706|2217->786|2230->790|2262->801|2332->844|2345->848|2378->860|2448->903|2461->907|2494->919|3005->1403|3018->1407|3053->1421|6467->4817|6480->4821|6519->4822|6556->4832|6617->4863|6650->4866
                  LINES: 27->1|32->1|33->2|33->2|33->2|34->3|34->3|34->3|35->4|38->7|38->7|38->7|43->12|43->12|43->12|44->13|44->13|44->13|45->14|45->14|45->14|46->15|47->16|48->17|50->19|50->19|50->19|51->20|51->20|51->20|52->21|52->21|52->21|66->35|66->35|66->35|104->73|104->73|104->73|105->74|106->75|107->76
                  -- GENERATED --
              */
          