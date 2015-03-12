
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

"""),format.raw/*3.1*/("""<html>
<head>
	<title>Portal do Leite</title>
	<meta charset="utf-8">
	<link rel="stylesheet" media="screen" href=""""),_display_(/*7.47*/routes/*7.53*/.Assets.at("stylesheets/bootstrap-theme.min.css")),format.raw/*7.102*/("""">
	<link rel="stylesheet" media="screen" href=""""),_display_(/*8.47*/routes/*8.53*/.Assets.at("stylesheets/bootstrap.min.css")),format.raw/*8.96*/("""">
	<link rel="stylesheet" media="screen" href=""""),_display_(/*9.47*/routes/*9.53*/.Assets.at("stylesheets/font-awesome.min.css")),format.raw/*9.99*/("""">
	<link rel="stylesheet" media="screen" href=""""),_display_(/*10.47*/routes/*10.53*/.Assets.at("stylesheets/bootstrap-notify.css")),format.raw/*10.99*/("""">
	<link rel="shortcut icon" type="image/png" href=""""),_display_(/*11.52*/routes/*11.58*/.Assets.at("images/icon.png")),format.raw/*11.87*/("""">
	<script src=""""),_display_(/*12.16*/routes/*12.22*/.Assets.at("javascripts/jquery-2.1.1.min.js")),format.raw/*12.67*/("""" type="text/javascript"></script>
	<script src=""""),_display_(/*13.16*/routes/*13.22*/.Assets.at("javascripts/bootstrap.min.js")),format.raw/*13.64*/("""" type="text/javascript"></script>
	<script src=""""),_display_(/*14.16*/routes/*14.22*/.Assets.at("javascripts/bootstrap-notify.js")),format.raw/*14.67*/("""" type="text/javascript"></script>
	<body background=""""),_display_(/*15.21*/routes/*15.27*/.Assets.at("images/fundo.jpg")),format.raw/*15.57*/("""">
	</head>
	<body>
		<div class="navbar navbar-default navbar-fixed-top" role="navigation">
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
		<div class="row">
			<div class="col-md-3">
				<!-- Vazio -->
			</div>

			<div class="col-md-6">
				"""),_display_(/*50.6*/if(mensagemErro != null && !mensagemErro.trim().equals(""))/*50.65*/ {_display_(Seq[Any](format.raw/*50.67*/("""
				"""),format.raw/*51.5*/("""<div class="alert alert-danger">
					<p>"""),_display_(/*52.10*/(mensagemErro)),format.raw/*52.24*/("""</p>
				</div>
			""")))}),format.raw/*54.5*/(""" 

			"""),_display_(/*56.5*/if(mensagem != null && !mensagem.trim().equals(""))/*56.56*/ {_display_(Seq[Any](format.raw/*56.58*/("""
			"""),format.raw/*57.4*/("""<div class="alert alert-success">
				<p>"""),_display_(/*58.9*/(mensagem)),format.raw/*58.19*/("""</p>
			</div>
		""")))}),format.raw/*60.4*/("""

		"""),format.raw/*62.3*/("""<div class="panel panel-default">
			<div class="panel-heading">Login</div>
			<div class="panel-body">
				"""),_display_(/*65.6*/helper/*65.12*/.form(routes.AutenticacaoController.autenticar)/*65.59*/ {_display_(Seq[Any](format.raw/*65.61*/("""
				"""),format.raw/*66.5*/("""<form role="form">
					<div class="form-group">
						<input type="email" class="form-control" name="email" value='"""),_display_(/*68.69*/form("email")/*68.82*/.value),format.raw/*68.88*/("""' placeholder="Digite seu email" required>
					</div>
					<div class="form-group">
						<input type="password" class="form-control" name="senha" placeholder="Digite sua senha" required>
					</div>
					<button type="submit" class="btn btn-primary">Entrar</button>
				</form>
			""")))}),format.raw/*75.5*/("""
		"""),format.raw/*76.3*/("""</div>
	</div>
</div>
<div class="col-md-3">
	<!-- Vazio -->
</div>
</div>
</div>
</body>
</html>"""))}
  }

  def render(form:Form[Usuario],mensagemErro:String,mensagem:String): play.twirl.api.HtmlFormat.Appendable = apply(form,mensagemErro,mensagem)

  def f:((Form[Usuario],String,String) => play.twirl.api.HtmlFormat.Appendable) = (form,mensagemErro,mensagem) => apply(form,mensagemErro,mensagem)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Thu Mar 12 15:43:33 BRT 2015
                  SOURCE: /home/andrezarmq/Documentos/ProjetoSI1/app/views/login.scala.html
                  HASH: 56806081532504491b740488a2a270208b098811
                  MATRIX: 744->1|893->62|921->64|1063->180|1077->186|1147->235|1222->284|1236->290|1299->333|1374->382|1388->388|1454->434|1530->483|1545->489|1612->535|1693->589|1708->595|1758->624|1803->642|1818->648|1884->693|1961->743|1976->749|2039->791|2116->841|2131->847|2197->892|2279->947|2294->953|2345->983|3484->2096|3552->2155|3592->2157|3624->2162|3693->2204|3728->2218|3778->2238|3811->2245|3871->2296|3911->2298|3942->2302|4010->2344|4041->2354|4089->2372|4120->2376|4255->2485|4270->2491|4326->2538|4366->2540|4398->2545|4542->2662|4564->2675|4591->2681|4905->2965|4935->2968
                  LINES: 26->1|29->1|31->3|35->7|35->7|35->7|36->8|36->8|36->8|37->9|37->9|37->9|38->10|38->10|38->10|39->11|39->11|39->11|40->12|40->12|40->12|41->13|41->13|41->13|42->14|42->14|42->14|43->15|43->15|43->15|78->50|78->50|78->50|79->51|80->52|80->52|82->54|84->56|84->56|84->56|85->57|86->58|86->58|88->60|90->62|93->65|93->65|93->65|93->65|94->66|96->68|96->68|96->68|103->75|104->76
                  -- GENERATED --
              */
          