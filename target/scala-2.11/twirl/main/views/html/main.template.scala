
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
        <title>"""),_display_(/*7.17*/title),format.raw/*7.22*/("""</title>
       	<meta charset="utf-8" />
    	<meta name="viewport" content="width=device-width, initial-scale=1.0" />
  
        <link rel="stylesheet" media="screen" href=""""),_display_(/*11.54*/routes/*11.60*/.Assets.at("stylesheets/main.css")),format.raw/*11.94*/("""">
        <link rel="stylesheet" media="screen" href=""""),_display_(/*12.54*/routes/*12.60*/.Assets.at("stylesheets/bootstrap.css")),format.raw/*12.99*/("""">
		<link rel="stylesheet" media="screen" href=""""),_display_(/*13.48*/routes/*13.54*/.Assets.at("stylesheets/font-awesome.css")),format.raw/*13.96*/("""">
		<link rel="stylesheet" media="screen" href=""""),_display_(/*14.48*/routes/*14.54*/.Assets.at("javascripts/morris-0.4.3.min.css")),format.raw/*14.100*/("""">
        <link rel="stylesheet" media="screen" href=""""),_display_(/*15.54*/routes/*15.60*/.Assets.at("stylesheets/custom.css")),format.raw/*15.96*/("""">
        
		<script src=""""),_display_(/*17.17*/routes/*17.23*/.Assets.at("javascripts/hello.js")),format.raw/*17.57*/("""" type="text/javascript"></script>

        
        <link rel="shortcut icon" type="image/png" href=""""),_display_(/*20.59*/routes/*20.65*/.Assets.at("images/favicon.png")),format.raw/*20.97*/("""">
		
		  <!-- GOOGLE FONTS-->
		<link href='http://fonts.googleapis.com/css?family=Open+Sans' rel='stylesheet' type='text/css' />          
    </head>
    <body>
        <div class="container">
            """),_display_(/*27.14*/content),format.raw/*27.21*/("""
        """),format.raw/*28.9*/("""</div>
    </body>
</html>"""))}
  }

  def render(title:String,content:Html): play.twirl.api.HtmlFormat.Appendable = apply(title)(content)

  def f:((String) => (Html) => play.twirl.api.HtmlFormat.Appendable) = (title) => (content) => apply(title)(content)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Thu Mar 12 14:41:32 BRT 2015
                  SOURCE: /home/andrezarmq/Documentos/ProjetoSI1/app/views/main.scala.html
                  HASH: 74c093c1180b44fbaee6cf8d402d0f9d48db1882
                  MATRIX: 727->1|845->31|873->33|987->121|1012->126|1215->302|1230->308|1285->342|1368->398|1383->404|1443->443|1520->493|1535->499|1598->541|1675->591|1690->597|1758->643|1841->699|1856->705|1913->741|1968->769|1983->775|2038->809|2168->912|2183->918|2236->950|2472->1159|2500->1166|2536->1175
                  LINES: 26->1|29->1|31->3|35->7|35->7|39->11|39->11|39->11|40->12|40->12|40->12|41->13|41->13|41->13|42->14|42->14|42->14|43->15|43->15|43->15|45->17|45->17|45->17|48->20|48->20|48->20|55->27|55->27|56->28
                  -- GENERATED --
              */
          