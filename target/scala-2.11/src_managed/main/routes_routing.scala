// @SOURCE:/home/andrezarmq/Documentos/SI1/ProjetoSI1/conf/routes
// @HASH:215ba2c1fb56f1e019dd69760edd795222a1857b
// @DATE:Mon Mar 23 11:02:23 BRT 2015


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
        

// @LINE:19
private[this] lazy val controllers_TemaController_avaliarTema7_route = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("avaliar"))))
private[this] lazy val controllers_TemaController_avaliarTema7_invoker = createInvoker(
controllers.TemaController.avaliarTema(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.TemaController", "avaliarTema", Nil,"POST", """""", Routes.prefix + """avaliar"""))
        

// @LINE:22
private[this] lazy val controllers_TemaController_addDicaSemDificuldade8_route = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("addDicaSemDificuldade"))))
private[this] lazy val controllers_TemaController_addDicaSemDificuldade8_invoker = createInvoker(
controllers.TemaController.addDicaSemDificuldade(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.TemaController", "addDicaSemDificuldade", Nil,"POST", """Dicas""", Routes.prefix + """addDicaSemDificuldade"""))
        

// @LINE:23
private[this] lazy val controllers_TemaController_addDicaConselho9_route = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("addDicaConselho"))))
private[this] lazy val controllers_TemaController_addDicaConselho9_invoker = createInvoker(
controllers.TemaController.addDicaConselho(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.TemaController", "addDicaConselho", Nil,"POST", """""", Routes.prefix + """addDicaConselho"""))
        

// @LINE:24
private[this] lazy val controllers_TemaController_addDicaMaterialUtil10_route = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("addDicaMaterialUtil"))))
private[this] lazy val controllers_TemaController_addDicaMaterialUtil10_invoker = createInvoker(
controllers.TemaController.addDicaMaterialUtil(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.TemaController", "addDicaMaterialUtil", Nil,"POST", """""", Routes.prefix + """addDicaMaterialUtil"""))
        

// @LINE:25
private[this] lazy val controllers_TemaController_addDicaDiscAnteriores11_route = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("addDicaDiscAnteriores"))))
private[this] lazy val controllers_TemaController_addDicaDiscAnteriores11_invoker = createInvoker(
controllers.TemaController.addDicaDiscAnteriores(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.TemaController", "addDicaDiscAnteriores", Nil,"POST", """""", Routes.prefix + """addDicaDiscAnteriores"""))
        

// @LINE:27
private[this] lazy val controllers_TemaController_concordar12_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("concordar"))))
private[this] lazy val controllers_TemaController_concordar12_invoker = createInvoker(
controllers.TemaController.concordar(fakeValue[String]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.TemaController", "concordar", Seq(classOf[String]),"GET", """""", Routes.prefix + """concordar"""))
        

// @LINE:28
private[this] lazy val controllers_TemaController_discordar13_route = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("discordar"))))
private[this] lazy val controllers_TemaController_discordar13_invoker = createInvoker(
controllers.TemaController.discordar(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.TemaController", "discordar", Nil,"POST", """""", Routes.prefix + """discordar"""))
        

// @LINE:29
private[this] lazy val controllers_TemaController_denunciar14_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("denunciar"))))
private[this] lazy val controllers_TemaController_denunciar14_invoker = createInvoker(
controllers.TemaController.denunciar(fakeValue[String], fakeValue[String]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.TemaController", "denunciar", Seq(classOf[String], classOf[String]),"GET", """""", Routes.prefix + """denunciar"""))
        

// @LINE:33
private[this] lazy val controllers_Assets_at15_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("assets/"),DynamicPart("file", """.+""",false))))
private[this] lazy val controllers_Assets_at15_invoker = createInvoker(
controllers.Assets.at(fakeValue[String], fakeValue[String]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.Assets", "at", Seq(classOf[String], classOf[String]),"GET", """ Map static resources from the /public folder to the /assets URL path""", Routes.prefix + """assets/$file<.+>"""))
        
def documentation = List(("""GET""", prefix,"""controllers.Application.index()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """logout""","""controllers.AutenticacaoController.logout()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """login""","""controllers.AutenticacaoController.showLogin()"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """login""","""controllers.AutenticacaoController.autenticar()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """cadastro""","""controllers.AutenticacaoController.showCadastro()"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """cadastro""","""controllers.AutenticacaoController.cadastrar()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """tema""","""controllers.TemaController.showTema($id:String)"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """avaliar""","""controllers.TemaController.avaliarTema()"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """addDicaSemDificuldade""","""controllers.TemaController.addDicaSemDificuldade()"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """addDicaConselho""","""controllers.TemaController.addDicaConselho()"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """addDicaMaterialUtil""","""controllers.TemaController.addDicaMaterialUtil()"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """addDicaDiscAnteriores""","""controllers.TemaController.addDicaDiscAnteriores()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """concordar""","""controllers.TemaController.concordar($id:String)"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """discordar""","""controllers.TemaController.discordar()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """denunciar""","""controllers.TemaController.denunciar($idTema:String, $idDica:String)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """assets/$file<.+>""","""controllers.Assets.at(path:String = "/public", file:String)""")).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
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
        

// @LINE:19
case controllers_TemaController_avaliarTema7_route(params) => {
   call { 
        controllers_TemaController_avaliarTema7_invoker.call(controllers.TemaController.avaliarTema())
   }
}
        

// @LINE:22
case controllers_TemaController_addDicaSemDificuldade8_route(params) => {
   call { 
        controllers_TemaController_addDicaSemDificuldade8_invoker.call(controllers.TemaController.addDicaSemDificuldade())
   }
}
        

// @LINE:23
case controllers_TemaController_addDicaConselho9_route(params) => {
   call { 
        controllers_TemaController_addDicaConselho9_invoker.call(controllers.TemaController.addDicaConselho())
   }
}
        

// @LINE:24
case controllers_TemaController_addDicaMaterialUtil10_route(params) => {
   call { 
        controllers_TemaController_addDicaMaterialUtil10_invoker.call(controllers.TemaController.addDicaMaterialUtil())
   }
}
        

// @LINE:25
case controllers_TemaController_addDicaDiscAnteriores11_route(params) => {
   call { 
        controllers_TemaController_addDicaDiscAnteriores11_invoker.call(controllers.TemaController.addDicaDiscAnteriores())
   }
}
        

// @LINE:27
case controllers_TemaController_concordar12_route(params) => {
   call(params.fromQuery[String]("$id", None)) { ($id) =>
        controllers_TemaController_concordar12_invoker.call(controllers.TemaController.concordar($id))
   }
}
        

// @LINE:28
case controllers_TemaController_discordar13_route(params) => {
   call { 
        controllers_TemaController_discordar13_invoker.call(controllers.TemaController.discordar())
   }
}
        

// @LINE:29
case controllers_TemaController_denunciar14_route(params) => {
   call(params.fromQuery[String]("$idTema", None), params.fromQuery[String]("$idDica", None)) { ($idTema, $idDica) =>
        controllers_TemaController_denunciar14_invoker.call(controllers.TemaController.denunciar($idTema, $idDica))
   }
}
        

// @LINE:33
case controllers_Assets_at15_route(params) => {
   call(Param[String]("path", Right("/public")), params.fromPath[String]("file", None)) { (path, file) =>
        controllers_Assets_at15_invoker.call(controllers.Assets.at(path, file))
   }
}
        
}

}
     