package controllers;

import play.*;
import play.mvc.*;

import views.html.*;

public class Application extends Controller {

	public static Result index() {
		System.out.println("\n[INFO] Hello server\n");
		return redirect("assets/index.html");
	}
	
	public static Result Register(){
		return redirect("assets/index.html");
	}
	
	public static Result Main(){
		return redirect("assets/index.html");
	}


}
