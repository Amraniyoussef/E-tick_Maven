package dao;

import java.util.List;

import model.Client;

import org.springframework.dao.DataAccessException;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;


public class DAOClient extends HibernateDaoSupport implements IDAOObject<Client>{

	@Override
	public void save(Client x) {
		// TODO Auto-generated method stub
		getHibernateTemplate().save(x);
	}

	@Override
	public void delete(Client y) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Client findById(int id) {
		// TODO Auto-generated method stub
		return null ;
	}

	@SuppressWarnings("unchecked")
	public List<Client> select(String f)throws DataAccessException {
		// TODO Auto-generated method stub
		return  (List<Client>)getHibernateTemplate().find(f);
	}
	
}
