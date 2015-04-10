package dao;

import java.util.List;

import model.Panier;

import org.springframework.dao.DataAccessException;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;


public class DAOPanier extends HibernateDaoSupport implements IDAOObject<Panier>{
	@Override
	public void save(Panier c) {
		// TODO Auto-generated method stub
		getHibernateTemplate().save(c);
	}

	@Override
	public void delete(Panier c) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Panier findById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@SuppressWarnings("unchecked")
	public List<Panier> select(String f)throws DataAccessException {
		// TODO Auto-generated method stub
		return  (List<Panier>)getHibernateTemplate().find(f);
	}
	   
}
