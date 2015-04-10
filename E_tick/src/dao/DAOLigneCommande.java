package dao;


import java.util.List;

import model.LigneCommande;

import org.springframework.dao.DataAccessException;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;


public class DAOLigneCommande extends HibernateDaoSupport implements IDAOObject<LigneCommande>{
	@Override
	public void save(LigneCommande c) {
		// TODO Auto-generated method stub
		getHibernateTemplate().save(c);
	}

	@Override
	public void delete(LigneCommande c) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public LigneCommande findById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@SuppressWarnings("unchecked")
	public List<LigneCommande> select(String f)throws DataAccessException {
		// TODO Auto-generated method stub
		return  (List<LigneCommande>)getHibernateTemplate().find(f);
	}
	   
}
