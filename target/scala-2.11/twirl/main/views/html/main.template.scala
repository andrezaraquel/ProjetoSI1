
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
	     
	    <link rel="stylesheet" media="screen" href=""""),_display_(/*10.51*/routes/*10.57*/.Assets.at("stylesheets/main.css")),format.raw/*10.91*/("""">
	    <link rel="stylesheet" media="screen" href=""""),_display_(/*11.51*/routes/*11.57*/.Assets.at("stylesheets/bootstrap.css")),format.raw/*11.96*/("""">
		<link rel="stylesheet" media="screen" href=""""),_display_(/*12.48*/routes/*12.54*/.Assets.at("stylesheets/font-awesome.css")),format.raw/*12.96*/("""">
		<link rel="stylesheet" media="screen" href=""""),_display_(/*13.48*/routes/*13.54*/.Assets.at("javascripts/morris-0.4.3.min.css")),format.raw/*13.100*/("""">
	    <link rel="stylesheet" media="screen" href=""""),_display_(/*14.51*/routes/*14.57*/.Assets.at("stylesheets/custom.css")),format.raw/*14.93*/("""">
		<script src=""""),_display_(/*15.17*/routes/*15.23*/.Assets.at("javascripts/hello.js")),format.raw/*15.57*/("""" type="text/javascript"></script>
	
	       
	    <link rel="shortcut icon" type="image/png" href=""""),_display_(/*18.56*/routes/*18.62*/.Assets.at("images/favicon.png")),format.raw/*18.94*/("""">
		
		<!-- GOOGLE FONTS-->
		<link href='http://fonts.googleapis.com/css?family=Open+Sans' rel='stylesheet' type='text/css' /> 
	         
	</head>

	<body>
		<div>
			"""),_display_(/*27.5*/content),format.raw/*27.12*/("""
		"""),format.raw/*28.3*/("""</div>
	</body>
</html>"""))}
  }

  def render(title:String,content:Html): play.twirl.api.HtmlFormat.Appendable = apply(title)(content)

  def f:((String) => (Html) => play.twirl.api.HtmlFormat.Appendable) = (title) => (content) => apply(title)(content)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Thu Mar 12 15:18:16 BRT 2015
                  SOURCE: /home/andrezarmq/Documentos/ProjetoSI1/app/views/main.scala.html
                  HASH: 9cee625d54862d59b30dae3aa85fda14ce9a367f
                  MATRIX: 727->1|845->31|874->34|978->112|1003->117|1204->291|1219->297|1274->331|1354->384|1369->390|1429->429|1506->479|1521->485|1584->527|1661->577|1676->583|1744->629|1824->682|1839->688|1896->724|1942->743|1957->749|2012->783|2140->884|2155->890|2208->922|2405->1093|2433->1100|2463->1103
                  LINES: 26->1|29->1|31->3|34->6|34->6|38->10|38->10|38->10|39->11|39->11|39->11|40->12|40->12|40->12|41->13|41->13|41->13|42->14|42->14|42->14|43->15|43->15|43->15|46->18|46->18|46->18|55->27|55->27|56->28
                  -- GENERATED --
              */
          