package controllers;

import static play.data.Form.form;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.List;

import models.Usuario;
import models.Tema;

import play.data.Form;
import play.db.jpa.Transactional;
import play.mvc.Controller;
import play.mvc.Result;
import views.html.*;


public class TemaController extends Controller {

	//private static Form<Tema> viagemForm = form(Tema.class).bindFromRequest();

	@Transactional
	public static Result showTema(String id) {

		long idLong = Long.parseLong(id);
		return ok(views.html.dicasTema.render(Application.getUsuarioLogado(), getTema(idLong), ""));
	}

	private static Tema getTema(Long id) {
		return Application.getDAO().findByEntityId(Tema.class, id);
	}
	
//	protected static List<Tema> getTemas() {
//		List<Tema> temas = Application.getDAO().findAllByClassName("Tema");
//		if (temas == null) {
//			temas = new ArrayList<Tema>();
//		}
//		return temas;
//	}


}
