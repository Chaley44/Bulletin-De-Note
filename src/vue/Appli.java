package vue;

public class Appli {

	
	public static void main(String[] args) {
		VueClasse vueClasse = new VueClasse();
		VueDiscipline vueDiscipline = new VueDiscipline();
		VueEleve vueEleve = new VueEleve();
		VueLigneBulletin vueLigneBulletin = new VueLigneBulletin();
		VueBulletin vueBulletin  = new VueBulletin();
		
		
		//vueLigneBulletin.listerLigneBulletinDiscipline();
		//vueLigneBulletin.modifierLigneBulletin();
		
		vueBulletin.creerBulletin();
		
		//vueLigneBulletin.modifierClasse();
		//vueEleve.modifierEleve();
		
		
		//vueClasse.creerClasse();
		//vueClasse.supprimerClasse();
		//vueDiscipline.supprimerDiscipline();
		
		
		
	}
}
