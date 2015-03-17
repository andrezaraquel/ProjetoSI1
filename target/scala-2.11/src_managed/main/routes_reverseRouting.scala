// @SOURCE:C:/Users/Andreza/Desktop/projetoSI/ProjetoSI1/conf/routes
// @HASH:8a96f80ce9015e2bacd7e6e110977895bba631e8
// @DATE:Tue Mar 17 19:54:00 BRT 2015

import Routes.{prefix => _prefix, defaultPrefix => _defaultPrefix}
import play.core._
import play.core.Router._
import play.core.Router.HandlerInvokerFactory._
import play.core.j._

import play.api.mvc._
import _root_.controllers.Assets.Asset
import _root_.play.libs.F

import Router.queryString


// @LINE:21
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
                          

// @LINE:21
class ReverseAssets {


// @LINE:21
def at(file:String): Call = {
   implicit val _rrc = new ReverseRouteContext(Map(("path", "/public")))
   Call("GET", _prefix + { _defaultPrefix } + "assets/" + implicitly[PathBindable[String]].unbind("file", file))
}
                        

}
                          

// @LINE:18
class ReverseTemaController {


// @LINE:18
def showTema(x$1:String): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "tema" + queryString(List(Some(implicitly[QueryStringBindable[String]].unbind("x$1", x$1)))))
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
                  


// @LINE:21
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
              

// @LINE:21
class ReverseAssets {


// @LINE:21
def at : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Assets.at",
   """
      function(file) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "assets/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("file", file)})
      }
   """
)
                        

}
              

// @LINE:18
class ReverseTemaController {


// @LINE:18
def showTema : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.TemaController.showTema",
   """
      function(x$1) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "tema" + _qS([(""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("x$1", x$1)])})
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
        


// @LINE:21
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
                          

// @LINE:21
class ReverseAssets {


// @LINE:21
def at(path:String, file:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Assets.at(path, file), HandlerDef(this.getClass.getClassLoader, "", "controllers.Assets", "at", Seq(classOf[String], classOf[String]), "GET", """ Map static resources from the /public folder to the /assets URL path""", _prefix + """assets/$file<.+>""")
)
                      

}
                          

// @LINE:18
class ReverseTemaController {


// @LINE:18
def showTema(x$1:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.TemaController.showTema(x$1), HandlerDef(this.getClass.getClassLoader, "", "controllers.TemaController", "showTema", Seq(classOf[String]), "GET", """Tema""", _prefix + """tema""")
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
        
    