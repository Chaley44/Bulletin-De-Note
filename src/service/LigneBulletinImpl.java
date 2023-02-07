package service;

import java.util.ArrayList;
import java.util.List;

import domaine.Classe;
import domaine.LigneBulletin;

public class LigneBulletinImpl implements ILigneBulletin {

	List<LigneBulletin> listLigneBulletin = new ArrayList<>();
	
	@Override
	public List<LigneBulletin> listLigneBulletin() {
		// TODO Auto-generated method stub
		return listLigneBulletin;
	}

	@Override
	public void creerLigneBulletin(domaine.LigneBulletin ligneBulletin) {
		listLigneBulletin.add(ligneBulletin);

	}

	@Override
	public void supprimerLigneBulletin(domaine.LigneBulletin ligneBulletin) {
		listLigneBulletin.remove(ligneBulletin);

	}

	@Override
	public void modifierLigneBulletin(LigneBulletin ligneBulletin) {
		LigneBulletin classe2 = getLigneBulletinById(ligneBulletin.getId());
		int index = listLigneBulletin.indexOf(classe2);
		
		listLigneBulletin.set(index, ligneBulletin);

	}

	@Override
	public LigneBulletin getLigneBulletinById(int id) {
		for(LigneBulletin ligneBulletin : listLigneBulletin) {
			if(ligneBulletin.getId()== id) {
				return ligneBulletin;
			}
		}
		return null;
	}

}
