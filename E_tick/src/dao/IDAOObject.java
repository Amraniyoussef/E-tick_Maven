package dao;

import java.util.List;


public interface IDAOObject<T> {
		public void save(T x);
		public void delete(T y);
		public T findById(int id);
		public List<?> select(String f);
		
}
