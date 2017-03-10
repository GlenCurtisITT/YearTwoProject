
package views.html.adminPages

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object adminFilm_Scope0 {
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

class adminFilm extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template3[models.users.User,List[models.Film],play.api.Environment,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(user: models.users.User, films: List[models.Film], env: play.api.Environment):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.80*/("""
"""),_display_(/*2.2*/adminPages/*2.12*/.adminMain("Admin Homepage", user)/*2.46*/ {_display_(Seq[Any](format.raw/*2.48*/("""
    """),_display_(/*3.6*/if(flash().containsKey("success"))/*3.40*/{_display_(Seq[Any](format.raw/*3.41*/("""
        """),format.raw/*4.9*/("""<div class="row">
            <div class="col-xs-4">
                <div class="alert alert-success">
                    <strong>"""),_display_(/*7.30*/flash()/*7.37*/.get("success")),format.raw/*7.52*/("""</strong>
                </div>
            </div>
        </div>

    """)))}),format.raw/*12.6*/("""
    """),_display_(/*13.6*/for(f <- films) yield /*13.21*/{_display_(Seq[Any](format.raw/*13.22*/("""
        """),format.raw/*14.9*/("""<div class="row">
            <div class="col-lg-12">
                <h1 class="page-header" style="padding-top: 10px;">"""),_display_(/*16.69*/f/*16.70*/.getTitle),format.raw/*16.79*/("""</h1>
            </div>
        </div>
        <div class="row">
            <div class="col-lg-3 col-sm-12" id="posterSize">
                """),_display_(/*21.18*/if(env.resource("public/images/FilmPosters/" + f.getTitle + ".jpg").isDefined)/*21.96*/{_display_(Seq[Any](format.raw/*21.97*/("""
                    """),format.raw/*22.21*/("""<img src="/assets/images/FilmPosters/"""),_display_(/*22.59*/(f.getTitle + ".jpg")),format.raw/*22.80*/("""" />
                """)))}/*23.18*/else/*23.22*/{_display_(Seq[Any](format.raw/*23.23*/("""
                    """),format.raw/*24.21*/("""<img src="/assets/images/FilmPosters/noImage.jpg" />
                """)))}),format.raw/*25.18*/("""
            """),format.raw/*26.13*/("""</div>
            <div class="col-lg-9">
                <p><b>Description: """),_display_(/*28.37*/f/*28.38*/.getSummery),format.raw/*28.49*/("""</b></p>
                <p><b>Director: """),_display_(/*29.34*/f/*29.35*/.getDirector),format.raw/*29.47*/("""</b></p>
                <p><b>Duration: """),_display_(/*30.34*/f/*30.35*/.getDuration),format.raw/*30.47*/(""" """),format.raw/*30.48*/("""(Mins)</b></p>
                <p><b>Trailer URL: <a href=""""),_display_(/*31.46*/f/*31.47*/.getTrailerURL),format.raw/*31.61*/("""">YouTube</a></b></p>
                <p><a class="btn btn-lg btn-danger" id="right-btn" href=""""),_display_(/*32.75*/routes/*32.81*/.AdminController.deleteMovie(f.getTitle)),format.raw/*32.121*/("""" role="button" onclick="return confirmDel();">Delete</a></p>
                <p><a class="btn btn-lg btn-primary" id="right-btn" href=""""),_display_(/*33.76*/routes/*33.82*/.AdminController.updateMovie(f.getTitle)),format.raw/*33.122*/("""" role="button">Update</a></p>
                <p><a class="btn btn-lg btn-primary" id="right-btn" href="#" role="button">Showings</a></p>
                    <!--uses the films id to access the showing for that particular film-->

            </div>
        </div>
    """)))}),format.raw/*39.6*/("""

    """),format.raw/*41.5*/("""<div class="row">
        <div class="col-lg-12">
            <h1 class="page-header" style="padding-top: 10px;">Add New Film</h1>
        </div>
    </div>
    <p><a class="btn btn-xl btn-primary" href=""""),_display_(/*46.49*/routes/*46.55*/.AdminController.adminAddFilm()),format.raw/*46.86*/("""" role="button">Add New Film</a>

    <script>
        function confirmDel() """),format.raw/*49.31*/("""{"""),format.raw/*49.32*/("""
            """),format.raw/*50.13*/("""return confirm('Are you sure?');
        """),format.raw/*51.9*/("""}"""),format.raw/*51.10*/("""
    """),format.raw/*52.5*/("""</script>
""")))}),format.raw/*53.2*/("""
"""))
      }
    }
  }

  def render(user:models.users.User,films:List[models.Film],env:play.api.Environment): play.twirl.api.HtmlFormat.Appendable = apply(user,films,env)

  def f:((models.users.User,List[models.Film],play.api.Environment) => play.twirl.api.HtmlFormat.Appendable) = (user,films,env) => apply(user,films,env)

  def ref: this.type = this

}


}

/**/
object adminFilm extends adminFilm_Scope0.adminFilm
              /*
                  -- GENERATED --
                  DATE: Thu Mar 09 23:27:54 GMT 2017
                  SOURCE: C:/Users/Glen/Desktop/YearTwoProject/app/views/adminPages/adminFilm.scala.html
                  HASH: d974c24816a5c0711f02d9f998a1d0b051a54981
                  MATRIX: 814->1|987->79|1015->82|1033->92|1075->126|1114->128|1146->135|1188->169|1226->170|1262->180|1423->315|1438->322|1473->337|1581->415|1614->422|1645->437|1684->438|1721->448|1872->572|1882->573|1912->582|2088->731|2175->809|2214->810|2264->832|2329->870|2371->891|2413->914|2426->918|2465->919|2515->941|2617->1012|2659->1026|2766->1106|2776->1107|2808->1118|2878->1161|2888->1162|2921->1174|2991->1217|3001->1218|3034->1230|3063->1231|3151->1292|3161->1293|3196->1307|3320->1404|3335->1410|3397->1450|3562->1588|3577->1594|3639->1634|3946->1911|3981->1919|4218->2129|4233->2135|4285->2166|4393->2246|4422->2247|4464->2261|4533->2303|4562->2304|4595->2310|4637->2322
                  LINES: 27->1|32->1|33->2|33->2|33->2|33->2|34->3|34->3|34->3|35->4|38->7|38->7|38->7|43->12|44->13|44->13|44->13|45->14|47->16|47->16|47->16|52->21|52->21|52->21|53->22|53->22|53->22|54->23|54->23|54->23|55->24|56->25|57->26|59->28|59->28|59->28|60->29|60->29|60->29|61->30|61->30|61->30|61->30|62->31|62->31|62->31|63->32|63->32|63->32|64->33|64->33|64->33|70->39|72->41|77->46|77->46|77->46|80->49|80->49|81->50|82->51|82->51|83->52|84->53
                  -- GENERATED --
              */
          