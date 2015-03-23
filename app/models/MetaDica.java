package models;

import javax.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
public class MetaDica extends Dica {
	
	@ManyToMany(cascade=CascadeType.ALL)
	@JoinTable(name="dicasMetaDica")
	private List<Dica> dicasMetaDica = new ArrayList<Dica>();

	private String comentario;

	public MetaDica() {}

	public MetaDica(Usuario user, String comentario) {
		super(user);
		this.comentario = comentario;
	}


	public String getComentario() {
		return comentario;
	}

	public void setComentario(String comentario) {
		this.comentario = comentario;
	}

	public void adicionaDicaMetaDica(Dica dica) {
		dicasMetaDica.add(dica);
	}

	public List<Dica> getListaDicas() {
		return dicasMetaDica;
	}

	public int getNumeroDicasNaMetaDica() {
		return dicasMetaDica.size();
	}

	@Override
	public String exibirDica() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String exibirLabel() {		
		return "<span class=\"label label-info\">" + "Meta Dica" + "</span>";
	}

}