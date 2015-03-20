package models;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

import com.fasterxml.jackson.annotation.JsonBackReference;

import java.util.ArrayList;
import java.util.List;


@Entity
public abstract class Dica implements Comparable<Dica> {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private long id;
	
	@ManyToMany(cascade=CascadeType.ALL)
	@JsonBackReference
	private List<Usuario> relacaoConcordancia;
	@ManyToMany(cascade=CascadeType.ALL)
	@JsonBackReference
	private List<Usuario> relacaoDiscordancia;
	
	public Dica() {
		this.relacaoConcordancia = new ArrayList<Usuario>();
		this.relacaoDiscordancia = new ArrayList<Usuario>();		
	}	
	
	public void concordar(Usuario user) throws Exception {		
		if (!relacaoConcordancia.contains(user) || !relacaoDiscordancia.contains(user)) {
			this.relacaoConcordancia.add(user);
		} else {
			throw new Exception("Você só pode concordar/discordar uma vez!");
		}
	}
	
	public void discordar(Usuario user) throws Exception {
		if (!relacaoConcordancia.contains(user) || !relacaoDiscordancia.contains(user)) {
			this.relacaoDiscordancia.add(user);
		} else {
			throw new Exception("Você só pode concordar/discordar uma vez!");
		}		
	}	

	public long getId() {
		return id;
	}

	public String getIdString() {
		return "" + id;
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

	public List<Usuario> getRelacaoConcordancia() {
		return relacaoConcordancia;
	}

	public List<Usuario> getRelacaoDiscordancia() {
		return relacaoDiscordancia;
	}
	
	public void comentar(Usuario user, String comentario) {
		//comentar uma dica
	}
		
	public abstract String exibir();
	
}