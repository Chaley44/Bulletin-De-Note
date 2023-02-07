package domaine;

public class LigneBulletin {

	private int id;
	private int rangDiscipline;
	private String appreciation;
	private float moyenne;
	private float moyenneX;
	private static int compteurL = 0;
	private Discipline discipline;
	
	public LigneBulletin() {
		compteurL++;
		this.id= compteurL;
	}
	
	public LigneBulletin( int rangDiscipline) {
		this();
		this.rangDiscipline=rangDiscipline;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getRangDiscipline() {
		return rangDiscipline;
	}

	public void setRangDiscipline(int rangDiscipline) {
		this.rangDiscipline = rangDiscipline;
	}

	public String getAppreciation() {
		
		if(getMoyenne()>=18) {
			appreciation = Appreciation.EXCELLENT.getEtat() ;
		}else if(getMoyenne()>=16 && getMoyenne()<18) {
			appreciation = Appreciation.TRES_BIEN.getEtat();
		}else if(getMoyenne()>=14 && getMoyenne()<16) {
			appreciation = Appreciation.BIEN.getEtat();
		}else if(getMoyenne()>=12 && getMoyenne()<14){
			appreciation = Appreciation.ASSEZ_BIEN.getEtat();
		}else if(getMoyenne()>=10 && getMoyenne()<12) {
			appreciation = Appreciation.PASSABLE.getEtat();
		}else {
			appreciation = Appreciation.INSUFISANT.getEtat();
		}
		
		return appreciation;
	}

	public float getMoyenne() {
		moyenne = (getDiscipline().getDevoir() + getDiscipline().getComp())/2;
		return moyenne;
	}

	public float getMoynneX() {
		moyenneX = getMoyenne() * getDiscipline().getCoef();
		return moyenneX;
	}

	public Discipline getDiscipline() {
		return discipline;
	}

	public void setDiscipline(Discipline discipline) {
		this.discipline = discipline;
	}

	

	
	
}
