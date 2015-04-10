package dao;

import java.util.List;

import model.EvenementCategorie;

import org.springframework.dao.DataAccessException;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;



public class DAOEvenementCategorie extends HibernateDaoSupport implements IDAOObject<EvenementCategorie>{

	@Override
	public void save(EvenementCategorie evc) {
		getHibernateTemplate().save(evc);
		
	}

	@Override
	public void delete(EvenementCategorie evc) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public EvenementCategorie findById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@SuppressWarnings("unchecked")
	public List<EvenementCategorie> select(String f)throws DataAccessException {
		// TODO Auto-generated method stub
		return  (List<EvenementCategorie>)getHibernateTemplate().find(f);
	}
	
	
	   
}
