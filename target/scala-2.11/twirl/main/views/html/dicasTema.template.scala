
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
	
	<div class="panel">	
		<div class="col-md-5 col-offset-1">
		
		<button class="btn btn-small btn-default" data-toggle="modal" data-target="#avaliarTema">Avaliar tema</button>
			
		
		<div class="col-md-2 col-md-offset-1">
			<label>Média</label>
			<div >222</div>
		</div>
		<div class="col-md-2 col-md-offset-1">
			<label>Mediana</label>
			<div >200</div>
		</div>	
	</div>		
</div>


<div class="panel col-md-12 ">
	"""),_display_(/*40.3*/if(tema.isEmpty())/*40.21*/{_display_(Seq[Any](format.raw/*40.22*/("""
		"""),format.raw/*41.3*/("""<p>Nenhuma dica para este tema.</p>	
	""")))}/*42.3*/else/*42.7*/{_display_(Seq[Any](format.raw/*42.8*/("""	
		"""),_display_(/*43.4*/for(dica <- tema.getDicas()) yield /*43.32*/{_display_(Seq[Any](format.raw/*43.33*/("""
			"""),format.raw/*44.4*/("""<p class="nomeUsuarios">"""),_display_(/*44.29*/dica/*44.33*/.getNameUser()),format.raw/*44.47*/("""</p>
			"""),_display_(/*45.5*/Html(dica.exibir())),format.raw/*45.24*/("""

			"""),_display_(/*47.5*/for(user <- dica.getListaDiscordancia()) yield /*47.45*/{_display_(Seq[Any](format.raw/*47.46*/("""
				"""),format.raw/*48.5*/("""<p class="nomeUsuarios">"""),_display_(/*48.30*/user/*48.34*/.getNome()),format.raw/*48.44*/("""</p> 
				<h5>"""),_display_(/*49.10*/dica/*49.14*/.exibirFraseDeDiscordancia(user)),format.raw/*49.46*/("""</h5>
			
			""")))}),format.raw/*51.5*/("""
			
			"""),format.raw/*53.4*/("""<a onClick="location.href='"""),_display_(/*53.32*/routes/*53.38*/.TemaController.concordar(dica.getIdDicaString())),format.raw/*53.87*/("""'" disabled=""""),_display_(/*53.101*/dica/*53.105*/.isDicaFechada()),format.raw/*53.121*/("""" class="acaoRota linkConcordar">Concordar</a> <img src="/assets/images/curtir_icon.jpg" />"""),_display_(/*53.213*/dica/*53.217*/.getQuantConcordancias()),format.raw/*53.241*/("""&nbsp;&nbsp;
			<a disabled=""""),_display_(/*54.18*/dica/*54.22*/.isDicaFechada()),format.raw/*54.38*/("""" class="acaoRota linkDiscordar" data-toggle="modal" data-target="#discordar">Discordar</a> <img src="/assets/images/curtir_icon.jpg"/>"""),_display_(/*54.174*/dica/*54.178*/.getQuantDiscordancias()),format.raw/*54.202*/("""&nbsp;&nbsp;
			<p> Índicie de concordância </p>"""),_display_(/*55.37*/dica/*55.41*/.getIndiceConcordancia()),format.raw/*55.65*/("""
			"""),format.raw/*56.4*/("""<a onClick="location.href='"""),_display_(/*56.32*/routes/*56.38*/.TemaController.denunciar(tema.getIdString(),dica.getIdDicaString())),format.raw/*56.106*/("""'" class="acaoRota linkDenunciar">Denunciar </a>"""),_display_(/*56.155*/dica/*56.159*/.getQuantDenuncias()),format.raw/*56.179*/("""
			"""),format.raw/*57.4*/("""<legend></legend>
		

			<div class="modal fade" id="discordar">
				<div class="modal-dialog">
					<div class="modal-content">
						<div class="modal-header">
							<button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
							<h4 class="modal-title">Por que você discorda?</h4>
						</div>
						<div class="modal-body">
							<form class="form-horizontal" method="POST" role="form"  id="formDiscordar"  action="/discordar">
								<input type="hidden"  name="idDica" value=""""),_display_(/*69.53*/dica/*69.57*/.getIdDicaString()),format.raw/*69.75*/("""" />
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
			""")))}),format.raw/*83.5*/("""
		""")))}),format.raw/*84.4*/("""	
"""),format.raw/*85.1*/("""</div>

<div class="modal fade" id="avaliarTema">
				<div class="modal-dialog">
					<div class="modal-content">
						<div class="modal-header">
							<button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
							<h4 class="modal-title">Avalie este tema</h4>
						</div>
						<div class="modal-body">
							
							<form class="form-horizontal" method="POST" role="form"  id="formAvaliar"  action="/avaliar">
								<input type="hidden"  name="idTema" value=""""),_display_(/*97.53*/tema/*97.57*/.getIdString()),format.raw/*97.71*/("""" />
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
                  DATE: Sun Mar 22 22:55:40 BRT 2015
                  SOURCE: C:/Users/Daniela/Documents/CC/projetosi1-vespera/ProjetoSI1/app/views/dicasTema.scala.html
                  HASH: 15880b2e7d426eb8011bbbbd1f9d7b850db6c6d1
                  MATRIX: 740->1|862->35|892->40|923->63|961->64|991->69|1031->89|1059->91|1278->283|1291->287|1322->297|2001->950|2028->968|2067->969|2098->973|2156->1013|2168->1017|2206->1018|2238->1024|2282->1052|2321->1053|2353->1058|2405->1083|2418->1087|2453->1101|2489->1111|2529->1130|2563->1138|2619->1178|2658->1179|2691->1185|2743->1210|2756->1214|2787->1224|2830->1240|2843->1244|2896->1276|2942->1292|2979->1302|3034->1330|3049->1336|3119->1385|3161->1399|3175->1403|3213->1419|3333->1511|3347->1515|3393->1539|3451->1570|3464->1574|3501->1590|3665->1726|3679->1730|3725->1754|3802->1804|3815->1808|3860->1832|3892->1837|3947->1865|3962->1871|4052->1939|4129->1988|4143->1992|4185->2012|4217->2017|4810->2583|4823->2587|4862->2605|5487->3200|5522->3205|5552->3208|6128->3757|6141->3761|6176->3775
                  LINES: 26->1|29->1|31->3|31->3|31->3|33->5|33->5|34->6|39->11|39->11|39->11|68->40|68->40|68->40|69->41|70->42|70->42|70->42|71->43|71->43|71->43|72->44|72->44|72->44|72->44|73->45|73->45|75->47|75->47|75->47|76->48|76->48|76->48|76->48|77->49|77->49|77->49|79->51|81->53|81->53|81->53|81->53|81->53|81->53|81->53|81->53|81->53|81->53|82->54|82->54|82->54|82->54|82->54|82->54|83->55|83->55|83->55|84->56|84->56|84->56|84->56|84->56|84->56|84->56|85->57|97->69|97->69|97->69|111->83|112->84|113->85|125->97|125->97|125->97
                  -- GENERATED --
              */
          