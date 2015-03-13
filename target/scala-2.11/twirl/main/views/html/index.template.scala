
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
object index extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(message: String):play.twirl.api.HtmlFormat.Appendable = {
      _display_ {

Seq[Any](format.raw/*1.19*/("""

"""),_display_(/*3.2*/main("Portal do Leite")/*3.25*/ {_display_(Seq[Any](format.raw/*3.27*/("""

"""),format.raw/*5.1*/("""<div id="wrapper">
	
	<div class="navbar navbar-default navbar-fixed-top" role="navigation">
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
						<li>
							<button class="btn btn-danger navbar-btn" onclick="location.href='/logout'">
							<span class="glyphicon glyphicon-log-out"></span>
							</button>
						</li>
					</ul>
				</div>
			</div>
	</div>	
        
	<!-- /. NAV TOP  -->
	<nav class="navbar-default navbar-side" role="navigation">
		<div class="sidebar-collapse">
	 		<ul class="nav" id="main-menu">
				
				<li class="text-center">
						<br><br>
						<h1>Disciplina SI1</h1>
				</li>
				<li>
					<a class="active-menu"  href="">Análise x Design </a>
				</li>
				<li>
					<a  href="">Orientação a Objetos</a>
				</li>
				<li>
					<a  href="">Padrões de Projeto GRASP</a>
				</li>
				<li>
					<a   href="">Padrões de Projeto Gof</a>
				</li>	
				<li>
					<a  href="">Arquitetura de Software</a>
				</li>
				<li>
					<a  href="">Play Framework</a>
				</li>		
				<li>
					<a  href="">Java Script </a>
				</li>		
				<li>
					<a  href="">HTML + CSS + Bootstrap </a>
				</li>		
				<li>
					<a  href="">Heroku </a>
				</li>		
				<li>
					<a  href="">Laboratórios </a>
				</li>		
				<li>
	 				<a  href="">Minitestes </a>
				</li>
				<li>
					<a  href="">Projeto </a>
				</li>
			</ul>
		</div>
	</nav>
</div>      
""")))}))}
  }

  def render(message:String): play.twirl.api.HtmlFormat.Appendable = apply(message)

  def f:((String) => play.twirl.api.HtmlFormat.Appendable) = (message) => apply(message)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Fri Mar 13 19:02:45 BRT 2015
                  SOURCE: C:/Users/Daniela/Documents/siProjeto/ProjetoSI1/app/views/index.scala.html
                  HASH: 7ea4b71b022a099e3adad643915e7f027ef784c0
                  MATRIX: 723->1|828->18|858->23|889->46|928->48|958->52
                  LINES: 26->1|29->1|31->3|31->3|31->3|33->5
                  -- GENERATED --
              */
          