
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
object index extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template4[Usuario,models.Disciplina,List[models.Tema],String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(user: Usuario, diciplina: models.Disciplina, temas : List[models.Tema], message: String):play.twirl.api.HtmlFormat.Appendable = {
      _display_ {

Seq[Any](format.raw/*1.91*/(""" 


"""),_display_(/*4.2*/main("Portal do Leite")/*4.25*/ {_display_(Seq[Any](format.raw/*4.27*/("""
"""),_display_(/*5.2*/modalAdicionarMetaDica()),format.raw/*5.26*/("""

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
		
	
		<div class="col-md-8 col-offset-1 metaDica" >	
			<br /> <br /> <br /> <br />
			<div class="panel panel-info ">
				<div class="panel-heading">
					<div class="row">
						<div class="col-md-9 ">
						<h1 class="panel-title" >Meta Dicas</h1>
						</div>
						
						<div class="col-md-3 " >
						<button type="button" class="btn-info btn" data-toggle="modal" data-target="" >Crie sua meta dica</button>
						</div>						
					</div>
				</div>
			</div>
		</div>
		
	</div>
</div>		
""")))}),format.raw/*77.2*/("""
"""))}
  }

  def render(user:Usuario,diciplina:models.Disciplina,temas:List[models.Tema],message:String): play.twirl.api.HtmlFormat.Appendable = apply(user,diciplina,temas,message)

  def f:((Usuario,models.Disciplina,List[models.Tema],String) => play.twirl.api.HtmlFormat.Appendable) = (user,diciplina,temas,message) => apply(user,diciplina,temas,message)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Mon Mar 23 15:39:23 BRT 2015
                  SOURCE: /home/mariadch/ultimo/ProjetoSI1/app/views/index.scala.html
                  HASH: 06bac319f31516926e0ab8e02d1c9ab8b785a48a
                  MATRIX: 767->1|944->90|974->95|1005->118|1044->120|1071->122|1115->146|1144->149|1750->728|1763->732|1794->742|2407->1329|2441->1347|2480->1348|2515->1356|2588->1402|2601->1406|2632->1416|2667->1424|2680->1428|2715->1442|2745->1445|2758->1449|2789->1459|2859->1499|2892->1505|3523->2106
                  LINES: 26->1|29->1|32->4|32->4|32->4|33->5|33->5|35->7|48->20|48->20|48->20|72->44|72->44|72->44|73->45|74->46|74->46|74->46|74->46|74->46|74->46|74->46|74->46|74->46|77->49|78->50|105->77
                  -- GENERATED --
              */
          