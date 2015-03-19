package models;

import javax.persistence.Entity;

@Entity
public class DicaConselho extends Dica {

		
	private String conselho;
	
	public DicaConselho() {}
	
	public DicaConselho(String conselho) {
		this.conselho = conselho;
	}

	public String getConselho() {
		return conselho;
	}

	public void setConselho(String conselho) {
		this.conselho = conselho;
	}
	
//	public void isDicaValida(String conselho) throws Exception{
//		if (conselho == null) {
//			throw new Exception("Conselho não pode ser nulo");
//		}
//		if (conselho.trim().equals("")) {
//			throw new Exception("Conselho não pode ser vazio");
//		}
//		if (conselho.length() > 100) { //Decidir o tamanho
//			throw new Exception("Conselho muito longo");
//		}
//		this.conselho = conselho;
//	}

	@Override
	public int compareTo(Dica o) {
		// TODO Auto-generated method stub
		return 0;
	}

	
	@Override
	public String exibir() {
		String label = "<span class=\"label label-info\">" + "Conselho" + "</span>";
		String textConselho = "<h5>" + conselho + "</h5>";
		return textConselho + label + "<br>";
	}
	
}
