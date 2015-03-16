
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
		<link rel="stylesheet" media="screen" href=""""),_display_(/*15.48*/routes/*15.54*/.Assets.at("stylesheets/style.css")),format.raw/*15.89*/("""">
		<script src=""""),_display_(/*16.17*/routes/*16.23*/.Assets.at("javascripts/jquery-2.1.1.min.js")),format.raw/*16.68*/("""" type="text/javascript"></script>
		<script src=""""),_display_(/*17.17*/routes/*17.23*/.Assets.at("javascripts/bootstrap.min.js")),format.raw/*17.65*/("""" type="text/javascript"></script>
		<script src=""""),_display_(/*18.17*/routes/*18.23*/.Assets.at("javascripts/bootstrap-notify.js")),format.raw/*18.68*/("""" type="text/javascript"></script>
		<body background=""""),_display_(/*19.22*/routes/*19.28*/.Assets.at("images/fundo.jpg")),format.raw/*19.58*/(""""> 
		
	
	    <link rel="stylesheet" media="screen" href=""""),_display_(/*22.51*/routes/*22.57*/.Assets.at("stylesheets/bootstrap.css")),format.raw/*22.96*/("""">
		<link rel="stylesheet" media="screen" href=""""),_display_(/*23.48*/routes/*23.54*/.Assets.at("stylesheets/font-awesome.css")),format.raw/*23.96*/("""">
		<link rel="stylesheet" media="screen" href=""""),_display_(/*24.48*/routes/*24.54*/.Assets.at("javascripts/morris-0.4.3.min.css")),format.raw/*24.100*/("""">
	    <link rel="stylesheet" media="screen" href=""""),_display_(/*25.51*/routes/*25.57*/.Assets.at("stylesheets/custom.css")),format.raw/*25.93*/("""">
	       
	    <link rel="shortcut icon" type="image/png" href=""""),_display_(/*27.56*/routes/*27.62*/.Assets.at("images/favicon.png")),format.raw/*27.94*/("""">
	    <link rel="shortcut icon" type="image/png" href=""""),_display_(/*28.56*/routes/*28.62*/.Assets.at("images/icon_estrela.png")),format.raw/*28.99*/("""">
	    
		
		<!-- GOOGLE FONTS-->
		<link href='http://fonts.googleapis.com/css?family=Open+Sans' rel='stylesheet' type='text/css' /> 
		
		
	</head>

	<body>
		<div>
			"""),_display_(/*39.5*/content),format.raw/*39.12*/("""
		"""),format.raw/*40.3*/("""</div>
	</body>
		<script src=""""),_display_(/*42.17*/routes/*42.23*/.Assets.at("javascripts/scripts.js")),format.raw/*42.59*/("""" type="text/javascript"></script>
		<script src=""""),_display_(/*43.17*/routes/*43.23*/.Assets.at("javascripts/jquery-1.10.2.js")),format.raw/*43.65*/("""" type="text/javascript"></script>
		<script src=""""),_display_(/*44.17*/routes/*44.23*/.Assets.at("javascripts/bootstrap.min.js")),format.raw/*44.65*/("""" type="text/javascript"></script>
		<script src=""""),_display_(/*45.17*/routes/*45.23*/.Assets.at("javascripts/jquery.metisMenu.js")),format.raw/*45.68*/("""" type="text/javascript"></script>
		<script src=""""),_display_(/*46.17*/routes/*46.23*/.Assets.at("javascripts/raphael-2.1.0.min.js")),format.raw/*46.69*/("""" type="text/javascript"></script>
		<script src=""""),_display_(/*47.17*/routes/*47.23*/.Assets.at("javascripts/morris.js")),format.raw/*47.58*/("""" type="text/javascript"></script>
		<script src=""""),_display_(/*48.17*/routes/*48.23*/.Assets.at("javascripts/custom.js")),format.raw/*48.58*/("""" type="text/javascript"></script>
	         
</html>"""))}
  }

  def render(title:String,content:Html): play.twirl.api.HtmlFormat.Appendable = apply(title)(content)

  def f:((String) => (Html) => play.twirl.api.HtmlFormat.Appendable) = (title) => (content) => apply(title)(content)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Mon Mar 16 20:18:42 BRT 2015
                  SOURCE: C:/Users/Daniela/Documents/CC/projetosi-16/ProjetoSI1/app/views/main.scala.html
                  HASH: 38dd0123f48cd7f2b562e9e94249868ccac72cd2
                  MATRIX: 727->1|845->31|876->36|983->117|1008->122|1217->304|1232->310|1303->359|1381->410|1396->416|1460->459|1538->510|1553->516|1621->562|1699->613|1714->619|1782->665|1860->716|1875->722|1931->757|1978->777|1993->783|2059->828|2138->880|2153->886|2216->928|2295->980|2310->986|2376->1031|2460->1088|2475->1094|2526->1124|2615->1186|2630->1192|2690->1231|2768->1282|2783->1288|2846->1330|2924->1381|2939->1387|3007->1433|3088->1487|3103->1493|3160->1529|3256->1598|3271->1604|3324->1636|3410->1695|3425->1701|3483->1738|3692->1921|3720->1928|3751->1932|3812->1966|3827->1972|3884->2008|3963->2060|3978->2066|4041->2108|4120->2160|4135->2166|4198->2208|4277->2260|4292->2266|4358->2311|4437->2363|4452->2369|4519->2415|4598->2467|4613->2473|4669->2508|4748->2560|4763->2566|4819->2601
                  LINES: 26->1|29->1|31->3|34->6|34->6|39->11|39->11|39->11|40->12|40->12|40->12|41->13|41->13|41->13|42->14|42->14|42->14|43->15|43->15|43->15|44->16|44->16|44->16|45->17|45->17|45->17|46->18|46->18|46->18|47->19|47->19|47->19|50->22|50->22|50->22|51->23|51->23|51->23|52->24|52->24|52->24|53->25|53->25|53->25|55->27|55->27|55->27|56->28|56->28|56->28|67->39|67->39|68->40|70->42|70->42|70->42|71->43|71->43|71->43|72->44|72->44|72->44|73->45|73->45|73->45|74->46|74->46|74->46|75->47|75->47|75->47|76->48|76->48|76->48
                  -- GENERATED --
              */
          