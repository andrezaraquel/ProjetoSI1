
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._

import play.api.templates.PlayMagic._
import models._
import controllers._
import java.lang._
import java.util._
import scala.collection.JavaConversions._
import scala.collection.JavaConverters._
import play.api.i18n._
import play.core.j.PlayMagicForJava._
import play.mvc._
import play.data._
import play.api.data.Field
import play.mvc.Http.Context.Implicit._
import views.html._

/**/
object dicasTema extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template3[Usuario,models.Tema,String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(user: Usuario, tema: models.Tema, mensagem: String):play.twirl.api.HtmlFormat.Appendable = {
      _display_ {

Seq[Any](format.raw/*1.54*/("""

"""),_display_(/*3.2*/main("Portal do Leite")/*3.25*/ {_display_(Seq[Any](format.raw/*3.27*/("""



""")))}))}
  }

  def render(user:Usuario,tema:models.Tema,mensagem:String): play.twirl.api.HtmlFormat.Appendable = apply(user,tema,mensagem)

  def f:((Usuario,models.Tema,String) => play.twirl.api.HtmlFormat.Appendable) = (user,tema,mensagem) => apply(user,tema,mensagem)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Mon Mar 16 20:18:42 BRT 2015
                  SOURCE: C:/Users/Daniela/Documents/CC/projetosi-16/ProjetoSI1/app/views/dicasTema.scala.html
                  HASH: 9167fd4edf9211c866117135f15df02a55e1835f
                  MATRIX: 747->1|887->53|917->58|948->81|987->83
                  LINES: 26->1|29->1|31->3|31->3|31->3
                  -- GENERATED --
              */
          