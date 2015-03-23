
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
object dicasTema extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template2[Usuario,models.Tema,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(user: Usuario, tema: models.Tema):play.twirl.api.HtmlFormat.Appendable = {
      _display_ {

Seq[Any](format.raw/*1.36*/("""

"""),_display_(/*3.2*/main("Portal do Leite")/*3.25*/{_display_(Seq[Any](format.raw/*3.26*/("""

"""),_display_(/*5.2*/modalAdicionarDica()),format.raw/*5.22*/("""
"""),format.raw/*6.1*/("""<br /> <br /> <br /> <br />
<div class="panel panel-info ">
	<div class="panel-heading">
		<div class="row">
			<div class="col-md-10 ">
			<h1 class="panel-title" id ="temaSelecionado">"""),_display_(/*11.51*/tema/*11.55*/.getNome()),format.raw/*11.65*/("""</h1>
			</div>
			
			<div class="col-md-1.5 " >
			<button type="button" class="btn-info " data-toggle="modal" data-target="#adicionarDica" >Adicionar dica</button>
			</div>		
			
		</div>
	</div>
	

	<div  class=" avaliacoesTema">
		<div class="row">
			<div class="col-md-3"><label>Nível de dificuldade</label> </div>
			<div class="col-md-2 "><label>Média: &nbsp;</label><label>"""),_display_(/*25.63*/tema/*25.67*/.getAvaliacaoMedia()),format.raw/*25.87*/("""</label></div>
			<div class="col-md-2 "><label>Mediana:&nbsp;</label><label>"""),_display_(/*26.64*/tema/*26.68*/.getAvaliacaoMediana()),format.raw/*26.90*/("""</label></div>
			<div class="col-md-offset-2.5 col-md-2"><button class="btn btn-small btn-default" data-toggle="modal" data-target="#avaliarTema">Avaliar tema</button></div>
		</div>
	</div>
	

	<div class="col-md-12 panelDicas">
		"""),_display_(/*33.4*/if(tema.isEmpty())/*33.22*/{_display_(Seq[Any](format.raw/*33.23*/("""
			"""),format.raw/*34.4*/("""<p>Nenhuma dica para este tema.</p>	
		""")))}/*35.4*/else/*35.8*/{_display_(Seq[Any](format.raw/*35.9*/("""	
			"""),_display_(/*36.5*/for(dica <- tema.getDicas()) yield /*36.33*/{_display_(Seq[Any](format.raw/*36.34*/("""
				"""),format.raw/*37.5*/("""<p class="nomeUsuarios">"""),_display_(/*37.30*/dica/*37.34*/.getNameUser()),format.raw/*37.48*/("""&nbsp;&nbsp;"""),_display_(/*37.61*/Html(dica.exibirLabel())),format.raw/*37.85*/("""</p>
				"""),_display_(/*38.6*/Html(dica.exibirDica())),format.raw/*38.29*/("""

				
				"""),format.raw/*41.5*/("""<a onClick="location.href='"""),_display_(/*41.33*/routes/*41.39*/.TemaController.concordar(dica.getIdDicaString())),format.raw/*41.88*/("""'" disabled=""""),_display_(/*41.102*/dica/*41.106*/.isDicaFechada()),format.raw/*41.122*/("""" class="acaoRota linkConcordar">Concordar</a> <img src="/assets/images/curtir_icon.jpg" />"""),_display_(/*41.214*/dica/*41.218*/.getQuantConcordancias()),format.raw/*41.242*/("""&nbsp;&nbsp;
				<a disabled=""""),_display_(/*42.19*/dica/*42.23*/.isDicaFechada()),format.raw/*42.39*/("""" class="acaoRota linkDiscordar" data-toggle="modal" data-target="#discordar">Discordar</a> <img src="/assets/images/discurtir_icon.jpg"/>"""),_display_(/*42.178*/dica/*42.182*/.getQuantDiscordancias()),format.raw/*42.206*/("""&nbsp;&nbsp;
				<a disabled="true">Índicie de concordância</a>"""),_display_(/*43.52*/dica/*43.56*/.getIndiceConcordancia()),format.raw/*43.80*/("""&nbsp;&nbsp;
				<a class="acaoRota linkDenunciar" data-toggle="modal" data-target="#denunciar">Denunciar </a>
				
				
				"""),_display_(/*47.6*/if(!dica.getListaDiscordancia().isEmpty())/*47.48*/{_display_(Seq[Any](format.raw/*47.49*/("""
					"""),format.raw/*48.6*/("""<div class= "panel container col-md-12 panelFrase">
					"""),_display_(/*49.7*/for(user <- dica.getListaDiscordancia()) yield /*49.47*/{_display_(Seq[Any](format.raw/*49.48*/("""
							"""),format.raw/*50.8*/("""<p class="nomeUsuarios">"""),_display_(/*50.33*/user/*50.37*/.getNome()),format.raw/*50.47*/(""" """),format.raw/*50.48*/("""discordou pelo seguinte motivo:</p> 
							<h5>"""),_display_(/*51.13*/dica/*51.17*/.exibirFraseDeDiscordancia(user)),format.raw/*51.49*/("""</h5>
							<legend></legend>
					""")))}),format.raw/*53.7*/("""
					"""),format.raw/*54.6*/("""</div>
					
				""")))}),format.raw/*56.6*/("""			
				"""),format.raw/*57.5*/("""<legend></legend>
				<div class="modal fade" id="discordar">
					<div class="modal-dialog">
						<div class="modal-content">
							<div class="modal-header">
								<button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
								<h4 class="modal-title">Por que você discorda?</h4>
							</div>
							<div class="modal-body">
								<form class="form-horizontal" method="POST" role="form"  id="formDiscordar"  action="/discordar">
									<input type="hidden"  name="idDica" value=""""),_display_(/*67.54*/dica/*67.58*/.getIdDicaString()),format.raw/*67.76*/("""" />
									<div class="col-sm-8">
										<textarea class="form-control" name="frase" maxlength="100"
											placeholder="Digite a razão pela qual você discorda desta dica." required></textarea>
									</div>
								</form>						
						</div>
							<div class="modal-footer">
								<button type="button" class="btn btn-default" data-dismiss="modal">Cancelar</button>
								<button type="submit" class="btn btn-primary" form="formDiscordar" >Adicionar</button>
							</div>
						</div><!-- /.modal-content -->
					</div><!-- /.modal-dialog -->
				</div><!-- /.modal -->
				
				<!--Modal Denunciar-->
			<div id="denunciar" class="modal fade "> <!--1-->
				<div class="modal-dialog centralizarModal"><!--2-->
					<div class="modal-content"><!--3-->
						<div class="modal-header"><!--4-->
							<button type="button" class="close" data-dismiss="modal" aria-hidden="true">&times;</button>
							<h4 class="modal-title">Informe-nos o que está acontecendo</h4>				
						</div><!--4-->
						
						<p class="text-warning"><small>Por que você não quer ver essa informação? </small></p>
						
						<div class="modal-body"> <!--5-->
							<form class="form-horizontal" method="POST" role="form" id="addDicaSemDificuldade" action="/addDicaSemDificuldade">
								<input type="radio" name="informacao" value="ofensivo" checked>A dica possui conteúdo ofensivo.
								<br>
								<input type="radio" name="informacao" value="antietico">A dica possui conteúdo antiético.
							</form> 
							
						 </div> <!--5-->	
						
						<div class="modal-footer">
							<button type="button" class="btn btn-default" data-dismiss="modal">Cancelar</button>
							<button type="button" class="btn btn-default" onClick="location.href='"""),_display_(/*104.79*/routes/*104.85*/.TemaController.denunciar(tema.getIdString(),dica.getIdDicaString())),format.raw/*104.153*/(""" """),format.raw/*104.154*/("""'" >Denunciar</button>
						</div>	
					 </div> <!--3-->
				</div> <!--2-->
			</div><!--1-->
				""")))}),format.raw/*109.6*/("""
			""")))}),format.raw/*110.5*/("""	
	"""),format.raw/*111.2*/("""</div>

<div class="modal fade" id="avaliarTema">
				<div class="modal-dialog">
					<div class="modal-content">
						<div class="modal-header">
							<button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
							<h4 class="modal-title">Avalie este tema</h4>
						</div>
						<div class="modal-body col-md-offset-1">
							
							<form class="form-horizontal" method="POST" role="form"  id="formAvaliar"  action="/avaliar">
								<input type="hidden"  name="idTema" value=""""),_display_(/*123.53*/tema/*123.57*/.getIdString()),format.raw/*123.71*/("""" />
								<div class="form-group">
									<label class="radio-inline"><input name="notaValue" type="radio" value="-2" checked>Muito Fácil</input></label>
									<label class="radio-inline"><input name="notaValue" type="radio" value="-1" value="facil">Fácil</input></label>
									<label class="radio-inline"><input name="notaValue" type="radio" value="0">Médio</input></label>
									<label class="radio-inline"><input name="notaValue" type="radio" value="1">Difícil</input></label>
									<label class="radio-inline"><input name="notaValue" type="radio" value="2">Muito Difícil</input></label>
								</div>
							</form>				
						</div>
						
						<div class="modal-footer">
							<button type="button" class="btn btn-default" data-dismiss="modal">Cancelar</button>
							<button type="submit" class="btn btn-primary" form="formAvaliar" >Avaliar</button>
						</div>
					</div><!-- /.modal-content -->
				</div><!-- /.modal-dialog -->
			</div><!-- /.modal -->
""")))}))}
  }

  def render(user:Usuario,tema:models.Tema): play.twirl.api.HtmlFormat.Appendable = apply(user,tema)

  def f:((Usuario,models.Tema) => play.twirl.api.HtmlFormat.Appendable) = (user,tema) => apply(user,tema)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Mon Mar 23 13:44:07 BRT 2015
                  SOURCE: /home/mariadch/projetosi1-dia/ProjetoSI1/app/views/dicasTema.scala.html
                  HASH: 39e19b5ec7fff6f4423b7ad9742bb3dff53709a0
                  MATRIX: 740->1|862->35|890->38|921->61|959->62|987->65|1027->85|1054->86|1268->273|1281->277|1312->287|1724->672|1737->676|1778->696|1883->774|1896->778|1939->800|2199->1034|2226->1052|2265->1053|2296->1057|2354->1097|2366->1101|2404->1102|2436->1108|2480->1136|2519->1137|2551->1142|2603->1167|2616->1171|2651->1185|2691->1198|2736->1222|2772->1232|2816->1255|2854->1266|2909->1294|2924->1300|2994->1349|3036->1363|3050->1367|3088->1383|3208->1475|3222->1479|3268->1503|3326->1534|3339->1538|3376->1554|3543->1693|3557->1697|3603->1721|3694->1785|3707->1789|3752->1813|3904->1939|3955->1981|3994->1982|4027->1988|4111->2046|4167->2086|4206->2087|4241->2095|4293->2120|4306->2124|4337->2134|4366->2135|4442->2184|4455->2188|4508->2220|4575->2257|4608->2263|4656->2281|4691->2289|5278->2849|5291->2853|5330->2871|7110->4623|7126->4629|7217->4697|7248->4698|7381->4800|7417->4805|7448->4808|8029->5361|8043->5365|8079->5379
                  LINES: 26->1|29->1|31->3|31->3|31->3|33->5|33->5|34->6|39->11|39->11|39->11|53->25|53->25|53->25|54->26|54->26|54->26|61->33|61->33|61->33|62->34|63->35|63->35|63->35|64->36|64->36|64->36|65->37|65->37|65->37|65->37|65->37|65->37|66->38|66->38|69->41|69->41|69->41|69->41|69->41|69->41|69->41|69->41|69->41|69->41|70->42|70->42|70->42|70->42|70->42|70->42|71->43|71->43|71->43|75->47|75->47|75->47|76->48|77->49|77->49|77->49|78->50|78->50|78->50|78->50|78->50|79->51|79->51|79->51|81->53|82->54|84->56|85->57|95->67|95->67|95->67|132->104|132->104|132->104|132->104|137->109|138->110|139->111|151->123|151->123|151->123
                  -- GENERATED --
              */
          