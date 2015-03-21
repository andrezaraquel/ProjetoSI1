package models;

import javax.persistence.Entity;

@Entity
public class DicaSemDificuldades extends Dica {

	private String nomeDoAssunto;
	
	public DicaSemDificuldades() {}
	
	public DicaSemDificuldades(Usuario user, String nomeDoAssunto) {	
		super(user);
		this.nomeDoAssunto = nomeDoAssunto;
	}

	public String getNomeDoAssunto() {
		return nomeDoAssunto;
	}

	public void setNomeDoAssunto(String nomeDoAssunto) {
		this.nomeDoAssunto = nomeDoAssunto;
	}

	
	public int compareTo(Dica o) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public String exibir() {
		String label = "<span class=\"label label-info\">" + "O que você precisa saber para não ter dificuldades" + "</span>";
		String textAssunto = "<h5>" + nomeDoAssunto + "</h5>";
		return textAssunto + label + "<br>" ;
	}

}
