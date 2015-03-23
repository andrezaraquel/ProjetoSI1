
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
	     
		<link rel="shortcut icon" type="image/png" href=""""),_display_(/*10.53*/routes/*10.59*/.Assets.at("images/leite.jpg")),format.raw/*10.89*/("""">
	    
		<link rel="stylesheet" media="screen" href=""""),_display_(/*12.48*/routes/*12.54*/.Assets.at("stylesheets/bootstrap-theme.min.css")),format.raw/*12.103*/("""">
		<link rel="stylesheet" media="screen" href=""""),_display_(/*13.48*/routes/*13.54*/.Assets.at("stylesheets/bootstrap.min.css")),format.raw/*13.97*/("""">
		<link rel="stylesheet" media="screen" href=""""),_display_(/*14.48*/routes/*14.54*/.Assets.at("stylesheets/font-awesome.min.css")),format.raw/*14.100*/("""">
		<link rel="stylesheet" media="screen" href=""""),_display_(/*15.48*/routes/*15.54*/.Assets.at("stylesheets/bootstrap-notify.css")),format.raw/*15.100*/("""">
		<link rel="stylesheet" media="screen" href=""""),_display_(/*16.48*/routes/*16.54*/.Assets.at("stylesheets/style.css")),format.raw/*16.89*/("""">
		<script src=""""),_display_(/*17.17*/routes/*17.23*/.Assets.at("javascripts/jquery-2.1.1.min.js")),format.raw/*17.68*/("""" type="text/javascript"></script>
		<script src=""""),_display_(/*18.17*/routes/*18.23*/.Assets.at("javascripts/bootstrap.min.js")),format.raw/*18.65*/("""" type="text/javascript"></script>
		<script src=""""),_display_(/*19.17*/routes/*19.23*/.Assets.at("javascripts/bootstrap-notify.js")),format.raw/*19.68*/("""" type="text/javascript"></script>
		<body background=""""),_display_(/*20.22*/routes/*20.28*/.Assets.at("images/fundo.jpg")),format.raw/*20.58*/(""""> 
		
		<link rel="stylesheet" media="screen" href=""""),_display_(/*22.48*/routes/*22.54*/.Assets.at("stylesheets/font-awesome.css")),format.raw/*22.96*/("""">
		<link rel="stylesheet" media="screen" href=""""),_display_(/*23.48*/routes/*23.54*/.Assets.at("javascripts/morris-0.4.3.min.css")),format.raw/*23.100*/("""">
	    <link rel="stylesheet" media="screen" href=""""),_display_(/*24.51*/routes/*24.57*/.Assets.at("stylesheets/custom.css")),format.raw/*24.93*/("""">
	       
	   
	    
		
		<!-- GOOGLE FONTS-->
		<link href='http://fonts.googleapis.com/css?family=Open+Sans' rel='stylesheet' type='text/css' /> 
		
		
	</head>

	<body>
		<div>
			"""),_display_(/*37.5*/content),format.raw/*37.12*/("""
		"""),format.raw/*38.3*/("""</div>
		<script src=""""),_display_(/*39.17*/routes/*39.23*/.Assets.at("javascripts/scripts.js")),format.raw/*39.59*/("""" type="text/javascript"></script>
		<script src=""""),_display_(/*40.17*/routes/*40.23*/.Assets.at("javascripts/jquery-1.10.2.js")),format.raw/*40.65*/("""" type="text/javascript"></script>
		<script src=""""),_display_(/*41.17*/routes/*41.23*/.Assets.at("javascripts/bootstrap.min.js")),format.raw/*41.65*/("""" type="text/javascript"></script>
		<script src=""""),_display_(/*42.17*/routes/*42.23*/.Assets.at("javascripts/jquery.metisMenu.js")),format.raw/*42.68*/("""" type="text/javascript"></script>
		<script src=""""),_display_(/*43.17*/routes/*43.23*/.Assets.at("javascripts/raphael-2.1.0.min.js")),format.raw/*43.69*/("""" type="text/javascript"></script>
		<script src=""""),_display_(/*44.17*/routes/*44.23*/.Assets.at("javascripts/morris.js")),format.raw/*44.58*/("""" type="text/javascript"></script>
		<script src=""""),_display_(/*45.17*/routes/*45.23*/.Assets.at("javascripts/custom.js")),format.raw/*45.58*/("""" type="text/javascript"></script>
	    
	</body>
		     
</html>"""))}
  }

  def render(title:String,content:Html): play.twirl.api.HtmlFormat.Appendable = apply(title)(content)

  def f:((String) => (Html) => play.twirl.api.HtmlFormat.Appendable) = (title) => (content) => apply(title)(content)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Mon Mar 23 16:45:23 BRT 2015
                  SOURCE: /home/mariadch/ULTIMA/ProjetoSI1/app/views/main.scala.html
                  HASH: cf655ac582709d9cde1e34646e3842dab92a4a8c
                  MATRIX: 727->1|845->31|874->34|991->125|1016->130|1218->305|1233->311|1284->341|1367->397|1382->403|1453->452|1530->502|1545->508|1609->551|1686->601|1701->607|1769->653|1846->703|1861->709|1929->755|2006->805|2021->811|2077->846|2123->865|2138->871|2204->916|2282->967|2297->973|2360->1015|2438->1066|2453->1072|2519->1117|2602->1173|2617->1179|2668->1209|2749->1263|2764->1269|2827->1311|2904->1361|2919->1367|2987->1413|3067->1466|3082->1472|3139->1508|3351->1694|3379->1701|3409->1704|3459->1727|3474->1733|3531->1769|3609->1820|3624->1826|3687->1868|3765->1919|3780->1925|3843->1967|3921->2018|3936->2024|4002->2069|4080->2120|4095->2126|4162->2172|4240->2223|4255->2229|4311->2264|4389->2315|4404->2321|4460->2356
                  LINES: 26->1|29->1|31->3|34->6|34->6|38->10|38->10|38->10|40->12|40->12|40->12|41->13|41->13|41->13|42->14|42->14|42->14|43->15|43->15|43->15|44->16|44->16|44->16|45->17|45->17|45->17|46->18|46->18|46->18|47->19|47->19|47->19|48->20|48->20|48->20|50->22|50->22|50->22|51->23|51->23|51->23|52->24|52->24|52->24|65->37|65->37|66->38|67->39|67->39|67->39|68->40|68->40|68->40|69->41|69->41|69->41|70->42|70->42|70->42|71->43|71->43|71->43|72->44|72->44|72->44|73->45|73->45|73->45
                  -- GENERATED --
              */
          