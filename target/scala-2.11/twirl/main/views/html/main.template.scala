
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
                  DATE: Fri Mar 13 18:50:11 BRT 2015
                  SOURCE: C:/Users/Daniela/Documents/siProjeto/ProjetoSI1/app/views/main.scala.html
                  HASH: 7d0a7adf5ccf19ca43900e15873be4cf8fcca785
                  MATRIX: 727->1|845->31|876->36|983->117|1008->122|1217->304|1232->310|1303->359|1381->410|1396->416|1460->459|1538->510|1553->516|1621->562|1699->613|1714->619|1782->665|1829->685|1844->691|1910->736|1989->788|2004->794|2067->836|2146->888|2161->894|2227->939|2311->996|2326->1002|2377->1032|2462->1090|2477->1096|2537->1135|2615->1186|2630->1192|2693->1234|2771->1285|2786->1291|2854->1337|2935->1391|2950->1397|3007->1433|3103->1502|3118->1508|3171->1540|3359->1701|3374->1707|3437->1749|3516->1801|3531->1807|3594->1849|3673->1901|3688->1907|3754->1952|3833->2004|3848->2010|3915->2056|3994->2108|4009->2114|4065->2149|4144->2201|4159->2207|4215->2242|4323->2324|4351->2331|4382->2335
                  LINES: 26->1|29->1|31->3|34->6|34->6|39->11|39->11|39->11|40->12|40->12|40->12|41->13|41->13|41->13|42->14|42->14|42->14|43->15|43->15|43->15|44->16|44->16|44->16|45->17|45->17|45->17|46->18|46->18|46->18|48->20|48->20|48->20|49->21|49->21|49->21|50->22|50->22|50->22|51->23|51->23|51->23|53->25|53->25|53->25|59->31|59->31|59->31|60->32|60->32|60->32|61->33|61->33|61->33|62->34|62->34|62->34|63->35|63->35|63->35|64->36|64->36|64->36|70->42|70->42|71->43
                  -- GENERATED --
              */
          