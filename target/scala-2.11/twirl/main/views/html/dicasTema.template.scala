
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
			<div class="col-md-9 ">
			<h1 class="panel-title" id ="temaSelecionado">"""),_display_(/*11.51*/tema/*11.55*/.getNome()),format.raw/*11.65*/("""</h1>
			</div>
			
			<div class="col-md-3" >
			<button type="button" class="btn btn-xs btn-info" data-toggle="modal" data-target="#adicionarDica" >Adicionar dica</button>
			</div>		
			
		</div>
	</div>
	

	<div  class=" avaliacoesTema">
		<div class="panel-heading">	
			<div class="row">
				<div class="col-md-5 "><label>Média de Dificuldade do Tema: &nbsp;</label><label>"""),_display_(/*25.87*/tema/*25.91*/.getAvaliacaoMedia()),format.raw/*25.111*/("""</label></div>
				<div class="col-md-4 "><label>Mediana das Avaliações:&nbsp;</label><label>"""),_display_(/*26.80*/tema/*26.84*/.getAvaliacaoMediana()),format.raw/*26.106*/("""</label></div>
				<div class="col-md-3"><button class="btn btn-xs btn-info" data-toggle="modal" data-target="#avaliarTema">Avaliar tema</button></div>
			</div>
		</div>
	</div>
	

	<div class="col-md-12 panelDicas">
		"""),_display_(/*34.4*/if(tema.isEmpty())/*34.22*/{_display_(Seq[Any](format.raw/*34.23*/("""
			"""),format.raw/*35.4*/("""<p>Nenhuma dica para este tema.</p>	
		""")))}/*36.4*/else/*36.8*/{_display_(Seq[Any](format.raw/*36.9*/("""	
			"""),_display_(/*37.5*/for(dica <- tema.getDicas()) yield /*37.33*/{_display_(Seq[Any](format.raw/*37.34*/("""
				"""),format.raw/*38.5*/("""<p class="nomeUsuarios">"""),_display_(/*38.30*/dica/*38.34*/.getNameUser()),format.raw/*38.48*/("""&nbsp;&nbsp;"""),_display_(/*38.61*/Html(dica.exibirLabel())),format.raw/*38.85*/("""</p>
				"""),_display_(/*39.6*/Html(dica.exibirDica())),format.raw/*39.29*/("""

				
				"""),format.raw/*42.5*/("""<a onClick="location.href='"""),_display_(/*42.33*/routes/*42.39*/.TemaController.concordar(dica.getIdDicaString())),format.raw/*42.88*/("""'" disabled=""""),_display_(/*42.102*/dica/*42.106*/.isDicaFechada()),format.raw/*42.122*/("""" class="acaoRota linkConcordar">Concordar</a> <img src="/assets/images/curtir_icon.jpg" />"""),_display_(/*42.214*/dica/*42.218*/.getQuantConcordancias()),format.raw/*42.242*/("""&nbsp;&nbsp;
				<a disabled=""""),_display_(/*43.19*/dica/*43.23*/.isDicaFechada()),format.raw/*43.39*/("""" class="acaoRota linkDiscordar" data-toggle="modal" data-target="#discordar">Discordar</a> <img src="/assets/images/discurtir_icon.jpg"/>"""),_display_(/*43.178*/dica/*43.182*/.getQuantDiscordancias()),format.raw/*43.206*/("""&nbsp;&nbsp;
				<a disabled="true">Índicie de concordância</a>"""),_display_(/*44.52*/dica/*44.56*/.getIndiceConcordancia()),format.raw/*44.80*/("""&nbsp;&nbsp;
				<a class="acaoRota linkDenunciar" data-toggle="modal" data-target="#denunciar">Denunciar </a>
				
				
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
				<div class="modal fade" id="discordar">
					<div class="modal-dialog">
						<div class="modal-content">
							<div class="modal-header">
								<button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
								<h4 class="modal-title">Por que você discorda?</h4>
							</div>
							<div class="modal-body">
								<form class="form-horizontal" method="POST" role="form"  id="formDiscordar"  action="/discordar">
									<input type="hidden"  name="idDica" value=""""),_display_(/*68.54*/dica/*68.58*/.getIdDicaString()),format.raw/*68.76*/("""" />
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
							<button type="button" class="btn btn-default" onClick="location.href='"""),_display_(/*105.79*/routes/*105.85*/.TemaController.denunciar(tema.getIdString(),dica.getIdDicaString())),format.raw/*105.153*/(""" """),format.raw/*105.154*/("""'" >Denunciar</button>
						</div>	
					 </div> <!--3-->
				</div> <!--2-->
			</div><!--1-->
				""")))}),format.raw/*110.6*/("""
			""")))}),format.raw/*111.5*/("""	
	"""),format.raw/*112.2*/("""</div>

<div class="modal fade" id="avaliarTema">
				<div class="modal-dialog">
					<div class="modal-content">
						<div class="modal-header">
							<button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
							<h4 class="modal-title">Avalie este tema</h4>
						</div>
						<div class="modal-body col-md-offset-1">
							
							<form class="form-horizontal" method="POST" role="form"  id="formAvaliar"  action="/avaliar">
								<input type="hidden"  name="idTema" value=""""),_display_(/*124.53*/tema/*124.57*/.getIdString()),format.raw/*124.71*/("""" />
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
                  DATE: Mon Mar 23 14:01:35 BRT 2015
                  SOURCE: /home/andrezarmq/Documentos/SI1/ProjetoSI1/app/views/dicasTema.scala.html
                  HASH: ac29f9b6d15716b6328a27e5a71f58b143b88785
                  MATRIX: 740->1|862->35|890->38|921->61|959->62|987->65|1027->85|1054->86|1267->272|1280->276|1311->286|1718->666|1731->670|1773->690|1894->784|1907->788|1951->810|2198->1031|2225->1049|2264->1050|2295->1054|2353->1094|2365->1098|2403->1099|2435->1105|2479->1133|2518->1134|2550->1139|2602->1164|2615->1168|2650->1182|2690->1195|2735->1219|2771->1229|2815->1252|2853->1263|2908->1291|2923->1297|2993->1346|3035->1360|3049->1364|3087->1380|3207->1472|3221->1476|3267->1500|3325->1531|3338->1535|3375->1551|3542->1690|3556->1694|3602->1718|3693->1782|3706->1786|3751->1810|3903->1936|3954->1978|3993->1979|4026->1985|4110->2043|4166->2083|4205->2084|4240->2092|4292->2117|4305->2121|4336->2131|4365->2132|4441->2181|4454->2185|4507->2217|4574->2254|4607->2260|4655->2278|4690->2286|5277->2846|5290->2850|5329->2868|7109->4620|7125->4626|7216->4694|7247->4695|7380->4797|7416->4802|7447->4805|8028->5358|8042->5362|8078->5376
                  LINES: 26->1|29->1|31->3|31->3|31->3|33->5|33->5|34->6|39->11|39->11|39->11|53->25|53->25|53->25|54->26|54->26|54->26|62->34|62->34|62->34|63->35|64->36|64->36|64->36|65->37|65->37|65->37|66->38|66->38|66->38|66->38|66->38|66->38|67->39|67->39|70->42|70->42|70->42|70->42|70->42|70->42|70->42|70->42|70->42|70->42|71->43|71->43|71->43|71->43|71->43|71->43|72->44|72->44|72->44|76->48|76->48|76->48|77->49|78->50|78->50|78->50|79->51|79->51|79->51|79->51|79->51|80->52|80->52|80->52|82->54|83->55|85->57|86->58|96->68|96->68|96->68|133->105|133->105|133->105|133->105|138->110|139->111|140->112|152->124|152->124|152->124
                  -- GENERATED --
              */
          