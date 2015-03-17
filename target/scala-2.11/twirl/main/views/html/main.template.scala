
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
	    <link rel="shortcut icon" type="image/png" href=""""),_display_(/*28.56*/routes/*28.62*/.Assets.at("images/star2.jpg")),format.raw/*28.92*/("""">
	    
		
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
                  DATE: Tue Mar 17 17:46:18 BRT 2015
                  SOURCE: /home/mariadch/ProjetoSI/ProjetoSI1/app/views/main.scala.html
                  HASH: 3a19af8896570d5f3f213656be0a4bcb3d8725de
                  MATRIX: 727->1|845->31|874->34|978->112|1003->117|1207->294|1222->300|1293->349|1370->399|1385->405|1449->448|1526->498|1541->504|1609->550|1686->600|1701->606|1769->652|1846->702|1861->708|1917->743|1963->762|1978->768|2044->813|2122->864|2137->870|2200->912|2278->963|2293->969|2359->1014|2442->1070|2457->1076|2508->1106|2594->1165|2609->1171|2669->1210|2746->1260|2761->1266|2824->1308|2901->1358|2916->1364|2984->1410|3064->1463|3079->1469|3136->1505|3230->1572|3245->1578|3298->1610|3383->1668|3398->1674|3449->1704|3647->1876|3675->1883|3705->1886|3764->1918|3779->1924|3836->1960|3914->2011|3929->2017|3992->2059|4070->2110|4085->2116|4148->2158|4226->2209|4241->2215|4307->2260|4385->2311|4400->2317|4467->2363|4545->2414|4560->2420|4616->2455|4694->2506|4709->2512|4765->2547
                  LINES: 26->1|29->1|31->3|34->6|34->6|39->11|39->11|39->11|40->12|40->12|40->12|41->13|41->13|41->13|42->14|42->14|42->14|43->15|43->15|43->15|44->16|44->16|44->16|45->17|45->17|45->17|46->18|46->18|46->18|47->19|47->19|47->19|50->22|50->22|50->22|51->23|51->23|51->23|52->24|52->24|52->24|53->25|53->25|53->25|55->27|55->27|55->27|56->28|56->28|56->28|67->39|67->39|68->40|70->42|70->42|70->42|71->43|71->43|71->43|72->44|72->44|72->44|73->45|73->45|73->45|74->46|74->46|74->46|75->47|75->47|75->47|76->48|76->48|76->48
                  -- GENERATED --
              */
          