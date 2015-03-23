package models;

import javax.persistence.Entity;

@Entity
public class DicaMaterialUtil extends Dica {


	private String urlDoMaterial;
	
	public DicaMaterialUtil() {}
	
	public DicaMaterialUtil(Usuario user, String url) {
		super(user);
		this.urlDoMaterial = url;
	}

	public String getUrlDoMaterial() {
		return urlDoMaterial;
	}

	public void setUrlDoMaterial(String urlDoMaterial) {
		this.urlDoMaterial = urlDoMaterial;
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
