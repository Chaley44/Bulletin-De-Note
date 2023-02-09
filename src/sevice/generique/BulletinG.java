package sevice.generique;

import java.util.ArrayList;
import java.util.List;

import domaine.Bulletin;

public class BulletinG implements IMetier<Bulletin, Integer> {

	List<Bulletin> listBulletin = new ArrayList<>();

	@Override
	public List<Bulletin> liste() {
		// TODO Auto-generated method stub
		return listBulletin;
	}

	@Override
	public void creer(Bulletin o) {
		listBulletin.add(o);
		
	}

	@Override
	public void supprimer(Bulletin o) {
		listBulletin.remove(o);
		
	}

	@Override
	public void modifier(Bulletin o) {
		Bulletin o2 = getById(o.getId());
		int index = listBulletin.indexOf(o2);
		
		listBulletin.set(index, o);
		
	}

	@Override
	public Bulletin getById(Integer id) {
		for(Bulletin o: listBulletin) {
			if(o.getId()== id) {
				return o;
			}
		}
		return null;
	}
	
}
