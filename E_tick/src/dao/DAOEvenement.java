package dao;

import java.util.List;

import model.Evenement;

import org.springframework.dao.DataAccessException;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;


public class DAOEvenement extends HibernateDaoSupport implements IDAOObject<Evenement>{
	@Override
	public void save(Evenement ev) {
		// TODO Auto-generated method stub
		getHibernateTemplate().save(ev);
	}

	@Override
	public void delete(Evenement ev) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Evenement findById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	
	@SuppressWarnings("unchecked")
	public List<Evenement> select(String f)throws DataAccessException {
		// TODO Auto-generated method stub
		return  (List<Evenement>)getHibernateTemplate().find(f);
	}
	   
}
