
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
"""),format.raw/*6.1*/("""<br /> <br /> <br /> <br />
<div class="panel panel-info ">
	<div class="panel-heading">
		<div class="row">
			<div class="col-md-10 ">
			<h1 class="panel-title" id ="temaSelecionado">"""),_display_(/*11.51*/tema/*11.55*/.getNome()),format.raw/*11.65*/("""</h1>
			</div>
			
			<div class="col-md-1.5 " >
			<button type="button" class="btn-info " data-toggle="modal" data-target="#adicionarDica" >Adicionar dica</button>
			</div>
			
		</div>
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


<div class="panel ">
	"""),_display_(/*46.3*/if(tema.isEmpty())/*46.21*/{_display_(Seq[Any](format.raw/*46.22*/("""
		"""),format.raw/*47.3*/("""<p>Nenhuma dica para este tema.</p>
			
		
		
		
	""")))}/*52.3*/else/*52.7*/{_display_(Seq[Any](format.raw/*52.8*/("""
		"""),_display_(/*53.4*/for(dica <- tema.getDicas()) yield /*53.32*/{_display_(Seq[Any](format.raw/*53.33*/("""
			"""),format.raw/*54.4*/("""<div class="panel panel-info ">Concordo  Discordo </div>
			<legend></legend>	
		""")))}),format.raw/*56.4*/("""	
	""")))}),format.raw/*57.3*/("""
"""),format.raw/*58.1*/("""</div>



""")))}))}
  }

  def render(user:Usuario,tema:models.Tema): play.twirl.api.HtmlFormat.Appendable = apply(user,tema)

  def f:((Usuario,models.Tema) => play.twirl.api.HtmlFormat.Appendable) = (user,tema) => apply(user,tema)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Wed Mar 18 17:35:39 BRT 2015
                  SOURCE: /home/mariadch/projetosi-18/ProjetoSI1/app/views/dicasTema.scala.html
                  HASH: b6af26e90a8b340d25e76de0bdade93463f9e130
                  MATRIX: 740->1|862->35|890->38|921->61|959->62|987->65|1027->85|1054->86|1268->273|1281->277|1312->287|2167->1116|2194->1134|2233->1135|2263->1138|2332->1189|2344->1193|2382->1194|2412->1198|2456->1226|2495->1227|2526->1231|2638->1313|2672->1317|2700->1318
                  LINES: 26->1|29->1|31->3|31->3|31->3|33->5|33->5|34->6|39->11|39->11|39->11|74->46|74->46|74->46|75->47|80->52|80->52|80->52|81->53|81->53|81->53|82->54|84->56|85->57|86->58
                  -- GENERATED --
              */
          