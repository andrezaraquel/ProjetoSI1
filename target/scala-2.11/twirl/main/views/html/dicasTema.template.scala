
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
			<div class="panel-heading">	
				<div class="row">
					<div class="col-md-5 "><label>Média de Dificuldade do Tema: &nbsp;</label><label>"""),_display_(/*25.88*/tema/*25.92*/.getAvaliacaoMedia()),format.raw/*25.112*/("""</label></div>
					<div class="col-md-4 "><label>Mediana das Avaliações:&nbsp;</label><label>"""),_display_(/*26.81*/tema/*26.85*/.getAvaliacaoMediana()),format.raw/*26.107*/("""</label></div>
					<div class="col-md-3"><button class="btn btn-xs btn-info" data-toggle="modal" data-target="#avaliarTema">Avaliar tema</button></div>
				</div>
			</div>
		</div>
	

	<div class="col-md-12 panelDicas">
		"""),_display_(/*34.4*/if(tema.isEmpty())/*34.22*/{_display_(Seq[Any](format.raw/*34.23*/("""
			"""),format.raw/*35.4*/("""<p>Nenhuma dica para este tema.</p>	
		""")))}/*36.4*/else/*36.8*/{_display_(Seq[Any](format.raw/*36.9*/("""	
			"""),_display_(/*37.5*/for(dica <- tema.getDicas()) yield /*37.33*/{_display_(Seq[Any](format.raw/*37.34*/("""
				"""),format.raw/*38.5*/("""<p class="nomeUsuarios">"""),_display_(/*38.30*/dica/*38.34*/.getNameUser()),format.raw/*38.48*/("""&nbsp;&nbsp;"""),_display_(/*38.61*/Html(dica.exibirLabel())),format.raw/*38.85*/("""&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<a><img src="/assets/images/add.png"/></a></p>
				"""),_display_(/*39.6*/Html(dica.exibirDica())),format.raw/*39.29*/("""

				"""),format.raw/*41.5*/("""<div class="row"></div>
					<div class="col-md-3"><a onClick="location.href='"""),_display_(/*42.56*/routes/*42.62*/.TemaController.concordar(dica.getIdDicaString())),format.raw/*42.111*/("""'" disabled=""""),_display_(/*42.125*/dica/*42.129*/.isDicaFechada()),format.raw/*42.145*/("""" class="acaoRota linkConcordar">Concordar</a> <img src="/assets/images/curtir_icon.jpg" />"""),_display_(/*42.237*/dica/*42.241*/.getQuantConcordancias()),format.raw/*42.265*/("""</div>
					<div class="col-md-3"><a disabled=""""),_display_(/*43.42*/dica/*43.46*/.isDicaFechada()),format.raw/*43.62*/("""" class="acaoRota linkDiscordar" data-toggle="modal" data-target="#discordar">Discordar</a> <img src="/assets/images/discurtir_icon.jpg"/>"""),_display_(/*43.201*/dica/*43.205*/.getQuantDiscordancias()),format.raw/*43.229*/("""</div>
					<div class="col-md-3"><a disabled="true">I.C = </a>"""),_display_(/*44.58*/dica/*44.62*/.getIndiceConcordancia()),format.raw/*44.86*/("""</div>
					<div class="col-md-3"><a class="acaoRota linkDenunciar" data-toggle="modal" data-target="#denunciar">Denunciar </a></div>
			
				
				"""),_display_(/*48.6*/if(!dica.getListaDiscordancia().isEmpty())/*48.48*/{_display_(Seq[Any](format.raw/*48.49*/("""
					"""),format.raw/*49.6*/("""<div class= "panel container col-md-12 panelFrase">
					"""),_display_(/*50.7*/for(user <- dica.getListaDiscordancia()) yield /*50.47*/{_display_(Seq[Any](format.raw/*50.48*/("""
							"""),format.raw/*51.8*/("""<p class="nomeUsuarios">"""),_display_(/*51.33*/user/*51.37*/.getNome()),format.raw/*51.47*/(""" """),format.raw/*51.48*/("""discordou pelo seguinte motivo:</p> 
							<h5>"""),_display_(/*52.13*/dica/*52.17*/.exibirFraseDeDiscordancia(user)),format.raw/*52.49*/("""</h5>
							<legend></legend>
					""")))}),format.raw/*54.7*/("""
					"""),format.raw/*55.6*/("""</div>
					
				""")))}),format.raw/*57.6*/("""			
				"""),format.raw/*58.5*/("""<legend></legend>
				</div>
				<div class="modal fade" id="discordar">
					<div class="modal-dialog">
						<div class="modal-content">
							<div class="modal-header">
								<button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
								<h4 class="modal-title">Por que você discorda?</h4>
							</div>
							<div class="modal-body">
								<form class="form-horizontal" method="POST" role="form"  id="formDiscordar"  action="/discordar">
									<input type="hidden"  name="idDica" value=""""),_display_(/*69.54*/dica/*69.58*/.getIdDicaString()),format.raw/*69.76*/("""" />
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
							<button type="button" class="btn btn-default" onClick="location.href='"""),_display_(/*106.79*/routes/*106.85*/.TemaController.denunciar(tema.getIdString(),dica.getIdDicaString())),format.raw/*106.153*/(""" """),format.raw/*106.154*/("""'" >Denunciar</button>
						</div>	
					 </div> <!--3-->
				</div> <!--2-->
			</div><!--1-->
				""")))}),format.raw/*111.6*/("""
			""")))}),format.raw/*112.5*/("""	
	"""),format.raw/*113.2*/("""</div>

<div class="modal fade" id="avaliarTema">
				<div class="modal-dialog">
					<div class="modal-content">
						<div class="modal-header">
							<button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
							<h4 class="modal-title">Avalie este tema</h4>
						</div>
						<div class="modal-body col-md-offset-1">
							
							<form class="form-horizontal" method="POST" role="form"  id="formAvaliar"  action="/avaliar">
								<input type="hidden"  name="idTema" value=""""),_display_(/*125.53*/tema/*125.57*/.getIdString()),format.raw/*125.71*/("""" />
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
                  DATE: Mon Mar 23 15:39:23 BRT 2015
                  SOURCE: /home/mariadch/ultimo/ProjetoSI1/app/views/dicasTema.scala.html
                  HASH: 9afd814c996e88fe359b060f7b751f1d45712b6a
                  MATRIX: 740->1|862->35|890->38|921->61|959->62|987->65|1027->85|1054->86|1268->273|1281->277|1312->287|1715->663|1728->667|1770->687|1892->782|1905->786|1949->808|2200->1033|2227->1051|2266->1052|2297->1056|2355->1096|2367->1100|2405->1101|2437->1107|2481->1135|2520->1136|2552->1141|2604->1166|2617->1170|2652->1184|2692->1197|2737->1221|2851->1309|2895->1332|2928->1338|3034->1417|3049->1423|3120->1472|3162->1486|3176->1490|3214->1506|3334->1598|3348->1602|3394->1626|3469->1674|3482->1678|3519->1694|3686->1833|3700->1837|3746->1861|3837->1925|3850->1929|3895->1953|4069->2101|4120->2143|4159->2144|4192->2150|4276->2208|4332->2248|4371->2249|4406->2257|4458->2282|4471->2286|4502->2296|4531->2297|4607->2346|4620->2350|4673->2382|4740->2419|4773->2425|4821->2443|4856->2451|5454->3022|5467->3026|5506->3044|7286->4796|7302->4802|7393->4870|7424->4871|7557->4973|7593->4978|7624->4981|8205->5534|8219->5538|8255->5552
                  LINES: 26->1|29->1|31->3|31->3|31->3|33->5|33->5|34->6|39->11|39->11|39->11|53->25|53->25|53->25|54->26|54->26|54->26|62->34|62->34|62->34|63->35|64->36|64->36|64->36|65->37|65->37|65->37|66->38|66->38|66->38|66->38|66->38|66->38|67->39|67->39|69->41|70->42|70->42|70->42|70->42|70->42|70->42|70->42|70->42|70->42|71->43|71->43|71->43|71->43|71->43|71->43|72->44|72->44|72->44|76->48|76->48|76->48|77->49|78->50|78->50|78->50|79->51|79->51|79->51|79->51|79->51|80->52|80->52|80->52|82->54|83->55|85->57|86->58|97->69|97->69|97->69|134->106|134->106|134->106|134->106|139->111|140->112|141->113|153->125|153->125|153->125
                  -- GENERATED --
              */
          