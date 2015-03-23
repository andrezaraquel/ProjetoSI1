package models;

import javax.persistence.CascadeType;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


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

	@ElementCollection
	private Map<Usuario, String> frasesDicaDiscordada;

	private String nameUser;
	private static final int MAX_DENUNCIAS = 3;
	private final int MAX_CONCORDANDICAS_OU_DISCORDANCIAS = 20;


	public Dica() {
		this.listaConcordancia = new ArrayList<Usuario>();
		this.listaDiscordancia = new ArrayList<Usuario>();	
		this.listaDenuncias = new ArrayList<Usuario>();
		this.frasesDicaDiscordada = new HashMap<Usuario, String>();
	}	

	public Dica(Usuario user){
		this();
		this.nameUser = new String(user.getNome());


	}

	public boolean isDicaFechada(){
		if (getQuantConcordancias() == MAX_CONCORDANDICAS_OU_DISCORDANCIAS ||
				getQuantDiscordancias() == MAX_CONCORDANDICAS_OU_DISCORDANCIAS){
			return true;
		}
		return false;
	}


	public void concordar(Usuario user) {	
		if(!listaDiscordancia.contains(user) && !listaConcordancia.contains(user)) {
			listaConcordancia.add(user);
		}
	}

	public void discordar(Usuario user, String frase) {
		if(!listaConcordancia.contains(user) && !listaDiscordancia.contains(user)){ 
			listaDiscordancia.add(user);
			adicionarFrase(user, frase);
		}
	}	

	public void denunciar(Usuario user){
		if (!listaDenuncias.contains(user)){
			listaDenuncias.add(user);
		}
	}

	public void adicionarFrase(Usuario user, String frase) {
		frasesDicaDiscordada.put(user, frase);
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

	public Map<Usuario, String> getFrasesDicaDiscordada(){
		return frasesDicaDiscordada;
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

	public boolean isDicaInapropriada() {
		return this.getQuantDenuncias() == MAX_DENUNCIAS;
	}

	public abstract String exibir();

	public String exibirFraseDeDiscordancia(Usuario user){
		return frasesDicaDiscordada.get(user);

	}
	
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
