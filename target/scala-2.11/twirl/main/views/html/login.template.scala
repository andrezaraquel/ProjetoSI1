
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
	<script src=""""),_display_(/*11.16*/routes/*11.22*/.Assets.at("javascripts/jquery-2.1.1.min.js")),format.raw/*11.67*/("""" type="text/javascript"></script>
	<script src=""""),_display_(/*12.16*/routes/*12.22*/.Assets.at("javascripts/bootstrap.min.js")),format.raw/*12.64*/("""" type="text/javascript"></script>
	<script src=""""),_display_(/*13.16*/routes/*13.22*/.Assets.at("javascripts/bootstrap-notify.js")),format.raw/*13.67*/("""" type="text/javascript"></script>
	<body background=""""),_display_(/*14.21*/routes/*14.27*/.Assets.at("images/fundo.jpg")),format.raw/*14.57*/("""">
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
				"""),_display_(/*49.6*/if(mensagemErro != null && !mensagemErro.trim().equals(""))/*49.65*/ {_display_(Seq[Any](format.raw/*49.67*/("""
				"""),format.raw/*50.5*/("""<div class="alert alert-danger">
					<p>"""),_display_(/*51.10*/(mensagemErro)),format.raw/*51.24*/("""</p>
				</div>
			""")))}),format.raw/*53.5*/(""" 

			"""),_display_(/*55.5*/if(mensagem != null && !mensagem.trim().equals(""))/*55.56*/ {_display_(Seq[Any](format.raw/*55.58*/("""
			"""),format.raw/*56.4*/("""<div class="alert alert-success">
				<p>"""),_display_(/*57.9*/(mensagem)),format.raw/*57.19*/("""</p>
			</div>
		""")))}),format.raw/*59.4*/("""

		"""),format.raw/*61.3*/("""<div class="panel panel-default">
			<div class="panel-heading">Login</div>
			<div class="panel-body">
				"""),_display_(/*64.6*/helper/*64.12*/.form(routes.AutenticacaoController.autenticar)/*64.59*/ {_display_(Seq[Any](format.raw/*64.61*/("""
				"""),format.raw/*65.5*/("""<form role="form">
					<div class="form-group">
						<input type="email" class="form-control" name="email" value='"""),_display_(/*67.69*/form("email")/*67.82*/.value),format.raw/*67.88*/("""' placeholder="Digite seu email" required>
					</div>
					<div class="form-group">
						<input type="password" class="form-control" name="senha" placeholder="Digite sua senha" required>
					</div>
					<button type="submit" class="btn btn-primary">Entrar</button>
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
</body>
</html>"""))}
  }

  def render(form:Form[Usuario],mensagemErro:String,mensagem:String): play.twirl.api.HtmlFormat.Appendable = apply(form,mensagemErro,mensagem)

  def f:((Form[Usuario],String,String) => play.twirl.api.HtmlFormat.Appendable) = (form,mensagemErro,mensagem) => apply(form,mensagemErro,mensagem)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Thu Mar 12 16:26:34 BRT 2015
                  SOURCE: /home/andrezarmq/Documentos/ProjetoSI1/app/views/login.scala.html
                  HASH: b3378e16ce5be64019b03243c19b093f748a2ada
                  MATRIX: 744->1|893->62|921->64|1063->180|1077->186|1147->235|1222->284|1236->290|1299->333|1374->382|1388->388|1454->434|1530->483|1545->489|1612->535|1657->553|1672->559|1738->604|1815->654|1830->660|1893->702|1970->752|1985->758|2051->803|2133->858|2148->864|2199->894|3338->2007|3406->2066|3446->2068|3478->2073|3547->2115|3582->2129|3632->2149|3665->2156|3725->2207|3765->2209|3796->2213|3864->2255|3895->2265|3943->2283|3974->2287|4109->2396|4124->2402|4180->2449|4220->2451|4252->2456|4396->2573|4418->2586|4445->2592|4759->2876|4789->2879
                  LINES: 26->1|29->1|31->3|35->7|35->7|35->7|36->8|36->8|36->8|37->9|37->9|37->9|38->10|38->10|38->10|39->11|39->11|39->11|40->12|40->12|40->12|41->13|41->13|41->13|42->14|42->14|42->14|77->49|77->49|77->49|78->50|79->51|79->51|81->53|83->55|83->55|83->55|84->56|85->57|85->57|87->59|89->61|92->64|92->64|92->64|92->64|93->65|95->67|95->67|95->67|102->74|103->75
                  -- GENERATED --
              */
          