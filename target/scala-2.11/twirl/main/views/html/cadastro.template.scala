
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

"""),format.raw/*3.1*/("""<html>
<head>
	<title>Cadastre-se</title>
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
		
		<div class="row">
			
			<div class="col-md-3">
				<!-- Vazio -->
			</div>
			
			<div class="col-md-6">	
				"""),_display_(/*52.6*/if(mensagemErro != null && !mensagemErro.trim().equals(""))/*52.65*/ {_display_(Seq[Any](format.raw/*52.67*/("""
				"""),format.raw/*53.5*/("""<div class="alert alert-danger">
					<p>"""),_display_(/*54.10*/(mensagemErro)),format.raw/*54.24*/("""</p>
				</div>
			""")))}),format.raw/*56.5*/(""" 
			
			"""),_display_(/*58.5*/if(mensagem != null && !mensagem.trim().equals(""))/*58.56*/ {_display_(Seq[Any](format.raw/*58.58*/("""
			"""),format.raw/*59.4*/("""<div class="alert alert-success">
				<p>"""),_display_(/*60.9*/(mensagem)),format.raw/*60.19*/("""</p>
			</div>
		""")))}),format.raw/*62.4*/("""
		
		"""),format.raw/*64.3*/("""<div class="panel panel-default">
			<div class="panel-heading">Cadastre-se aqui</div>
			<div class="panel-body">
				"""),_display_(/*67.6*/helper/*67.12*/.form(routes.AutenticacaoController.cadastrar)/*67.58*/ {_display_(Seq[Any](format.raw/*67.60*/("""
				"""),format.raw/*68.5*/("""<form role="form">
					<div class="form-group">
						<input type="text" class="form-control" name="nome"
						value='"""),_display_(/*71.15*/form("nome")/*71.27*/.value),format.raw/*71.33*/("""' placeholder="Digite seu nome" required>
					</div>
					<div class="form-group">
						<input type="email" class="form-control" name="email"
						value='"""),_display_(/*75.15*/form("email")/*75.28*/.value),format.raw/*75.34*/("""' placeholder="Digite seu email" required>
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
			""")))}),format.raw/*88.5*/("""
		"""),format.raw/*89.3*/("""</div>
	</div>
</div>

<div class="col-md-3">
	<!-- Vazio -->
</div>

</div>
</div>
</body>
</html>
"""))}
  }

  def render(form:Form[Usuario],mensagemErro:String,mensagem:String): play.twirl.api.HtmlFormat.Appendable = apply(form,mensagemErro,mensagem)

  def f:((Form[Usuario],String,String) => play.twirl.api.HtmlFormat.Appendable) = (form,mensagemErro,mensagem) => apply(form,mensagemErro,mensagem)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Thu Mar 12 16:26:34 BRT 2015
                  SOURCE: /home/andrezarmq/Documentos/ProjetoSI1/app/views/cadastro.scala.html
                  HASH: 1123e1990ecc44f8ee140965d5e8155a4e277c6b
                  MATRIX: 747->1|896->62|924->64|1062->176|1076->182|1146->231|1221->280|1235->286|1298->329|1373->378|1387->384|1453->430|1529->479|1544->485|1611->531|1656->549|1671->555|1737->600|1814->650|1829->656|1892->698|1969->748|1984->754|2050->799|2132->854|2147->860|2198->890|3324->1990|3392->2049|3432->2051|3464->2056|3533->2098|3568->2112|3618->2132|3654->2142|3714->2193|3754->2195|3785->2199|3853->2241|3884->2251|3932->2269|3965->2275|4111->2395|4126->2401|4181->2447|4221->2449|4253->2454|4401->2575|4422->2587|4449->2593|4634->2751|4656->2764|4683->2770|5174->3231|5204->3234
                  LINES: 26->1|29->1|31->3|35->7|35->7|35->7|36->8|36->8|36->8|37->9|37->9|37->9|38->10|38->10|38->10|39->11|39->11|39->11|40->12|40->12|40->12|41->13|41->13|41->13|42->14|42->14|42->14|80->52|80->52|80->52|81->53|82->54|82->54|84->56|86->58|86->58|86->58|87->59|88->60|88->60|90->62|92->64|95->67|95->67|95->67|95->67|96->68|99->71|99->71|99->71|103->75|103->75|103->75|116->88|117->89
                  -- GENERATED --
              */
          