
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


		"""),format.raw/*51.3*/("""<div class="panel panel-default">
				
		
			<div class="panel-heading">Login</div>
			<div class="panel-body">
				"""),_display_(/*56.6*/helper/*56.12*/.form(routes.AutenticacaoController.autenticar)/*56.59*/ {_display_(Seq[Any](format.raw/*56.61*/("""
				"""),format.raw/*57.5*/("""<form role="form">
					<div class="form-group">
						<input type="email" class="form-control" name="email" value='"""),_display_(/*59.69*/form("email")/*59.82*/.value),format.raw/*59.88*/("""' placeholder="Digite seu email" required>
					</div>
					<div class="form-group">
						<input type="password" class="form-control" name="senha" placeholder="Digite sua senha" required>
					</div>
					<button type="submit" class="btn btn-primary">Entrar</button>
				</form>
			""")))}),format.raw/*66.5*/("""
		"""),format.raw/*67.3*/("""</div>
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
                  DATE: Thu Mar 19 19:56:05 BRT 2015
                  SOURCE: C:/Users/Daniela/Documents/CC/projetosi1-19/ProjetoSI1/app/views/login.scala.html
                  HASH: d1f0c9f80e7011adf406b8ae9fb0ea785a96e8ba
                  MATRIX: 744->1|893->62|923->67|944->80|982->81|1012->85|2224->1271|2292->1330|2332->1332|2365->1338|2435->1381|2470->1395|2522->1417|2557->1426|2617->1477|2657->1479|2689->1484|2758->1527|2789->1537|2839->1557|2874->1565|3022->1687|3037->1693|3093->1740|3133->1742|3166->1748|3312->1867|3334->1880|3361->1886|3682->2177|3713->2181
                  LINES: 26->1|29->1|31->3|31->3|31->3|32->4|66->38|66->38|66->38|67->39|68->40|68->40|70->42|72->44|72->44|72->44|73->45|74->46|74->46|76->48|79->51|84->56|84->56|84->56|84->56|85->57|87->59|87->59|87->59|94->66|95->67
                  -- GENERATED --
              */
          