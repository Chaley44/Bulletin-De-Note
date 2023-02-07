package service;

import java.util.List;


import domaine.Eleve;

public interface IEleve {

	List<Eleve> listEleve();
	void creerEleve(Eleve eleve);
	void supprimerEleve(Eleve eleve);
	void modifierEleve(Eleve eleve);
	Eleve getEleveById(int id);
}
