package vue;

import java.util.Scanner;

import domaine.Classe;
import service.ClasseImpl;
import service.IClasse;
public class VueClasse {

	public IClasse impl = new ClasseImpl();
	
	public  VueClasse() {
		Classe classe1 = new Classe("4M3", 25);
		Classe classe2 = new Classe("3M5", 23);
		impl.creerClasse(classe1);
		impl.creerClasse(classe2);
	}
	
	public void listerClasse() {
		System.out.println("Liste des classes");
		System.out.println("===================================");
		for(Classe classe : impl.listClasse()) {
			System.out.println("id : " + classe.getId());
			System.out.println("Nom de la classe : " + classe.getNomClasse());
			System.out.println("Nombre d'eleve : " + classe.getNbrEleve());
			System.out.println("-----------------------------------");
		}
	}
	
	public void creerClasse() {
		Classe classe = new Classe();
		Scanner scanner = new Scanner(System.in);
		String input;
		
		System.out.print("Nom : ");
		input = scanner.nextLine();
		classe.setNomClasse(input);
		
		System.out.print("Nombre d'eleve : ");
		input = scanner.nextLine();
		classe.setNbrEleve(Integer.parseInt(input));
		
		impl.creerClasse(classe);
		listerClasse();
		
		
	}
	
	public void rechercherClasse() {
		Classe classe = new Classe();
		Scanner scanner = new Scanner(System.in);
		String input;
		System.out.print("Id : ");
		input = scanner.nextLine();
		classe= impl.getClasseById(Integer.parseInt(input));
		
		
		if(impl.listClasse().contains(classe)) {
			System.out.println("id : " + classe.getId());
			System.out.println("Nom : " + classe.getNomClasse());
			System.out.println("Prenom : " + classe.getNbrEleve());
			
			
		}else {
			System.out.println("La classe n'existe pas !!");
		}
	}
	
	public void supprimerClasse() {
		Classe classe ;
		Scanner scanner = new Scanner(System.in);
		String input;
		System.out.print("Id : ");
		input = scanner.nextLine();
		classe= impl.getClasseById(Integer.parseInt(input));
		impl.supprimerClasse(classe);
		
		listerClasse();
	}
	
	public void modifierClasse() {
		Classe classe = new Classe();
		Scanner scanner = new Scanner(System.in);
		String input;
		System.out.println("Entrer l'id : ");
		input = scanner.nextLine();
		classe = impl.getClasseById(Integer.parseInt(input));
		
		System.out.print("Nom : ");
		input = scanner.nextLine();
		classe.setNomClasse(input);
		
		System.out.print("Nombre d'eleve : ");
		input = scanner.nextLine();
		classe.setNbrEleve(Integer.parseInt(input));
		
		impl.modifierClasse(classe);
		listerClasse();
		
	}
}
