package models;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

import java.util.ArrayList;
import java.util.List;


@Entity
public abstract class Dica implements Comparable<Dica> {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private long idDica;

	@ManyToMany(cascade=CascadeType.ALL)
	@JoinTable(name="listaConcordancia")
	private List<Usuario> listaConcordancia;

	@ManyToMany(cascade=CascadeType.ALL)
	@JoinTable(name="listaDiscordancia")
	private List<Usuario> listaDiscordancia;

	@ManyToMany(cascade=CascadeType.ALL)
	@JoinTable(name="listaDenuncias")
	private List<Usuario> listaDenuncias;

	private long idUser;
	private String nameUser;

	private static final int MAX_DENUNCIAS = 3;


	public Dica() {
		this.listaConcordancia = new ArrayList<Usuario>();
		this.listaDiscordancia = new ArrayList<Usuario>();	
		this.listaDenuncias = new ArrayList<Usuario>();
	}	

	public Dica(Usuario user){
		this();
		this.nameUser = new String(user.getNome());

	}

	public void concordar(Usuario user) {	
		if(listaDiscordancia.contains(user)) {
			listaDiscordancia.remove(user);
			listaConcordancia.add(user);

		} else if(listaConcordancia.contains(user)){
			listaConcordancia.remove(user);

		} else {			
			this.listaConcordancia.add(user);
		} 
	}

	public void discordar(Usuario user) {
		if(listaConcordancia.contains(user)) {
			listaConcordancia.remove(user);
			listaDiscordancia.add(user);

		} else if(listaDiscordancia.contains(user)) {
			this.listaDiscordancia.remove(user);

		}  else {
			listaDiscordancia.add(user);
		}		
	}	

	public void denunciar(Usuario user){
		if (!listaDenuncias.contains(user)){
			listaDenuncias.add(user);
		}
	}


	public double getIndiceConcordancia(){
		if (getQuantConcordancias() == 0){
			return 0;
		}else{
			return getQuantConcordancias()/(getQuantConcordancias() + getQuantDiscordancias()); 
		}		
	}
	
	public List<Usuario> getRelacaoDenuncia() {
		return listaDenuncias;
	}

	public void setRelacaoDenuncia(List<Usuario> relacaoDenuncia) {
		this.listaDenuncias = relacaoDenuncia;
	}

	public void setRelacaoConcordancia(List<Usuario> relacaoConcordancia) {
		this.listaConcordancia = relacaoConcordancia;
	}

	public void setRelacaoDiscordancia(List<Usuario> relacaoDiscordancia) {
		this.listaDiscordancia = relacaoDiscordancia;
	}


	public void setNameUser(String nameUser) {
		this.nameUser = nameUser;
	}


	public String getNameUser() {
		return nameUser;
	}


	public long getIdDica() {
		return idDica;
	}

	public String getIdDicaString() {
		return "" + idDica;
	}

	public long getIdUser(){
		return idUser;
	}

	public void setIdDica(long id) {
		this.idDica = id;
	}

	public int getQuantDenuncias() {
		return listaDenuncias.size();
	}

	public int getQuantConcordancias() {
		return listaConcordancia.size(); 
	}

	public int getQuantDiscordancias() {
		return listaDiscordancia.size();
	}

	public List<Usuario> getListaConcordancia() {
		return listaConcordancia;
	}

	public List<Usuario> getListaDiscordancia() {
		return listaDiscordancia;
	}

	public List<Usuario> getListaDenucnia() {
		return listaDenuncias;
	}

	public void comentar(Usuario user, String comentario) {
		//comentar uma dica
	}

	public boolean isDicaInapropriada() {
		return this.getQuantDenuncias() == MAX_DENUNCIAS;
	}

	public abstract String exibir();
	
	@Override
	public int compareTo(Dica dica) {
		if (this.getQuantConcordancias() > dica.getQuantConcordancias()){
			return 1;
		}
		else if (this.getQuantConcordancias() < dica.getQuantConcordancias()) {
			return -1;
		}
		return 0;
	}

}