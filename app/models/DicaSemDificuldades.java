package models;

import javax.persistence.Entity;

@Entity
public class DicaSemDificuldades extends DicaSimples {

	private String nomeDoAssunto;
	
	public DicaSemDificuldades() {
	}
	
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
	public void cadastrar(Usuario usuario, Dica dica) throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void isDicaValida(Dica dica) throws Exception {
		// TODO Auto-generated method stub
		
	}
	
}
