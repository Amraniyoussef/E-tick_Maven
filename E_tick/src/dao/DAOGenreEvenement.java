package dao;


import java.util.List;

import model.GenreEvenement;

import org.springframework.dao.DataAccessException;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

public class DAOGenreEvenement extends HibernateDaoSupport implements IDAOObject<GenreEvenement>{

	@Override
	public void save(GenreEvenement ge) {
		// TODO Auto-generated method stub
		getHibernateTemplate().save(ge);
	}

	@Override
	public void delete(GenreEvenement ge) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public GenreEvenement findById(int id) {
		// TODO Auto-generated method stub
		return null;
	}
	@SuppressWarnings("unchecked")
	public List<GenreEvenement> select(String f) throws DataAccessException {
			
			return  (List<GenreEvenement>)getHibernateTemplate().find(f);
		}
}
