package service;

import java.util.List;

import dao.IDAOObject;

import model.Date_Ev;
import model.Lieu;




public class ServiceDate implements IServiceObject<Date_Ev>{
IDAOObject dateDao;



public void setDateDao(IDAOObject dateDao) {
	this.dateDao = dateDao;
}

@Override
public void create(Date_Ev person) {
	// TODO Auto-generated method stub
	dateDao.save(person);
}

@Override
public void delete(Date_Ev person) {
	// TODO Auto-generated method stub
	
}

@Override
public void update(Date_Ev person) {
	// TODO Auto-generated method stub
	
}

@Override
public Date_Ev searchPersonById(int id) {
	// TODO Auto-generated method stub
	return (Date_Ev) dateDao.findById(id);
}

public List<Date_Ev> select(String f) {
	
	return dateDao.select(f);
}
	

}
