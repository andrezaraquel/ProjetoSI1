
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
  def apply/*1.2*/(user: Usuario, temas: List[models.Tema],message: String):play.twirl.api.HtmlFormat.Appendable = {
      _display_ {

Seq[Any](format.raw/*1.59*/(""" 


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
				
				<div>&nbsp;&nbsp;Nível de dificuldade 
				<img src=""""),_display_(/*64.16*/routes/*64.22*/.Assets.at("images/star2.jpg")),format.raw/*64.52*/(""""  id= "star1" class="star1">
				<img src=""""),_display_(/*65.16*/routes/*65.22*/.Assets.at("images/star2.jpg")),format.raw/*65.52*/("""" id= "star2">
				<img src=""""),_display_(/*66.16*/routes/*66.22*/.Assets.at("images/star2.jpg")),format.raw/*66.52*/(""""  id= "star3">
				<img src=""""),_display_(/*67.16*/routes/*67.22*/.Assets.at("images/star2.jpg")),format.raw/*67.52*/(""""  id= "star4">
				<img src=""""),_display_(/*68.16*/routes/*68.22*/.Assets.at("images/star2.jpg")),format.raw/*68.52*/(""""  id= "star5">
				Média =
				Mediana 
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
                  DATE: Mon Mar 16 23:41:56 BRT 2015
                  SOURCE: C:/Users/Daniela/Documents/CC/projetosi-16/ProjetoSI1/app/views/index.scala.html
                  HASH: 97fb2330f16ec7a3b88e736f0deae3f5d554faca
                  MATRIX: 749->1|894->58|927->66|958->89|997->91|1028->96|1783->824|1796->828|1827->838|2464->1449|2498->1467|2537->1468|2573->1477|2647->1524|2660->1528|2691->1538|2726->1546|2739->1550|2774->1564|2804->1567|2817->1571|2848->1581|2912->1615|2946->1622|3302->1951|3317->1957|3368->1987|3441->2033|3456->2039|3507->2069|3565->2100|3580->2106|3631->2136|3690->2168|3705->2174|3756->2204|3815->2236|3830->2242|3881->2272
                  LINES: 26->1|29->1|32->4|32->4|32->4|34->6|51->23|51->23|51->23|75->47|75->47|75->47|76->48|77->49|77->49|77->49|77->49|77->49|77->49|77->49|77->49|77->49|79->51|80->52|92->64|92->64|92->64|93->65|93->65|93->65|94->66|94->66|94->66|95->67|95->67|95->67|96->68|96->68|96->68
                  -- GENERATED --
              */
          