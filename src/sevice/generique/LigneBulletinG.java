package sevice.generique;

import java.util.ArrayList;
import java.util.List;

import domaine.LigneBulletin;

public class LigneBulletinG implements IMetier<LigneBulletin, Integer>{
	
	List<LigneBulletin> listLigneBulletin = new ArrayList<>();

	@Override
	public List<LigneBulletin> liste() {
		// TODO Auto-generated method stub
		return listLigneBulletin;
	}

	@Override
	public void creer(LigneBulletin o) {
		listLigneBulletin.add(o);
		
	}

	@Override
	public void supprimer(LigneBulletin o) {
		listLigneBulletin.remove(o);
		
	}

	@Override
	public void modifier(LigneBulletin o) {
		LigneBulletin o2 = getById(o.getId());
		int index = listLigneBulletin.indexOf(o2);
		
		listLigneBulletin.set(index, o);
		
	}

	@Override
	public LigneBulletin getById(Integer id) {
		for(LigneBulletin o : listLigneBulletin) {
			if(o.getId()== id) {
				return o;
			}
		}
		return null;
	}
}
