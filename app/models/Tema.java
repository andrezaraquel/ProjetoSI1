package models;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OrderBy;


@Entity(name = "tema")
public class Tema {
 
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private long id;
	
	@OneToMany
	private List<Dica> dicas;
	@ElementCollection
	private Map<Usuario,Integer> valoresAvaliacoes;
	@ElementCollection
	private Map<Usuario, Integer> valoresAvaliacoesOrdenadas;
	private String nome;
//	
//	private String texto;
//	
//	private int quantAvaliacao;
//	private boolean temaAvaliado;
//	private TipoDeDica tipo;
//	


	public Tema() {
		this.dicas = new ArrayList<Dica>();
		this.valoresAvaliacoes = new HashMap<Usuario, Integer>();
		this.valoresAvaliacoesOrdenadas = new TreeMap<Usuario, Integer>(this.valoresAvaliacoes);
	}
	
	public Tema(String nome) {
		this();
		this.nome = nome;		
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
	
	public double getAvaliacaoMedia(){
		double soma = 0;
		for (int nota : getValoresAvaliacoes().values()) {
			soma += nota;
		}
		return soma/getValoresAvaliacoes().size(); 
	}

	public int numAvaliacoes() {
		return (int) Math.floor(getValoresAvaliacoesOrdenadas().size());
	}
	
	public Integer getAvaliacaoMediana(){
		Integer mediana = 0;		
		if (getValoresAvaliacoesOrdenadas().size() % 2 != 0){
			int indexMediana = (int) Math.ceil(numAvaliacoes()/2);
			mediana = getValoresAvaliacoesOrdenadas().get(indexMediana);
		} else {
			mediana = getValoresAvaliacoesOrdenadas().get(numAvaliacoes()/2) + 
					(getValoresAvaliacoesOrdenadas().get((numAvaliacoes()/2) + 1));
		}
		return mediana; 
	}
	
	
	

	/*-------------------------------------US 3 ------------------------------*/
//	
//	
//
//	public String getTexto() {
//		return texto;
//	}
//
//	public void setTexto(String texto) {
//		this.texto = texto;
//	}
//
//	public int getQuantAvaliacao() {
//		return quantAvaliacao;
//	}
//
//	public void setQuantAvaliacao(int quantAvaliacao) {
//		this.quantAvaliacao = quantAvaliacao;
//	}
//
//	public boolean isTemaAvaliado() {
//		return temaAvaliado;
//	}
//
//	public void setTemaAvaliado(boolean temaAvaliado) {
//		this.temaAvaliado = temaAvaliado;
//	}
//
//	public TipoDeDica getTipo() {
//		return tipo;
//	}
//
//	public void setTipo(TipoDeDica tipo) {
//		this.tipo = tipo;
//	}
//
//	public void setDicas(List<Dica> dicas) {
//		this.dicas = dicas;
//	}
//
//	public void avaliarTema(){
//		if(!this.temaAvaliado){
//			this.temaAvaliado =  true;
//		} 		
//	}
//	
//	public boolean isAvaliado(){
//		return temaAvaliado;
//	}
//	
//	public boolean isEmpty() {
//		if (dicas.isEmpty()) {
//			return true;
//		}
//		return false;
//	}
//
//	
//	/*---------------------------------US 2---------------------------------------------------*/
//	public void adicionarDica(Dica dica) {
//		dicas.add(dica);
//		Collections.sort(this.getDicas());
//	}
//
//	
//	public void removerDica(Dica dica){
//
//	}
//
//	
//	/*------------------------------------------------------------------------------------------*/
//	public List<Dica> getDicas() {
//		return dicas;
//	}
//
//	
//	/*------------------------------US 7-------------------------------------------------------*/
//	public void fecharDica(Dica dica){
//		if (dica.getConteudoInapropriado() == 3){
//			dicas.remove(dica);
//		}
//	if (dica.getQuantCondordancia() == 20 || dica.getQuantDisordancia() == 20){
//		//desabilitar opção de concordar ou discordar com aquele tema
//	}
//	}
//
//	
//	private void isDicaValida(String texto) throws Exception {
//		if (texto == null) {
//			throw new Exception("Dica não pode ser nula");
//		}
//		if (texto.trim().equals("")) {
//			throw new Exception("Dica não pode ser vazia");
//		}
//		if (texto.length() > 500) {
//			throw new Exception("Dica muito longa");
//		}
//		this.texto = texto;
//	}
//	
//	public String getDica() {
//		return texto;
//	}
//
//	public void setDescricao(String dica) throws Exception {
//		isDicaValida(texto);
//	}
//
//	
//	
}
