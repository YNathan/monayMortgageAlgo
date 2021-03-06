// @SOURCE:C:/devl/work/GIT_WS/MyServer/conf/routes
// @HASH:df9bd9d4579b93db961ebf3ed0c58cf519135528
// @DATE:Fri Feb 12 13:52:22 IST 2016

import Routes.{prefix => _prefix, defaultPrefix => _defaultPrefix}
import play.core._
import play.core.Router._
import play.core.j._

import play.api.mvc._
import play.libs.F

import Router.queryString


// @LINE:24
// @LINE:22
// @LINE:21
// @LINE:20
// @LINE:19
// @LINE:18
// @LINE:17
// @LINE:16
// @LINE:15
// @LINE:14
// @LINE:13
// @LINE:12
// @LINE:11
package controllers {

// @LINE:21
// @LINE:18
// @LINE:17
// @LINE:16
// @LINE:15
// @LINE:14
class Reversegetter {
    

// @LINE:17
def getGelts(userName:String): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "GET_GELT/" + implicitly[PathBindable[String]].unbind("userName", dynamicString(userName)))
}
                                                

// @LINE:15
def isUserNameAlreadyExist(USER_NAME:String): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "CHECK_USER_NAME/" + implicitly[PathBindable[String]].unbind("USER_NAME", dynamicString(USER_NAME)))
}
                                                

// @LINE:18
def getUsers(userName:String): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "GET_USERS/" + implicitly[PathBindable[String]].unbind("userName", dynamicString(userName)))
}
                                                

// @LINE:16
def isEmailAlreadyExist(Email:String): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "CHECK_EMAIL/" + implicitly[PathBindable[String]].unbind("Email", dynamicString(Email)))
}
                                                

// @LINE:21
def checkIfUserIsDebter(szUserName:String): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "IS_DEBTER/" + implicitly[PathBindable[String]].unbind("szUserName", dynamicString(szUserName)))
}
                                                

// @LINE:14
def isLoginPermited(Username:String, Password:String): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "LOGIN/" + implicitly[PathBindable[String]].unbind("Username", dynamicString(Username)) + "/" + implicitly[PathBindable[String]].unbind("Password", dynamicString(Password)))
}
                                                
    
}
                          

// @LINE:22
// @LINE:20
// @LINE:19
class Reversesetter {
    

// @LINE:20
def registerNewUser(userName:String, firstName:String, lastName:String, telephone:String, email:String, password:String, birthdate:String): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "REGISTER/" + implicitly[PathBindable[String]].unbind("userName", dynamicString(userName)) + "/" + implicitly[PathBindable[String]].unbind("firstName", dynamicString(firstName)) + "/" + implicitly[PathBindable[String]].unbind("lastName", dynamicString(lastName)) + "/" + implicitly[PathBindable[String]].unbind("telephone", dynamicString(telephone)) + "/" + implicitly[PathBindable[String]].unbind("email", dynamicString(email)) + "/" + implicitly[PathBindable[String]].unbind("password", dynamicString(password)) + "/" + implicitly[PathBindable[String]].unbind("birthdate", dynamicString(birthdate)))
}
                                                

// @LINE:19
def newGelt(szDebterName:String, szAmount:String, szEntitledName:String): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "INSERT_GELT/" + implicitly[PathBindable[String]].unbind("szDebterName", dynamicString(szDebterName)) + "/" + implicitly[PathBindable[String]].unbind("szAmount", dynamicString(szAmount)) + "/" + implicitly[PathBindable[String]].unbind("szEntitledName", dynamicString(szEntitledName)))
}
                                                

// @LINE:22
def confirm(szDebterName:String, szAmount:String, szEntitledName:String): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "CONFIRMATION/" + implicitly[PathBindable[String]].unbind("szDebterName", dynamicString(szDebterName)) + "/" + implicitly[PathBindable[String]].unbind("szAmount", dynamicString(szAmount)) + "/" + implicitly[PathBindable[String]].unbind("szEntitledName", dynamicString(szEntitledName)))
}
                                                
    
}
                          

// @LINE:24
class ReverseAssets {
    

// @LINE:24
def at(file:String): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "assets/" + implicitly[PathBindable[String]].unbind("file", file))
}
                                                
    
}
                          

// @LINE:13
// @LINE:12
// @LINE:11
class ReverseApplication {
    

// @LINE:13
def Main(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "MAIN")
}
                                                

// @LINE:12
def Register(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "REGISTER_PAGE")
}
                                                

