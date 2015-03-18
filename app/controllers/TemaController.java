package controllers;


import java.util.ArrayList;
import java.util.List;
import models.Tema;

import play.db.jpa.Transactional;
import play.mvc.Controller;
import play.mvc.Result;
import views.html.*;


public class TemaController extends Controller {

	@Transactional
	public static Result showTema(String id) {

		long idLong = Long.parseLong(id);
		
		return ok(dicasTema.render(Application.getUsuarioLogado(), getTema(idLong)));
	}
	
	private static Tema getTema(Long id) {
		return Application.getDAO().findByEntityId(Tema.class, id);
	}
	
	protected static List<Tema> getTemas() {
		List<Tema> temas = Application.getDAO().findAllByClass(Tema.class);
		if (temas == null) {
			temas = new ArrayList<Tema>();
		}
	
		return temas;
	}


}
