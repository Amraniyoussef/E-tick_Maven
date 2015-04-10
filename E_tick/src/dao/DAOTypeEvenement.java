package dao;

import java.util.List;

import model.TypeEvenement;

import org.springframework.dao.DataAccessException;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;


public class DAOTypeEvenement extends HibernateDaoSupport implements IDAOObject<TypeEvenement>{
	@Override
	public void save(TypeEvenement c) {
		// TODO Auto-generated method stub
		getHibernateTemplate().save(c);
	}

	@Override
	public void delete(TypeEvenement c) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public TypeEvenement findById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@SuppressWarnings("unchecked")
	public List<TypeEvenement> select(String f)throws DataAccessException {
		// TODO Auto-generated method stub
		return  (List<TypeEvenement>)getHibernateTemplate().find(f);
	}
	   
}
