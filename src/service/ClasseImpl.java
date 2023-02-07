package service;

import java.util.ArrayList;

import java.util.List;

import domaine.Classe;


public class ClasseImpl implements IClasse {

	List<Classe> listClasse = new ArrayList<>();
	
	@Override
	public List<Classe> listClasse() {
		// TODO Auto-generated method stub
		return listClasse;
	}

	@Override
	public void creerClasse(Classe classe) {
		listClasse.add(classe);

	}

	@Override
	public void supprimerClasse(Classe classe) {
		listClasse.remove(classe);

	}

	@Override
	public void modifierClasse(Classe classe) {
		Classe classe2 = getClasseById(classe.getId());
		int index = listClasse.indexOf(classe2);
		
		listClasse.set(index, classe);

	}

	@Override
	public Classe getClasseById(int id) {
		for(Classe classe : listClasse) {
			if(classe.getId()== id) {
				return classe;
			}
		}
		return null;
	}

}
