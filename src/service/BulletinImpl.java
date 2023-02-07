package service;

import java.util.ArrayList;
import java.util.List;

import domaine.Bulletin;
import domaine.Eleve;

public class BulletinImpl implements IBulletin {

	List<Bulletin> listBulletin = new ArrayList<>();
	
	@Override
	public List<Bulletin> listeBulletin() {
		// TODO Auto-generated method stub
		return listBulletin ;
	}

	@Override
	public void creerBulletin(Bulletin bulletin) {
		listBulletin.add(bulletin);

	}

	@Override
	public void supprimerBulletin(Bulletin bulletin) {
		listBulletin.remove(bulletin);

	}

	@Override
	public void modifierBulletin(Bulletin bulletin) {
		Bulletin bulletin2 = getBulletinById(bulletin.getId());
		int index = listBulletin.indexOf(bulletin2);
		
		listBulletin.set(index, bulletin);

	}

	@Override
	public Bulletin getBulletinById(int id) {
		for(Bulletin bulletin: listBulletin) {
			if(bulletin.getId()== id) {
				return bulletin;
			}
		}
		return null;
	}

	@Override
	public Bulletin getBulletinByEleve(String matricule) {
		for(Bulletin bulletin : listBulletin) {
			if(bulletin.getEleve().getMatricule().equals(matricule)) {
				return bulletin;
			}
		}
		return null;
	}



}
