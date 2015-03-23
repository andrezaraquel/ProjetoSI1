
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

"""),_display_(/*3.2*/main("Portal do Leite - Login")/*3.33*/{_display_(Seq[Any](format.raw/*3.34*/("""
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
				"""),_display_(/*34.6*/if(mensagemErro != null && !mensagemErro.trim().equals(""))/*34.65*/ {_display_(Seq[Any](format.raw/*34.67*/("""
				"""),format.raw/*35.5*/("""<div class="alert alert-danger">
					<p>"""),_display_(/*36.10*/(mensagemErro)),format.raw/*36.24*/("""</p>
				</div>
			""")))}),format.raw/*38.5*/(""" 

			"""),_display_(/*40.5*/if(mensagem != null && !mensagem.trim().equals(""))/*40.56*/ {_display_(Seq[Any](format.raw/*40.58*/("""
			"""),format.raw/*41.4*/("""<div class="alert alert-success">
				<p>"""),_display_(/*42.9*/(mensagem)),format.raw/*42.19*/("""</p>
			</div>
		""")))}),format.raw/*44.4*/("""
		
		"""),format.raw/*46.3*/("""<div class="panel panel-default">
			<div class="panel-heading">Login</div>
				<div class="panel-body">
					"""),_display_(/*49.7*/helper/*49.13*/.form(routes.AutenticacaoController.autenticar)/*49.60*/ {_display_(Seq[Any](format.raw/*49.62*/("""
						"""),format.raw/*50.7*/("""<form role="form">
							<div class="form-group">
								<input type="email" class="form-control" name="email" value='"""),_display_(/*52.71*/form("email")/*52.84*/.value),format.raw/*52.90*/("""' placeholder="Digite seu email" required>
							</div>
							<div class="form-group">
								<input type="password" class="form-control" name="senha" placeholder="Digite sua senha" required>
							</div>
							<button type="submit" class="btn btn-primary">Entrar</button>
						</form>
					""")))}),format.raw/*59.7*/("""
				"""),format.raw/*60.5*/("""</div>
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
                  DATE: Mon Mar 23 16:45:23 BRT 2015
                  SOURCE: /home/mariadch/ULTIMA/ProjetoSI1/app/views/login.scala.html
                  HASH: df284ad5d4bfd6f432f3e3450a56c90a508b34b7
                  MATRIX: 744->1|893->62|921->65|960->96|998->97|1027->100|2078->1125|2146->1184|2186->1186|2218->1191|2287->1233|2322->1247|2372->1267|2405->1274|2465->1325|2505->1327|2536->1331|2604->1373|2635->1383|2683->1401|2716->1407|2853->1518|2868->1524|2924->1571|2964->1573|2998->1580|3146->1701|3168->1714|3195->1720|3523->2018|3555->2023
                  LINES: 26->1|29->1|31->3|31->3|31->3|32->4|62->34|62->34|62->34|63->35|64->36|64->36|66->38|68->40|68->40|68->40|69->41|70->42|70->42|72->44|74->46|77->49|77->49|77->49|77->49|78->50|80->52|80->52|80->52|87->59|88->60
                  -- GENERATED --
              */
          