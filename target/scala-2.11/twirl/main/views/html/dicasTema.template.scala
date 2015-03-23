
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

				"""),_display_(/*40.6*/for(user <- dica.getListaDiscordancia()) yield /*40.46*/{_display_(Seq[Any](format.raw/*40.47*/("""
					"""),format.raw/*41.6*/("""<p class="nomeUsuarios">"""),_display_(/*41.31*/user/*41.35*/.getNome()),format.raw/*41.45*/("""</p> 
					<h5>"""),_display_(/*42.11*/dica/*42.15*/.exibirFraseDeDiscordancia(user)),format.raw/*42.47*/("""</h5>
				""")))}),format.raw/*43.6*/("""
				"""),format.raw/*44.5*/("""<a onClick="location.href='"""),_display_(/*44.33*/routes/*44.39*/.TemaController.concordar(dica.getIdDicaString())),format.raw/*44.88*/("""'" disabled=""""),_display_(/*44.102*/dica/*44.106*/.isDicaFechada()),format.raw/*44.122*/("""" class="acaoRota linkConcordar">Concordar</a> <img src="/assets/images/curtir_icon.jpg" />"""),_display_(/*44.214*/dica/*44.218*/.getQuantConcordancias()),format.raw/*44.242*/("""&nbsp;&nbsp;
				<a disabled=""""),_display_(/*45.19*/dica/*45.23*/.isDicaFechada()),format.raw/*45.39*/("""" class="acaoRota linkDiscordar" data-toggle="modal" data-target="#discordar">Discordar</a> <img src="/assets/images/discurtir_icon.jpg"/>"""),_display_(/*45.178*/dica/*45.182*/.getQuantDiscordancias()),format.raw/*45.206*/("""&nbsp;&nbsp;
				<a disabled="true">Índicie de concordância</a>"""),_display_(/*46.52*/dica/*46.56*/.getIndiceConcordancia()),format.raw/*46.80*/("""&nbsp;&nbsp;
				<a onClick="location.href='"""),_display_(/*47.33*/routes/*47.39*/.TemaController.denunciar(tema.getIdString(),dica.getIdDicaString())),format.raw/*47.107*/(""" """),format.raw/*47.108*/("""'" class="acaoRota linkDenunciar">Denunciar </a>"""),_display_(/*47.157*/dica/*47.161*/.getQuantDenuncias()),format.raw/*47.181*/("""&nbsp;&nbsp;
				<legend></legend>
			

				<div class="modal fade" id="discordar">
					<div class="modal-dialog">
						<div class="modal-content">
							<div class="modal-header">
								<button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
								<h4 class="modal-title">Por que você discorda?</h4>
							</div>
							<div class="modal-body">
								<form class="form-horizontal" method="POST" role="form"  id="formDiscordar"  action="/discordar">
									<input type="hidden"  name="idDica" value=""""),_display_(/*60.54*/dica/*60.58*/.getIdDicaString()),format.raw/*60.76*/("""" />
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
							<button type="button" class="btn btn-default" >Denunciar</button>
						</div>	
					 </div> <!--3-->
				</div> <!--2-->
			</div><!--1-->
				""")))}),format.raw/*102.6*/("""
			""")))}),format.raw/*103.5*/("""	
	"""),format.raw/*104.2*/("""</div>

<div class="modal fade" id="avaliarTema">
				<div class="modal-dialog">
					<div class="modal-content">
						<div class="modal-header">
							<button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
							<h4 class="modal-title">Avalie este tema</h4>
						</div>
						<div class="modal-body col-md-offset-1">
							
							<form class="form-horizontal" method="POST" role="form"  id="formAvaliar"  action="/avaliar">
								<input type="hidden"  name="idTema" value=""""),_display_(/*116.53*/tema/*116.57*/.getIdString()),format.raw/*116.71*/("""" />
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
                  DATE: Mon Mar 23 11:02:24 BRT 2015
                  SOURCE: /home/andrezarmq/Documentos/SI1/ProjetoSI1/app/views/dicasTema.scala.html
                  HASH: b076226e30e1dba70101c46575f18948d9f3fe8d
                  MATRIX: 740->1|862->35|890->38|921->61|959->62|987->65|1027->85|1054->86|1268->273|1281->277|1312->287|1724->672|1737->676|1778->696|1883->774|1896->778|1939->800|2199->1034|2226->1052|2265->1053|2296->1057|2354->1097|2366->1101|2404->1102|2436->1108|2480->1136|2519->1137|2551->1142|2603->1167|2616->1171|2651->1185|2691->1198|2736->1222|2772->1232|2816->1255|2849->1262|2905->1302|2944->1303|2977->1309|3029->1334|3042->1338|3073->1348|3116->1364|3129->1368|3182->1400|3223->1411|3255->1416|3310->1444|3325->1450|3395->1499|3437->1513|3451->1517|3489->1533|3609->1625|3623->1629|3669->1653|3727->1684|3740->1688|3777->1704|3944->1843|3958->1847|4004->1871|4095->1935|4108->1939|4153->1963|4225->2008|4240->2014|4330->2082|4360->2083|4437->2132|4451->2136|4493->2156|5102->2738|5115->2742|5154->2760|7011->4586|7047->4591|7078->4594|7659->5147|7673->5151|7709->5165
                  LINES: 26->1|29->1|31->3|31->3|31->3|33->5|33->5|34->6|39->11|39->11|39->11|53->25|53->25|53->25|54->26|54->26|54->26|61->33|61->33|61->33|62->34|63->35|63->35|63->35|64->36|64->36|64->36|65->37|65->37|65->37|65->37|65->37|65->37|66->38|66->38|68->40|68->40|68->40|69->41|69->41|69->41|69->41|70->42|70->42|70->42|71->43|72->44|72->44|72->44|72->44|72->44|72->44|72->44|72->44|72->44|72->44|73->45|73->45|73->45|73->45|73->45|73->45|74->46|74->46|74->46|75->47|75->47|75->47|75->47|75->47|75->47|75->47|88->60|88->60|88->60|130->102|131->103|132->104|144->116|144->116|144->116
                  -- GENERATED --
              */
          