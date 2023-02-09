package vue;

import java.util.Scanner;

import domaine.Classe;
import service.ClasseImpl;
import service.IClasse;
import sevice.generique.ClasseG;
import sevice.generique.IMetier;
public class VueClasse {

	public IMetier<Classe, Integer> impl = new ClasseG();
	
	public  VueClasse() {
		Classe classe1 = new Classe("4M3", 25);
		Classe classe2 = new Classe("3M5", 23);
		impl.creer(classe1);
		impl.creer(classe2);
	}
	
	public void listerClasse() {
		System.out.println("Liste des classes");
		System.out.println("===================================");
		for(Classe classe : impl.liste()) {
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
		
		impl.creer(classe);
		listerClasse();
		
		
	}
	
	public void rechercherClasse() {
		Classe classe = new Classe();
		Scanner scanner = new Scanner(System.in);
		String input;
		System.out.print("Id : ");
		input = scanner.nextLine();
		classe= impl.getById(Integer.parseInt(input));
		
		
		if(impl.liste().contains(classe)) {
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
		classe= impl.getById(Integer.parseInt(input));
		impl.supprimer(classe);
		
		listerClasse();
	}
	
	public void modifierClasse() {
		Classe classe = new Classe();
		Scanner scanner = new Scanner(System.in);
		String input;
		System.out.println("Entrer l'id : ");
		input = scanner.nextLine();
		classe = impl.getById(Integer.parseInt(input));
		
		System.out.print("Nom : ");
		input = scanner.nextLine();
		classe.setNomClasse(input);
		
		System.out.print("Nombre d'eleve : ");
		input = scanner.nextLine();
		classe.setNbrEleve(Integer.parseInt(input));
		
		impl.modifier(classe);
		listerClasse();
		
	}
}
