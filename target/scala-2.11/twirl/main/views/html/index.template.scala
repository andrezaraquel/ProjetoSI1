
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


	"""),format.raw/*7.2*/("""<div class="navbar navbar-default navbar-fixed-top" role="navigation"> 
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
						<li><p>"""),_display_(/*24.15*/user/*24.19*/.getNome()),format.raw/*24.29*/("""&nbsp;&nbsp;</p></li>
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
						"""),_display_(/*48.8*/for(tema <- temas) yield /*48.26*/{_display_(Seq[Any](format.raw/*48.27*/("""
							"""),format.raw/*49.8*/("""<li>				
							<a  class="temas" data-nome=""""),_display_(/*50.38*/tema/*50.42*/.getNome()),format.raw/*50.52*/("""" id =""""),_display_(/*50.60*/tema/*50.64*/.getIdString()),format.raw/*50.78*/("""">"""),_display_(/*50.81*/tema/*50.85*/.getNome()),format.raw/*50.95*/("""</a>							
							</li>
							
						""")))}),format.raw/*53.8*/("""
					"""),format.raw/*54.6*/("""</ul>
				</div>
			</div>	
		</div>
		<div class="col-md-8 col-offset-1" id="campoTemas">			
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
                  DATE: Thu Mar 19 10:27:16 BRT 2015
                  SOURCE: /home/andrezarmq/Documentos/SI1/ProjetoSI1/app/views/index.scala.html
                  HASH: d2185d366755f537fa9752914e1f77538b6dfb41
                  MATRIX: 749->1|895->59|925->64|956->87|995->89|1025->93|1758->799|1771->803|1802->813|2415->1400|2449->1418|2488->1419|2523->1427|2596->1473|2609->1477|2640->1487|2675->1495|2688->1499|2723->1513|2753->1516|2766->1520|2797->1530|2867->1570|2900->1576
                  LINES: 26->1|29->1|32->4|32->4|32->4|35->7|52->24|52->24|52->24|76->48|76->48|76->48|77->49|78->50|78->50|78->50|78->50|78->50|78->50|78->50|78->50|78->50|81->53|82->54
                  -- GENERATED --
              */
          