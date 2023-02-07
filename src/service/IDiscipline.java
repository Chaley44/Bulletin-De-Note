package service;

import java.util.List;


import domaine.Discipline;

public interface IDiscipline {

	List<Discipline> listDiscipline();
	void creerDiscipline(Discipline discipline);
	void supprimerDiscipline(Discipline discipline);
	void modifierDiscipline(Discipline discipline);
	Discipline getDisciplineById(int id);
}
