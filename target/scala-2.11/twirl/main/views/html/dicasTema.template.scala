
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
			<select class="selectNivelDificuldade" data-max-options="1">
				<option>Nível de Dificuldade do Tema</option>
			    <option>Muito Fácil</option>
			    <option>Fácil</option>
			    <option>Normal</option>
			    <option>Difícil</option>
			    <option>Muito Difícil</option>
			</select>
		</div>
		
		<div class="col-md-2 col-md-offset-1">
			<label>Média</label>
			<div id="campoMedia">200</div>
		</div>
		<div class="col-md-2 col-md-offset-1">
			<label>Mediana</label>
			<div id="campoMediana">200</div>
		</div>	
	</div>		
</div>


<div class="panel col-md-12 ">
	"""),_display_(/*46.3*/if(tema.isEmpty())/*46.21*/{_display_(Seq[Any](format.raw/*46.22*/("""
		"""),format.raw/*47.3*/("""<p>Nenhuma dica para este tema.</p>	
	""")))}/*48.3*/else/*48.7*/{_display_(Seq[Any](format.raw/*48.8*/("""	
		"""),_display_(/*49.4*/for(dica <- tema.getDicas()) yield /*49.32*/{_display_(Seq[Any](format.raw/*49.33*/("""
			"""),format.raw/*50.4*/("""<p class="nomeUsuarios">"""),_display_(/*50.29*/dica/*50.33*/.getNameUser()),format.raw/*50.47*/("""</p>
			"""),_display_(/*51.5*/Html(dica.exibir())),format.raw/*51.24*/("""

			"""),_display_(/*53.5*/for(user <- dica.getListaDiscordancia()) yield /*53.45*/{_display_(Seq[Any](format.raw/*53.46*/("""
				"""),format.raw/*54.5*/("""<p class="nomeUsuarios">"""),_display_(/*54.30*/user/*54.34*/.getNome()),format.raw/*54.44*/("""</p> 
				<h5>"""),_display_(/*55.10*/dica/*55.14*/.exibirFraseDeDiscordancia(user)),format.raw/*55.46*/("""</h5>
			
			""")))}),format.raw/*57.5*/("""
			
			"""),format.raw/*59.4*/("""<a onClick="location.href='"""),_display_(/*59.32*/routes/*59.38*/.TemaController.concordar(dica.getIdDicaString())),format.raw/*59.87*/("""'" disabled=""""),_display_(/*59.101*/dica/*59.105*/.isDicaFechada()),format.raw/*59.121*/("""" class="acaoRota linkConcordar">Concordar</a> <img src="/assets/images/curtir_icon.jpg" />"""),_display_(/*59.213*/dica/*59.217*/.getQuantConcordancias()),format.raw/*59.241*/("""&nbsp;&nbsp;
			<a disabled=""""),_display_(/*60.18*/dica/*60.22*/.isDicaFechada()),format.raw/*60.38*/("""" class="acaoRota linkDiscordar" data-toggle="modal" data-target="#discordar">Discordar</a> <img src="/assets/images/curtir_icon.jpg"/>"""),_display_(/*60.174*/dica/*60.178*/.getQuantDiscordancias()),format.raw/*60.202*/("""&nbsp;&nbsp;
			<p> Índicie de concordância </p>"""),_display_(/*61.37*/dica/*61.41*/.getIndiceConcordancia()),format.raw/*61.65*/("""
			"""),format.raw/*62.4*/("""<a onClick="location.href='"""),_display_(/*62.32*/routes/*62.38*/.TemaController.denunciar(tema.getIdString(),dica.getIdDicaString())),format.raw/*62.106*/("""'" class="acaoRota linkDenunciar">Denunciar </a>"""),_display_(/*62.155*/dica/*62.159*/.getQuantDenuncias()),format.raw/*62.179*/("""
			"""),format.raw/*63.4*/("""<legend></legend>
		

			<div class="modal fade" id="discordar">
				<div class="modal-dialog">
					<div class="modal-content">
						<div class="modal-header">
							<button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
							<h4 class="modal-title">Por que você discorda?</h4>
						</div>
						<div class="modal-body">
							<form class="form-horizontal" method="POST" role="form"  id="formDiscordar"  action="/discordar">
								<input type="hidden"  name="idDica" value=""""),_display_(/*75.53*/dica/*75.57*/.getIdDicaString()),format.raw/*75.75*/("""" />
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
			""")))}),format.raw/*89.5*/("""
		""")))}),format.raw/*90.4*/("""	
"""),format.raw/*91.1*/("""</div>




""")))}),format.raw/*96.2*/("""

"""))}
  }

  def render(user:Usuario,tema:models.Tema): play.twirl.api.HtmlFormat.Appendable = apply(user,tema)

  def f:((Usuario,models.Tema) => play.twirl.api.HtmlFormat.Appendable) = (user,tema) => apply(user,tema)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Sun Mar 22 19:00:47 BRT 2015
                  SOURCE: C:/Users/Daniela/Documents/CC/projetosi1-vespera/ProjetoSI1/app/views/dicasTema.scala.html
                  HASH: e8896f969617276d0c9a98f4e99007e2d9dac201
                  MATRIX: 740->1|862->35|892->40|923->63|961->64|991->69|1031->89|1059->91|1278->283|1291->287|1322->297|2222->1171|2249->1189|2288->1190|2319->1194|2377->1234|2389->1238|2427->1239|2459->1245|2503->1273|2542->1274|2574->1279|2626->1304|2639->1308|2674->1322|2710->1332|2750->1351|2784->1359|2840->1399|2879->1400|2912->1406|2964->1431|2977->1435|3008->1445|3051->1461|3064->1465|3117->1497|3163->1513|3200->1523|3255->1551|3270->1557|3340->1606|3382->1620|3396->1624|3434->1640|3554->1732|3568->1736|3614->1760|3672->1791|3685->1795|3722->1811|3886->1947|3900->1951|3946->1975|4023->2025|4036->2029|4081->2053|4113->2058|4168->2086|4183->2092|4273->2160|4350->2209|4364->2213|4406->2233|4438->2238|5031->2804|5044->2808|5083->2826|5708->3421|5743->3426|5773->3429|5820->3446
                  LINES: 26->1|29->1|31->3|31->3|31->3|33->5|33->5|34->6|39->11|39->11|39->11|74->46|74->46|74->46|75->47|76->48|76->48|76->48|77->49|77->49|77->49|78->50|78->50|78->50|78->50|79->51|79->51|81->53|81->53|81->53|82->54|82->54|82->54|82->54|83->55|83->55|83->55|85->57|87->59|87->59|87->59|87->59|87->59|87->59|87->59|87->59|87->59|87->59|88->60|88->60|88->60|88->60|88->60|88->60|89->61|89->61|89->61|90->62|90->62|90->62|90->62|90->62|90->62|90->62|91->63|103->75|103->75|103->75|117->89|118->90|119->91|124->96
                  -- GENERATED --
              */
          