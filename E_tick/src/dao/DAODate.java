package dao;

import java.util.List;

import model.Date_Ev;

import org.springframework.dao.DataAccessException;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;


public class DAODate extends HibernateDaoSupport implements IDAOObject<Date_Ev>{

	@Override
	public void save(Date_Ev x) {
		// TODO Auto-generated method stub
		getHibernateTemplate().save(x);
	}

	@Override
	public void delete(Date_Ev y) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Date_Ev findById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@SuppressWarnings("unchecked")
	public List<Date_Ev> select(String f)throws DataAccessException {
		// TODO Auto-generated method stub
		return  (List<Date_Ev>)getHibernateTemplate().find(f);
	}
	
	
	
}
