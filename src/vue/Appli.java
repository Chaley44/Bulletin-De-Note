package vue;

public class Appli {

	
	public static void main(String[] args) {
		VueClasse vueClasse = new VueClasse();
		VueDiscipline vueDiscipline = new VueDiscipline();
		VueEleve vueEleve = new VueEleve();
		VueLigneBulletin vueLigneBulletin = new VueLigneBulletin();
		VueBulletin vueBulletin  = new VueBulletin();
		
		
		//vueLigneBulletin.listerLigneBulletin();
		//vueLigneBulletin.modifierLigneBulletin();
		
		vueBulletin.listerBulletin();
		
		//vueLigneBulletin.modifierClasse();
		//vueEleve.listerEleve();
		
		
		//vueClasse.creerClasse();
		//vueClasse.listerClasse();
		//vueDiscipline.listerDiscipline();
		
		
		
	}
}
