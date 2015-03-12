
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
	
"""),format.raw/*3.1*/("""<!DOCTYPE html>
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
    <meta charset="utf-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <title>Portal do Leite</title>
  
        <link rel="stylesheet" media="screen" href=""""),_display_(/*10.54*/routes/*10.60*/.Assets.at("stylesheets/main.css")),format.raw/*10.94*/("""">
        <link rel="stylesheet" media="screen" href=""""),_display_(/*11.54*/routes/*11.60*/.Assets.at("stylesheets/bootstrap.css")),format.raw/*11.99*/("""">
		<link rel="stylesheet" media="screen" href=""""),_display_(/*12.48*/routes/*12.54*/.Assets.at("stylesheets/font-awesome.css")),format.raw/*12.96*/("""">
		<link rel="stylesheet" media="screen" href=""""),_display_(/*13.48*/routes/*13.54*/.Assets.at("javascripts/morris-0.4.3.min.css")),format.raw/*13.100*/("""">
        <link rel="stylesheet" media="screen" href=""""),_display_(/*14.54*/routes/*14.60*/.Assets.at("stylesheets/custom.css")),format.raw/*14.96*/("""">
		<script src=""""),_display_(/*15.17*/routes/*15.23*/.Assets.at("javascripts/hello.js")),format.raw/*15.57*/("""" type="text/javascript"></script>

        
        <link rel="shortcut icon" type="image/png" href=""""),_display_(/*18.59*/routes/*18.65*/.Assets.at("images/favicon.png")),format.raw/*18.97*/("""">
		
		  <!-- GOOGLE FONTS-->
		<link href='http://fonts.googleapis.com/css?family=Open+Sans' rel='stylesheet' type='text/css' /> 
         
</head>

<body>
    <div id="wrapper">
        <nav class="navbar navbar-default navbar-cls-top " role="navigation" style="margin-bottom: 0">
            <div class="navbar-header">
                <button type="button" class="navbar-toggle" data-toggle="collapse" data-target=".sidebar-collapse">
                    <span class="sr-only">Toggle navigation</span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                </button>
                <a class="navbar-brand" href="index.html">Portal do leite</a> 
            </div>
  <div style="color: white;
padding: 15px 50px 5px 50px;
float: right;
font-size: 16px;"> Last access : 30 May 2014 &nbsp; <a href="#" class="btn btn-danger square-btn-adjust">Logout</a> </div>
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
    
	<script src=""""),_display_(/*126.16*/routes/*126.22*/.Assets.at("javascripts/jquery-1.10.2.js")),format.raw/*126.64*/("""" type="text/javascript"></script>
	<script src=""""),_display_(/*127.16*/routes/*127.22*/.Assets.at("javascripts/bootstrap.min.js")),format.raw/*127.64*/("""" type="text/javascript"></script>
	<script src=""""),_display_(/*128.16*/routes/*128.22*/.Assets.at("javascripts/jquery.metisMenu.js")),format.raw/*128.67*/("""" type="text/javascript"></script>
    <script src=""""),_display_(/*129.19*/routes/*129.25*/.Assets.at("javascripts/raphael-2.1.0.min.js")),format.raw/*129.71*/("""" type="text/javascript"></script>
    <script src=""""),_display_(/*130.19*/routes/*130.25*/.Assets.at("javascripts/morris.js")),format.raw/*130.60*/("""" type="text/javascript"></script>
	<script src=""""),_display_(/*131.16*/routes/*131.22*/.Assets.at("javascripts/custom.js")),format.raw/*131.57*/("""" type="text/javascript"></script>
</body>
</html>"""))}
  }

  def render(message:String): play.twirl.api.HtmlFormat.Appendable = apply(message)

  def f:((String) => play.twirl.api.HtmlFormat.Appendable) = (message) => apply(message)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Thu Mar 12 14:43:47 BRT 2015
                  SOURCE: /home/andrezarmq/Documentos/ProjetoSI1/app/views/index.scala.html
                  HASH: 81596396256b6a375744fde16a39975676241c4a
                  MATRIX: 723->1|828->18|857->21|1148->285|1163->291|1218->325|1301->381|1316->387|1376->426|1453->476|1468->482|1531->524|1608->574|1623->580|1691->626|1774->682|1789->688|1846->724|1892->743|1907->749|1962->783|2092->886|2107->892|2160->924|6317->5053|6333->5059|6397->5101|6475->5151|6491->5157|6555->5199|6633->5249|6649->5255|6716->5300|6797->5353|6813->5359|6881->5405|6962->5458|6978->5464|7035->5499|7113->5549|7129->5555|7186->5590
                  LINES: 26->1|29->1|31->3|38->10|38->10|38->10|39->11|39->11|39->11|40->12|40->12|40->12|41->13|41->13|41->13|42->14|42->14|42->14|43->15|43->15|43->15|46->18|46->18|46->18|154->126|154->126|154->126|155->127|155->127|155->127|156->128|156->128|156->128|157->129|157->129|157->129|158->130|158->130|158->130|159->131|159->131|159->131
                  -- GENERATED --
              */
          