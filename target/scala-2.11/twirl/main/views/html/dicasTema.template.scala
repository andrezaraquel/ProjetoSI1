
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


<div class="panel col-md-12 ">
	"""),_display_(/*46.3*/if(tema.isEmpty())/*46.21*/{_display_(Seq[Any](format.raw/*46.22*/("""
		"""),format.raw/*47.3*/("""<p>Nenhuma dica para este tema.</p>	
		<div class="panel panel-info ">Concordo  Discordo </div>
	""")))}/*49.3*/else/*49.7*/{_display_(Seq[Any](format.raw/*49.8*/("""
		"""),_display_(/*50.4*/for(dica <- tema.getDicas()) yield /*50.32*/{_display_(Seq[Any](format.raw/*50.33*/("""
			"""),format.raw/*51.4*/("""<div class="panel panel-default centralizarPanel ">
				"""),_display_(/*52.6*/Html(dica.exibir())),format.raw/*52.25*/("""
			
			"""),format.raw/*54.4*/("""<legend></legend>
			<a href="#" >Concordar <img src="/assets/images/curtir_icon.jpg">"""),_display_(/*55.70*/dica/*55.74*/.getQuantConcordancia()),format.raw/*55.97*/("""</a>&nbsp;&nbsp;
			<a href="#" >Discordar <img src="/assets/images/curtir_icon.jpg">"""),_display_(/*56.70*/dica/*56.74*/.getQuantDiscordancia()),format.raw/*56.97*/("""</a>
			<a href="#" >Denunciar </a>
			</div>

			
			
		""")))}),format.raw/*62.4*/("""	
	""")))}),format.raw/*63.3*/("""
"""),format.raw/*64.1*/("""</div>



""")))}))}
  }

  def render(user:Usuario,tema:models.Tema): play.twirl.api.HtmlFormat.Appendable = apply(user,tema)

  def f:((Usuario,models.Tema) => play.twirl.api.HtmlFormat.Appendable) = (user,tema) => apply(user,tema)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Thu Mar 19 15:47:21 BRT 2015
                  SOURCE: /home/mariadch/projetosi-18/ProjetoSI1/app/views/dicasTema.scala.html
                  HASH: c93ce27cf27cd83dfc25907a75ebaa0c63266374
                  MATRIX: 740->1|862->35|890->38|921->61|959->62|987->65|1027->85|1054->86|1268->273|1281->277|1312->287|2177->1126|2204->1144|2243->1145|2273->1148|2389->1246|2401->1250|2439->1251|2469->1255|2513->1283|2552->1284|2583->1288|2666->1345|2706->1364|2741->1372|2855->1459|2868->1463|2912->1486|3025->1572|3038->1576|3082->1599|3170->1657|3204->1661|3232->1662
                  LINES: 26->1|29->1|31->3|31->3|31->3|33->5|33->5|34->6|39->11|39->11|39->11|74->46|74->46|74->46|75->47|77->49|77->49|77->49|78->50|78->50|78->50|79->51|80->52|80->52|82->54|83->55|83->55|83->55|84->56|84->56|84->56|90->62|91->63|92->64
                  -- GENERATED --
              */
          