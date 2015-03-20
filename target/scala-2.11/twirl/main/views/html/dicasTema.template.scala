
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
			"""),_display_(/*50.5*/if(!tema.removeDica(dica))/*50.31*/{_display_(Seq[Any](format.raw/*50.32*/("""			
				"""),format.raw/*51.5*/("""<p>"""),_display_(/*51.9*/dica/*51.13*/.getNameUser()),format.raw/*51.27*/("""</p>
				"""),_display_(/*52.6*/Html(dica.exibir())),format.raw/*52.25*/("""
			
				"""),format.raw/*54.5*/("""<a onClick="location.href='"""),_display_(/*54.33*/routes/*54.39*/.TemaController.concordar(dica.getIdString())),format.raw/*54.84*/("""'">Concordar</a> <img src="/assets/images/curtir_icon.jpg" />"""),_display_(/*54.146*/dica/*54.150*/.getQuantConcordancia()),format.raw/*54.173*/("""&nbsp;&nbsp;
				<a onClick="location.href='"""),_display_(/*55.33*/routes/*55.39*/.TemaController.discordar(dica.getIdString())),format.raw/*55.84*/("""'">Discordar</a> <img src="/assets/images/curtir_icon.jpg"/>"""),_display_(/*55.145*/dica/*55.149*/.getQuantDiscordancia()),format.raw/*55.172*/("""&nbsp;&nbsp;
				<a onClick="location.href='"""),_display_(/*56.33*/routes/*56.39*/.TemaController.denunciar(dica.getIdString())),format.raw/*56.84*/("""'"  data-toggle="modal" data-target="#denunciar">Denunciar </a>"""),_display_(/*56.148*/dica/*56.152*/.getQuantDenuncia()),format.raw/*56.171*/("""
				"""),format.raw/*57.5*/("""<legend></legend>
							
			""")))}),format.raw/*59.5*/("""		

		""")))}),format.raw/*61.4*/("""	
	""")))}),format.raw/*62.3*/("""
	
"""),format.raw/*64.1*/("""</div>

<!-- Modal  Denunciar dica -->

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
                  DATE: Fri Mar 20 17:07:02 BRT 2015
                  SOURCE: /home/mariadch/projetosi1-20/ProjetoSI1/app/views/dicasTema.scala.html
                  HASH: 6e123cfa33c5608ca9003618b4344b2028766915
                  MATRIX: 740->1|862->35|890->38|921->61|959->62|987->65|1027->85|1054->86|1268->273|1281->277|1312->287|2177->1126|2204->1144|2243->1145|2273->1148|2330->1187|2342->1191|2380->1192|2411->1197|2455->1225|2494->1226|2525->1231|2560->1257|2599->1258|2634->1266|2664->1270|2677->1274|2712->1288|2748->1298|2788->1317|2824->1326|2879->1354|2894->1360|2960->1405|3050->1467|3064->1471|3109->1494|3181->1539|3196->1545|3262->1590|3351->1651|3365->1655|3410->1678|3482->1723|3497->1729|3563->1774|3655->1838|3669->1842|3710->1861|3742->1866|3802->1896|3839->1903|3873->1907|3903->1910
                  LINES: 26->1|29->1|31->3|31->3|31->3|33->5|33->5|34->6|39->11|39->11|39->11|74->46|74->46|74->46|75->47|76->48|76->48|76->48|77->49|77->49|77->49|78->50|78->50|78->50|79->51|79->51|79->51|79->51|80->52|80->52|82->54|82->54|82->54|82->54|82->54|82->54|82->54|83->55|83->55|83->55|83->55|83->55|83->55|84->56|84->56|84->56|84->56|84->56|84->56|85->57|87->59|89->61|90->62|92->64
                  -- GENERATED --
              */
          