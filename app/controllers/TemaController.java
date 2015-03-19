package controllers;


import java.util.ArrayList;
import java.util.List;

import models.Dica;
import models.DicaConselho;
import models.DicaDisciplinasAnteriores;
import models.DicaMaterialUtil;
import models.DicaSemDificuldades;
import models.Tema;
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
    public static Result addDicaSemDificuldade(){    	
    	
		DynamicForm form = Form.form().bindFromRequest();
		    	
		String idTema = form.field("idTema").value();		
    	String nomeDoAssunto = form.field("assunto").value();
    	
    	Dica dica = new DicaSemDificuldades(nomeDoAssunto);
    	
    	Application.salvaObjeto(dica); 
    	
    	long idTemaLong = Long.parseLong(idTema);
    	Tema tema = getTema(idTemaLong);
    	tema.adicionarDica(dica);
    	
    	return showTema(idTema);
    } 
	
	@Transactional
    public static Result addDicaConselho(){    	
    	
		DynamicForm form = Form.form().bindFromRequest();
		    	
		String idTema = form.field("idTema").value();		
    	String conselho = form.field("conselho").value();
    	
    	Dica dica = new DicaConselho(conselho);
    	
    	Application.salvaObjeto(dica); 
    	
    	long idTemaLong = Long.parseLong(idTema);
    	Tema tema = getTema(idTemaLong);
    	tema.adicionarDica(dica);
    	
    	return showTema(idTema);
    } 
	
	@Transactional
    public static Result addDicaMaterialUtil(){    	
    	
		DynamicForm form = Form.form().bindFromRequest();
		    	
		String idTema = form.field("idTema").value();		
    	String  urlDoMaterial = form.field("urlMaterial").value();
    	
    	Dica dica = new DicaMaterialUtil(urlDoMaterial);
    	
    	Application.salvaObjeto(dica); 
    	
    	long idTemaLong = Long.parseLong(idTema);
    	Tema tema = getTema(idTemaLong);
    	tema.adicionarDica(dica);
    	
    	return showTema(idTema);
    } 
	
	
	@Transactional
    public static Result addDicaDiscAnteriores(){    	
    	
		DynamicForm form = Form.form().bindFromRequest();
		    	
		String idTema = form.field("idTema").value();		
    	String nomeDaDisciplina = form.field("disciplina").value();
    	String razao = form.field("razao").value();
    	
    	Dica dica = new DicaDisciplinasAnteriores(nomeDaDisciplina, razao);
    	
    	Application.salvaObjeto(dica); 
    	
    	long idTemaLong = Long.parseLong(idTema);
    	Tema tema = getTema(idTemaLong);
    	tema.adicionarDica(dica);
    	
    	return showTema(idTema);
    	
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
