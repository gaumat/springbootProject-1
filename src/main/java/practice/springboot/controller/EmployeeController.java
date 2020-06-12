package practice.springboot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import practice.springboot.model.Employee;
import practice.springboot.service.MyService;

@RestController
public class EmployeeController {

	@Autowired
	MyService myService;
	
	
	@RequestMapping(value="/employees",method=RequestMethod.GET)
	public List<Employee> getUsersByFirstName(@RequestParam String firstName){
		List<Employee> employees = myService.getEmployeesDetailsByFirstName(firstName);
		return employees;
	}
	
	@RequestMapping(value="/employees",method=RequestMethod.POST)
	public String createUser(@RequestBody Employee employee){
		String id =  myService.createEmployee(employee);
		return id;
	}
	
}
