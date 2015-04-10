package dao;

import java.util.List;

import model.Commande;

import org.springframework.dao.DataAccessException;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;


public class DAOCommande extends HibernateDaoSupport implements IDAOObject<Commande>{
	@Override
	public void save(Commande c) {
		// TODO Auto-generated method stub
		getHibernateTemplate().save(c);
	}

	@Override
	public void delete(Commande c) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Commande findById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@SuppressWarnings("unchecked")
	public List<Commande> select(String f)throws DataAccessException {
		// TODO Auto-generated method stub
		return  (List<Commande>)getHibernateTemplate().find(f);
	}
	   
}
