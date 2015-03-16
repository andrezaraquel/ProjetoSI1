package models;

public enum AvaliacaoDoTema {
	
	MUITO_FACIL(-2), FACIL(-1), NORMAL(0), DIFICIL(1), MUITO_DIFICIL(2);
	
	private final int nota; 
	
	private AvaliacaoDoTema(int nota) {
		this.nota = nota;
	}

	public int getNota() {
		return nota;
	}
	
}
