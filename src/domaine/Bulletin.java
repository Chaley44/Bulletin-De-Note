package domaine;

import java.util.List;

public class Bulletin {

	private int id;
	private static int compteurB = 0;
	private float moyenneSemestre1;
	private float moyenneSemestre2;
	private float moyenneAnnuelle;
	private int rangSemestre;
	private int rangAnnuelle;
	private int totalCoef;
	private float totalMoyenneX;
	private List<LigneBulletin> listLigneBulletin;
	
	private int absence;
	private int totalAbsence;
	private int retard;
	private String anneeScolaire;
	private String semestre;
	private boolean classRedouble;
	private Classe classe;
	private Eleve eleve;
	
	private DecisionConseilProf decisionProf;
	
	
	public Bulletin() {
		compteurB++;
		this.id = compteurB;
	}


	public Bulletin( int absence, int retard, String anneeScolaire, String semestre, boolean classRedouble,
			Classe classe, Eleve eleve) {
		this();
		this.absence = absence;
		this.retard = retard;
		this.anneeScolaire = anneeScolaire;
		this.semestre = semestre;
		this.classRedouble = classRedouble;
		this.classe = classe;
		this.eleve = eleve;
	}


	public int getId() {
		return id;
	}
	
	public float getMoyenneSemestre1() {
		if(semestre.equalsIgnoreCase("semestre 1")) {
			moyenneSemestre1 = getTotalMoyenneX() / getTotalCoef();
		}
		return moyenneSemestre1;
	}


	public float getMoyenneSemestre2() {
		if(semestre.equalsIgnoreCase("semestre 2")) {
			moyenneSemestre2 = getTotalMoyenneX() / getTotalCoef();
		}
		
		return moyenneSemestre2;
	}



	public float getMoyenneAnnuelle() {
		moyenneAnnuelle = getMoyenneSemestre1() + getMoyenneSemestre2();
		return moyenneAnnuelle;
	}

	public int getRangSemestre() {
		return rangSemestre;
	}


	public void setRangSemestre(int rangSemestre) {
		this.rangSemestre = rangSemestre;
	}


	public void setRangAnnuelle(int rangAnnuelle) {
		this.rangAnnuelle = rangAnnuelle;
	}


	public int getRangAnnuelle() {
		return rangAnnuelle;
	}


	public int getTotalCoef() {
		for(LigneBulletin ligneBulletin: listLigneBulletin) {
			totalCoef += ligneBulletin.getDiscipline().getCoef();
		}
		return totalCoef;
	}


	public float getTotalMoyenneX() {
		for(LigneBulletin ligneBulletin: listLigneBulletin) {
			totalMoyenneX += ligneBulletin.getMoynneX();
		}
		return totalMoyenneX;
	}

	public List<LigneBulletin> getListLigneBulletin() {
		return listLigneBulletin;
	}


	public void setListLigneBulletin(List<LigneBulletin> listLigneBulletin) {
		this.listLigneBulletin = listLigneBulletin;
	}


	public int getAbsence() {
		return absence;
	}


	public void setAbsence(int absence) {
		this.absence = absence;
	}


	public int getTotalAbsence() {
		return totalAbsence;
	}

	public int getRetard() {
		return retard;
	}


	public void setRetard(int retard) {
		this.retard = retard;
	}


	public String getAnneeScolaire() {
		return anneeScolaire;
	}


	public void setAnneeScolaire(String anneeScolaire) {
		this.anneeScolaire = anneeScolaire;
	}


	public String getSemestre() {
		return semestre;
	}


	public void setSemestre(String semestre) {
		this.semestre = semestre;
	}


	public boolean isClassRedouble() {
		return classRedouble;
	}


	public void setClassRedouble(boolean classRedouble) {
		this.classRedouble = classRedouble;
	}


	public Classe getClasse() {
		return classe;
	}


	public void setClasse(Classe classe) {
		this.classe = classe;
	}


	public Eleve getEleve() {
		return eleve;
	}


	public void setEleve(Eleve eleve) {
		this.eleve = eleve;
	}


	public DecisionConseilProf getDecisionProf() {
		
		return decisionProf;
	}
	
	
	

	
	
}
