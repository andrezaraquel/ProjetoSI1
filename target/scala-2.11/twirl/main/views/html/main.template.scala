
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
                  DATE: Mon Mar 23 07:47:11 BRT 2015
                  SOURCE: C:/Users/Daniela/Documents/CC/projetosi1-vespera/ProjetoSI1/app/views/main.scala.html
                  HASH: 715329986f61b8c027e3bfad139a04f17c901112
                  MATRIX: 727->1|845->31|876->36|996->130|1021->135|1227->314|1242->320|1293->350|1378->408|1393->414|1464->463|1542->514|1557->520|1621->563|1699->614|1714->620|1782->666|1860->717|1875->723|1943->769|2021->820|2036->826|2092->861|2139->881|2154->887|2220->932|2299->984|2314->990|2377->1032|2456->1084|2471->1090|2537->1135|2621->1192|2636->1198|2687->1228|2770->1284|2785->1290|2848->1332|2926->1383|2941->1389|3009->1435|3090->1489|3105->1495|3162->1531|3387->1730|3415->1737|3446->1741|3497->1765|3512->1771|3569->1807|3648->1859|3663->1865|3726->1907|3805->1959|3820->1965|3883->2007|3962->2059|3977->2065|4043->2110|4122->2162|4137->2168|4204->2214|4283->2266|4298->2272|4354->2307|4433->2359|4448->2365|4504->2400
                  LINES: 26->1|29->1|31->3|34->6|34->6|38->10|38->10|38->10|40->12|40->12|40->12|41->13|41->13|41->13|42->14|42->14|42->14|43->15|43->15|43->15|44->16|44->16|44->16|45->17|45->17|45->17|46->18|46->18|46->18|47->19|47->19|47->19|48->20|48->20|48->20|50->22|50->22|50->22|51->23|51->23|51->23|52->24|52->24|52->24|65->37|65->37|66->38|67->39|67->39|67->39|68->40|68->40|68->40|69->41|69->41|69->41|70->42|70->42|70->42|71->43|71->43|71->43|72->44|72->44|72->44|73->45|73->45|73->45
                  -- GENERATED --
              */
          