
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
		
		<div class="row">
			
			<div class="col-md-3">
				<!-- Vazio -->
			</div>
			
			<div class="col-md-6">	
				"""),_display_(/*39.6*/if(mensagemErro != null && !mensagemErro.trim().equals(""))/*39.65*/ {_display_(Seq[Any](format.raw/*39.67*/("""
				"""),format.raw/*40.5*/("""<div class="alert alert-danger">
					<p>"""),_display_(/*41.10*/(mensagemErro)),format.raw/*41.24*/("""</p>
				</div>
			""")))}),format.raw/*43.5*/(""" 
			
			"""),_display_(/*45.5*/if(mensagem != null && !mensagem.trim().equals(""))/*45.56*/ {_display_(Seq[Any](format.raw/*45.58*/("""
			"""),format.raw/*46.4*/("""<div class="alert alert-success">
				<p>"""),_display_(/*47.9*/(mensagem)),format.raw/*47.19*/("""</p>
			</div>
		""")))}),format.raw/*49.4*/("""
		
		"""),format.raw/*51.3*/("""<div class="panel panel-default">
			<div class="panel-heading">Cadastre-se aqui</div>
			<div class="panel-body">
				"""),_display_(/*54.6*/helper/*54.12*/.form(routes.AutenticacaoController.cadastrar)/*54.58*/ {_display_(Seq[Any](format.raw/*54.60*/("""
				"""),format.raw/*55.5*/("""<form role="form">
					<div class="form-group">
						<input type="text" class="form-control" name="nome"
						value='"""),_display_(/*58.15*/form("nome")/*58.27*/.value),format.raw/*58.33*/("""' placeholder="Digite seu nome" required>
					</div>
					<div class="form-group">
						<input type="email" class="form-control" name="email"
						value='"""),_display_(/*62.15*/form("email")/*62.28*/.value),format.raw/*62.34*/("""' placeholder="Digite seu email" required>
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
			""")))}),format.raw/*75.5*/("""
		"""),format.raw/*76.3*/("""</div>
	</div>
</div>

<div class="col-md-3">
	<!-- Vazio -->
</div>

</div>
</div>
""")))}),format.raw/*86.2*/("""
"""))}
  }

  def render(form:Form[Usuario],mensagemErro:String,mensagem:String): play.twirl.api.HtmlFormat.Appendable = apply(form,mensagemErro,mensagem)

  def f:((Form[Usuario],String,String) => play.twirl.api.HtmlFormat.Appendable) = (form,mensagemErro,mensagem) => apply(form,mensagemErro,mensagem)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Fri Mar 13 19:02:45 BRT 2015
                  SOURCE: C:/Users/Daniela/Documents/siProjeto/ProjetoSI1/app/views/cadastro.scala.html
                  HASH: b0d5d75b8c9fc68e2d6556650c2fb1862e481d1e
                  MATRIX: 747->1|896->62|926->67|950->83|988->84|1018->88|2157->1201|2225->1260|2265->1262|2298->1268|2368->1311|2403->1325|2455->1347|2493->1359|2553->1410|2593->1412|2625->1417|2694->1460|2725->1470|2775->1490|2810->1498|2959->1621|2974->1627|3029->1673|3069->1675|3102->1681|3253->1805|3274->1817|3301->1823|3490->1985|3512->1998|3539->2004|4043->2478|4074->2482|4199->2577
                  LINES: 26->1|29->1|31->3|31->3|31->3|32->4|67->39|67->39|67->39|68->40|69->41|69->41|71->43|73->45|73->45|73->45|74->46|75->47|75->47|77->49|79->51|82->54|82->54|82->54|82->54|83->55|86->58|86->58|86->58|90->62|90->62|90->62|103->75|104->76|114->86
                  -- GENERATED --
              */
          