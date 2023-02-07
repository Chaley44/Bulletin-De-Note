package vue;

import java.util.Scanner;

import domaine.Classe;
import domaine.Discipline;
import service.ClasseImpl;
import service.DisciplineImpl;
import service.IClasse;
import service.IDiscipline;

public class VueDiscipline {
	public IDiscipline impl = new DisciplineImpl();
	
	
	public  VueDiscipline() {
		Discipline discipline1  = new Discipline("maths", 12, 7, 4);
		Discipline discipline2 = new Discipline("SVT", 14, 12, 2);
		impl.creerDiscipline(discipline1);
		impl.creerDiscipline(discipline2);
	}
	
	public void listerDiscipline() {
		System.out.println("Liste des discipline");
		System.out.println("===================================");
		for(Discipline discipline : impl.listDiscipline()) {
			System.out.println("id : " + discipline.getId());
			System.out.println("Nom de la discipline : " + discipline.getNomDiscipline());
			System.out.println("Devoir : " + discipline.getDevoir());
			System.out.println("Composition : " + discipline.getComp());
			System.out.println("Coeficient : " + discipline.getCoef());
			System.out.println("-----------------------------------");
		}
	}
	
	public void creerDiscipline() {
		Discipline discipline = new Discipline();
		Scanner scanner = new Scanner(System.in);
		String input;
		
		System.out.print("Nom de la discipline : ");
		input = scanner.nextLine();
		discipline.setNomDiscipline(input);
		
		System.out.print("Devoir : ");
		input = scanner.nextLine();
		discipline.setDevoir(Float.parseFloat(input));
		
		System.out.print("Composition : ");
		input = scanner.nextLine();
		discipline.setComp(Float.parseFloat(input));
		
		System.out.print("Coeficient : ");
		input = scanner.nextLine();
		discipline.setCoef(Integer.parseInt(input));
		
		impl.creerDiscipline(discipline);
		listerDiscipline();
		
		
	}
	
	public void rechercherDiscipline() {
		Discipline discipline = new Discipline();
		Scanner scanner = new Scanner(System.in);
		String input;
		System.out.print("Id : ");
		input = scanner.nextLine();
		discipline= impl.getDisciplineById(Integer.parseInt(input));
		
		
		if(impl.listDiscipline().contains(discipline)) {
			System.out.println("id : " + discipline.getId());
			System.out.println("Nom de la discipline : " + discipline.getNomDiscipline());
			System.out.println("Devoir : " + discipline.getDevoir());
			System.out.println("Composition : " + discipline.getComp());
			System.out.println("Coeficient : " + discipline.getCoef());
			
			
		}else {
			System.out.println("La discipline n'existe pas !!");
		}
	}
	
	public void supprimerDiscipline() {
		Discipline discipline ;
		Scanner scanner = new Scanner(System.in);
		String input;
		System.out.print("Id : ");
		input = scanner.nextLine();
		discipline= impl.getDisciplineById(Integer.parseInt(input));
		impl.supprimerDiscipline(discipline);
		
		listerDiscipline();
	}
	
	public void modifierDiscipline() {
		Discipline discipline = new Discipline();
		Scanner scanner = new Scanner(System.in);
		String input;
		System.out.print("Entrer l'id : ");
		input = scanner.nextLine();
		discipline = impl.getDisciplineById(Integer.parseInt(input));
		
		System.out.print("Nom de la discipline : ");
		input = scanner.nextLine();
		discipline.setNomDiscipline(input);
		
		System.out.print("Devoir : ");
		input = scanner.nextLine();
		discipline.setDevoir(Float.parseFloat(input));
		
		System.out.print("Composition : ");
		input = scanner.nextLine();
		discipline.setComp(Float.parseFloat(input));
		
		System.out.print("Coeficient : ");
		input = scanner.nextLine();
		discipline.setCoef(Integer.parseInt(input));
		
		impl.modifierDiscipline(discipline);
		listerDiscipline();
		
	}
}
