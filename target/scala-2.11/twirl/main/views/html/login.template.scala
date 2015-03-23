
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
object login extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template3[Form[Usuario],String,String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(form: Form[Usuario], mensagemErro: String, mensagem: String):play.twirl.api.HtmlFormat.Appendable = {
      _display_ {

Seq[Any](format.raw/*1.63*/("""

"""),_display_(/*3.2*/main("´Portal do Leite - Login")/*3.34*/{_display_(Seq[Any](format.raw/*3.35*/("""
		"""),format.raw/*4.3*/("""<div class="navbar navbar-default navbar-fixed-top" role="navigation">
			<div class="container">
				<div class="navbar-header">
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
						<b class="navbar-text">Ainda não possui cadastro?</b>
						<button class="btn btn-info navbar-btn" onclick="location.href='/cadastro'">Cadastre-se</button>
					</li>
				</ul>
			</div>
		</div>
	</div>
	<div class="container">
		<br /> <br /> <br /> <br />
		<br /> <br /> <br /> <br />
		<br /> <br /> <br /> <br />
		<div class="row">
			<div class="col-md-3">
				<!-- Vazio -->
			</div>

			<div class="col-md-6">
				"""),_display_(/*38.6*/if(mensagemErro != null && !mensagemErro.trim().equals(""))/*38.65*/ {_display_(Seq[Any](format.raw/*38.67*/("""
				"""),format.raw/*39.5*/("""<div class="alert alert-danger">
					<p>"""),_display_(/*40.10*/(mensagemErro)),format.raw/*40.24*/("""</p>
				</div>
			""")))}),format.raw/*42.5*/(""" 

			"""),_display_(/*44.5*/if(mensagem != null && !mensagem.trim().equals(""))/*44.56*/ {_display_(Seq[Any](format.raw/*44.58*/("""
			"""),format.raw/*45.4*/("""<div class="alert alert-success">
				<p>"""),_display_(/*46.9*/(mensagem)),format.raw/*46.19*/("""</p>
			</div>
		""")))}),format.raw/*48.4*/("""
		
		"""),format.raw/*50.3*/("""<div class="panel panel-default">
			<div class="panel-heading">Login</div>
				<div class="panel-body">
					"""),_display_(/*53.7*/helper/*53.13*/.form(routes.AutenticacaoController.autenticar)/*53.60*/ {_display_(Seq[Any](format.raw/*53.62*/("""
						"""),format.raw/*54.7*/("""<form role="form">
							<div class="form-group">
								<input type="email" class="form-control" name="email" value='"""),_display_(/*56.71*/form("email")/*56.84*/.value),format.raw/*56.90*/("""' placeholder="Digite seu email" required>
							</div>
							<div class="form-group">
								<input type="password" class="form-control" name="senha" placeholder="Digite sua senha" required>
							</div>
							<button type="submit" class="btn btn-primary">Entrar</button>
						</form>
					""")))}),format.raw/*63.7*/("""
				"""),format.raw/*64.5*/("""</div>
			</div>
		</div>
<div class="col-md-3">
	<!-- Vazio -->
</div>
</div>
</div>
""")))}))}
  }

  def render(form:Form[Usuario],mensagemErro:String,mensagem:String): play.twirl.api.HtmlFormat.Appendable = apply(form,mensagemErro,mensagem)

  def f:((Form[Usuario],String,String) => play.twirl.api.HtmlFormat.Appendable) = (form,mensagemErro,mensagem) => apply(form,mensagemErro,mensagem)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Mon Mar 23 07:47:11 BRT 2015
                  SOURCE: C:/Users/Daniela/Documents/CC/projetosi1-vespera/ProjetoSI1/app/views/login.scala.html
                  HASH: 13270dc7b380e72d64a0262ae34d14f7e474cdfb
                  MATRIX: 744->1|893->62|923->67|963->99|1001->100|1031->104|2243->1290|2311->1349|2351->1351|2384->1357|2454->1400|2489->1414|2541->1436|2576->1445|2636->1496|2676->1498|2708->1503|2777->1546|2808->1556|2858->1576|2893->1584|3033->1698|3048->1704|3104->1751|3144->1753|3179->1761|3329->1884|3351->1897|3378->1903|3713->2208|3746->2214
                  LINES: 26->1|29->1|31->3|31->3|31->3|32->4|66->38|66->38|66->38|67->39|68->40|68->40|70->42|72->44|72->44|72->44|73->45|74->46|74->46|76->48|78->50|81->53|81->53|81->53|81->53|82->54|84->56|84->56|84->56|91->63|92->64
                  -- GENERATED --
              */
          