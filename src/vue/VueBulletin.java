package vue;

import java.time.LocalDate;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import domaine.Bulletin;
import domaine.Classe;
import domaine.Discipline;
import domaine.Eleve;
import domaine.LigneBulletin;
import service.BulletinImpl;
import service.ClasseImpl;
import service.DisciplineImpl;
import service.EleveImpl;
import service.IBulletin;
import service.IClasse;
import service.IDiscipline;
import service.IEleve;
import service.ILigneBulletin;
import service.LigneBulletinImpl;

public class VueBulletin {

	public IBulletin impl = new BulletinImpl();
	public IEleve implE = new EleveImpl();
	public IClasse implC = new ClasseImpl();
	public ILigneBulletin implL = new LigneBulletinImpl();
	public IDiscipline implD = new DisciplineImpl();
	
	VueClasse vueClasse = new VueClasse();
	VueDiscipline vueDiscipline = new VueDiscipline();
	VueEleve vueEleve = new VueEleve();
	VueLigneBulletin vueLigneBulletin = new VueLigneBulletin();
	
	public VueBulletin() {
			
		Classe classe1 = new Classe("4M3", 25);
		Classe classe2 = new Classe("3M5", 23);
		implC.creerClasse(classe1);
		implC.creerClasse(classe2);
		
		Discipline discipline1  = new Discipline("maths", 12, 7, 4);
		Discipline discipline2 = new Discipline("SVT", 14, 12, 2);
		Discipline discipline3  = new Discipline("Science", 17, 15, 3);
		Discipline discipline4 = new Discipline("EPS", 16, 13, 1);
		implD.creerDiscipline(discipline1);
		implD.creerDiscipline(discipline2);
		implD.creerDiscipline(discipline1);
		implD.creerDiscipline(discipline2);
		
		
		Eleve eleve1 = new Eleve("345ISM65", "Rachid", "mimir", LocalDate.parse("2020-04-23"), "Thies");		
		Eleve eleve2 = new Eleve("629ISM45", "Bard", "Rami", LocalDate.parse("2010-06-15"), "Thies");		
		implE.creerEleve(eleve1);		
		implE.creerEleve(eleve2);
		
		List<LigneBulletin> listLigneBulletin1 = new ArrayList<>();
		List<LigneBulletin> listLigneBulletin2 = new ArrayList<>();
		
		LigneBulletin ligneBulletin1 = new LigneBulletin(4);
		LigneBulletin ligneBulletin2 = new LigneBulletin(2);
		LigneBulletin ligneBulletin3 = new LigneBulletin(7);
		LigneBulletin ligneBulletin4 = new LigneBulletin(1);
		implL.creerLigneBulletin(ligneBulletin1);
		implL.creerLigneBulletin(ligneBulletin2);
		
		ligneBulletin1.setDiscipline(discipline1);
		ligneBulletin2.setDiscipline(discipline2);
		ligneBulletin3.setDiscipline(discipline3);
		ligneBulletin4.setDiscipline(discipline4);
		listLigneBulletin1.add(ligneBulletin1);
		listLigneBulletin1.add(ligneBulletin2);
		listLigneBulletin2.add(ligneBulletin3);
		listLigneBulletin2.add(ligneBulletin4);
		
		Bulletin bulletin1 = new Bulletin(3, 8, "2020-2021", "semestre 1", false, classe1, eleve1);
		bulletin1.setClasse(classe1);
		bulletin1.setEleve(eleve1);
		bulletin1.setListLigneBulletin(listLigneBulletin1);
		
		
		Bulletin bulletin2 = new Bulletin(0, 0, "2020-2021", "semestre 2", true, classe2, eleve2);
		bulletin2.setClasse(classe2);
		bulletin2.setEleve(eleve2);
		bulletin2.setListLigneBulletin(listLigneBulletin2);
		impl.creerBulletin(bulletin1);
		impl.creerBulletin(bulletin2);
	}
	
	
	
	/*public void listerLigneBulletinDiscipline() {
		System.out.println("Liste des ligneBulletins");
		System.out.println("===================================");
		for(LigneBulletin ligneBulletin : vueLigneBulletin.impl.listLigneBulletin()) {
			System.out.println("id : " + ligneBulletin.getId());
			System.out.println("rang discipline : " + ligneBulletin.getRangDiscipline());
			System.out.println("Nom discipline : " + ligneBulletin.getDiscipline().getNomDiscipline());
			System.out.println("-----------------------------------");
		}
	}*/
	
