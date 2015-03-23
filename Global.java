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
	
		private String[] temasPadrao = {"Análise x Design", "Arquitetura de Software", "Heroku", "HTML, CSS e Bootstrap", "Javascript","Laboratórios", "Minitestes", "Orientação a Objetos", "Padros de Projeto GRASP", "Padrões de Projeto GoF", "Play Framework", "Projeto"};
		private String[] nomeUsuariosPadrao = {"Andreza", "Daniela", "João", "Maria", "José", "Paula", "Marcos", "Arthur", "Bruno", "Raquel", "Rayssa", "Lucas", "Claúdia", "Abner", "Douglas"};
		private String[] emailUsuariosPadrao = {"andreza@gmail.com", "daniela@gmail.com", "joao@gmail.com", "maria@gmail.com", "jose@hotmail.com", "paula@hotmail.com", "marcos@gmail.com", "arthur@gmail.com", "bruno@hotmail.com", "raquel@gmail.com", "rayssa@gmail.com", "lucas@yahoo.com.br", "claudia@yahoo.com", "abner@yahoo.com.br", "douglas@yahoo.com.br"};				
		private String[] senhaUsuariosPadrao = {"123456", "123456", "123456", "123456", "123456", "123456", "123456", "123456", "123456","123456", "123456", "123456","123456","123456","123456"};
	
	
		public void onStart(Application app){
			JPA.withTransaction(new play.libs.F.Callback0() {
	            @Override
	            public void invoke() throws Throwable {
	            	Logger.info("Aplicacao inicializada...");
	            	
	            	if(dao.findAllByClassName("Tema").isEmpty()){	
	
						for (String tema : temasPadrao){
								temas.add(new Tema(tema));
							
						}
						for(int i=0; i < nomeUsuariosPadrao.length; i++ ){
							usuarios.add(new Usuario(nomeUsuariosPadrao[i], emailUsuariosPadrao[i], senhaUsuariosPadrao[i]));
						}
				
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
							
						