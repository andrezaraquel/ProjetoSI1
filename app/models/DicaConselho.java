package models;

import javax.persistence.Entity;

@Entity
public class DicaConselho extends DicaSimples {

		
	private String conselho;
	
	public DicaConselho() {
	}
	
	public DicaConselho(String conselho) {
		this.conselho = conselho;
	}

	public String getConselho() {
		return conselho;
	}

	public void setConselho(String conselho) {
		this.conselho = conselho;
	}
	
	
	
	
	public void isDicaValida(String conselho) throws Exception{
		if (conselho == null) {
			throw new Exception("Conselho não pode ser nulo");
		}
		if (conselho.trim().equals("")) {
			throw new Exception("Conselho não pode ser vazio");
		}
		if (conselho.length() > 100) { //Decidir o tamanho
			throw new Exception("Conselho muito longo");
		}
		this.conselho = conselho;
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