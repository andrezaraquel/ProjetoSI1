
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
				<ul class="nav navbar-nav">
					<li><a href="/sobre">Sobre</a></li>
					<li><a href="/contato">Contato</a></li>
				</ul>
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
				"""),_display_(/*41.6*/if(mensagemErro != null && !mensagemErro.trim().equals(""))/*41.65*/ {_display_(Seq[Any](format.raw/*41.67*/("""
				"""),format.raw/*42.5*/("""<div class="alert alert-danger">
					<p>"""),_display_(/*43.10*/(mensagemErro)),format.raw/*43.24*/("""</p>
				</div>
			""")))}),format.raw/*45.5*/(""" 
			
			"""),_display_(/*47.5*/if(mensagem != null && !mensagem.trim().equals(""))/*47.56*/ {_display_(Seq[Any](format.raw/*47.58*/("""
			"""),format.raw/*48.4*/("""<div class="alert alert-success">
				<p>"""),_display_(/*49.9*/(mensagem)),format.raw/*49.19*/("""</p>
			</div>
		""")))}),format.raw/*51.4*/("""
		
		"""),format.raw/*53.3*/("""<div class="panel panel-default">
			<div class="panel-heading">Cadastre-se aqui</div>
			<div class="panel-body">
				"""),_display_(/*56.6*/helper/*56.12*/.form(routes.AutenticacaoController.cadastrar)/*56.58*/ {_display_(Seq[Any](format.raw/*56.60*/("""
				"""),format.raw/*57.5*/("""<form role="form">
					<div class="form-group">
						<input maxlength="50" type="text" class="form-control" name="nome"
						value='"""),_display_(/*60.15*/form("nome")/*60.27*/.value),format.raw/*60.33*/("""' placeholder="Digite seu nome" required>
					</div>
					<div class="form-group">
						<input type="email" class="form-control" name="email"
						value='"""),_display_(/*64.15*/form("email")/*64.28*/.value),format.raw/*64.34*/("""' placeholder="Digite seu email" required>
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
			""")))}),format.raw/*77.5*/("""
		"""),format.raw/*78.3*/("""</div>
	</div>
</div>

<div class="col-md-3">
	<!-- Vazio -->
</div>

</div>
</div>
""")))}),format.raw/*88.2*/("""
"""))}
  }

  def render(form:Form[Usuario],mensagemErro:String,mensagem:String): play.twirl.api.HtmlFormat.Appendable = apply(form,mensagemErro,mensagem)

  def f:((Form[Usuario],String,String) => play.twirl.api.HtmlFormat.Appendable) = (form,mensagemErro,mensagem) => apply(form,mensagemErro,mensagem)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Mon Mar 23 07:47:10 BRT 2015
                  SOURCE: C:/Users/Daniela/Documents/CC/projetosi1-vespera/ProjetoSI1/app/views/cadastro.scala.html
                  HASH: 062ea04e16a6a2b89f5b3cb7025477b096d59bb4
                  MATRIX: 747->1|896->62|926->67|950->83|988->84|1018->88|2194->1238|2262->1297|2302->1299|2335->1305|2405->1348|2440->1362|2492->1384|2530->1396|2590->1447|2630->1449|2662->1454|2731->1497|2762->1507|2812->1527|2847->1535|2996->1658|3011->1664|3066->1710|3106->1712|3139->1718|3305->1857|3326->1869|3353->1875|3542->2037|3564->2050|3591->2056|4095->2530|4126->2534|4251->2629
                  LINES: 26->1|29->1|31->3|31->3|31->3|32->4|69->41|69->41|69->41|70->42|71->43|71->43|73->45|75->47|75->47|75->47|76->48|77->49|77->49|79->51|81->53|84->56|84->56|84->56|84->56|85->57|88->60|88->60|88->60|92->64|92->64|92->64|105->77|106->78|116->88
                  -- GENERATED --
              */
          