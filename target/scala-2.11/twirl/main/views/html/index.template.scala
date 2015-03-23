
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
                  DATE: Sun Mar 22 22:23:54 BRT 2015
                  SOURCE: C:/Users/Daniela/Documents/CC/projetosi1-vespera/ProjetoSI1/app/views/index.scala.html
                  HASH: efb7398d55ff7a2fe8a696af363b41615e7ea5e6
                  MATRIX: 749->1|895->59|928->67|959->90|998->92|1031->99|1781->822|1794->826|1825->836|2462->1447|2496->1465|2535->1466|2571->1475|2645->1522|2658->1526|2689->1536|2724->1544|2737->1548|2772->1562|2802->1565|2815->1569|2846->1579|2919->1622|2953->1629
                  LINES: 26->1|29->1|32->4|32->4|32->4|35->7|52->24|52->24|52->24|76->48|76->48|76->48|77->49|78->50|78->50|78->50|78->50|78->50|78->50|78->50|78->50|78->50|81->53|82->54
                  -- GENERATED --
              */
          