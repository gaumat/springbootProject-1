package practice.springboot.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import practice.springboot.dao.UserDao;
import practice.springboot.model.Employee;
import practice.springboot.service.MyService;

@Service
public class MyServiceImpl implements MyService {

	@Autowired
	UserDao userdao;
	
	
	@Override
	public List<Employee> getEmployeesDetailsByFirstName(String firstName) {
		
		return userdao.getEmployeesByFirstName(firstName);
	}


	@Override
	public String createEmployee(Employee employee) {
		// TODO Auto-generated method stub
		return userdao.createEmployee(employee);
	}


	@Override
	public List<Employee> listEmployees() {
		// TODO Auto-generated method stub
		return userdao.listEmployees();
	}


}
