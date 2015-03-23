package unidade;

import static org.fest.assertions.Assertions.assertThat;

import java.util.ArrayList;
import java.util.List;

import models.*;
import models.dao.GenericDAO;
import models.dao.GenericDAOImpl;

import org.junit.Test;

import base.AbstractTest;

public class TemaTest extends AbstractTest {

	GenericDAO dao = new GenericDAOImpl();
	List<Dica> dicas;
	List<Usuario> usuarios;
	List<Tema> temas;
	Usuario user, user2, user3;
	Dica dicaConselho, dicaMaterialUtil, dicaDisciplinasAnteriores, dicaSemDificuldades;
	
	
	@Test 
	public void deveAvaliarTema() throws Exception{
		temas = dao.findAllByClassName("Tema");
		user = new Usuario("joao", "joao@gmail.com", "123456");
		Tema tema = new Tema("Arquitetura");
		dao.persist(user);
		assertThat(tema.getNome() == "Arquitetura");
		assertThat(temas.size() == 12);
		dao.persist(tema);
	
		assertThat(tema.getValoresAvaliacoes().size() == 0);
		tema.avaliarTema(user, AvaliacaoDoTema.FACIL);
		assertThat(tema.getValoresAvaliacoes().size() == 1);
		
		System.out.println("======================");
		assertThat(tema.getAvaliacaoMedia() == -1.0);
		System.out.println(tema.getAvaliacaoMedia());
		System.out.println("======================");
		System.out.println(tema.getAvaliacaoMediana());
		assertThat(tema.getAvaliacaoMediana() == -1);
		
		
	}
	
}