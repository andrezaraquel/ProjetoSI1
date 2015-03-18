package models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public abstract class Dica implements Comparable<Dica> {

	@Id
	@GeneratedValue
	private long id;
	private int quantConcordancia;
	private int quantDiscordancia;
	private boolean dicaConcordada;
	private boolean dicaDiscordada;
	private int conteudoInapropriado;
	

	
	public Dica(){		
		
	}
		
	/*------------------------- US 4 ---------------------------------------*/
	public int quantConcordancia(){
		return quantConcordancia; //
	}

	public int quantDiscordancia(){
		return quantDiscordancia();
	}

	public double indiceDeConcordancia(){
		return quantConcordancia/(quantConcordancia + quantDiscordancia);

	}
	
	public boolean isConcordada(){
		return dicaConcordada;
	}
	
	public boolean isDiscordada(){
		return dicaDiscordada;
	}
	
	public void concordarDica(){
		if(!this.dicaConcordada){
			this.dicaConcordada =  true;
		} 		
	}
	
	public void discordarDica(){
		if(!this.dicaDiscordada){
			this.dicaDiscordada =  true;
		} 		
	}
	
	public int getQuantCondordancia(){
		return quantConcordancia;
	}
	
	public int getQuantDisordancia(){
		return quantDiscordancia;
	}
	
	public void addFrase(){
		
	}
	
	/*---------------------------------US 5----------------------------------------------------*/
	
	@Override
	public int compareTo(Dica dica) {
		if (this.quantConcordancia() > dica.quantConcordancia()){
			return 1;
		}
		else if (this.quantConcordancia() < dica.quantConcordancia()) {
			return -1;
		}
		return 0;
	}
	
	
	/*-------------------------US 7 -----------------------------------------------------------*/
	
	public void marcarDicaInapropriado(){
		conteudoInapropriado += 1;
		
	}
	
	public int getConteudoInapropriado(){
		return conteudoInapropriado;
	}
	
}