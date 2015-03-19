// @SOURCE:/home/andrezarmq/Documentos/SI1/ProjetoSI1/conf/routes
// @HASH:273ea52a1d1e2575542429b956769298e611fe32
// @DATE:Thu Mar 19 10:27:15 BRT 2015


import play.core._
import play.core.Router._
import play.core.Router.HandlerInvokerFactory._
import play.core.j._

import play.api.mvc._
import _root_.controllers.Assets.Asset
import _root_.play.libs.F

import Router.queryString

object Routes extends Router.Routes {

import ReverseRouteContext.empty

private var _prefix = "/"

def setPrefix(prefix: String): Unit = {
  _prefix = prefix
  List[(String,Routes)]().foreach {
    case (p, router) => router.setPrefix(prefix + (if(prefix.endsWith("/")) "" else "/") + p)
  }
}

def prefix = _prefix

lazy val defaultPrefix = { if(Routes.prefix.endsWith("/")) "" else "/" }


// @LINE:6
private[this] lazy val controllers_Application_index0_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix))))
private[this] lazy val controllers_Application_index0_invoker = createInvoker(
controllers.Application.index(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "index", Nil,"GET", """ Home page""", Routes.prefix + """"""))
        

// @LINE:7
private[this] lazy val controllers_AutenticacaoController_logout1_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("logout"))))
private[this] lazy val controllers_AutenticacaoController_logout1_invoker = createInvoker(
controllers.AutenticacaoController.logout(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.AutenticacaoController", "logout", Nil,"GET", """""", Routes.prefix + """logout"""))
        

// @LINE:10
private[this] lazy val controllers_AutenticacaoController_showLogin2_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("login"))))
private[this] lazy val controllers_AutenticacaoController_showLogin2_invoker = createInvoker(
controllers.AutenticacaoController.showLogin(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.AutenticacaoController", "showLogin", Nil,"GET", """ Login""", Routes.prefix + """login"""))
        

// @LINE:11
private[this] lazy val controllers_AutenticacaoController_autenticar3_route = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("login"))))
private[this] lazy val controllers_AutenticacaoController_autenticar3_invoker = createInvoker(
controllers.AutenticacaoController.autenticar(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.AutenticacaoController", "autenticar", Nil,"POST", """""", Routes.prefix + """login"""))
        

// @LINE:14
private[this] lazy val controllers_AutenticacaoController_showCadastro4_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("cadastro"))))
private[this] lazy val controllers_AutenticacaoController_showCadastro4_invoker = createInvoker(
controllers.AutenticacaoController.showCadastro(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.AutenticacaoController", "showCadastro", Nil,"GET", """ Registro""", Routes.prefix + """cadastro"""))
        

// @LINE:15
private[this] lazy val controllers_AutenticacaoController_cadastrar5_route = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("cadastro"))))
private[this] lazy val controllers_AutenticacaoController_cadastrar5_invoker = createInvoker(
controllers.AutenticacaoController.cadastrar(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.AutenticacaoController", "cadastrar", Nil,"POST", """""", Routes.prefix + """cadastro"""))
        

// @LINE:18
private[this] lazy val controllers_TemaController_showTema6_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("tema"))))
private[this] lazy val controllers_TemaController_showTema6_invoker = createInvoker(
controllers.TemaController.showTema(fakeValue[String]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.TemaController", "showTema", Seq(classOf[String]),"GET", """Tema""", Routes.prefix + """tema"""))
        

// @LINE:22
private[this] lazy val controllers_Assets_at7_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("assets/"),DynamicPart("file", """.+""",false))))
private[this] lazy val controllers_Assets_at7_invoker = createInvoker(
controllers.Assets.at(fakeValue[String], fakeValue[String]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.Assets", "at", Seq(classOf[String], classOf[String]),"GET", """ Map static resources from the /public folder to the /assets URL path""", Routes.prefix + """assets/$file<.+>"""))
        
def documentation = List(("""GET""", prefix,"""controllers.Application.index()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """logout""","""controllers.AutenticacaoController.logout()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """login""","""controllers.AutenticacaoController.showLogin()"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """login""","""controllers.AutenticacaoController.autenticar()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """cadastro""","""controllers.AutenticacaoController.showCadastro()"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """cadastro""","""controllers.AutenticacaoController.cadastrar()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """tema""","""controllers.TemaController.showTema($id:String)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """assets/$file<.+>""","""controllers.Assets.at(path:String = "/public", file:String)""")).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
  case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
  case l => s ++ l.asInstanceOf[List[(String,String,String)]]
}}
      

def routes:PartialFunction[RequestHeader,Handler] = {

// @LINE:6
case controllers_Application_index0_route(params) => {
   call { 
        controllers_Application_index0_invoker.call(controllers.Application.index())
   }
}
        

// @LINE:7
case controllers_AutenticacaoController_logout1_route(params) => {
   call { 
        controllers_AutenticacaoController_logout1_invoker.call(controllers.AutenticacaoController.logout())
   }
}
        

// @LINE:10
case controllers_AutenticacaoController_showLogin2_route(params) => {
   call { 
        controllers_AutenticacaoController_showLogin2_invoker.call(controllers.AutenticacaoController.showLogin())
   }
}
        

// @LINE:11
case controllers_AutenticacaoController_autenticar3_route(params) => {
   call { 
        controllers_AutenticacaoController_autenticar3_invoker.call(controllers.AutenticacaoController.autenticar())
   }
}
        

// @LINE:14
case controllers_AutenticacaoController_showCadastro4_route(params) => {
   call { 
        controllers_AutenticacaoController_showCadastro4_invoker.call(controllers.AutenticacaoController.showCadastro())
   }
}
        

// @LINE:15
case controllers_AutenticacaoController_cadastrar5_route(params) => {
   call { 
        controllers_AutenticacaoController_cadastrar5_invoker.call(controllers.AutenticacaoController.cadastrar())
   }
}
        

// @LINE:18
case controllers_TemaController_showTema6_route(params) => {
   call(params.fromQuery[String]("$id", None)) { ($id) =>
        controllers_TemaController_showTema6_invoker.call(controllers.TemaController.showTema($id))
   }
}
        

// @LINE:22
case controllers_Assets_at7_route(params) => {
   call(Param[String]("path", Right("/public")), params.fromPath[String]("file", None)) { (path, file) =>
        controllers_Assets_at7_invoker.call(controllers.Assets.at(path, file))
   }
}
        
}

}
     