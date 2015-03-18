
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
object dicasTema extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template2[Usuario,models.Tema,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(user: Usuario, tema: models.Tema):play.twirl.api.HtmlFormat.Appendable = {
      _display_ {

Seq[Any](format.raw/*1.36*/("""

"""),_display_(/*3.2*/main("Portal do Leite")/*3.25*/{_display_(Seq[Any](format.raw/*3.26*/("""

"""),format.raw/*5.1*/("""<br /> <br /> <br /> <br />
<div class="panel panel-info">
	<div class="panel-heading">
		<h3 class="panel-title" id ="temaSelecionado">"""),_display_(/*8.50*/tema/*8.54*/.getNome()),format.raw/*8.64*/("""</h3>
	</div>
	<div class="panel">	
		<div class="col-md-5 col-offset-1">
			<select class="selectNivelDificuldade" data-max-options="1">
				<option>N�vel de Dificuldade do Tema</option>
			    <option>Muito F�cil</option>
			    <option>F�cil</option>
			    <option>Normal</option>
			    <option>Dif�cil</option>
			    <option>Muito Dif�cil</option>
			</select>
		</div>
		<div class="col-md-2 col-md-offset-1">
			<label>M�dia</label>
			<div id="campoMedia">200</div>
		</div>
		<div class="col-md-2 col-md-offset-1">
			<label>Mediana</label>
			<div id="campoMediana">200</div>
		</div>	
	</div>		
</div>

""")))}))}
  }

  def render(user:Usuario,tema:models.Tema): play.twirl.api.HtmlFormat.Appendable = apply(user,tema)

  def f:((Usuario,models.Tema) => play.twirl.api.HtmlFormat.Appendable) = (user,tema) => apply(user,tema)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Tue Mar 17 23:28:45 BRT 2015
                  SOURCE: C:/Users/Andreza/Desktop/projetoSI/ProjetoSI1/app/views/dicasTema.scala.html
                  HASH: 5cbf70b7b55e7924a86d59aa8b8024fc41a7c9a4
                  MATRIX: 740->1|862->35|892->40|923->63|961->64|991->68|1157->208|1169->212|1199->222
                  LINES: 26->1|29->1|31->3|31->3|31->3|33->5|36->8|36->8|36->8
                  -- GENERATED --
              */
          