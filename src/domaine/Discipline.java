package domaine;

public class Discipline {

	private int id;
	private String nomDiscipline;
	private float devoir;
	private float comp;
	private int coef;
	private static int compteurD = 0;
	
	public Discipline() {
		compteurD++;
		this.id= compteurD;
	}
	
	public Discipline( String nomDiscipline, float devoir, 
			float comp, int coef ) {
		this();
		this.nomDiscipline=nomDiscipline;
		this.devoir=devoir;
		this.comp=comp;
		this.coef=coef;
		
	}

	public int getId() {
		return id;
	}

	public String getNomDiscipline() {
		return nomDiscipline;
	}

	public void setNomDiscipline(String nomDiscipline) {
		this.nomDiscipline = nomDiscipline;
	}

	public float getDevoir() {
		return devoir;
	}

	public void setDevoir(float devoir) {
		this.devoir = devoir;
	}

	public float getComp() {
		return comp;
	}

	public void setComp(float comp) {
		this.comp = comp;
	}

	public int getCoef() {
		return coef;
	}

	public void setCoef(int coef) {
		this.coef = coef;
	}
	
	
}
