package models;

public class Dica implements Comparable<Dica> {

private int tipo;
	
	public Dica(int tipo){
		this.tipo = tipo;

	}

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

	//Retorna a quantidade de pessoas que concordaram com a dica
	public int quantConcordancia(){
		return 0; //
	}

	//Retorna quantidade de pessoas que discordaram com a dica
	public int quantDiscordancia(){
		return 0;
	}

	// Retorna o indice de concordÃ¢ncia na dica
	public double indiceDeConcordancia(){
		return quantConcordancia()/(quantConcordancia() + quantDiscordancia());

	}
	//	
	//	public double getFraseDiscordancia(){
	//		return ""; //Frase
	//	}
	//	
}

