import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

import models.dao.GenericDAO;
import models.dao.GenericDAOImpl;
import models.Tema;
import models.Usuario;
import play.*;
import play.db.jpa.JPA;

public class Global extends GlobalSettings{
	
	private GenericDAO dao = new GenericDAOImpl();
	private List<Tema> temas = new LinkedList<Tema>();
	private List<Usuario> usuarios = new LinkedList<Usuario>();
	
	public void onStart(Application app){
		JPA.withTransaction(new play.libs.F.Callback0() {
            @Override
            public void invoke() throws Throwable {
            	Logger.info("Aplicacao inicializada...");
            	
            	if(dao.findAllByClassName("Tema").isEmpty()){	
	                temas.add(new Tema("Análise x Design"));
					temas.add(new Tema("Arquitetura de Software"));
					temas.add(new Tema("Heroku"));
					temas.add(new Tema("HTML, CSS e Bootstrap"));
					temas.add(new Tema("Javascript"));
					temas.add(new Tema("Laboratórios"));
	               	temas.add(new Tema("Minitestes"));
	            	temas.add(new Tema("Orientação a Objetos"));
	            	temas.add(new Tema("Padros de Projeto GRASP"));
	            	temas.add(new Tema("Padrões de Projeto GoF"));
	            	temas.add(new Tema("Play Framework"));
					temas.add(new Tema("Projeto"));
	            	
					usuarios.add(new Usuario("Andreza Raquel", "andrezaraquel@gmail.com", "123456"));
					usuarios.add(new Usuario("Daniela Costa", "danielacosta@gmail.com", "123456"));
					usuarios.add(new Usuario("Maria Helena", "maria@gmail.com", "123456"));

	            	
	            	Iterator<Tema> it = temas.iterator();
	            	while(it.hasNext()){
	            	   salvaObjeto(it.next());
	               }
	            	Iterator<Usuario> it_u = usuarios.iterator();
	            	while(it_u.hasNext()){
	            	   salvaObjeto(it_u.next());
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