	public void listerBulletin() {
		System.out.println("______Liste Bulletin_____");
		for(Bulletin bulletin : impl.listeBulletin()) {
			System.out.println("Id : " + bulletin.getId());
			System.out.println("Annee scolaire : " + bulletin.getAnneeScolaire());
			System.out.println("Semestre : " + bulletin.getSemestre());
			System.out.println("Absence : " + bulletin.getAbsence());
			System.out.println("Retard : " + bulletin.getRetard());
			System.out.println("Classe : " + bulletin.getClasse().getNomClasse());
			System.out.println("Classe redouble : " + bulletin.isClassRedouble());
			System.out.println("------------Eleve---------- ");
			System.out.println("Matricule: " + bulletin.getEleve().getMatricule());
			System.out.println("Nom de l'eleve : " + bulletin.getEleve().getNom());
			System.out.println("Prenom de l'eleve : " + bulletin.getEleve().getPrenom());
			System.out.println("Date de naissance : " + bulletin.getEleve().getDateNaissance());
			System.out.println("Lieu de naissance : " + bulletin.getEleve().getLieuNaissance());
			
			System.out.println("-----------Ligne Bulletin------------");
			for(LigneBulletin ligneBulletin : bulletin.getListLigneBulletin()) {
				System.out.println("Nom de la discipline: " + ligneBulletin.getDiscipline().getNomDiscipline());
				System.out.println("Devoir: " + ligneBulletin.getDiscipline().getDevoir());
				System.out.println("Composition : " + ligneBulletin.getDiscipline().getComp());
				System.out.println("Moyenne : " + ligneBulletin.getMoyenne());
				System.out.println("Coefficient : " + ligneBulletin.getDiscipline().getCoef());
				System.out.println("Moyenne X : " + ligneBulletin.getMoynneX());
				System.out.println("Rang discipline : " + ligneBulletin.getRangDiscipline());
				System.out.println("Appreciation : " + ligneBulletin.getAppreciation());
				System.out.println("--------------------------------");
			}
			System.out.println("Total Coefficient : " + bulletin.getTotalCoef());
			System.out.println("Total Moyenne X : " + bulletin.getTotalMoyenneX());
			if(bulletin.getSemestre().equalsIgnoreCase("semestre 1")){
				System.out.println("Moyenne semestriel : "+ bulletin.getMoyenneSemestre1());
			}else {
				System.out.println("Moyenne semestriel : "+ bulletin.getMoyenneSemestre2());
			}
			System.out.println("_____________________________________");
			
			}
	}
	
	public void creerBulletin() {
		Bulletin bulletin = new Bulletin();
		LigneBulletin ligneBulletin = new LigneBulletin();
		Scanner scanner = new Scanner(System.in);
		String input;
		
		System.out.print("Abscence : ");
		input = scanner.nextLine();
		bulletin.setAbsence(Integer.parseInt(input));
		
		System.out.print("Retard : ");
		input = scanner.nextLine();
		bulletin.setRetard(Integer.parseInt(input));
		
		System.out.print("Annee Scolaire  : ");
		input = scanner.nextLine();
		bulletin.setAnneeScolaire(input);
		
		System.out.print("Semestre : ");
		input = scanner.nextLine();
		bulletin.setSemestre(input);
		
		System.out.print("Classe redoublée : ");
		input = scanner.nextLine();
		bulletin.setClassRedouble(false);
		
		vueClasse.listerClasse();
		System.out.print("Choisir une classe : ");
		input =scanner.nextLine();
		bulletin.setClasse(vueClasse.impl.getClasseById(Integer.parseInt(input)));
		
		vueEleve.listerEleve();
		System.out.print("Choisir une classe : ");
		input =scanner.nextLine();
		bulletin.setEleve(vueEleve.impl.getEleveById(Integer.parseInt(input)));
		
		List<LigneBulletin> listLigneBulletin = new ArrayList<>();
		
		System.out.println("Nombre de Discipline : ");
		input = scanner.nextLine();
		int nombreD = Integer.parseInt(input);
		
		System.out.println(nombreD);
		do {
			vueDiscipline.listerDiscipline();
			System.out.println("Choisir une discipline ");
			input =scanner.nextLine();
			ligneBulletin.setDiscipline(vueDiscipline.impl.getDisciplineById(Integer.parseInt(input))); ;
			
			System.out.print("Rang Discipline : ");
			input = scanner.nextLine();
			ligneBulletin.setRangDiscipline(Integer.parseInt(input));
			
			listLigneBulletin.add(ligneBulletin);
			nombreD--;
		}while(nombreD > 0);
		/*for(int i=0; i<Integer.parseInt(input); i++) {
			/*listerLigneBulletinDiscipline();
			System.out.println("Choisir une Ligne bulletin ");
			input =scanner.nextLine();
			ligneBulletin = vueLigneBulletin.impl.getLigneBulletinById(Integer.parseInt(input));
			
			if(ligneBulletin != null) {
				listLigneBulletin.add(ligneBulletin);
			} else {
				System.out.println("Cette ligne bulletin n'existe pas !!");
			}
			
		}*/
		bulletin.setListLigneBulletin(listLigneBulletin);
		
		impl.creerBulletin(bulletin);
		listerBulletin();
	}
	
