
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

"""),_display_(/*5.2*/modalAdicionarDica()),format.raw/*5.22*/("""

"""),format.raw/*7.1*/("""<br /> <br /> <br /> <br />
<div class="panel panel-info">
	<div class="panel-heading" 
		<h3 class="panel-title" id ="temaSelecionado">"""),_display_(/*10.50*/tema/*10.54*/.getNome()),format.raw/*10.64*/("""</h3>
		
		<button type="button" class="btn btn-info " data-toggle="modal" data-target="#adicionarDica">Adicionar dica</button>
		
	</div>
	<div class="panel">	
		<div class="col-md-5 col-offset-1">
			<select class="selectNivelDificuldade" data-max-options="1">
				<option>Nível de Dificuldade do Tema</option>
			    <option>Muito Fácil</option>
			    <option>Fácil</option>
			    <option>Normal</option>
			    <option>Difícil</option>
			    <option>Muito Difícil</option>
			</select>
		</div>
		<div class="col-md-2 col-md-offset-1">
			<label>Média</label>
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
                  DATE: Wed Mar 18 09:48:39 BRT 2015
                  SOURCE: C:/Users/Daniela/Documents/CC/projetosi1-18/ProjetoSI1/app/views/dicasTema.scala.html
                  HASH: 21747062c9f52609f175f1007abce8b9f4f2501f
                  MATRIX: 740->1|862->35|892->40|923->63|961->64|991->69|1031->89|1061->93|1228->233|1241->237|1272->247
                  LINES: 26->1|29->1|31->3|31->3|31->3|33->5|33->5|35->7|38->10|38->10|38->10
                  -- GENERATED --
              */
          