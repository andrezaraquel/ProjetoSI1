
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
object dicasTema extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template3[Usuario,models.Tema,String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(user: Usuario, tema: models.Tema, message: String):play.twirl.api.HtmlFormat.Appendable = {
      _display_ {

Seq[Any](format.raw/*1.53*/("""

"""),_display_(/*3.2*/main("Portal do Leite")/*3.25*/ {_display_(Seq[Any](format.raw/*3.27*/("""

	"""),format.raw/*5.2*/("""<div class="navbar navbar-default navbar-fixed-top" role="navigation"> 
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
						<li>
			
						<a  href="">Análise x Projeto</a>
						
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
			</div>
			<button type="button" class="btn btn-info btn-lg btn-block">Nova dica</button>		
		</div>
		
		
		
		<div class="row">
			
			<div class="col-md-5">	
				<br /> <br /> <br /> <br />
				<div class="panel panel-info">
					<div class="panel-heading">
						<h3 class="panel-title">Nome do tema aqui</h3>
					</div>
					<div>
					<ul>
					<!--Se tema.getDicas() == 0 -->
						<li> Não há nenhuma dica para o tema. </li>
					
					<!-- Se existir metas exibir  a lista -->
					</ul>	
					</div>
   				</div>
			</div>
		</div>	
</div>

""")))}))}
  }

  def render(user:Usuario,tema:models.Tema,message:String): play.twirl.api.HtmlFormat.Appendable = apply(user,tema,message)

  def f:((Usuario,models.Tema,String) => play.twirl.api.HtmlFormat.Appendable) = (user,tema,message) => apply(user,tema,message)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Fri Mar 13 23:45:37 BRT 2015
                  SOURCE: C:/Users/Daniela/Documents/siProjeto/ProjetoSI1/app/views/dicasTema.scala.html
                  HASH: 0c63a736b757f71d1de17dfe48553f3a96764ab4
                  MATRIX: 747->1|886->52|916->57|947->80|986->82|1017->87
                  LINES: 26->1|29->1|31->3|31->3|31->3|33->5
                  -- GENERATED --
              */
          