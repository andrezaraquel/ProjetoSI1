package models;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

import javax.persistence.CascadeType;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.OrderBy;


@Entity
public class Tema {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private long id;

	@ManyToMany
	@JoinTable(name="listaDeDicas")
	private List<Dica> dicas;
	@ElementCollection
	private Map<Usuario,Integer> valoresAvaliacoes;
	@ElementCollection
	private Map<Usuario, Integer> valoresAvaliacoesOrdenadas;
	private String nome;

	public Tema() {
		this.dicas = new ArrayList<Dica>();
		this.valoresAvaliacoes = new HashMap<Usuario, Integer>();
		this.valoresAvaliacoesOrdenadas = new TreeMap<Usuario, Integer>(this.valoresAvaliacoes);
	}

	public Tema(String nome) {
		this();
		this.nome = nome;		
	}

	public void adicionarDica(Dica dica) {
		dicas.add(dica);
		
	}
	
	public void removerDica(Dica dica) {
		dicas.remove(dica);
	}
	
	public void avaliarTema(Usuario usuario, AvaliacaoDoTema nota) {
		if (valoresAvaliacoes.containsKey(usuario)) {
			editarAvaliacao(usuario, nota);
		} else {
			this.valoresAvaliacoes.put(usuario, nota.getNota());
		}		
	}	
	
	public void editarAvaliacao(Usuario user, AvaliacaoDoTema novaAvaliacao) {
		for (Iterator<Entry<Usuario, Integer>> it = valoresAvaliacoes.entrySet().iterator(); it.hasNext(); ) {  
			Map.Entry<Usuario, Integer> entry = (Map.Entry<Usuario, Integer>) it.next();  

			if (user.equals ((Usuario)entry.getKey())) {
				entry.setValue (novaAvaliacao.getNota()); 
			}                 
		}  
	}
		
	public AvaliacaoDoTema getEnumAvaliacaoTema(int nota){
		switch(nota){
		
		case -1:
			return AvaliacaoDoTema.FACIL;
		case 0:
			return AvaliacaoDoTema.NORMAL;
		case 1:
			return AvaliacaoDoTema.DIFICIL;
		case 2:
			return AvaliacaoDoTema.MUITO_DIFICIL;
		default:
			return AvaliacaoDoTema.MUITO_FACIL;
		}	
	}
	
	public double getAvaliacaoMedia(){
		double soma = 0;
		for (int nota : getValoresAvaliacoes().values()) {
			soma += nota;
		}
		if(getValoresAvaliacoes().size() > 0) {
			return soma/getValoresAvaliacoes().size(); 
		}
		return 0;
	}

	public int getAvaliacaoMediana(){
		if(this.getValoresAvaliacoesOrdenadas().values().size() == 0) {
            return 0;
        }
        Integer[] valores = new Integer[this.getValoresAvaliacoes().values().size()];
        valores = getValoresAvaliacoes().values().toArray(valores);
        Arrays.sort(valores);
        int index = this.getValoresAvaliacoes().values().size();

        if(this.getValoresAvaliacoes().values().size() > 1 && this.getValoresAvaliacoes().values().size()%2 == 0){
            return (valores[(index/2)-1] + valores[(index/2)])/2;
        }
        else if (this.getValoresAvaliacoes().values().size() > 1 && this.getValoresAvaliacoes().values().size()%2 != 0){
            return valores[(index/2)-1];
        }
        return valores[index-1];
	}

	public Map<Usuario, Integer> getValoresAvaliacoes() {
		return valoresAvaliacoes;
	}

	public void setValoresAvaliacoes(Map<Usuario, Integer> valoresAvaliacoes) {
		this.valoresAvaliacoes = valoresAvaliacoes;
	}

	public Map<Usuario, Integer> getValoresAvaliacoesOrdenadas() {
		return valoresAvaliacoesOrdenadas;
	}

	public void setValoresAvaliacoesOrdenadas(
			Map<Usuario, Integer> valoresAvaliacoesOrdenadas) {
		this.valoresAvaliacoesOrdenadas = valoresAvaliacoesOrdenadas;
	}

	public int numAvaliacoes() {
		return (int) Math.floor(getValoresAvaliacoesOrdenadas().size());
	}

	public boolean isEmpty() {
		if (dicas.isEmpty()) {
			return true;
		}
		return false;
	}
	
	public List<Dica> getDicas() {
		Collections.sort(dicas);
        Collections.reverse(dicas);
        return dicas;
	}
	
	public void setDicas(List<Dica> dicas) {
		this.dicas = dicas;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getIdString() {
		return "" + id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
}