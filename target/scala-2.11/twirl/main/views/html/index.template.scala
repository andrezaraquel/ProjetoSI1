
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
					<ul class="nav navbar-nav navbar-right">
						<li><p>"""),_display_(/*20.15*/user/*20.19*/.getNome()),format.raw/*20.29*/("""&nbsp;&nbsp;</p></li>
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
						"""),_display_(/*44.8*/for(tema <- temas) yield /*44.26*/{_display_(Seq[Any](format.raw/*44.27*/("""
							"""),format.raw/*45.8*/("""<li>				
							<a  class="temas" data-nome=""""),_display_(/*46.38*/tema/*46.42*/.getNome()),format.raw/*46.52*/("""" id =""""),_display_(/*46.60*/tema/*46.64*/.getIdString()),format.raw/*46.78*/("""">"""),_display_(/*46.81*/tema/*46.85*/.getNome()),format.raw/*46.95*/("""</a>							
							</li>
							
						""")))}),format.raw/*49.8*/("""
					"""),format.raw/*50.6*/("""</ul>
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
                  DATE: Mon Mar 23 11:02:24 BRT 2015
                  SOURCE: /home/andrezarmq/Documentos/SI1/ProjetoSI1/app/views/index.scala.html
                  HASH: 6da722f297a58b8e9cb78b4cb66871da033cd529
                  MATRIX: 749->1|895->59|925->64|956->87|995->89|1025->93|1631->672|1644->676|1675->686|2288->1273|2322->1291|2361->1292|2396->1300|2469->1346|2482->1350|2513->1360|2548->1368|2561->1372|2596->1386|2626->1389|2639->1393|2670->1403|2740->1443|2773->1449
                  LINES: 26->1|29->1|32->4|32->4|32->4|35->7|48->20|48->20|48->20|72->44|72->44|72->44|73->45|74->46|74->46|74->46|74->46|74->46|74->46|74->46|74->46|74->46|77->49|78->50
                  -- GENERATED --
              */
          