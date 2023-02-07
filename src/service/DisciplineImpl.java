package service;

import java.util.ArrayList;
import java.util.List;

import domaine.Discipline;

public class DisciplineImpl implements IDiscipline {

	List<Discipline> listDiscipline = new ArrayList<>();
	
	@Override
	public List<Discipline> listDiscipline() {
		// TODO Auto-generated method stub
		return listDiscipline;
	}

	@Override
	public void creerDiscipline(Discipline discipline) {
		listDiscipline.add(discipline);

	}

	@Override
	public void supprimerDiscipline(Discipline discipline) {
		listDiscipline.remove(discipline);

	}

	@Override
	public void modifierDiscipline(Discipline discipline) {
		Discipline discipline2 = getDisciplineById(discipline.getId());
		int index = listDiscipline.indexOf(discipline2);
		
		listDiscipline.set(index, discipline);

	}

	@Override
	public Discipline getDisciplineById(int id) {
		for(Discipline discipline : listDiscipline) {
			if(discipline.getId()== id) {
				return discipline;
			}
		}
		return null;
	}

}