// @LINE:11
def index(): Call = {
   Call("GET", _prefix)
}
                                                
    
}
                          
}
                  


// @LINE:24
// @LINE:22
// @LINE:21
// @LINE:20
// @LINE:19
// @LINE:18
// @LINE:17
// @LINE:16
// @LINE:15
// @LINE:14
// @LINE:13
// @LINE:12
// @LINE:11
package controllers.javascript {

// @LINE:21
// @LINE:18
// @LINE:17
// @LINE:16
// @LINE:15
// @LINE:14
class Reversegetter {
    

// @LINE:17
def getGelts : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.getter.getGelts",
   """
      function(userName) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "GET_GELT/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("userName", encodeURIComponent(userName))})
      }
   """
)
                        

// @LINE:15
def isUserNameAlreadyExist : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.getter.isUserNameAlreadyExist",
   """
      function(USER_NAME) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "CHECK_USER_NAME/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("USER_NAME", encodeURIComponent(USER_NAME))})
      }
   """
)
                        

// @LINE:18
def getUsers : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.getter.getUsers",
   """
      function(userName) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "GET_USERS/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("userName", encodeURIComponent(userName))})
      }
   """
)
                        

// @LINE:16
def isEmailAlreadyExist : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.getter.isEmailAlreadyExist",
   """
      function(Email) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "CHECK_EMAIL/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("Email", encodeURIComponent(Email))})
      }
   """
)
                        

// @LINE:21
def checkIfUserIsDebter : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.getter.checkIfUserIsDebter",
   """
      function(szUserName) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "IS_DEBTER/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("szUserName", encodeURIComponent(szUserName))})
      }
   """
)
                        

// @LINE:14
def isLoginPermited : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.getter.isLoginPermited",
   """
      function(Username,Password) {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "LOGIN/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("Username", encodeURIComponent(Username)) + "/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("Password", encodeURIComponent(Password))})
      }
   """
)
                        
    
}
              

// @LINE:22
// @LINE:20
// @LINE:19
class Reversesetter {
    

// @LINE:20
def registerNewUser : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.setter.registerNewUser",
   """
      function(userName,firstName,lastName,telephone,email,password,birthdate) {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "REGISTER/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("userName", encodeURIComponent(userName)) + "/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("firstName", encodeURIComponent(firstName)) + "/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("lastName", encodeURIComponent(lastName)) + "/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("telephone", encodeURIComponent(telephone)) + "/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("email", encodeURIComponent(email)) + "/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("password", encodeURIComponent(password)) + "/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("birthdate", encodeURIComponent(birthdate))})
      }
   """
)
                        

// @LINE:19
def newGelt : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.setter.newGelt",
   """
      function(szDebterName,szAmount,szEntitledName) {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "INSERT_GELT/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("szDebterName", encodeURIComponent(szDebterName)) + "/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("szAmount", encodeURIComponent(szAmount)) + "/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("szEntitledName", encodeURIComponent(szEntitledName))})
      }
   """
)
                        

// @LINE:22
def confirm : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.setter.confirm",
   """
      function(szDebterName,szAmount,szEntitledName) {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "CONFIRMATION/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("szDebterName", encodeURIComponent(szDebterName)) + "/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("szAmount", encodeURIComponent(szAmount)) + "/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("szEntitledName", encodeURIComponent(szEntitledName))})
      }
   """
)
                        
    
}
              

// @LINE:24
class ReverseAssets {
    

// @LINE:24
def at : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Assets.at",
   """
      function(file) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "assets/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("file", file)})
      }
   """
)
                        
    
}
              

// @LINE:13
// @LINE:12
// @LINE:11
class ReverseApplication {
    

// @LINE:13
def Main : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.Main",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "MAIN"})
      }
   """
)
                        

// @LINE:12
def Register : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.Register",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "REGISTER_PAGE"})
      }
   """
)
                        

// @LINE:11
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
        


