package vue;

import java.time.LocalDate;

import java.util.Scanner;
import domaine.Eleve;
import service.EleveImpl;

import service.IEleve;
import sevice.generique.EleveG;
import sevice.generique.IMetier;

public class VueEleve {

public IMetier<Eleve, Integer> impl = new EleveG();
	
	
	public  VueEleve() {
		Eleve eleve1 = new Eleve("345ISM65", "Rachid", "mimir", LocalDate.parse("2020-04-23"), "Thies");
		Eleve eleve2 = new Eleve("629ISM45", "Bard", "Rami", LocalDate.parse("2010-06-15"), "Thies");
		impl.creer(eleve1);
		impl.creer(eleve2);
	}
	
	public void listerEleve() {
		System.out.println("Liste des eleves");
		System.out.println("===================================");
		for(Eleve eleve : impl.liste()) {
			System.out.println("id : " + eleve.getId());
			System.out.println("Matricule de l'eleve : " + eleve.getMatricule());
			System.out.println("Nom de l'eleve : " + eleve.getNom());
			System.out.println("Prenom de l'eleve : " + eleve.getPrenom());
			System.out.println("Date de naissance : " + eleve.getDateNaissance());
			System.out.println("Lieu de naissance : " + eleve.getLieuNaissance());
			System.out.println("-----------------------------------");
		}
	}
	
	public void creerEleve() {
		Eleve eleve = new Eleve();
		Scanner scanner = new Scanner(System.in);
		String input;
		
		
		System.out.print("Matricule : ");
		input = scanner.nextLine();
		eleve.setMatricule(input);
		
		System.out.print("Nom : ");
		input = scanner.nextLine();
		eleve.setNom(input);
		
		System.out.print("Prenom : ");
		input = scanner.nextLine();
		eleve.setPrenom(input);
		
		System.out.print("Date de naissance : ");
		input = scanner.nextLine();
		eleve.setDateNaissance(LocalDate.parse(input));
		
		System.out.print("Lieu de naissance : ");
		input = scanner.nextLine();
		eleve.setLieuNaissance(input);
		
		impl.creer(eleve);
		listerEleve();
		
		
	}
	
	public void rechercherEleve() {
		Eleve eleve = new Eleve();
		Scanner scanner = new Scanner(System.in);
		String input;
		System.out.print("Id : ");
		input = scanner.nextLine();
		eleve= impl.getById(Integer.parseInt(input));
		
		
		if(impl.liste().contains(eleve)) {
			System.out.println("id : " + eleve.getId());
			System.out.println("Matricule de l'eleve : " + eleve.getMatricule());
			System.out.println("Nom de l'eleve : " + eleve.getNom());
			System.out.println("Prenom de l'eleve : " + eleve.getPrenom());
			System.out.println("Date de naissance : " + eleve.getDateNaissance());
			System.out.println("Lieu de naissance : " + eleve.getLieuNaissance());
			
			
		}else {
			System.out.println("La classe n'existe pas !!");
		}
	}
	
	public void supprimerEleve() {
		Eleve eleve ;
		Scanner scanner = new Scanner(System.in);
		String input;
		System.out.print("Id : ");
		input = scanner.nextLine();
		eleve= impl.getById(Integer.parseInt(input));
		impl.supprimer(eleve);
		
		listerEleve();
	}
	
	public void modifierEleve() {
		Eleve eleve = new Eleve();
		Scanner scanner = new Scanner(System.in);
		String input;
		System.out.print("Entrer id : ");
		input = scanner.nextLine();
		eleve = impl.getById(Integer.parseInt(input));
		
		System.out.print("Matricule : ");
		input = scanner.nextLine();
		eleve.setMatricule(input);
		
		System.out.print("Nom : ");
		input = scanner.nextLine();
		eleve.setNom(input);
		
		System.out.print("Prenom : ");
		input = scanner.nextLine();
		eleve.setPrenom(input);
		
		System.out.print("Date de naissance : ");
		input = scanner.nextLine();
		eleve.setDateNaissance(LocalDate.parse(input));
		
		System.out.print("Lieu de naissance : ");
		input = scanner.nextLine();
		eleve.setLieuNaissance(input);
		
		impl.modifier(eleve);
		listerEleve();
		
	}
}
