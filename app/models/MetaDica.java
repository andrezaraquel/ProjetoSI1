package models;

import javax.persistence.Entity;

@Entity
public class MetaDica extends Dica {

	public MetaDica() {}
	
	public MetaDica(Usuario user) {
		super(user);
	}
	
	@Override
	public String exibirDica() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String exibirLabel() {
		// TODO Auto-generated method stub
		return null;
	}	
}