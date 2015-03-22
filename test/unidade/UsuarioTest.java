package unidade;

import static org.fest.assertions.Assertions.assertThat;

import java.util.List;

import models.*;
import models.dao.GenericDAO;
import models.dao.GenericDAOImpl;

import org.junit.Test;

import base.AbstractTest;

public class UsuarioTest extends AbstractTest {

	GenericDAO dao = new GenericDAOImpl();
	List<Usuario> usuarios;
	Usuario user;
	
	
	@Test
	public void deveCadastrarUsuario() throws Exception {	
		usuarios = dao.findAllByClassName("Usuario");
        assertThat(usuarios.size()).isEqualTo(0);
        
        user = new Usuario("Joao", "joao@gmail.com", "123456");
        dao.persist(user);
        usuarios = dao.findAllByClassName("Usuario");
        assertThat(usuarios.size()).isEqualTo(1);
        
       	assertThat(user.getNome() == usuarios.get(0).getNome());
		assertThat(user.getId() == usuarios.get(0).getId());
		assertThat(user.getEmail() == usuarios.get(0).getEmail());
		assertThat(user.getSenha() == usuarios.get(0).getSenha());
	}
		
}