	public void rechercherClasse() {
		Bulletin bulletin = new Bulletin();
		Scanner scanner = new Scanner(System.in);
		String input;
		System.out.print("Id : ");
		input = scanner.nextLine();
		bulletin= impl.getBulletinById(Integer.parseInt(input));
		
		
		if(impl.listeBulletin().contains(bulletin)) {
			System.out.println("Id : " + bulletin.getId());
			System.out.println("Annee scolaire : " + bulletin.getAnneeScolaire());
			System.out.println("Semestre : " + bulletin.getSemestre());
			System.out.println("Absence : " + bulletin.getAbsence());
			System.out.println("Retard : " + bulletin.getRetard());
			System.out.println("Classe : " + bulletin.getClasse().getNomClasse());
			System.out.println("Classe redouble : " + bulletin.isClassRedouble());
			System.out.println("------------Eleve---------- ");
			System.out.println("Matricule: " + bulletin.getEleve().getMatricule());
			System.out.println("Nom de l'eleve : " + bulletin.getEleve().getNom());
			System.out.println("Prenom de l'eleve : " + bulletin.getEleve().getPrenom());
			System.out.println("Date de naissance : " + bulletin.getEleve().getDateNaissance());
			System.out.println("Lieu de naissance : " + bulletin.getEleve().getLieuNaissance());
			
			System.out.println("-----------Ligne Bulletin------------");
			for(LigneBulletin ligneBulletin : bulletin.getListLigneBulletin()) {
				System.out.println("Nom de la discipline: " + ligneBulletin.getDiscipline().getNomDiscipline());
				System.out.println("Devoir: " + ligneBulletin.getDiscipline().getDevoir());
				System.out.println("Composition : " + ligneBulletin.getDiscipline().getComp());
				System.out.println("Moyenne : " + ligneBulletin.getMoyenne());
				System.out.println("Coefficient : " + ligneBulletin.getDiscipline().getCoef());
				System.out.println("Moyenne X : " + ligneBulletin.getMoynneX());
				System.out.println("Rang discipline : " + ligneBulletin.getRangDiscipline());
				System.out.println("Appreciation : " + ligneBulletin.getAppreciation());
				System.out.println("--------------------------------");
			}
			System.out.println("Total Coefficient : " + bulletin.getTotalCoef());
			System.out.println("Total Moyenne X : " + bulletin.getTotalMoyenneX());
			if(bulletin.getSemestre().equalsIgnoreCase("semestre 1")){
				System.out.println("Moyenne semestriel : "+ bulletin.getMoyenneSemestre1());
			}else {
				System.out.println("Moyenne semestriel : "+ bulletin.getMoyenneSemestre2());
			}
			System.out.println("_____________________________________");
			
			
		}else {
			System.out.println("La classe n'existe pas !!");
		}
	}
	
	public void supprimerClasse() {
		Bulletin bulletin;
		Scanner scanner = new Scanner(System.in);
		String input;
		System.out.print("Id : ");
		input = scanner.nextLine();
		bulletin= impl.getBulletinById(Integer.parseInt(input));
		impl.supprimerBulletin(bulletin);
		
		listerBulletin();
	}
	
	public void modifierClasse() {
		Bulletin bulletin = new Bulletin();
		LigneBulletin ligneBulletin = new LigneBulletin();
		Scanner scanner = new Scanner(System.in);
		String input;
		
		System.out.print(" Entrer l'id : ");
		input = scanner.nextLine();
		bulletin= impl.getBulletinById(Integer.parseInt(input));
		
		System.out.print("Abscence : ");
		input = scanner.nextLine();
		bulletin.setAbsence(Integer.parseInt(input));
		
		System.out.print("Retard : ");
		input = scanner.nextLine();
		bulletin.setRetard(Integer.parseInt(input));
		
		System.out.print("Annee Scolaire  : ");
		input = scanner.nextLine();
		bulletin.setAnneeScolaire(input);
		
		System.out.print("Semestre : ");
		input = scanner.nextLine();
		bulletin.setSemestre(input);
		
		System.out.print("Classe redoublée : ");
		input = scanner.nextLine();
		bulletin.setClassRedouble(false);
		
		vueClasse.listerClasse();
		System.out.print("Choisir une classe : ");
		input =scanner.nextLine();
		bulletin.setClasse(vueClasse.impl.getClasseById(Integer.parseInt(input)));

		List<LigneBulletin> listLigneBulletin = new ArrayList<>();
		
		System.out.println("Nombre de Discipline : ");
		input = scanner.nextLine();
		
		//System.out.println(Integer.parseInt(input));
		for(int i=0; i<Integer.parseInt(input); i++) {
			vueDiscipline.listerDiscipline();
			System.out.println("Choisir une discipline ");
			input =scanner.nextLine();
			ligneBulletin.setDiscipline(vueDiscipline.impl.getDisciplineById(Integer.parseInt(input))); ;
			
			System.out.print("Rang Discipline : ");
			input = scanner.nextLine();
			ligneBulletin.setRangDiscipline(Integer.parseInt(input));
			
			listLigneBulletin.add(ligneBulletin);
			
		}
		bulletin.setListLigneBulletin(listLigneBulletin);
		
		impl.modifierBulletin(bulletin);
		listerBulletin();
		
	}
}
