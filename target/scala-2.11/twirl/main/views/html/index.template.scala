
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object index_Scope0 {
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

class index extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template3[models.users.User,List[models.Film],play.api.Environment,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(user: models.users.User, films: List[models.Film], env: play.api.Environment):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.80*/("""
"""),_display_(/*2.2*/main("Index", user)/*2.21*/ {_display_(Seq[Any](format.raw/*2.23*/("""
    """),format.raw/*3.5*/("""<div class="row">
        <div class="col-lg-12">
                <!-- Carousel
    ================================================== -->
            """),_display_(/*7.14*/if(flash().containsKey("success"))/*7.48*/{_display_(Seq[Any](format.raw/*7.49*/("""
                """),format.raw/*8.17*/("""<div class="row">
                    <div class="col-xs-6">
                        <div class="alert alert-success">
                            <strong>"""),_display_(/*11.38*/flash()/*11.45*/.get("success")),format.raw/*11.60*/("""</strong>
                        </div>
                    </div>
                </div>

            """)))}),format.raw/*16.14*/("""
            """),_display_(/*17.14*/if(user != null)/*17.30*/{_display_(Seq[Any](format.raw/*17.31*/("""
                """),format.raw/*18.17*/("""<h1>Welcome back: """),_display_(/*18.36*/user/*18.40*/.getName),format.raw/*18.48*/("""</h1>
            """)))}),format.raw/*19.14*/("""
            """),format.raw/*20.13*/("""<div id="myCarousel" class="carousel slide" data-ride="carousel">
                    <!-- Indicators -->
                <ol class="carousel-indicators">
                    <li data-target="#myCarousel" data-slide-to="0" class="active"></li>
                    <li data-target="#myCarousel" data-slide-to="1"></li>
                    <li data-target="#myCarousel" data-slide-to="2"></li>
                </ol>
                <div class="carousel-inner" role="listbox">
                    <div class="item active">
                        <img class="first-slide" src="/assets/images/Banners/logan.jpg" alt="First slide">
                        <div class="container">
                            <div class="carousel-caption">
                                <h1>Example headline.</h1>
                                <p>Note: If you're viewing this page via a <code>file://</code> URL, the "next" and "previous" Glyphicon buttons on the left and right might not load/display properly due to web browser security rules.</p>
                                <p><a class="btn btn-lg btn-primary" href="#" role="button">Sign up today</a></p>
                            </div>
                        </div>
                    </div>
                    <div class="item">
                        <img class="second-slide" src="/assets/images/Banners/gotg.jpg" alt="Second slide">
                        <div class="container">
                            <div class="carousel-caption">
                                <h1>Another example headline.</h1>
                                <p>Cras justo odio, dapibus ac facilisis in, egestas eget quam. Donec id elit non mi porta gravida at eget metus. Nullam id dolor id nibh ultricies vehicula ut id elit.</p>
                                <p><a class="btn btn-lg btn-primary" href="#" role="button">Learn more</a></p>
                            </div>
                        </div>
                    </div>
                    <div class="item">
                        <img class="third-slide" src="/assets/images/Banners/ds.jpg" alt="Third slide">
                        <div class="container">
                            <div class="carousel-caption">
                                <h1>One more for good measure.</h1>
                                <p>Cras justo odio, dapibus ac facilisis in, egestas eget quam. Donec id elit non mi porta gravida at eget metus. Nullam id dolor id nibh ultricies vehicula ut id elit.</p>
                                <p><a class="btn btn-lg btn-primary" href="#" role="button">Browse gallery</a></p>
                            </div>
                        </div>
                    </div>
                </div>
                <a class="left carousel-control" href="#myCarousel" role="button" data-slide="prev">
                    <span class="glyphicon glyphicon-chevron-left" aria-hidden="true"></span>
                    <span class="sr-only">Previous</span>
                </a>
                <a class="right carousel-control" href="#myCarousel" role="button" data-slide="next">
                    <span class="glyphicon glyphicon-chevron-right" aria-hidden="true"></span>
                    <span class="sr-only">Next</span>
                </a>
            </div><!-- /.carousel -->
            <div class="container">
                <h1 class="page-header">Films</h1><!--Want to anchor this to the films button at top-->
                <!-- 4 posters to a row each poster for a particular movie on click go to movies own page pulled from db-->
                <div class="row">
                    <div class="col-xs-12" id="posterSize">
                        """),_display_(/*73.26*/for(f <- films) yield /*73.41*/{_display_(Seq[Any](format.raw/*73.42*/("""
                            """),_display_(/*74.30*/if(env.resource("public/images/FilmPosters/" + f.getTitle + ".jpg").isDefined)/*74.108*/{_display_(Seq[Any](format.raw/*74.109*/("""
                                """),format.raw/*75.33*/("""<a href=""""),_display_(/*75.43*/routes/*75.49*/.HomeController.viewMovie(f.getTitle)),format.raw/*75.86*/(""""><img src="/assets/images/FilmPosters/"""),_display_(/*75.126*/(f.getTitle + ".jpg")),format.raw/*75.147*/("""" /></a>
                            """)))}/*76.30*/else/*76.34*/{_display_(Seq[Any](format.raw/*76.35*/("""
                                """),format.raw/*77.33*/("""<a href=""""),_display_(/*77.43*/routes/*77.49*/.HomeController.viewMovie(f.getTitle)),format.raw/*77.86*/(""""><img src="/assets/images/FilmPosters/noImage.jpg" /></a>

                            """)))}),format.raw/*79.30*/("""
                        """)))}),format.raw/*80.26*/("""
                    """),format.raw/*81.21*/("""</div>
                </div>
            </div>
                <!--<div class="row">
                    <div class="col-lg-3 col-sm-12" id="posterSize">
                        <img src="/assets/images/FilmPosters/1.jpg">
                    </div>
                    <div class="col-lg-3 col-sm-12" id="posterSize">
                        <img src="/assets/images/FilmPosters/2.jpg">
                    </div>
                    <div class="col-lg-3 col-sm-12" id="posterSize">
                        <img src="/assets/images/FilmPosters/3.jpg">
                    </div>
                    <div class="col-lg-3 col-sm-12" id="posterSize">
                        <img src="/assets/images/FilmPosters/4.jpg">
                    </div>
                </div>-->
        </div>

    </div>


""")))}),format.raw/*103.2*/("""
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
object index extends index_Scope0.index
              /*
                  -- GENERATED --
                  DATE: Thu Mar 09 23:30:23 GMT 2017
                  SOURCE: C:/Users/Glen/Desktop/YearTwoProject/app/views/index.scala.html
                  HASH: ca7d403d532a7ad5b7e8a6b9427c763dd333e853
                  MATRIX: 795->1|968->79|996->82|1023->101|1062->103|1094->109|1276->265|1318->299|1356->300|1401->318|1587->477|1603->484|1639->499|1780->609|1822->624|1847->640|1886->641|1932->659|1978->678|1991->682|2020->690|2071->710|2113->724|5882->4466|5913->4481|5952->4482|6010->4513|6098->4591|6138->4592|6200->4626|6237->4636|6252->4642|6310->4679|6378->4719|6421->4740|6479->4779|6492->4783|6531->4784|6593->4818|6630->4828|6645->4834|6703->4871|6825->4962|6883->4989|6933->5011|7789->5836
                  LINES: 27->1|32->1|33->2|33->2|33->2|34->3|38->7|38->7|38->7|39->8|42->11|42->11|42->11|47->16|48->17|48->17|48->17|49->18|49->18|49->18|49->18|50->19|51->20|104->73|104->73|104->73|105->74|105->74|105->74|106->75|106->75|106->75|106->75|106->75|106->75|107->76|107->76|107->76|108->77|108->77|108->77|108->77|110->79|111->80|112->81|134->103
                  -- GENERATED --
              */
          