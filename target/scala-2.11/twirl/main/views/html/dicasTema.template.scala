
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
		<label class="col-md-5">"""),_display_(/*24.28*/user/*24.32*/.getNome()),format.raw/*24.42*/("""</label>
		<!--<div class="progress"> 
			<div class="progress-bar progress-bar-danger active" role="progressbar" aria-valuenow="70" aria-valuemin="0" aria-valuemax="100" style="width:70%"> Muito difícil</div>
		</div>-->
		<label>Média</label>0.0
		<button class="btn-small btn-default" data-toggle="modal" data-target="#avaliarTema">Avaliar tema</button>
	</div>
	

<div class="col-md-12 panelDicas">
	"""),_display_(/*34.3*/if(tema.isEmpty())/*34.21*/{_display_(Seq[Any](format.raw/*34.22*/("""
		"""),format.raw/*35.3*/("""<p>Nenhuma dica para este tema.</p>	
	""")))}/*36.3*/else/*36.7*/{_display_(Seq[Any](format.raw/*36.8*/("""	
		"""),_display_(/*37.4*/for(dica <- tema.getDicas()) yield /*37.32*/{_display_(Seq[Any](format.raw/*37.33*/("""
			"""),format.raw/*38.4*/("""<p class="nomeUsuarios">"""),_display_(/*38.29*/dica/*38.33*/.getNameUser()),format.raw/*38.47*/("""</p>
			"""),_display_(/*39.5*/Html(dica.exibir())),format.raw/*39.24*/("""

			"""),_display_(/*41.5*/for(user <- dica.getListaDiscordancia()) yield /*41.45*/{_display_(Seq[Any](format.raw/*41.46*/("""
				"""),format.raw/*42.5*/("""<p class="nomeUsuarios">"""),_display_(/*42.30*/user/*42.34*/.getNome()),format.raw/*42.44*/("""</p> 
				<h5>"""),_display_(/*43.10*/dica/*43.14*/.exibirFraseDeDiscordancia(user)),format.raw/*43.46*/("""</h5>
			""")))}),format.raw/*44.5*/("""
			"""),format.raw/*45.4*/("""<a onClick="location.href='"""),_display_(/*45.32*/routes/*45.38*/.TemaController.concordar(dica.getIdDicaString())),format.raw/*45.87*/("""'" disabled=""""),_display_(/*45.101*/dica/*45.105*/.isDicaFechada()),format.raw/*45.121*/("""" class="acaoRota linkConcordar">Concordar</a> <img src="/assets/images/curtir_icon.jpg" />"""),_display_(/*45.213*/dica/*45.217*/.getQuantConcordancias()),format.raw/*45.241*/("""&nbsp;&nbsp;
			<a disabled=""""),_display_(/*46.18*/dica/*46.22*/.isDicaFechada()),format.raw/*46.38*/("""" class="acaoRota linkDiscordar" data-toggle="modal" data-target="#discordar">Discordar</a> <img src="/assets/images/discurtir_icon.jpg"/>"""),_display_(/*46.177*/dica/*46.181*/.getQuantDiscordancias()),format.raw/*46.205*/("""&nbsp;&nbsp;
			<a disabled="true">Índicie de concordância</a>"""),_display_(/*47.51*/dica/*47.55*/.getIndiceConcordancia()),format.raw/*47.79*/("""&nbsp;&nbsp;
			<a onClick="location.href='"""),_display_(/*48.32*/routes/*48.38*/.TemaController.denunciar(tema.getIdString(),dica.getIdDicaString())),format.raw/*48.106*/(""" """),format.raw/*48.107*/("""'" class="acaoRota linkDenunciar">Denunciar </a>"""),_display_(/*48.156*/dica/*48.160*/.getQuantDenuncias()),format.raw/*48.180*/("""&nbsp;&nbsp;
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
								<input type="hidden"  name="idDica" value=""""),_display_(/*61.53*/dica/*61.57*/.getIdDicaString()),format.raw/*61.75*/("""" />
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
			""")))}),format.raw/*75.5*/("""
		""")))}),format.raw/*76.4*/("""	
"""),format.raw/*77.1*/("""</div>

<div class="modal fade" id="avaliarTema">
				<div class="modal-dialog">
					<div class="modal-content">
						<div class="modal-header">
							<button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
							<h4 class="modal-title">Avalie este tema</h4>
						</div>
						<div class="modal-body">
							
							<form class="form-horizontal" method="POST" role="form"  id="formAvaliar"  action="/avaliar">
								<input type="hidden"  name="idTema" value=""""),_display_(/*89.53*/tema/*89.57*/.getIdString()),format.raw/*89.71*/("""" />
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
                  DATE: Mon Mar 23 01:36:28 BRT 2015
                  SOURCE: C:/Users/Daniela/Documents/CC/projetosi1-vespera/ProjetoSI1/app/views/dicasTema.scala.html
                  HASH: e040e74330fd7f1cd70ad0cb7af536a3225a70e0
                  MATRIX: 740->1|862->35|892->40|923->63|961->64|991->69|1031->89|1059->91|1278->283|1291->287|1322->297|1626->574|1639->578|1670->588|2111->1003|2138->1021|2177->1022|2208->1026|2266->1066|2278->1070|2316->1071|2348->1077|2392->1105|2431->1106|2463->1111|2515->1136|2528->1140|2563->1154|2599->1164|2639->1183|2673->1191|2729->1231|2768->1232|2801->1238|2853->1263|2866->1267|2897->1277|2940->1293|2953->1297|3006->1329|3047->1340|3079->1345|3134->1373|3149->1379|3219->1428|3261->1442|3275->1446|3313->1462|3433->1554|3447->1558|3493->1582|3551->1613|3564->1617|3601->1633|3768->1772|3782->1776|3828->1800|3919->1864|3932->1868|3977->1892|4049->1937|4064->1943|4154->2011|4184->2012|4261->2061|4275->2065|4317->2085|4927->2668|4940->2672|4979->2690|5604->3285|5639->3290|5669->3293|6245->3842|6258->3846|6293->3860
                  LINES: 26->1|29->1|31->3|31->3|31->3|33->5|33->5|34->6|39->11|39->11|39->11|52->24|52->24|52->24|62->34|62->34|62->34|63->35|64->36|64->36|64->36|65->37|65->37|65->37|66->38|66->38|66->38|66->38|67->39|67->39|69->41|69->41|69->41|70->42|70->42|70->42|70->42|71->43|71->43|71->43|72->44|73->45|73->45|73->45|73->45|73->45|73->45|73->45|73->45|73->45|73->45|74->46|74->46|74->46|74->46|74->46|74->46|75->47|75->47|75->47|76->48|76->48|76->48|76->48|76->48|76->48|76->48|89->61|89->61|89->61|103->75|104->76|105->77|117->89|117->89|117->89
                  -- GENERATED --
              */
          