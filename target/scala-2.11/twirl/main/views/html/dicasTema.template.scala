
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
			"""),format.raw/*50.4*/("""<p>"""),_display_(/*50.8*/dica/*50.12*/.getNameUser()),format.raw/*50.26*/("""</p>
			"""),_display_(/*51.5*/Html(dica.exibir())),format.raw/*51.24*/("""
		
			"""),format.raw/*53.4*/("""<a onClick="location.href='"""),_display_(/*53.32*/routes/*53.38*/.TemaController.concordar(dica.getIdDicaString())),format.raw/*53.87*/("""'"  class="acaoRota linkConcordar">Concordar</a> <img src="/assets/images/curtir_icon.jpg" />"""),_display_(/*53.181*/dica/*53.185*/.getQuantConcordancias()),format.raw/*53.209*/("""&nbsp;&nbsp;
			<a onClick="location.href='"""),_display_(/*54.32*/routes/*54.38*/.TemaController.discordar(dica.getIdDicaString())),format.raw/*54.87*/("""'" class="acaoRota linkDiscordar">Discordar</a> <img src="/assets/images/curtir_icon.jpg"/>"""),_display_(/*54.179*/dica/*54.183*/.getQuantDiscordancias()),format.raw/*54.207*/("""&nbsp;&nbsp;
			<a onClick="location.href='"""),_display_(/*55.32*/routes/*55.38*/.TemaController.denunciar(tema.getIdString(),dica.getIdDicaString())),format.raw/*55.106*/("""'" class="acaoRota linkDenunciar" data-toggle="modal" data-target="#denunciar">Denunciar </a>"""),_display_(/*55.200*/dica/*55.204*/.getQuantDenuncias()),format.raw/*55.224*/("""
			"""),format.raw/*56.4*/("""<legend></legend>
		""")))}),format.raw/*57.4*/("""	
	""")))}),format.raw/*58.3*/("""
	
"""),format.raw/*60.1*/("""</div>

<!-- Modal  Denunciar dica -->

<div id="denunciar" class="modal fade "> <!--1-->
    <div class="modal-dialog centralizarModal"><!--2-->
        <div class="modal-content"><!--3-->
            <div class="modal-header"><!--4-->
                <button type="button" class="close" data-dismiss="modal" aria-hidden="true">&times;</button>
                <h4 class="modal-title">Informe-nos o que estÃ¡ acontecendo</h4>				
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
			    <!--  Preciso do id da dica, como pegar?  Para colocar dentro de denunciar, concordar e discordar-->
			</div>	
			
         </div> <!--3-->
    </div> <!--2-->
</div><!--1-->

""")))}))}
  }

  def render(user:Usuario,tema:models.Tema): play.twirl.api.HtmlFormat.Appendable = apply(user,tema)

  def f:((Usuario,models.Tema) => play.twirl.api.HtmlFormat.Appendable) = (user,tema) => apply(user,tema)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Sat Mar 21 00:23:10 BRT 2015
                  SOURCE: C:/Users/Andreza/Desktop/projetoSI/ProjetoSI1/app/views/dicasTema.scala.html
                  HASH: 50c9ce1b46e0cf238275c915dbe3ca6ca76d4632
                  MATRIX: 740->1|862->35|892->40|923->63|961->64|991->69|1031->89|1059->91|1278->283|1291->287|1322->297|2222->1171|2249->1189|2288->1190|2319->1194|2377->1234|2389->1238|2427->1239|2459->1245|2503->1273|2542->1274|2574->1279|2604->1283|2617->1287|2652->1301|2688->1311|2728->1330|2764->1339|2819->1367|2834->1373|2904->1422|3026->1516|3040->1520|3086->1544|3158->1589|3173->1595|3243->1644|3363->1736|3377->1740|3423->1764|3495->1809|3510->1815|3600->1883|3722->1977|3736->1981|3778->2001|3810->2006|3862->2028|3897->2033|3929->2038
                  LINES: 26->1|29->1|31->3|31->3|31->3|33->5|33->5|34->6|39->11|39->11|39->11|74->46|74->46|74->46|75->47|76->48|76->48|76->48|77->49|77->49|77->49|78->50|78->50|78->50|78->50|79->51|79->51|81->53|81->53|81->53|81->53|81->53|81->53|81->53|82->54|82->54|82->54|82->54|82->54|82->54|83->55|83->55|83->55|83->55|83->55|83->55|84->56|85->57|86->58|88->60
                  -- GENERATED --
              */
          