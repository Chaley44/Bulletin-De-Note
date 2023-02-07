package service;

import java.util.List;

import domaine.Classe;


public interface IClasse {

	List<Classe> listClasse();
	void creerClasse(Classe classe);
	void supprimerClasse(Classe classe);
	void modifierClasse(Classe classe);
	Classe getClasseById(int id);
}
