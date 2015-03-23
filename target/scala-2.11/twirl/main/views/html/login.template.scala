
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
                  DATE: Mon Mar 23 13:52:24 BRT 2015
                  SOURCE: /home/andrezarmq/Documentos/SI1/ProjetoSI1/app/views/login.scala.html
                  HASH: 8ce287df64c6768c3a572ab143a147e7b3bd7dd4
                  MATRIX: 744->1|893->62|921->65|961->97|999->98|1028->101|2079->1126|2147->1185|2187->1187|2219->1192|2288->1234|2323->1248|2373->1268|2406->1275|2466->1326|2506->1328|2537->1332|2605->1374|2636->1384|2684->1402|2717->1408|2854->1519|2869->1525|2925->1572|2965->1574|2999->1581|3147->1702|3169->1715|3196->1721|3524->2019|3556->2024
                  LINES: 26->1|29->1|31->3|31->3|31->3|32->4|62->34|62->34|62->34|63->35|64->36|64->36|66->38|68->40|68->40|68->40|69->41|70->42|70->42|72->44|74->46|77->49|77->49|77->49|77->49|78->50|80->52|80->52|80->52|87->59|88->60
                  -- GENERATED --
              */
          