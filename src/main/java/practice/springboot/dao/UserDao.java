package practice.springboot.dao;
import java.util.List;

import practice.springboot.model.Employee;

public interface UserDao {
     
	public List<Employee> getEmployeesByFirstName(String firstName);
}
