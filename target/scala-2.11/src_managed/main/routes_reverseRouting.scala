// @SOURCE:/home/mariadch/ULTIMA/ProjetoSI1/conf/routes
// @HASH:215ba2c1fb56f1e019dd69760edd795222a1857b
// @DATE:Mon Mar 23 16:45:22 BRT 2015

import Routes.{prefix => _prefix, defaultPrefix => _defaultPrefix}
import play.core._
import play.core.Router._
import play.core.Router.HandlerInvokerFactory._
import play.core.j._

import play.api.mvc._
import _root_.controllers.Assets.Asset
import _root_.play.libs.F

import Router.queryString


// @LINE:33
// @LINE:29
// @LINE:28
// @LINE:27
// @LINE:25
// @LINE:24
// @LINE:23
// @LINE:22
// @LINE:19
// @LINE:18
// @LINE:15
// @LINE:14
// @LINE:11
// @LINE:10
// @LINE:7
// @LINE:6
package controllers {

// @LINE:15
// @LINE:14
// @LINE:11
// @LINE:10
// @LINE:7
class ReverseAutenticacaoController {


// @LINE:15
def cadastrar(): Call = {
   import ReverseRouteContext.empty
   Call("POST", _prefix + { _defaultPrefix } + "cadastro")
}
                        

// @LINE:7
def logout(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "logout")
}
                        

// @LINE:10
def showLogin(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "login")
}
                        

// @LINE:14
def showCadastro(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "cadastro")
}
                        

// @LINE:11
def autenticar(): Call = {
   import ReverseRouteContext.empty
   Call("POST", _prefix + { _defaultPrefix } + "login")
}
                        

}
                          

// @LINE:33
class ReverseAssets {


// @LINE:33
def at(file:String): Call = {
   implicit val _rrc = new ReverseRouteContext(Map(("path", "/public")))
   Call("GET", _prefix + { _defaultPrefix } + "assets/" + implicitly[PathBindable[String]].unbind("file", file))
}
                        

}
                          

// @LINE:29
// @LINE:28
// @LINE:27
// @LINE:25
// @LINE:24
// @LINE:23
// @LINE:22
// @LINE:19
// @LINE:18
class ReverseTemaController {


// @LINE:25
def addDicaDiscAnteriores(): Call = {
   import ReverseRouteContext.empty
   Call("POST", _prefix + { _defaultPrefix } + "addDicaDiscAnteriores")
}
                        

// @LINE:28
def discordar(): Call = {
   import ReverseRouteContext.empty
   Call("POST", _prefix + { _defaultPrefix } + "discordar")
}
                        

// @LINE:19
def avaliarTema(): Call = {
   import ReverseRouteContext.empty
   Call("POST", _prefix + { _defaultPrefix } + "avaliar")
}
                        

// @LINE:18
def showTema($id:String): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "tema" + queryString(List(Some(implicitly[QueryStringBindable[String]].unbind("$id", $id)))))
}
                        

// @LINE:27
def concordar($id:String): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "concordar" + queryString(List(Some(implicitly[QueryStringBindable[String]].unbind("$id", $id)))))
}
                        

// @LINE:23
def addDicaConselho(): Call = {
   import ReverseRouteContext.empty
   Call("POST", _prefix + { _defaultPrefix } + "addDicaConselho")
}
                        

// @LINE:24
def addDicaMaterialUtil(): Call = {
   import ReverseRouteContext.empty
   Call("POST", _prefix + { _defaultPrefix } + "addDicaMaterialUtil")
}
                        

// @LINE:22
def addDicaSemDificuldade(): Call = {
   import ReverseRouteContext.empty
   Call("POST", _prefix + { _defaultPrefix } + "addDicaSemDificuldade")
}
                        

// @LINE:29
def denunciar($idTema:String, $idDica:String): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "denunciar" + queryString(List(Some(implicitly[QueryStringBindable[String]].unbind("$idTema", $idTema)), Some(implicitly[QueryStringBindable[String]].unbind("$idDica", $idDica)))))
}
                        

}
                          

// @LINE:6
class ReverseApplication {


// @LINE:6
def index(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix)
}
                        

}
                          
}
                  


