package models;

import javax.persistence.Entity;

@Entity
public class DicaMaterialUtil extends Dica {


	private String urlDoMaterial;

	public DicaMaterialUtil() {}

	public DicaMaterialUtil(Usuario user, String urlDoMaterial) {
		super(user);
		this.urlDoMaterial = urlDoMaterial;
	}

	public String getUrlDoMaterial() {
		return urlDoMaterial;
	}

	public void setUrlDoMaterial(String urlDoMaterial) throws Exception {
		validaUrl(urlDoMaterial);
	}

	private void validaUrl(String url) throws Exception {
		String tipo1 = "(http://)[-a-zA-Z0-9+&@#/%?=~_|!:,.;]*(.com)";
		String tipo2 = "(http://)[-a-zA-Z0-9+&@#/%?=~_|!:,.;]*(.com.br)";
		String tipo3 = "(http://)[-a-zA-Z0-9+&@#/%?=~_|!:,.;]*(.edu)";
		String tipo4 = "(http://)[-a-zA-Z0-9+&@#/%?=~_|!:,.;]*(.edu.br)";

		if (url == null){
			throw new Exception("Url não pode ser nulo");
		}
		if (url == ""){
			throw new Exception("Url não pode ser vazio");
		}

		if (!url.matches(tipo1) && !url.matches(tipo2)  && !url.matches(tipo3) && !url.matches(tipo4)) {
				throw new Exception("Url inválida");
			}
		this.urlDoMaterial = url;
	}
		

	@Override
	public String exibirLabel(){
		String label = "<span class=\"label label-info\">" + "Material Útil" + "</span>";
		return label;
	}
	@Override
	public String exibirDica() {
		String textUrl = "<h5>" + urlDoMaterial + "</h5>";
		return  textUrl;
	}

}
