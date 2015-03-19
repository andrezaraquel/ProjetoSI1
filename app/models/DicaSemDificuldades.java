package models;

import javax.persistence.Entity;

@Entity
public class DicaSemDificuldades extends Dica {

	private String nomeDoAssunto;
	
	public DicaSemDificuldades() {}
	
	public DicaSemDificuldades(String nomeDoAssunto) {	
		this.nomeDoAssunto = nomeDoAssunto;
	}

	public String getNomeDoAssunto() {
		return nomeDoAssunto;
	}

	public void setNomeDoAssunto(String nomeDoAssunto) {
		this.nomeDoAssunto = nomeDoAssunto;
	}

	@Override
	public int compareTo(Dica o) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public String exibir() {
		// TODO Auto-generated method stub
		return null;
	}

}
