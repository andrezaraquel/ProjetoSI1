import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

import models.dao.GenericDAO;
import models.Tema;
import play.*;
import play.db.jpa.JPA;

public class Global extends GlobalSettings{
	
	private GenericDAO dao = new GenericDAO();
	private List<Tema> temas = new LinkedList<Tema>();
	
	public void onStart(Application app){
		JPA.withTransaction(new play.libs.F.Callback0() {
            @Override
            public void invoke() throws Throwable {
            	Logger.info("Aplicacao inicializada...");
            	
            	if(dao.findAllByClass(Tema.class).isEmpty()){
	                temas.add(new Tema("Analise X Design"));
					temas.add(new Tema("Arquitetura de Software"));
					temas.add(new Tema("Heroku"));
					temas.add(new Tema("HTML, CSS e Bootstrap"));
					temas.add(new Tema("Javascript"));
					temas.add(new Tema("Laboratorios"));
	               	temas.add(new Tema("Minitestes"));
	            	temas.add(new Tema("Orientacao a Objetos"));
	            	temas.add(new Tema("Padros de Projeto GRASP"));
	            	temas.add(new Tema("Padroes de Projeto GoF"));
	            	temas.add(new Tema("Play Framework"));
					temas.add(new Tema("Projeto"));
	            	
	            	
	            	Iterator<Tema> it = temas.iterator();
	            	while(it.hasNext()){
	            	   salvaObjeto(it.next());
	               }
            	}
            }
            
        	private void salvaObjeto(Object obj) {
				dao.persist(obj);
				dao.merge(obj);
				dao.flush();
			}
           
        });
		
		
	}
	
//	public void onStop(Application app){
//		Logger.info("Aplicacao finalizada");
//	}
}