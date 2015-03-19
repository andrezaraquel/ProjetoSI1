package models;

import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import java.util.Map;
import java.util.Map.Entry;
import java.util.HashMap;
import java.util.Iterator;

@Entity
public abstract class Dica implements Comparable<Dica> {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private long id;
	@ElementCollection
	private Map<Usuario, Boolean> relacaoConcordancia;
	@ElementCollection
	private Map<Usuario, Boolean> relacaoDiscordancia;
	
	public Dica() {
		this.relacaoConcordancia = new HashMap<Usuario, Boolean>();
		this.relacaoDiscordancia = new HashMap<Usuario, Boolean>();		
	}	
	
	public void concordar(Usuario user) throws Exception {		
		if (!relacaoConcordancia.containsKey(user) || !relacaoDiscordancia.containsKey(user)) {
			this.relacaoConcordancia.put(user, true);
		} else {
			throw new Exception("Você só pode concordar/discordar uma vez!");
		}
	}
	
	public void discordar(Usuario user) throws Exception {
		if (!relacaoConcordancia.containsKey(user) || !relacaoDiscordancia.containsKey(user)) {
			this.relacaoDiscordancia.put(user, true);
		} else {
			throw new Exception("Você só pode concordar/discordar uma vez!");
		}		
	}	

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}
	
	public int getQuantConcordancia() {
		return relacaoConcordancia.size(); 
	}

	public int getQuantDiscordancia() {
		return relacaoDiscordancia.size();
	}

	public Map<Usuario, Boolean> getRelacaoConcordancia() {
		return relacaoConcordancia;
	}

	public Map<Usuario, Boolean> getRelacaoDiscordancia() {
		return relacaoDiscordancia;
	}
	
	public void comentar(Usuario user, String comentario) {
		//comentar uma dica
	}
		
	public abstract String exibir();
	
}