package sevice.generique;

import java.util.ArrayList;
import java.util.List;

import domaine.Discipline;

public class DisciplineG implements IMetier<Discipline, Integer> {

	List<Discipline> listDiscipline = new ArrayList<>();
	
	@Override
	public List<Discipline> liste() {
		// TODO Auto-generated method stub
		return listDiscipline;
	}

	@Override
	public void creer(Discipline o) {
		listDiscipline.add(o);
		
	}

	@Override
	public void supprimer(Discipline o) {
		listDiscipline.remove(o);
		
	}

	@Override
	public void modifier(Discipline o) {
		Discipline o2 = getById(o.getId());
		int index = listDiscipline.indexOf(o2);
		
		listDiscipline.set(index, o);
		
	}

	@Override
	public Discipline getById(Integer id) {
		for(Discipline o : listDiscipline) {
			if(o.getId()== id) {
				return o;
			}
		}
		return null;
	}

}
