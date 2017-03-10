
package views.html.adminPages

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object adminShowing_Scope0 {
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

class adminShowing extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[models.users.User,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(user: models.users.User):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.27*/("""
"""),_display_(/*2.2*/adminPages/*2.12*/.adminMain("adminShowing", user)/*2.44*/ {_display_(Seq[Any](format.raw/*2.46*/("""
    """),format.raw/*3.5*/("""<div class="container">

        <div class="row">
            <div class="col-lg-12">
                <h1 style="text-align: center">Showings</h1>
                <h1 class="page-header" style="padding-top: 10px;">Title</h1><!--Pull Title From DB-->
            </div>
        </div>
            <!-- Showing Item -->
        <div class="row">
            <div class="col-lg-9">
                <p><b>Time:</b></p>
                <p><b>Screen No:</b></p>
                <p><b>Duration:</b></p>
                <p><a class="btn btn-lg btn-primary" id="right-btn" href="#" role="button">Edit</a></p>
                <p><a class="btn btn-lg btn-primary" id="right-btn"href="#" role="button">Delete</a></p>
                <h1 class="page-header" style="padding-top: 10px;"></h1>
            </div>
        </div>
            <!-- Showing Item -->
        <div class="row">
            <div class="col-lg-9">
                <p><b>Time:</b></p>
                <p><b>Screen No:</b></p>
                <p><b>Duration:</b></p>
                <p><a class="btn btn-lg btn-primary" id="right-btn" href="#" role="button">Edit</a></p>
                <p><a class="btn btn-lg btn-primary" id="right-btn"href="#" role="button">Delete</a></p>
                <h1 class="page-header" style="padding-top: 10px;"></h1>
            </div>
        </div>
        <p><a class="btn btn-xl btn-primary" href="#" role="button">Add New Showing</a></p>
    </div>

""")))}),format.raw/*36.2*/("""
"""))
      }
    }
  }

  def render(user:models.users.User): play.twirl.api.HtmlFormat.Appendable = apply(user)

  def f:((models.users.User) => play.twirl.api.HtmlFormat.Appendable) = (user) => apply(user)

  def ref: this.type = this

}


}

/**/
object adminShowing extends adminShowing_Scope0.adminShowing
              /*
                  -- GENERATED --
                  DATE: Thu Mar 09 19:35:50 GMT 2017
                  SOURCE: C:/Users/Glen/Desktop/YearTwoProject/app/views/adminPages/adminShowing.scala.html
                  HASH: 10bedd8e97f8becf456913b459ec440cebb983c3
                  MATRIX: 781->1|901->26|929->29|947->39|987->71|1026->73|1058->79|2567->1558
                  LINES: 27->1|32->1|33->2|33->2|33->2|33->2|34->3|67->36
                  -- GENERATED --
              */
          