// @LINE:33
// @LINE:29
// @LINE:28
// @LINE:27
// @LINE:25
// @LINE:24
// @LINE:23
// @LINE:22
// @LINE:19
// @LINE:18
// @LINE:15
// @LINE:14
// @LINE:11
// @LINE:10
// @LINE:7
// @LINE:6
package controllers.javascript {
import ReverseRouteContext.empty

// @LINE:15
// @LINE:14
// @LINE:11
// @LINE:10
// @LINE:7
class ReverseAutenticacaoController {


// @LINE:15
def cadastrar : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.AutenticacaoController.cadastrar",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "cadastro"})
      }
   """
)
                        

// @LINE:7
def logout : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.AutenticacaoController.logout",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "logout"})
      }
   """
)
                        

// @LINE:10
def showLogin : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.AutenticacaoController.showLogin",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "login"})
      }
   """
)
                        

// @LINE:14
def showCadastro : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.AutenticacaoController.showCadastro",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "cadastro"})
      }
   """
)
                        

// @LINE:11
def autenticar : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.AutenticacaoController.autenticar",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "login"})
      }
   """
)
                        

}
              

// @LINE:33
class ReverseAssets {


// @LINE:33
def at : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Assets.at",
   """
      function(file) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "assets/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("file", file)})
      }
   """
)
                        

}
              

// @LINE:29
// @LINE:28
// @LINE:27
// @LINE:25
// @LINE:24
// @LINE:23
// @LINE:22
// @LINE:19
// @LINE:18
class ReverseTemaController {


// @LINE:25
def addDicaDiscAnteriores : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.TemaController.addDicaDiscAnteriores",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "addDicaDiscAnteriores"})
      }
   """
)
                        

// @LINE:28
def discordar : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.TemaController.discordar",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "discordar"})
      }
   """
)
                        

// @LINE:19
def avaliarTema : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.TemaController.avaliarTema",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "avaliar"})
      }
   """
)
                        

// @LINE:18
def showTema : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.TemaController.showTema",
   """
      function($id) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "tema" + _qS([(""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("$id", $id)])})
      }
   """
)
                        

// @LINE:27
def concordar : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.TemaController.concordar",
   """
      function($id) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "concordar" + _qS([(""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("$id", $id)])})
      }
   """
)
                        

// @LINE:23
def addDicaConselho : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.TemaController.addDicaConselho",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "addDicaConselho"})
      }
   """
)
                        

// @LINE:24
def addDicaMaterialUtil : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.TemaController.addDicaMaterialUtil",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "addDicaMaterialUtil"})
      }
   """
)
                        

