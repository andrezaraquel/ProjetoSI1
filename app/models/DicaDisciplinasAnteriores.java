package models;

import javax.persistence.Entity;

@Entity
public class DicaDisciplinasAnteriores extends Dica {

	private String nomeDaDisciplina, razao;
	
	public DicaDisciplinasAnteriores() {}
	
	public DicaDisciplinasAnteriores(String nomeDaDisciplina, String razao) {
		this.nomeDaDisciplina = nomeDaDisciplina;
		this.razao = razao;
	}

	public String getNomeDaDisciplina() {
		return nomeDaDisciplina;
	}

	public void setNomeDaDisciplina(String nomeDaDisciplina) {
		this.nomeDaDisciplina = nomeDaDisciplina;
	}

	public String getRazao() {
		return razao;
	}

	public void setRazao(String razao) {
		this.razao = razao;
	}
	
	
//	public void isDicaValida(String razao) throws Exception{
//		if (razao == null) {
//			throw new Exception("Nome ou Razao não pode ser nulo");
//		}
//		if (razao.trim().equals("")) {
//			throw new Exception("Nome ou razão não pode ser vazio");
//		}
//		if (razao.length() > 50) { //Decidir o tamanho
//			throw new Exception("Nome ou razão muito longa");
//		}
//		this.razao = razao;
//	}

	@Override
	public int compareTo(Dica o) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public String exibir() {
		return "<h1>Nome da Disciplina: "+ nomeDaDisciplina+"</h1>" +
	
				"<h4>Motivo: " +getRazao()+" </h4>";
	}	
	
}
