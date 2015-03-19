package models;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.persistence.Entity;

@Entity
public class DicaMaterialUtil extends Dica {

	private String urlDoMaterial;
	
	public DicaMaterialUtil() {}
	
	public DicaMaterialUtil(String url) {
		this.urlDoMaterial = url;
	}

	public String getUrlDoMaterial() {
		return urlDoMaterial;
	}

	public void setUrlDoMaterial(String urlDoMaterial) {
		this.urlDoMaterial = urlDoMaterial;
	}

//	public void isDicaValida(String urlDoMaterial) throws Exception{
//		if (urlDoMaterial == null) {
//			throw new Exception("Url não pode ser nulo");
//		}
//		if (urlDoMaterial.trim().equals("")) {
//			throw new Exception("Url não pode ser vazio");
//		}
////		if (WEB.matcher(url).matches()) { //Decidir o tamanho
//	//		throw new Exception("Url inválida");
//	//	}
//		this.urlDoMaterial = urlDoMaterial;
//	}

	@Override
	public int compareTo(Dica o) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public String exibir() {
		return "Retorno do Material Util";
	}

}
