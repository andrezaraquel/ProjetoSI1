
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
object index extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template3[Usuario,List[models.Tema],String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(user: Usuario, temas: List[models.Tema], message: String):play.twirl.api.HtmlFormat.Appendable = {
      _display_ {

Seq[Any](format.raw/*1.60*/(""" 


"""),_display_(/*4.2*/main("Portal do Leite")/*4.25*/ {_display_(Seq[Any](format.raw/*4.27*/("""

	"""),format.raw/*6.2*/("""<div class="navbar navbar-default navbar-fixed-top" role="navigation"> 
			<div class="container">
				<div>
					<button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target=".navbar-collapse">
						<span class="sr-only">Toggle navigation</span>
						<span class="icon-bar"></span> <span class="icon-bar"></span> 
						<span class="icon-bar"></span>
					</button>
					<a class="navbar-brand" href="/">Portal do Leite</a>
				</div>
				
				<div class="navbar-collapse collapse">
					<ul class="nav navbar-nav">
						<li><a href="/sobre">Sobre</a></li>
						<li><a href="/contato">Contato</a></li>
					</ul>
					<ul class="nav navbar-nav navbar-right">
						<li><p>Olá, """),_display_(/*23.20*/user/*23.24*/.getNome()),format.raw/*23.34*/("""&nbsp;&nbsp;</p></li>
						<li>							
							<button class="btn btn-danger navbar-btn" onclick="location.href='/logout'">
							<span class="glyphicon glyphicon-log-out"></span>
							</button>
						</li>
					</ul>
				</div>
			</div>
	</div>	
     
     
<div class="container">
	<div class="row">
		<!-- Temas da disciplina -->
		<div class="col-md-3">
			<br /> <br /> <br /> <br />
			<div class="panel panel-info">
				<div class="panel-heading">
					<h3 class="panel-title">Temas da disciplina SI1</h3>
				</div>
				
				<div>
					<ul class="nav" id="main-menu">
						"""),_display_(/*47.8*/for(tema <- temas) yield /*47.26*/{_display_(Seq[Any](format.raw/*47.27*/("""
							"""),format.raw/*48.8*/("""<li>				
							<a  class="temas" data-nome=""""),_display_(/*49.38*/tema/*49.42*/.getNome()),format.raw/*49.52*/("""" id =""""),_display_(/*49.60*/tema/*49.64*/.getIdString()),format.raw/*49.78*/("""">"""),_display_(/*49.81*/tema/*49.85*/.getNome()),format.raw/*49.95*/("""</a>							
							</li>
						""")))}),format.raw/*51.8*/("""
					"""),format.raw/*52.6*/("""</ul>
				</div>
			</div>	
		</div>
		<div class="col-md-8 col-offset-1" id="campoTemas">
			<br /> <br /> <br /> <br />
			<div class="panel panel-info">
				<div class="panel-heading">
					<h3 class="panel-title" id ="temaSelecionado"></h3>
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
						<div id="campoMedia"></div>
					</div>
					<div class="col-md-2 col-md-offset-1">
						<label>Mediana</label>
						<div id="campoMediana"></div>
					</div>	
				</div>		
			</div>
		</div>
	</div>
</div>		
		

		
	
""")))}))}
  }

  def render(user:Usuario,temas:List[models.Tema],message:String): play.twirl.api.HtmlFormat.Appendable = apply(user,temas,message)

  def f:((Usuario,List[models.Tema],String) => play.twirl.api.HtmlFormat.Appendable) = (user,temas,message) => apply(user,temas,message)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Tue Mar 17 22:04:26 BRT 2015
                  SOURCE: C:/Users/Andreza/Desktop/projetoSI/ProjetoSI1/app/views/index.scala.html
                  HASH: 3640a639c75dc882a1ec54e9c2dbf657ea15eb6c
                  MATRIX: 749->1|895->59|925->64|956->87|995->89|1024->92|1762->803|1775->807|1806->817|2419->1404|2453->1422|2492->1423|2527->1431|2600->1477|2613->1481|2644->1491|2679->1499|2692->1503|2727->1517|2757->1520|2770->1524|2801->1534|2863->1566|2896->1572
                  LINES: 26->1|29->1|32->4|32->4|32->4|34->6|51->23|51->23|51->23|75->47|75->47|75->47|76->48|77->49|77->49|77->49|77->49|77->49|77->49|77->49|77->49|77->49|79->51|80->52
                  -- GENERATED --
              */
          