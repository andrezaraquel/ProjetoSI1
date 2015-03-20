package models;

import javax.persistence.Entity;

@Entity
public class MetaDica extends Dica {

	public MetaDica() {}
	
	public MetaDica(Usuario user) {
		super(user);
	}
	@Override
	public int compareTo(Dica arg0) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public String exibir() {
		// TODO Auto-generated method stub
		return null;
	}	
}