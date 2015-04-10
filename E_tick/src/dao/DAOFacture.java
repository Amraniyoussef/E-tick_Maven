package dao;

import java.util.List;

import model.Facture;

import org.springframework.dao.DataAccessException;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;


public class DAOFacture extends HibernateDaoSupport implements IDAOObject<Facture>{

	@Override
	public void save(Facture x) {
		// TODO Auto-generated method stub
		getHibernateTemplate().save(x);
	}

	@Override
	public void delete(Facture y) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Facture findById(int id) {
		// TODO Auto-generated method stub
		return null ;
	}

	@SuppressWarnings("unchecked")
	public List<Facture> select(String f)throws DataAccessException {
		// TODO Auto-generated method stub
		return  (List<Facture>)getHibernateTemplate().find(f);
	}
	
}
