package controllers;


import java.util.ArrayList;
import java.util.List;

import models.Dica;
import models.DicaConselho;
import models.DicaDisciplinasAnteriores;
import models.DicaMaterialUtil;
import models.DicaSemDificuldades;
import models.Tema;
import models.Usuario;
import play.data.DynamicForm;
import play.data.Form;
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

	@Transactional
	public static Result concordar(String id) {

		long idLong = Long.parseLong(id);
		Dica dica = getDica(idLong);
		try {
			dica.concordar(Application.getUsuarioLogado());
		} catch (Exception e) {
			return ok(index.render(Application.getUsuarioLogado(), getTemas(), e.getMessage()));

		}
		return ok(index.render(Application.getUsuarioLogado(), getTemas(), ""));
	
	}	
	
	@Transactional
	public static Result discordar(String id) {

		long idLong = Long.parseLong(id);
		Dica dica = getDica(idLong);
		try {
			dica.discordar(Application.getUsuarioLogado());
		} catch (Exception e) {
			return ok(index.render(Application.getUsuarioLogado(), getTemas(), e.getMessage()));

		}
		return ok(index.render(Application.getUsuarioLogado(), getTemas(), ""));
	
	}
	
	
	@Transactional
	public static Result denunciar(String id) {

		long idLong = Long.parseLong(id);
		Dica dica = getDica(idLong);
		try {
			dica.denunciar( Application.getUsuarioLogado());
		} catch (Exception e) {
			return ok(index.render(Application.getUsuarioLogado(), getTemas(), e.getMessage()));

		}
		return ok(index.render(Application.getUsuarioLogado(), getTemas(), ""));
	}
	
	

	@Transactional
	public static Result addDicaSemDificuldade(){    	

		DynamicForm form = Form.form().bindFromRequest();

		String idTema = form.field("idTema").value();		
		String nomeDoAssunto = form.field("assunto").value();

		Dica dica = new DicaSemDificuldades( Application.getUsuarioLogado(), nomeDoAssunto);

		Application.salvaObjeto(dica); 

		long idTemaLong = Long.parseLong(idTema);
		Tema tema = getTema(idTemaLong);
		tema.adicionarDica(dica);
		
		
		Application.salvaObjeto(tema);
		Application.salvaObjeto(Application.getUsuarioLogado());

		return showTema(idTema);
	} 

	@Transactional
	public static Result addDicaConselho(){    	

		DynamicForm form = Form.form().bindFromRequest();

		String idTema = form.field("idTema").value();		
		String conselho = form.field("conselho").value();

		Dica dica = new DicaConselho(Application.getUsuarioLogado(), conselho);

		Application.salvaObjeto(dica); 

		long idTemaLong = Long.parseLong(idTema);
		Tema tema = getTema(idTemaLong);
		tema.adicionarDica(dica);
		Application.salvaObjeto(tema);
		Application.salvaObjeto(Application.getUsuarioLogado());
		return showTema(idTema);
	} 

	@Transactional
	public static Result addDicaMaterialUtil(){    	

		DynamicForm form = Form.form().bindFromRequest();

		String idTema = form.field("idTema").value();		
		String  urlDoMaterial = form.field("urlMaterial").value();

		Dica dica = new DicaMaterialUtil( Application.getUsuarioLogado(), urlDoMaterial);

		Application.salvaObjeto(dica); 

		long idTemaLong = Long.parseLong(idTema);
		Tema tema = getTema(idTemaLong);
		tema.adicionarDica(dica);
		Application.salvaObjeto(tema);
		Application.salvaObjeto(Application.getUsuarioLogado());
		return showTema(idTema);
	} 


	@Transactional
	public static Result addDicaDiscAnteriores(){    	

		DynamicForm form = Form.form().bindFromRequest();

		String idTema = form.field("idTema").value();		
		String nomeDaDisciplina = form.field("disciplina").value();
		String razao = form.field("razao").value();

		
		Dica dica = new DicaDisciplinasAnteriores( Application.getUsuarioLogado(), nomeDaDisciplina, razao);

		Application.salvaObjeto(dica); 

		long idTemaLong = Long.parseLong(idTema);
		Tema tema = getTema(idTemaLong);
		tema.adicionarDica(dica);
		Application.salvaObjeto(tema);
		Application.salvaObjeto(Application.getUsuarioLogado());
		return showTema(idTema);

	} 
	
	@Transactional
	private static Usuario getUsuarioId(Long id){
		return Application.getDAO().findByEntityId(Usuario.class, id);
	}

	@Transactional
	private static Tema getTema(Long id) {
		return Application.getDAO().findByEntityId(Tema.class, id);
	}

	@Transactional
	private static Dica getDica(Long id) {
		return Application.getDAO().findByEntityId(Dica.class, id);
	}

	@Transactional
	protected static List<Tema> getTemas() {
		List<Tema> temas = Application.getDAO().findAllByClassName("Tema");
		if (temas == null) {
			temas = new ArrayList<Tema>();
		}

		return temas;
	}


}
