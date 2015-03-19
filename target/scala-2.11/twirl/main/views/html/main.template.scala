
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
<html xmlns="http://www.w3.org/1999/xhtml" lang="pt-br">
	<head>
		<title>"""),_display_(/*6.11*/title),format.raw/*6.16*/("""</title>
	    <meta charset="utf-8" >
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
		
	
		<link rel="stylesheet" media="screen" href=""""),_display_(/*22.48*/routes/*22.54*/.Assets.at("stylesheets/font-awesome.css")),format.raw/*22.96*/("""">
		<link rel="stylesheet" media="screen" href=""""),_display_(/*23.48*/routes/*23.54*/.Assets.at("javascripts/morris-0.4.3.min.css")),format.raw/*23.100*/("""">
	    <link rel="stylesheet" media="screen" href=""""),_display_(/*24.51*/routes/*24.57*/.Assets.at("stylesheets/custom.css")),format.raw/*24.93*/("""">
	       
	    <link rel="shortcut icon" type="image/png" href=""""),_display_(/*26.56*/routes/*26.62*/.Assets.at("images/favicon.png")),format.raw/*26.94*/("""">
	    
		
		<!-- GOOGLE FONTS-->
		<link href='http://fonts.googleapis.com/css?family=Open+Sans' rel='stylesheet' type='text/css' /> 
		
		
	</head>

	<body>
		<div>
			"""),_display_(/*37.5*/content),format.raw/*37.12*/("""
		"""),format.raw/*38.3*/("""</div>
	</body>
		<script src=""""),_display_(/*40.17*/routes/*40.23*/.Assets.at("javascripts/scripts.js")),format.raw/*40.59*/("""" type="text/javascript"></script>
		<script src=""""),_display_(/*41.17*/routes/*41.23*/.Assets.at("javascripts/jquery-1.10.2.js")),format.raw/*41.65*/("""" type="text/javascript"></script>
		<script src=""""),_display_(/*42.17*/routes/*42.23*/.Assets.at("javascripts/bootstrap.min.js")),format.raw/*42.65*/("""" type="text/javascript"></script>
		<script src=""""),_display_(/*43.17*/routes/*43.23*/.Assets.at("javascripts/jquery.metisMenu.js")),format.raw/*43.68*/("""" type="text/javascript"></script>
		<script src=""""),_display_(/*44.17*/routes/*44.23*/.Assets.at("javascripts/raphael-2.1.0.min.js")),format.raw/*44.69*/("""" type="text/javascript"></script>
		<script src=""""),_display_(/*45.17*/routes/*45.23*/.Assets.at("javascripts/morris.js")),format.raw/*45.58*/("""" type="text/javascript"></script>
		<script src=""""),_display_(/*46.17*/routes/*46.23*/.Assets.at("javascripts/custom.js")),format.raw/*46.58*/("""" type="text/javascript"></script>
	         
</html>"""))}
  }

  def render(title:String,content:Html): play.twirl.api.HtmlFormat.Appendable = apply(title)(content)

  def f:((String) => (Html) => play.twirl.api.HtmlFormat.Appendable) = (title) => (content) => apply(title)(content)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Thu Mar 19 14:56:22 BRT 2015
                  SOURCE: /home/mariadch/projetosi-18/ProjetoSI1/app/views/main.scala.html
                  HASH: 493230d4a7a8cedb9cc3fbe507b053988d7f9278
                  MATRIX: 727->1|845->31|874->34|991->125|1016->130|1219->306|1234->312|1305->361|1382->411|1397->417|1461->460|1538->510|1553->516|1621->562|1698->612|1713->618|1781->664|1858->714|1873->720|1929->755|1975->774|1990->780|2056->825|2134->876|2149->882|2212->924|2290->975|2305->981|2371->1026|2454->1082|2469->1088|2520->1118|2603->1174|2618->1180|2681->1222|2758->1272|2773->1278|2841->1324|2921->1377|2936->1383|2993->1419|3087->1486|3102->1492|3155->1524|3353->1696|3381->1703|3411->1706|3470->1738|3485->1744|3542->1780|3620->1831|3635->1837|3698->1879|3776->1930|3791->1936|3854->1978|3932->2029|3947->2035|4013->2080|4091->2131|4106->2137|4173->2183|4251->2234|4266->2240|4322->2275|4400->2326|4415->2332|4471->2367
                  LINES: 26->1|29->1|31->3|34->6|34->6|39->11|39->11|39->11|40->12|40->12|40->12|41->13|41->13|41->13|42->14|42->14|42->14|43->15|43->15|43->15|44->16|44->16|44->16|45->17|45->17|45->17|46->18|46->18|46->18|47->19|47->19|47->19|50->22|50->22|50->22|51->23|51->23|51->23|52->24|52->24|52->24|54->26|54->26|54->26|65->37|65->37|66->38|68->40|68->40|68->40|69->41|69->41|69->41|70->42|70->42|70->42|71->43|71->43|71->43|72->44|72->44|72->44|73->45|73->45|73->45|74->46|74->46|74->46
                  -- GENERATED --
              */
          