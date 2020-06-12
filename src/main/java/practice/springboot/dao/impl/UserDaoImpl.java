package practice.springboot.dao.impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import practice.springboot.dao.UserDao;
import practice.springboot.model.Employee;

@Repository
public class UserDaoImpl implements UserDao{

	@PersistenceContext
	EntityManager entityManager;
	
	SessionFactory sessionFactory;
	
	@SuppressWarnings("unchecked")
	@Override
	public List<Employee> getEmployeesByFirstName(String firstName) {
		
		Query q = entityManager.createQuery("select e from Employee e where e.firstName = :firstname");
		q.setParameter("firstname", firstName);
		return q.getResultList();
	}


	@Override
	public String createEmployee(Employee employee) {
		Session session = entityManager.unwrap(Session.class);
		session.beginTransaction();
		session.save(employee);
		session.getTransaction().commit();
		session.close();
		return String.valueOf(employee.getId());
	}

}
