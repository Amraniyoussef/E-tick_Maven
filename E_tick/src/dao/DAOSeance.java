package dao;

import java.util.List;

import model.Seance;

import org.springframework.dao.DataAccessException;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;


public class DAOSeance extends HibernateDaoSupport implements IDAOObject<Seance>{

	@Override
	public void save(Seance x) {
		// TODO Auto-generated method stub
		getHibernateTemplate().save(x);
	}

	@Override
	public void delete(Seance y) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Seance findById(int id) {
		// TODO Auto-generated method stub
		return null ;
	}

	@SuppressWarnings("unchecked")
	public List<Seance> select(String f)throws DataAccessException {
		// TODO Auto-generated method stub
		return  (List<Seance>)getHibernateTemplate().find(f);
	}
	
}
