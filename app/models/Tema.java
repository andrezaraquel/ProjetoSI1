package models;


import models.Dica;
import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToOne;

public class Tema {
	
	@Id
	@GeneratedValue
	private long id;

	@OneToOne
	private Usuario organizador;

	@ManyToMany
	private List<Dica> dicas;
	
	private String nome;

	
	public Tema() {
		dicas = new ArrayList<Dica>();
	}
	
	

	public void setId(long id) {
		this.id = id;
	}


	public long getId() {
		return id;
	}

	public String getIdString() {
		return "" + id;
	}
	
	public boolean isEmpty() {
		if (dicas.isEmpty()) {
			return true;
		}
		return false;
	}
	
	//Permite adicionar uma nova dica
	public void adicionarDica(Dica dica) {
		dicas.add(dica);
		Collections.sort(this.getDicas());
	}
	
	//Permite remover uma dica
	public void removerDica(Dica dica){
		
	}
	
	//Retorna a lista de dicas
	public List<Dica> getDicas() {
		return dicas;
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}


}
