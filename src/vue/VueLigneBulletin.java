package vue;

import java.util.Scanner;

import domaine.Classe;
import domaine.LigneBulletin;
import service.ClasseImpl;
import service.IClasse;
import service.ILigneBulletin;
import service.LigneBulletinImpl;

public class VueLigneBulletin {
	public ILigneBulletin impl = new LigneBulletinImpl();
	VueDiscipline vueDiscipline = new VueDiscipline();

	
	
	public  VueLigneBulletin() {
		LigneBulletin ligneBulletin1 = new LigneBulletin(4);
		LigneBulletin ligneBulletin2 = new LigneBulletin(2);
		impl.creerLigneBulletin(ligneBulletin1);
		impl.creerLigneBulletin(ligneBulletin2);
	}
	
	
	
	public void listerLigneBulletin() {
		System.out.println("Liste des ligneBulletins");
		System.out.println("===================================");
		for(LigneBulletin ligneBulletin : impl.listLigneBulletin()) {
			System.out.println("id : " + ligneBulletin.getId());
			System.out.println("rang discipline : " + ligneBulletin.getRangDiscipline());
			System.out.println("-----------------------------------");
		}
	}
	
	public void creerLigneBulletin() {
		LigneBulletin ligneBulletin = new LigneBulletin();
		Scanner scanner = new Scanner(System.in);
		String input;
		
		System.out.print("Rang Discipline : ");
		input = scanner.nextLine();
		ligneBulletin.setRangDiscipline(Integer.parseInt(input));
		
		/*vueDiscipline.listerDiscipline();
		System.out.print("Choisir une discipline : ");
		input =scanner.nextLine();
		ligneBulletin.setDiscipline(vueDiscipline.impl.getDisciplineById(Integer.parseInt(input)));
		*/
		impl.creerLigneBulletin(ligneBulletin);
		listerLigneBulletin();
		
		
	}
	
	public void rechercherLigneBulletin() {
		LigneBulletin ligneBulletin = new LigneBulletin();
		Scanner scanner = new Scanner(System.in);
		String input;
		System.out.print("Id : ");
		input = scanner.nextLine();
		ligneBulletin= impl.getLigneBulletinById(Integer.parseInt(input));
		
		
		if(impl.listLigneBulletin().contains(ligneBulletin)) {
			System.out.println("id : " + ligneBulletin.getId());
			System.out.println("Rang : " + ligneBulletin.getRangDiscipline());
			
			
		}else {
			System.out.println("La ligneBulletin n'existe pas !!");
		}
	}
	
	public void supprimerLigneBulletin() {
		LigneBulletin ligneBulletin ;
		Scanner scanner = new Scanner(System.in);
		String input;
		System.out.print("Id : ");
		input = scanner.nextLine();
		ligneBulletin= impl.getLigneBulletinById(Integer.parseInt(input));
		impl.supprimerLigneBulletin(ligneBulletin);
		
		listerLigneBulletin();
	}
	
	public void modifierLigneBulletin() {
		LigneBulletin ligneBulletin = new LigneBulletin();
		Scanner scanner = new Scanner(System.in);
		String input;
		System.out.print("Entrer id : ");
		input = scanner.nextLine();
		ligneBulletin = impl.getLigneBulletinById(Integer.parseInt(input));
		
		System.out.print("Rang Discipline : ");
		input = scanner.nextLine();
		ligneBulletin.setRangDiscipline(Integer.parseInt(input));
		
		/*vueDiscipline.listerDiscipline();
		System.out.print("Choisir une discipline : ");
		input =scanner.nextLine();
		ligneBulletin.setDiscipline(vueBulletin.implD.getDisciplineById(Integer.parseInt(input)));
		*/
		impl.modifierLigneBulletin(ligneBulletin);
		listerLigneBulletin();
		
	}
}
