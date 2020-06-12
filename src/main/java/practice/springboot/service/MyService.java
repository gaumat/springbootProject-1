package practice.springboot.service;

import java.util.List;

import practice.springboot.model.Employee;

public interface MyService {
	
	public  List<Employee>getEmployeesDetailsByFirstName(String firstName);
	
	public  String createEmployee(Employee employee);
}
