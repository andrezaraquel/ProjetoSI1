
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
object cadastro extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template3[Form[Usuario],String,String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(form: Form[Usuario], mensagemErro: String, mensagem: String):play.twirl.api.HtmlFormat.Appendable = {
      _display_ {

Seq[Any](format.raw/*1.63*/("""

"""),_display_(/*3.2*/main("Cadastro")/*3.18*/{_display_(Seq[Any](format.raw/*3.19*/("""
		"""),format.raw/*4.3*/("""<div class="navbar navbar-default navbar-fixed-top" role="navigation">
			<div class="container">
				<div class="navbar-header">
					<button type="button" class="navbar-toggle collapsed"
					data-toggle="collapse" data-target=".navbar-collapse">
					<span class="sr-only">Toggle navigation</span> <span
					class="icon-bar"></span> <span class="icon-bar"></span> <span
					class="icon-bar"></span>
				</button>
				<a class="navbar-brand" href="/">Portal do Leite</a>
			</div>
			<div class="navbar-collapse collapse">
				
				<ul class="nav navbar-nav navbar-right">
					<li>
						<b class="navbar-text">Já possui cadastro?</b>
						<button class="btn btn-info navbar-btn" onclick="location.href='/login'">Login</button>
					</li>
				</ul>
			</div>
		</div>
	</div>
	<div class="container">
		
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
			<div class="panel-heading">Cadastre-se aqui</div>
			<div class="panel-body">
				"""),_display_(/*53.6*/helper/*53.12*/.form(routes.AutenticacaoController.cadastrar)/*53.58*/ {_display_(Seq[Any](format.raw/*53.60*/("""
				"""),format.raw/*54.5*/("""<form role="form">
					<div class="form-group">
						<input maxlength="50" type="text" class="form-control" name="nome"
						value='"""),_display_(/*57.15*/form("nome")/*57.27*/.value),format.raw/*57.33*/("""' placeholder="Digite seu nome" required>
					</div>
					<div class="form-group">
						<input type="email" class="form-control" name="email"
						value='"""),_display_(/*61.15*/form("email")/*61.28*/.value),format.raw/*61.34*/("""' placeholder="Digite seu email" required>
					</div>
					<div class="form-group">
						<input type="password" class="form-control" name="senha"
						placeholder="Digite sua senha" required>
					</div>
					<div class="form-group">
						<input type="password" class="form-control" name="confirmaSenha"
						placeholder="Confirme sua senha" required>
					</div>
					
					<button type="submit" class="btn btn-primary">Cadastrar</button>
				</form>
			""")))}),format.raw/*74.5*/("""
		"""),format.raw/*75.3*/("""</div>
	</div>
</div>

<div class="col-md-3">
	<!-- Vazio -->
</div>

</div>
</div>
""")))}),format.raw/*85.2*/("""
"""))}
  }

  def render(form:Form[Usuario],mensagemErro:String,mensagem:String): play.twirl.api.HtmlFormat.Appendable = apply(form,mensagemErro,mensagem)

  def f:((Form[Usuario],String,String) => play.twirl.api.HtmlFormat.Appendable) = (form,mensagemErro,mensagem) => apply(form,mensagemErro,mensagem)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Mon Mar 23 13:06:15 BRT 2015
                  SOURCE: /home/mariadch/projetosi1-dia/ProjetoSI1/app/views/cadastro.scala.html
                  HASH: 5af907dc7aa448242f9bfb59aba137bf0ea6c276
                  MATRIX: 747->1|896->62|924->65|948->81|986->82|1015->85|2031->1075|2099->1134|2139->1136|2171->1141|2240->1183|2275->1197|2325->1217|2361->1227|2421->1278|2461->1280|2492->1284|2560->1326|2591->1336|2639->1354|2672->1360|2818->1480|2833->1486|2888->1532|2928->1534|2960->1539|3123->1675|3144->1687|3171->1693|3356->1851|3378->1864|3405->1870|3896->2331|3926->2334|4041->2419
                  LINES: 26->1|29->1|31->3|31->3|31->3|32->4|66->38|66->38|66->38|67->39|68->40|68->40|70->42|72->44|72->44|72->44|73->45|74->46|74->46|76->48|78->50|81->53|81->53|81->53|81->53|82->54|85->57|85->57|85->57|89->61|89->61|89->61|102->74|103->75|113->85
                  -- GENERATED --
              */
          