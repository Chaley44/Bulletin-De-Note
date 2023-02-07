package domaine;

public enum DecisionConseilProf {

	ADMIS("Admis(e) en classe Superieur"), EXCLU("Exclusion"), 
	REDOUBLER("Autorisé(e) à redoubler");
	
	private String etat;
	
	private DecisionConseilProf(String etat) {
		this.etat=etat;
	}

	public String getEtat() {
		return etat;
	}
	
}
