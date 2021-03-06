package models;

import javax.persistence.Entity;

@Entity
public class DicaConselho extends Dica {

	private String conselho;
	
	public DicaConselho() {}
	
	public DicaConselho(Usuario user, String conselho) {
		super(user);
		this.conselho = conselho;
	}

	public String getConselho() {
		return conselho;
	}

	public void setConselho(String conselho) {
		this.conselho = conselho;
	}
	
	
	@Override
	public String exibirLabel(){
		String label = "<span class=\"label label-info\">" + "Conselho" + "</span>";
		return label;
	}
	@Override
	public String exibirDica() {
		String textConselho = "<h5>" + conselho + "</h5>";
		return textConselho;
	}

}
