package service;

import java.util.ArrayList;
import java.util.List;

import domaine.Classe;
import domaine.Eleve;

public class EleveImpl implements IEleve {

	List<Eleve> listEleve = new ArrayList<>();
	
	@Override
	public List<Eleve> listEleve() {
		// TODO Auto-generated method stub
		return listEleve;
	}

	@Override
	public void creerEleve(Eleve eleve) {
		listEleve.add(eleve);

	}

	@Override
	public void supprimerEleve(Eleve eleve) {
		listEleve.remove(eleve);

	}

	@Override
	public void modifierEleve(Eleve eleve) {
		Eleve eleve2 = getEleveById(eleve.getId());
		int index = listEleve.indexOf(eleve2);
		
		listEleve.set(index, eleve);// TODO Auto-generated method stub

	}

	@Override
	public Eleve getEleveById(int id) {
		for(Eleve eleve : listEleve) {
			if(eleve.getId()== id) {
				return eleve;
			}
		}
		return null;
	}

}
