
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

"""),_display_(/*3.2*/main("Login")/*3.15*/{_display_(Seq[Any](format.raw/*3.16*/("""
		"""),format.raw/*4.3*/("""<div class="navbar navbar-default navbar-top2  navbar-fixed-top" role="navigation">
			<a class="navbar-brand" href="/">Portal do Leite</a>
			<div class="container">
				<div class="navbar-header">
					<button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target=".navbar-collapse">
						<span class="sr-only">Toggle navigation</span>
						<span class="icon-bar"></span> <span class="icon-bar"></span> 
						<span class="icon-bar"></span>
					</button>
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
				"""),_display_(/*36.6*/if(mensagemErro != null && !mensagemErro.trim().equals(""))/*36.65*/ {_display_(Seq[Any](format.raw/*36.67*/("""
				"""),format.raw/*37.5*/("""<div class="alert alert-danger">
					<p>"""),_display_(/*38.10*/(mensagemErro)),format.raw/*38.24*/("""</p>
				</div>
			""")))}),format.raw/*40.5*/(""" 

			"""),_display_(/*42.5*/if(mensagem != null && !mensagem.trim().equals(""))/*42.56*/ {_display_(Seq[Any](format.raw/*42.58*/("""
			"""),format.raw/*43.4*/("""<div class="alert alert-success">
				<p>"""),_display_(/*44.9*/(mensagem)),format.raw/*44.19*/("""</p>
			</div>
		""")))}),format.raw/*46.4*/("""

		"""),format.raw/*48.3*/("""<div class="panel panel-default">
			<div class="panel-heading">Login</div>
			<div class="panel-body">
				"""),_display_(/*51.6*/helper/*51.12*/.form(routes.AutenticacaoController.autenticar)/*51.59*/ {_display_(Seq[Any](format.raw/*51.61*/("""
				"""),format.raw/*52.5*/("""<form role="form">
					<div class="form-group">
						<input type="email" class="form-control" name="email" value='"""),_display_(/*54.69*/form("email")/*54.82*/.value),format.raw/*54.88*/("""' placeholder="Digite seu email" required>
					</div>
					<div class="form-group">
						<input type="password" class="form-control" name="senha" placeholder="Digite sua senha" required>
					</div>
					<button type="submit" class="btn btn-primary">Entrar</button>
				</form>
			""")))}),format.raw/*61.5*/("""
		"""),format.raw/*62.3*/("""</div>
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
                  DATE: Thu Mar 12 19:45:39 BRT 2015
                  SOURCE: C:/Users/Daniela/Documents/siProjeto/ProjetoSI1/app/views/login.scala.html
                  HASH: dba487c6af56c4cb69869d5e9074fddfe63e566f
                  MATRIX: 744->1|893->62|923->67|944->80|982->81|1012->85|2172->1219|2240->1278|2280->1280|2313->1286|2383->1329|2418->1343|2470->1365|2505->1374|2565->1425|2605->1427|2637->1432|2706->1475|2737->1485|2787->1505|2820->1511|2958->1623|2973->1629|3029->1676|3069->1678|3102->1684|3248->1803|3270->1816|3297->1822|3618->2113|3649->2117
                  LINES: 26->1|29->1|31->3|31->3|31->3|32->4|64->36|64->36|64->36|65->37|66->38|66->38|68->40|70->42|70->42|70->42|71->43|72->44|72->44|74->46|76->48|79->51|79->51|79->51|79->51|80->52|82->54|82->54|82->54|89->61|90->62
                  -- GENERATED --
              */
          