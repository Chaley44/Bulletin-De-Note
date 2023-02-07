package domaine;

public enum Appreciation {

	EXCELLENT("Excellent Travail"), TRES_BIEN("Tres bon travail"), 
	BIEN("Bon travail"), ASSEZ_BIEN("Assez bon travail"), 
	PASSABLE("Passable"), INSUFISANT("Insufisant");
	
	private String etat;
	
	private Appreciation(String etat) {
		this.etat=etat;
	}

	public String getEtat() {
		return etat;
	}

	
}
