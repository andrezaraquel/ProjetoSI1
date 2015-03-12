
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
object main extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template2[String,Html,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(title: String)(content: Html):play.twirl.api.HtmlFormat.Appendable = {
      _display_ {

Seq[Any](format.raw/*1.32*/("""
	
"""),format.raw/*3.1*/("""<!DOCTYPE html>
<html xmlns="http://www.w3.org/1999/xhtml">
	<head>
		<title>"""),_display_(/*6.11*/title),format.raw/*6.16*/("""</title>
	    <meta charset="utf-8" />
	    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
	     
	    
		<link rel="stylesheet" media="screen" href=""""),_display_(/*11.48*/routes/*11.54*/.Assets.at("stylesheets/bootstrap-theme.min.css")),format.raw/*11.103*/("""">
		<link rel="stylesheet" media="screen" href=""""),_display_(/*12.48*/routes/*12.54*/.Assets.at("stylesheets/bootstrap.min.css")),format.raw/*12.97*/("""">
		<link rel="stylesheet" media="screen" href=""""),_display_(/*13.48*/routes/*13.54*/.Assets.at("stylesheets/font-awesome.min.css")),format.raw/*13.100*/("""">
		<link rel="stylesheet" media="screen" href=""""),_display_(/*14.48*/routes/*14.54*/.Assets.at("stylesheets/bootstrap-notify.css")),format.raw/*14.100*/("""">
		<script src=""""),_display_(/*15.17*/routes/*15.23*/.Assets.at("javascripts/jquery-2.1.1.min.js")),format.raw/*15.68*/("""" type="text/javascript"></script>
		<script src=""""),_display_(/*16.17*/routes/*16.23*/.Assets.at("javascripts/bootstrap.min.js")),format.raw/*16.65*/("""" type="text/javascript"></script>
		<script src=""""),_display_(/*17.17*/routes/*17.23*/.Assets.at("javascripts/bootstrap-notify.js")),format.raw/*17.68*/("""" type="text/javascript"></script>
		<body background=""""),_display_(/*18.22*/routes/*18.28*/.Assets.at("images/fundo.jpg")),format.raw/*18.58*/(""""> 
	
	    <link rel="stylesheet" media="screen" href=""""),_display_(/*20.51*/routes/*20.57*/.Assets.at("stylesheets/bootstrap.css")),format.raw/*20.96*/("""">
		<link rel="stylesheet" media="screen" href=""""),_display_(/*21.48*/routes/*21.54*/.Assets.at("stylesheets/font-awesome.css")),format.raw/*21.96*/("""">
		<link rel="stylesheet" media="screen" href=""""),_display_(/*22.48*/routes/*22.54*/.Assets.at("javascripts/morris-0.4.3.min.css")),format.raw/*22.100*/("""">
	    <link rel="stylesheet" media="screen" href=""""),_display_(/*23.51*/routes/*23.57*/.Assets.at("stylesheets/custom.css")),format.raw/*23.93*/("""">
	       
	    <link rel="shortcut icon" type="image/png" href=""""),_display_(/*25.56*/routes/*25.62*/.Assets.at("images/favicon.png")),format.raw/*25.94*/("""">
		
		<!-- GOOGLE FONTS-->
		<link href='http://fonts.googleapis.com/css?family=Open+Sans' rel='stylesheet' type='text/css' /> 
		
		   
		<script src=""""),_display_(/*31.17*/routes/*31.23*/.Assets.at("javascripts/jquery-1.10.2.js")),format.raw/*31.65*/("""" type="text/javascript"></script>
		<script src=""""),_display_(/*32.17*/routes/*32.23*/.Assets.at("javascripts/bootstrap.min.js")),format.raw/*32.65*/("""" type="text/javascript"></script>
		<script src=""""),_display_(/*33.17*/routes/*33.23*/.Assets.at("javascripts/jquery.metisMenu.js")),format.raw/*33.68*/("""" type="text/javascript"></script>
		<script src=""""),_display_(/*34.17*/routes/*34.23*/.Assets.at("javascripts/raphael-2.1.0.min.js")),format.raw/*34.69*/("""" type="text/javascript"></script>
		<script src=""""),_display_(/*35.17*/routes/*35.23*/.Assets.at("javascripts/morris.js")),format.raw/*35.58*/("""" type="text/javascript"></script>
		<script src=""""),_display_(/*36.17*/routes/*36.23*/.Assets.at("javascripts/custom.js")),format.raw/*36.58*/("""" type="text/javascript"></script>
	         
	</head>

	<body>
		<div>
			"""),_display_(/*42.5*/content),format.raw/*42.12*/("""
		"""),format.raw/*43.3*/("""</div>
	</body>
</html>"""))}
  }

  def render(title:String,content:Html): play.twirl.api.HtmlFormat.Appendable = apply(title)(content)

  def f:((String) => (Html) => play.twirl.api.HtmlFormat.Appendable) = (title) => (content) => apply(title)(content)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Thu Mar 12 16:26:34 BRT 2015
                  SOURCE: /home/andrezarmq/Documentos/ProjetoSI1/app/views/main.scala.html
                  HASH: a1ed26d0ed179efe8bf9704a2220b5e02b408154
                  MATRIX: 727->1|845->31|874->34|978->112|1003->117|1207->294|1222->300|1293->349|1370->399|1385->405|1449->448|1526->498|1541->504|1609->550|1686->600|1701->606|1769->652|1815->671|1830->677|1896->722|1974->773|1989->779|2052->821|2130->872|2145->878|2211->923|2294->979|2309->985|2360->1015|2443->1071|2458->1077|2518->1116|2595->1166|2610->1172|2673->1214|2750->1264|2765->1270|2833->1316|2913->1369|2928->1375|2985->1411|3079->1478|3094->1484|3147->1516|3329->1671|3344->1677|3407->1719|3485->1770|3500->1776|3563->1818|3641->1869|3656->1875|3722->1920|3800->1971|3815->1977|3882->2023|3960->2074|3975->2080|4031->2115|4109->2166|4124->2172|4180->2207|4282->2283|4310->2290|4340->2293
                  LINES: 26->1|29->1|31->3|34->6|34->6|39->11|39->11|39->11|40->12|40->12|40->12|41->13|41->13|41->13|42->14|42->14|42->14|43->15|43->15|43->15|44->16|44->16|44->16|45->17|45->17|45->17|46->18|46->18|46->18|48->20|48->20|48->20|49->21|49->21|49->21|50->22|50->22|50->22|51->23|51->23|51->23|53->25|53->25|53->25|59->31|59->31|59->31|60->32|60->32|60->32|61->33|61->33|61->33|62->34|62->34|62->34|63->35|63->35|63->35|64->36|64->36|64->36|70->42|70->42|71->43
                  -- GENERATED --
              */
          