// @LINE:22
def addDicaSemDificuldade : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.TemaController.addDicaSemDificuldade",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "addDicaSemDificuldade"})
      }
   """
)
                        

// @LINE:29
def denunciar : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.TemaController.denunciar",
   """
      function($idTema,$idDica) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "denunciar" + _qS([(""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("$idTema", $idTema), (""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("$idDica", $idDica)])})
      }
   """
)
                        

}
              

// @LINE:6
class ReverseApplication {


// @LINE:6
def index : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.index",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + """"})
      }
   """
)
                        

}
              
}
        


// @LINE:33
// @LINE:29
// @LINE:28
// @LINE:27
// @LINE:25
// @LINE:24
// @LINE:23
// @LINE:22
// @LINE:19
// @LINE:18
// @LINE:15
// @LINE:14
// @LINE:11
// @LINE:10
// @LINE:7
// @LINE:6
package controllers.ref {


// @LINE:15
// @LINE:14
// @LINE:11
// @LINE:10
// @LINE:7
class ReverseAutenticacaoController {


// @LINE:15
def cadastrar(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.AutenticacaoController.cadastrar(), HandlerDef(this.getClass.getClassLoader, "", "controllers.AutenticacaoController", "cadastrar", Seq(), "POST", """""", _prefix + """cadastro""")
)
                      

// @LINE:7
def logout(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.AutenticacaoController.logout(), HandlerDef(this.getClass.getClassLoader, "", "controllers.AutenticacaoController", "logout", Seq(), "GET", """""", _prefix + """logout""")
)
                      

// @LINE:10
def showLogin(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.AutenticacaoController.showLogin(), HandlerDef(this.getClass.getClassLoader, "", "controllers.AutenticacaoController", "showLogin", Seq(), "GET", """ Login""", _prefix + """login""")
)
                      

// @LINE:14
def showCadastro(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.AutenticacaoController.showCadastro(), HandlerDef(this.getClass.getClassLoader, "", "controllers.AutenticacaoController", "showCadastro", Seq(), "GET", """ Registro""", _prefix + """cadastro""")
)
                      

// @LINE:11
def autenticar(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.AutenticacaoController.autenticar(), HandlerDef(this.getClass.getClassLoader, "", "controllers.AutenticacaoController", "autenticar", Seq(), "POST", """""", _prefix + """login""")
)
                      

}
                          

// @LINE:33
class ReverseAssets {


// @LINE:33
def at(path:String, file:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Assets.at(path, file), HandlerDef(this.getClass.getClassLoader, "", "controllers.Assets", "at", Seq(classOf[String], classOf[String]), "GET", """ Map static resources from the /public folder to the /assets URL path""", _prefix + """assets/$file<.+>""")
)
                      

}
                          

// @LINE:29
// @LINE:28
// @LINE:27
// @LINE:25
// @LINE:24
// @LINE:23
// @LINE:22
// @LINE:19
// @LINE:18
class ReverseTemaController {


// @LINE:25
def addDicaDiscAnteriores(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.TemaController.addDicaDiscAnteriores(), HandlerDef(this.getClass.getClassLoader, "", "controllers.TemaController", "addDicaDiscAnteriores", Seq(), "POST", """""", _prefix + """addDicaDiscAnteriores""")
)
                      

// @LINE:28
def discordar(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.TemaController.discordar(), HandlerDef(this.getClass.getClassLoader, "", "controllers.TemaController", "discordar", Seq(), "POST", """""", _prefix + """discordar""")
)
                      

// @LINE:19
def avaliarTema(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.TemaController.avaliarTema(), HandlerDef(this.getClass.getClassLoader, "", "controllers.TemaController", "avaliarTema", Seq(), "POST", """""", _prefix + """avaliar""")
)
                      

// @LINE:18
def showTema($id:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.TemaController.showTema($id), HandlerDef(this.getClass.getClassLoader, "", "controllers.TemaController", "showTema", Seq(classOf[String]), "GET", """Tema""", _prefix + """tema""")
)
                      

// @LINE:27
def concordar($id:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.TemaController.concordar($id), HandlerDef(this.getClass.getClassLoader, "", "controllers.TemaController", "concordar", Seq(classOf[String]), "GET", """""", _prefix + """concordar""")
)
                      

// @LINE:23
def addDicaConselho(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.TemaController.addDicaConselho(), HandlerDef(this.getClass.getClassLoader, "", "controllers.TemaController", "addDicaConselho", Seq(), "POST", """""", _prefix + """addDicaConselho""")
)
                      

// @LINE:24
def addDicaMaterialUtil(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.TemaController.addDicaMaterialUtil(), HandlerDef(this.getClass.getClassLoader, "", "controllers.TemaController", "addDicaMaterialUtil", Seq(), "POST", """""", _prefix + """addDicaMaterialUtil""")
)
                      

// @LINE:22
def addDicaSemDificuldade(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.TemaController.addDicaSemDificuldade(), HandlerDef(this.getClass.getClassLoader, "", "controllers.TemaController", "addDicaSemDificuldade", Seq(), "POST", """Dicas""", _prefix + """addDicaSemDificuldade""")
)
                      

// @LINE:29
def denunciar($idTema:String, $idDica:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.TemaController.denunciar($idTema, $idDica), HandlerDef(this.getClass.getClassLoader, "", "controllers.TemaController", "denunciar", Seq(classOf[String], classOf[String]), "GET", """""", _prefix + """denunciar""")
)
                      

}
                          

// @LINE:6
class ReverseApplication {


// @LINE:6
def index(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.index(), HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "index", Seq(), "GET", """ Home page""", _prefix + """""")
)
                      

}
                          
}
        
    