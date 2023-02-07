package domaine;

import java.time.LocalDate;

public class Eleve {

	private int id;
	private String matricule;
	private String nom;
	private String prenom;
	private LocalDate dateNaissance;
	private String lieuNaissance;
	private static int compteurE = 0;
	private Bulletin bulletin;
	
	public Eleve() {
		compteurE++;
		this.id= compteurE;
	}
	
	public Eleve( String matricule, String nom, String prenom, 
			LocalDate dateNaissance, String lieuNaissance) {
		this();
		this.matricule=matricule;
		this.nom=nom;
		this.prenom=prenom;
		this.dateNaissance=dateNaissance;
		this.lieuNaissance=lieuNaissance;
	}

	public int getId() {
		return id;
	}

	public String getMatricule() {
		return matricule;
	}

	public void setMatricule(String matricule) {
		this.matricule = matricule;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public LocalDate getDateNaissance() {
		return dateNaissance;
	}

	public void setDateNaissance(LocalDate dateNaissance) {
		this.dateNaissance = dateNaissance;
	}

	public String getLieuNaissance() {
		return lieuNaissance;
	}

	public void setLieuNaissance(String lieuNaissance) {
		this.lieuNaissance = lieuNaissance;
	}
	
	
}
