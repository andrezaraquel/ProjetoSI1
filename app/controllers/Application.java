package controllers;

import java.util.List;

import models.Usuario;
import models.dao.GenericDAO;
import models.dao.GenericDAOImpl;
import play.*;
import play.db.jpa.Transactional;
import play.mvc.*;
import views.html.*;

public class Application extends Controller {

	private static GenericDAO dao = new GenericDAOImpl();

	@Transactional
	public static Result index() {
		if (session().get("user") == null) {
			return redirect(routes.AutenticacaoController.showLogin());
		}
		return ok(index.render("Portal do Leite"));
	} 

	protected static Usuario getUsuarioLogado() {
		Usuario user = new Usuario();
		if (listaUsuariosLogados().size() > 0) {
			if (listaUsuariosLogados().get(0) != null) {
				user = (Usuario) dao.findByAttributeName("Usuario", "email", session().get("user")).get(0);
			}
		}
		return user;
	}

	private static List<Usuario> listaUsuariosLogados() {
		return dao.findByAttributeName("Usuario", "email", session().get("user"));
	}

	@Transactional
	protected static void salvaObjeto(Object obj) {
		dao.persist(obj);
		dao.merge(obj);
		dao.flush();
	}

	protected static GenericDAO getDAO() {
		return dao;
	}

}
