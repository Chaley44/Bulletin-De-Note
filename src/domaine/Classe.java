package domaine;

public class Classe {

	private int id;
	private String nomClasse;
	private int nbrEleve;
	private static int compteur = 0;
	
	public Classe() {
		compteur++;
		this.id=compteur;
		
	}
	
	public Classe( String nomClasse, int nbrEleve) {
		this();
		this.nomClasse=nomClasse;
		this.nbrEleve=nbrEleve;
		
	}

	public int getId() {
		return id;
	}

	public String getNomClasse() {
		return nomClasse;
	}

	public void setNomClasse(String nomClasse) {
		this.nomClasse = nomClasse;
	}

	public int getNbrEleve() {
		
		return nbrEleve;
	}

	public void setNbrEleve(int nbrEleve) {
		this.nbrEleve = nbrEleve;
	}
	
}
