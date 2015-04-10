package service;

import java.util.List;

import dao.IDAOObject;
import model.Evenement;
import model.GenreEvenement;




public class ServiceEvenement implements IServiceObject<Evenement>{
IDAOObject evenementDao;
	@Override
	
	public void create(Evenement ev) {
		evenementDao.save(ev);
		
	}

	
	


	public void setEvenementDao(IDAOObject evenementDao) {
		this.evenementDao = evenementDao;
	}





	@Override
	public void delete(Evenement ev) {
		evenementDao.delete(ev);
		
	}

	@Override
	public void update(Evenement ev) {
		//hdhd
		
	}

	@Override
	public Evenement searchPersonById(int id) {
		// TODO Auto-generated method stub
		return (Evenement) evenementDao.findById(id);
	}
public List<Evenement> select(String f) {
		
		return evenementDao.select(f);
	}

}
