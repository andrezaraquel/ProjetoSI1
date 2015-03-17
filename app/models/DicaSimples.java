package models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import models.Usuario;

@Entity
public abstract class DicaSimples extends Dica {

	public void DicaSimples() {		
	}

	public abstract void cadastrar(Usuario usuario, Dica dica) throws Exception;

	public abstract void isDicaValida(Dica dica) throws Exception;
		
}