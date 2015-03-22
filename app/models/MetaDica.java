package models;

import javax.persistence.Entity;

@Entity
public class MetaDica extends Dica {

	public MetaDica() {}
	
	public MetaDica(Usuario user) {
		super(user);
	}
	

	@Override
	public String exibir() {
		// TODO Auto-generated method stub
		return null;
	}	
}