// @LINE:24
// @LINE:22
// @LINE:21
// @LINE:20
// @LINE:19
// @LINE:18
// @LINE:17
// @LINE:16
// @LINE:15
// @LINE:14
// @LINE:13
// @LINE:12
// @LINE:11
package controllers.ref {


// @LINE:21
// @LINE:18
// @LINE:17
// @LINE:16
// @LINE:15
// @LINE:14
class Reversegetter {
    

// @LINE:17
def getGelts(userName:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.getter.getGelts(userName), HandlerDef(this, "controllers.getter", "getGelts", Seq(classOf[String]), "GET", """""", _prefix + """GET_GELT/$userName<[^/]+>""")
)
                      

// @LINE:15
def isUserNameAlreadyExist(USER_NAME:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.getter.isUserNameAlreadyExist(USER_NAME), HandlerDef(this, "controllers.getter", "isUserNameAlreadyExist", Seq(classOf[String]), "GET", """""", _prefix + """CHECK_USER_NAME/$USER_NAME<[^/]+>""")
)
                      

// @LINE:18
def getUsers(userName:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.getter.getUsers(userName), HandlerDef(this, "controllers.getter", "getUsers", Seq(classOf[String]), "GET", """""", _prefix + """GET_USERS/$userName<[^/]+>""")
)
                      

// @LINE:16
def isEmailAlreadyExist(Email:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.getter.isEmailAlreadyExist(Email), HandlerDef(this, "controllers.getter", "isEmailAlreadyExist", Seq(classOf[String]), "GET", """""", _prefix + """CHECK_EMAIL/$Email<[^/]+>""")
)
                      

// @LINE:21
def checkIfUserIsDebter(szUserName:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.getter.checkIfUserIsDebter(szUserName), HandlerDef(this, "controllers.getter", "checkIfUserIsDebter", Seq(classOf[String]), "GET", """""", _prefix + """IS_DEBTER/$szUserName<[^/]+>""")
)
                      

// @LINE:14
def isLoginPermited(Username:String, Password:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.getter.isLoginPermited(Username, Password), HandlerDef(this, "controllers.getter", "isLoginPermited", Seq(classOf[String], classOf[String]), "POST", """""", _prefix + """LOGIN/$Username<[^/]+>/$Password<[^/]+>""")
)
                      
    
}
                          

// @LINE:22
// @LINE:20
// @LINE:19
class Reversesetter {
    

// @LINE:20
def registerNewUser(userName:String, firstName:String, lastName:String, telephone:String, email:String, password:String, birthdate:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.setter.registerNewUser(userName, firstName, lastName, telephone, email, password, birthdate), HandlerDef(this, "controllers.setter", "registerNewUser", Seq(classOf[String], classOf[String], classOf[String], classOf[String], classOf[String], classOf[String], classOf[String]), "POST", """""", _prefix + """REGISTER/$userName<[^/]+>/$firstName<[^/]+>/$lastName<[^/]+>/$telephone<[^/]+>/$email<[^/]+>/$password<[^/]+>/$birthdate<[^/]+>""")
)
                      

// @LINE:19
def newGelt(szDebterName:String, szAmount:String, szEntitledName:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.setter.newGelt(szDebterName, szAmount, szEntitledName), HandlerDef(this, "controllers.setter", "newGelt", Seq(classOf[String], classOf[String], classOf[String]), "POST", """""", _prefix + """INSERT_GELT/$szDebterName<[^/]+>/$szAmount<[^/]+>/$szEntitledName<[^/]+>""")
)
                      

// @LINE:22
def confirm(szDebterName:String, szAmount:String, szEntitledName:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.setter.confirm(szDebterName, szAmount, szEntitledName), HandlerDef(this, "controllers.setter", "confirm", Seq(classOf[String], classOf[String], classOf[String]), "POST", """""", _prefix + """CONFIRMATION/$szDebterName<[^/]+>/$szAmount<[^/]+>/$szEntitledName<[^/]+>""")
)
                      
    
}
                          

// @LINE:24
class ReverseAssets {
    

// @LINE:24
def at(path:String, file:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Assets.at(path, file), HandlerDef(this, "controllers.Assets", "at", Seq(classOf[String], classOf[String]), "GET", """ Map static resources from the /public folder to the /assets URL path""", _prefix + """assets/$file<.+>""")
)
                      
    
}
                          

// @LINE:13
// @LINE:12
// @LINE:11
class ReverseApplication {
    

// @LINE:13
def Main(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.Main(), HandlerDef(this, "controllers.Application", "Main", Seq(), "GET", """""", _prefix + """MAIN""")
)
                      

// @LINE:12
def Register(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.Register(), HandlerDef(this, "controllers.Application", "Register", Seq(), "GET", """""", _prefix + """REGISTER_PAGE""")
)
                      

// @LINE:11
def index(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.index(), HandlerDef(this, "controllers.Application", "index", Seq(), "GET", """""", _prefix + """""")
)
                      
    
}
                          
}
        
    