
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
			<div class="col-md-2 "><label>Média</label>0.0 </div>
			<div class="col-md-2 "><label>Mediana</label>0.0 </div>
			<div class="col-md-offset-2.5 col-md-2"><button class="btn btn-small btn-default" data-toggle="modal" data-target="#avaliarTema">Avaliar tema</button></div>
		</div>
	</div>
	

	<div class="col-md-12 panelDicas">
		"""),_display_(/*34.4*/if(tema.isEmpty())/*34.22*/{_display_(Seq[Any](format.raw/*34.23*/("""
			"""),format.raw/*35.4*/("""<p>Nenhuma dica para este tema.</p>	
		""")))}/*36.4*/else/*36.8*/{_display_(Seq[Any](format.raw/*36.9*/("""	
			"""),_display_(/*37.5*/for(dica <- tema.getDicas()) yield /*37.33*/{_display_(Seq[Any](format.raw/*37.34*/("""
				"""),format.raw/*38.5*/("""<p class="nomeUsuarios">"""),_display_(/*38.30*/dica/*38.34*/.getNameUser()),format.raw/*38.48*/("""&nbsp;&nbsp;"""),_display_(/*38.61*/Html(dica.exibirLabel())),format.raw/*38.85*/("""</p>
				"""),_display_(/*39.6*/Html(dica.exibirDica())),format.raw/*39.29*/("""

				"""),_display_(/*41.6*/for(user <- dica.getListaDiscordancia()) yield /*41.46*/{_display_(Seq[Any](format.raw/*41.47*/("""
					"""),format.raw/*42.6*/("""<p class="nomeUsuarios">"""),_display_(/*42.31*/user/*42.35*/.getNome()),format.raw/*42.45*/("""</p> 
					<h5>"""),_display_(/*43.11*/dica/*43.15*/.exibirFraseDeDiscordancia(user)),format.raw/*43.47*/("""</h5>
				""")))}),format.raw/*44.6*/("""
				"""),format.raw/*45.5*/("""<a onClick="location.href='"""),_display_(/*45.33*/routes/*45.39*/.TemaController.concordar(dica.getIdDicaString())),format.raw/*45.88*/("""'" disabled=""""),_display_(/*45.102*/dica/*45.106*/.isDicaFechada()),format.raw/*45.122*/("""" class="acaoRota linkConcordar">Concordar</a> <img src="/assets/images/curtir_icon.jpg" />"""),_display_(/*45.214*/dica/*45.218*/.getQuantConcordancias()),format.raw/*45.242*/("""&nbsp;&nbsp;
				<a disabled=""""),_display_(/*46.19*/dica/*46.23*/.isDicaFechada()),format.raw/*46.39*/("""" class="acaoRota linkDiscordar" data-toggle="modal" data-target="#discordar">Discordar</a> <img src="/assets/images/discurtir_icon.jpg"/>"""),_display_(/*46.178*/dica/*46.182*/.getQuantDiscordancias()),format.raw/*46.206*/("""&nbsp;&nbsp;
				<a disabled="true">Índicie de concordância</a>"""),_display_(/*47.52*/dica/*47.56*/.getIndiceConcordancia()),format.raw/*47.80*/("""&nbsp;&nbsp;
				<a onClick="location.href='"""),_display_(/*48.33*/routes/*48.39*/.TemaController.denunciar(tema.getIdString(),dica.getIdDicaString())),format.raw/*48.107*/(""" """),format.raw/*48.108*/("""'" class="acaoRota linkDenunciar">Denunciar </a>"""),_display_(/*48.157*/dica/*48.161*/.getQuantDenuncias()),format.raw/*48.181*/("""&nbsp;&nbsp;
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
									<input type="hidden"  name="idDica" value=""""),_display_(/*61.54*/dica/*61.58*/.getIdDicaString()),format.raw/*61.76*/("""" />
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
				""")))}),format.raw/*103.6*/("""
			""")))}),format.raw/*104.5*/("""	
	"""),format.raw/*105.2*/("""</div>

<div class="modal fade" id="avaliarTema">
				<div class="modal-dialog">
					<div class="modal-content">
						<div class="modal-header">
							<button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
							<h4 class="modal-title">Avalie este tema</h4>
						</div>
						<div class="modal-body col-md-offset-1">
							
							<form class="form-horizontal" method="POST" role="form"  id="formAvaliar"  action="/avaliar">
								<input type="hidden"  name="idTema" value=""""),_display_(/*117.53*/tema/*117.57*/.getIdString()),format.raw/*117.71*/("""" />
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
                  DATE: Mon Mar 23 08:35:23 BRT 2015
                  SOURCE: C:/Users/Daniela/Documents/CC/projetosi1-vespera/ProjetoSI1/app/views/dicasTema.scala.html
                  HASH: 4ec07f1acbc0e9b35cee280e2f325047eb3b60f9
                  MATRIX: 740->1|862->35|892->40|923->63|961->64|991->69|1031->89|1059->91|1278->283|1291->287|1322->297|2031->980|2058->998|2097->999|2129->1004|2188->1045|2200->1049|2238->1050|2271->1057|2315->1085|2354->1086|2387->1092|2439->1117|2452->1121|2487->1135|2527->1148|2572->1172|2609->1183|2653->1206|2688->1215|2744->1255|2783->1256|2817->1263|2869->1288|2882->1292|2913->1302|2957->1319|2970->1323|3023->1355|3065->1367|3098->1373|3153->1401|3168->1407|3238->1456|3280->1470|3294->1474|3332->1490|3452->1582|3466->1586|3512->1610|3571->1642|3584->1646|3621->1662|3788->1801|3802->1805|3848->1829|3940->1894|3953->1898|3998->1922|4071->1968|4086->1974|4176->2042|4206->2043|4283->2092|4297->2096|4339->2116|4961->2711|4974->2715|5013->2733|6912->4601|6949->4607|6981->4611|7574->5176|7588->5180|7624->5194
                  LINES: 26->1|29->1|31->3|31->3|31->3|33->5|33->5|34->6|39->11|39->11|39->11|62->34|62->34|62->34|63->35|64->36|64->36|64->36|65->37|65->37|65->37|66->38|66->38|66->38|66->38|66->38|66->38|67->39|67->39|69->41|69->41|69->41|70->42|70->42|70->42|70->42|71->43|71->43|71->43|72->44|73->45|73->45|73->45|73->45|73->45|73->45|73->45|73->45|73->45|73->45|74->46|74->46|74->46|74->46|74->46|74->46|75->47|75->47|75->47|76->48|76->48|76->48|76->48|76->48|76->48|76->48|89->61|89->61|89->61|131->103|132->104|133->105|145->117|145->117|145->117
                  -- GENERATED --
              */
          