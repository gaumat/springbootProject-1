package practice.springboot.dao.impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import practice.springboot.dao.UserDao;
import practice.springboot.model.Employee;

@Repository
public class UserDaoImpl implements UserDao{

	@PersistenceContext
	EntityManager entityManager;
	
	
	@SuppressWarnings("unchecked")
	@Override
	public List<Employee> getEmployeesByFirstName(String firstName) {
		Query q = entityManager.createQuery("select e from Employee e where e.firstName = :firstname");
		q.setParameter("firstname", firstName);
		return q.getResultList();
	}

}
