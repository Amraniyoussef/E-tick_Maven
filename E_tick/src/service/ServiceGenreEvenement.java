package service;

import java.util.List;

import dao.DAOGenreEvenement;
import dao.IDAOObject;
import model.GenreEvenement;

public class ServiceGenreEvenement implements IServiceObject<GenreEvenement>{
	DAOGenreEvenement daogenreevenement;
	@Override
	public void create(GenreEvenement ge) {
		// TODO Auto-generated method stub
		daogenreevenement.save(ge);
	}

	@Override
	public void delete(GenreEvenement ge) {
		// TODO Auto-generated method stub
		daogenreevenement.delete(ge);
	}

	@Override
	public void update(GenreEvenement person) {
		// TODO Auto-generated method stub
		
	}
	

	

	public DAOGenreEvenement getDaogenreevenement() {
		return daogenreevenement;
	}

	public void setDaogenreevenement(DAOGenreEvenement daogenreevenement) {
		this.daogenreevenement = daogenreevenement;
	}

	@Override
	public GenreEvenement searchPersonById(int id) {
		// TODO Auto-generated method stub
		return (GenreEvenement) daogenreevenement.findById(id);
	}
public List<GenreEvenement> select(String f) {
		
		return daogenreevenement.select(f);
	}
}
