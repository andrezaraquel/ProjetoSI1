package unidade;

import static org.fest.assertions.Assertions.assertThat;
import static org.junit.Assert.*;

import java.util.List;
import models.*;
import models.dao.GenericDAO;
import models.dao.GenericDAOImpl;

import org.junit.Test;

import base.AbstractTest;

public class DicaTest extends AbstractTest {

	GenericDAO dao = new GenericDAOImpl();
	List<Dica> dicas;
	List<Usuario> usuarios;
	Usuario user;
	@Test
	public void deveConcordarDica() throws Exception{
		user = new Usuario("Joao", "email@gmail.com", "123456");		
		Dica dicaConselho = new DicaConselho(user, "Conselho");
		dao.persist(user);
		dao.persist(dicaConselho);
		
		assertThat(dicaConselho.getListaConcordancia().size() == 0);
		dicaConselho.concordar(user);			
		assertThat(dicaConselho.getListaConcordancia().size() == 1);
		
		
	}
	@Test
	public void deveSalvarDica() throws Exception {
		dicas = dao.findAllByClassName("Dica"); //consulta o bd
		assertThat(dicas.size()).isEqualTo(0);
		
		user = new Usuario("Joao", "email@gmail.com", "123456");
		
		Dica dicaConselho = new DicaConselho(user, "Conselho");
		dao.persist(dicaConselho);
		
		dicas = dao.findAllByClassName("Dica"); //consulta o bd
		assertThat(dicas.size()).isEqualTo(1);
		assertThat(((DicaConselho) dicas.get(0)).getConselho()).isEqualTo("Conselho");
		
		assertEquals(user.getNome(), dicas.get(0).getNameUser());
		assertEquals(user.getId(), dicas.get(0).getIdUser());

		
	}
	
	@Test
	public void deveSalvarUsuario() throws Exception{
		usuarios = dao.findAllByClassName("Usuario"); //consulta o bd
		assertThat(usuarios.size()).isEqualTo(0);
		
		user = new Usuario("Joao", "email@gmail.com", "123456");
		dao.persist(user);
		
		usuarios = dao.findAllByClassName("Usuario");
		assertThat(usuarios.size()).isEqualTo(1);	
		
		assertEquals(user.getNome(), usuarios.get(0).getNome());
		assertEquals(user.getId(), usuarios.get(0).getId());
		assertEquals(user.getEmail(), usuarios.get(0).getEmail());
		assertEquals(user.getSenha(), usuarios.get(0).getSenha());
	}
	
}