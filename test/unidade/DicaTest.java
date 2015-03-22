package unidade;

import static org.fest.assertions.Assertions.assertThat;

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
	Usuario user, user2, user3;
	Dica dicaConselho, dicaMaterialUtil, dicaDisciplinasAnteriores, dicaSemDificuldades;
	
	
	@Test 
	public void deveAdicionarDica() throws Exception {
		user = new Usuario("Joao", "email@gmail.com", "123456");	
		dicaConselho = new DicaConselho(user, "Assista todas as aulas");
		dao.persist(user);
		dao.persist(dicaConselho);
		
		dicas = dao.findAllByClassName("Dica"); 
		assertThat(dicas.size() == 1);
				
		dicaMaterialUtil = new DicaMaterialUtil(user, "https://piazza.com/");
		dao.persist(user);
		dao.persist(dicaMaterialUtil);
		
		dicas = dao.findAllByClassName("Dica"); 
		assertThat(dicas.size() == 2);
		

		dicaDisciplinasAnteriores = new DicaDisciplinasAnteriores(user, "Programação 2", "É preciso ter uma boa base de programação orientada a objetos.");
		dao.persist(user);
		dao.persist(dicaDisciplinasAnteriores);
		
		dicas = dao.findAllByClassName("Dica"); 
		assertThat(dicas.size() == 3);
		
		dicaSemDificuldades = new DicaSemDificuldades(user, "Orientação a objetos.");
		dao.persist(user);
		dao.persist(dicaSemDificuldades);
		
		dicas = dao.findAllByClassName("Dica"); 
		assertThat(dicas.size() == 4);
		
		assertThat(((DicaConselho) dicas.get(0)).getConselho()).isEqualTo("Assista todas as aulas");
		assertThat(((DicaMaterialUtil) dicas.get(1)).getUrlDoMaterial()).isEqualTo("https://piazza.com/");
		assertThat(((DicaDisciplinasAnteriores) dicas.get(2)).getNomeDaDisciplina()).isEqualTo("Programação 2");
		assertThat(((DicaDisciplinasAnteriores) dicas.get(2)).getRazao()).isEqualTo("É preciso ter uma boa base de programação orientada a objetos.");
		assertThat(((DicaSemDificuldades) dicas.get(3)).getNomeDoAssunto()).isEqualTo("Orientação a objetos.");

		
	}
	
	@Test 
	public void deveConcordarDica() throws Exception {
		user = new Usuario("Joao", "joao@gmail.com", "123456");		
		dicaConselho = new DicaConselho(user, "Assista todas as aulas");
		dao.persist(user);
		dao.persist(dicaConselho);
		
		assertThat(dicaConselho.getQuantConcordancias() == 0);
		assertThat(dicaConselho.getQuantDiscordancias() == 0);
		assertThat(dicaConselho.getIndiceConcordancia()).isEqualTo(0);

		dicaConselho.concordar(user);	
		assertThat(dicaConselho.getQuantConcordancias() == 1);
		assertThat(dicaConselho.getQuantDiscordancias()== 0);
		assertThat(dicaConselho.getIndiceConcordancia()).isEqualTo(1);

		dicaConselho.concordar(user);
		assertThat(dicaConselho.getQuantConcordancias() == 0);
		assertThat(dicaConselho.getQuantDiscordancias() == 0);
		dicaConselho.discordar(user, "");
		assertThat(dicaConselho.getQuantConcordancias() == 0);
		assertThat(dicaConselho.getQuantDiscordancias() == 1);
		dicaConselho.concordar(user);
		assertThat(dicaConselho.getQuantConcordancias() == 1);
		assertThat(dicaConselho.getQuantDiscordancias() == 0);
		
	}

	@Test
	public void deveDiscordarDica() throws Exception {
		user = new Usuario("Joao", "joao@gmail.com", "123456");		
		dicaConselho = new DicaConselho(user, "Assista todas as aulas");
		dao.persist(user);
		dao.persist(dicaConselho);
		
		assertThat(dicaConselho.getQuantConcordancias() == 0);
		assertThat(dicaConselho.getQuantDiscordancias()== 0);
		assertThat(dicaConselho.getIndiceConcordancia()).isEqualTo(0);
		
		dicaConselho.discordar(user, "");	
		assertThat(dicaConselho.getQuantConcordancias() == 0);
		assertThat(dicaConselho.getQuantDiscordancias() == 1);
		assertThat(dicaConselho.getIndiceConcordancia()).isEqualTo(0);
		dicaConselho.discordar(user, "");
		assertThat(dicaConselho.getQuantConcordancias() == 0);
		assertThat(dicaConselho.getQuantDiscordancias() == 0);
		dicaConselho.concordar(user);
		assertThat(dicaConselho.getQuantConcordancias() == 1);
		assertThat(dicaConselho.getQuantDiscordancias() == 0);
		dicaConselho.discordar(user, "");
		assertThat(dicaConselho.getQuantConcordancias() == 0);
		assertThat(dicaConselho.getQuantDiscordancias() == 1);
	}
	
	
	@Test
	public void deveDenunciarDica() throws Exception{
		user = new Usuario("Joao", "joao@gmail.com", "123456");		
		user2 = new Usuario("Maria", "maria@gmail.com", "123456");
		user3 = new Usuario("Jose", "jose@gmail.com", "123456");	
		dicaConselho = new DicaConselho(user, "Assista todas as aulas");
		dao.persist(user);
		dao.persist(dicaConselho);
		assertThat(dicaConselho.getQuantDenuncias() == 0);
		dicaConselho.denunciar(user);
		assertThat(dicaConselho.getQuantDenuncias() == 1);
		dicaConselho.denunciar(user2);
		assertThat(dicaConselho.getQuantDenuncias() == 2);
		dicaConselho.denunciar(user3);
		assertThat(dicaConselho.getQuantDenuncias() == 0);
		
	}
	
	@Test
	public void deveAdicionarFrase() throws Exception{
		user = new Usuario("Joao", "joao@gmail.com", "123456");
		dicaConselho = new DicaConselho(user, "Não faça um miniteste se não tiver sabendo tudo.");
		dao.persist(user);
		dao.persist(dicaConselho);
		assertThat(dicaConselho.getFrasesDicaDiscordada().size() == 0);
		dicaConselho.discordar(user, "Faça todos os minitestes, no final do período será eliminado um percentual.");
		assertThat(dicaConselho.getFrasesDicaDiscordada().size() == 1);
		dicaConselho.discordar(user, "");
		assertThat(dicaConselho.getFrasesDicaDiscordada().size() == 0);
		dicaConselho.discordar(user, "Faça todos os minitestes, no final do período será eliminado um percentual.");
		assertThat(dicaConselho.getFrasesDicaDiscordada().size() == 1);
		dicaConselho.concordar(user);
		assertThat(dicaConselho.getFrasesDicaDiscordada().size() == 0);
		
		
	}
}