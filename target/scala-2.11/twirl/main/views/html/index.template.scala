
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
object index extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(message: String):play.twirl.api.HtmlFormat.Appendable = {
      _display_ {

Seq[Any](format.raw/*1.19*/("""

"""),_display_(/*3.2*/main("Portal do Leite")/*3.25*/ {_display_(Seq[Any](format.raw/*3.27*/("""
"""),format.raw/*4.1*/("""<div id="wrapper">
	    <nav class="navbar navbar-default navbar-cls-top " role="navigation" style="margin-bottom: 0">
	<div class="navbar-header">
	    <button type="button" class="navbar-toggle" data-toggle="collapse" data-target=".sidebar-collapse">
	        <span class="sr-only">Toggle navigation</span>
	        <span class="icon-bar"></span>
	        <span class="icon-bar"></span>
	        <span class="icon-bar"></span>
	    </button>
	    <a class="navbar-brand" href="#">Portal do leite</a> 
</div>
 <div style="color: white; padding: 15px 50px 5px 50px; float: right;font-size: 16px;"> Last access : 30 May 2014 &nbsp; 
 
 	<button class="btn btn-danger navbar-btn" onclick="location.href='/logout'">
	<span class="glyphicon glyphicon-log-out"></span>
	</button>
</div>
        </nav>   
           <!-- /. NAV TOP  -->
                <nav class="navbar-default navbar-side" role="navigation">
            <div class="sidebar-collapse">
                <ul class="nav" id="main-menu">
				<li class="text-center">
           
					</li>
				
					
                    <li>
                        <a class="active-menu"  href="">Análise x Design </a>
                    </li>
                     <li>
                        <a  href="">Orientação a Objetos</a>
                    </li>
                    <li>
                        <a  href="">Padrões de Projeto GRASP</a>
                    </li>
						   <li  >
                        <a   href="">Padrões de Projeto Gof</a>
                    </li>	
                      <li  >
                        <a  href="">Arquitetura de Software</a>
                    </li>
                    <li  >
                        <a  href="">Play Framework</a>
                    </li>		
					 <li  >
                        <a  href="">Java Script </a>
                    </li>		
					 <li  >
                        <a  href="">HTML + CSS + Bootstrap </a>
                    </li>		
					 <li  >
                        <a  href="">Heroku </a>
                    </li>		
					 <li  >
                        <a  href="">Laboratórios </a>
                    </li>		
					 <li  >
                        <a  href="">Minitestes </a>
                    </li>
					 <li  >
                        <a  href="">Projeto </a>
                    </li>
				   
					
					<!---             
                    <li>
                        <a href="#"><i class="fa fa-sitemap fa-3x"></i> Multi-Level Dropdown<span class="fa arrow"></span></a>
                        <ul class="nav nav-second-level">
                            <li>
                                <a href="#">Second Level Link</a>
                            </li>
                            <li>
                                <a href="#">Second Level Link</a>
                            </li>
                            <li>
                                <a href="#">Second Level Link<span class="fa arrow"></span></a>
                                <ul class="nav nav-third-level">
                                    <li>
                                        <a href="#">Third Level Link</a>
                                    </li>
                                    <li>
                                        <a href="#">Third Level Link</a>
                                    </li>
                                    <li>
                                        <a href="#">Third Level Link</a>
                                    </li>
                                </ul>
                               
                            </li>
                        </ul>
                      </li>  -->
                 <!-- <li  >
                        <a  href="blank.html"><i class="fa fa-square-o fa-3x"></i> Blank Page</a>
                    </li>	
                </ul> --->
               
            </div>
            
        
        </div>
    
	<script src=""""),_display_(/*106.16*/routes/*106.22*/.Assets.at("javascripts/jquery-1.10.2.js")),format.raw/*106.64*/("""" type="text/javascript"></script>
	<script src=""""),_display_(/*107.16*/routes/*107.22*/.Assets.at("javascripts/bootstrap.min.js")),format.raw/*107.64*/("""" type="text/javascript"></script>
	<script src=""""),_display_(/*108.16*/routes/*108.22*/.Assets.at("javascripts/jquery.metisMenu.js")),format.raw/*108.67*/("""" type="text/javascript"></script>
    <script src=""""),_display_(/*109.19*/routes/*109.25*/.Assets.at("javascripts/raphael-2.1.0.min.js")),format.raw/*109.71*/("""" type="text/javascript"></script>
    <script src=""""),_display_(/*110.19*/routes/*110.25*/.Assets.at("javascripts/morris.js")),format.raw/*110.60*/("""" type="text/javascript"></script>
	<script src=""""),_display_(/*111.16*/routes/*111.22*/.Assets.at("javascripts/custom.js")),format.raw/*111.57*/("""" type="text/javascript"></script>
""")))}))}
  }

  def render(message:String): play.twirl.api.HtmlFormat.Appendable = apply(message)

  def f:((String) => play.twirl.api.HtmlFormat.Appendable) = (message) => apply(message)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Thu Mar 12 15:18:16 BRT 2015
                  SOURCE: /home/andrezarmq/Documentos/ProjetoSI1/app/views/index.scala.html
                  HASH: 805860cc13339b4d0958543e25f49134f76c807c
                  MATRIX: 723->1|828->18|856->21|887->44|926->46|953->47|4914->3980|4930->3986|4994->4028|5072->4078|5088->4084|5152->4126|5230->4176|5246->4182|5313->4227|5394->4280|5410->4286|5478->4332|5559->4385|5575->4391|5632->4426|5710->4476|5726->4482|5783->4517
                  LINES: 26->1|29->1|31->3|31->3|31->3|32->4|134->106|134->106|134->106|135->107|135->107|135->107|136->108|136->108|136->108|137->109|137->109|137->109|138->110|138->110|138->110|139->111|139->111|139->111
                  -- GENERATED --
              */
          