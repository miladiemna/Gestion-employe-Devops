package com.example.StageTalanBack.Controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.StageTalanBack.Exception.RessourceNotFoundException;
import com.example.StageTalanBack.Model.Employee;
import com.example.StageTalanBack.Service.EmployeeService;


@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/employee/")
public class EmployeeController {

	
	@Autowired
	private EmployeeService employeeService;
	
	// get all employees
	@GetMapping("/employees")
	public List<Employee> getAllEmployee()
	{
		return employeeService.ListEmployee();
	}		
	
	/*// create employee rest api
	@PostMapping("/employees")
	public Employee creerEmployee( @RequestBody Employee employee)
	{
		employeeService.saveEmployee(employee);
		return employee;
	}
	
	// get employee by id rest api
	@GetMapping("/employees/{id}")
	public Optional<Employee> findEmployee(@PathVariable (value="id") String id){
		return employeeService.findEmployee(Long.parseLong(id));
	}
	
	// update employee rest api
	
	@PutMapping("/employees/{id}")
	public String UpdateEmployee( @RequestBody Employee employee)  
	
	{
		employeeService.saveEmployee(employee);
		return "alerte Updated Successfully !";
	}
	
	// delete employee rest api
	/**
	 * @param id
	 * @return
	 
	@DeleteMapping("/employees/{id}")
	public ResponseEntity<Map<String, Boolean>> deleteEmployee(@PathVariable Long id){
		final Employee employee = employeeService.findEmployee(id)
				.orElseThrow(() -> new RessourceNotFoundException("Employee not exist with id :" + id));
		
		employeeService.removeEmployee(id);
		Map<String, Boolean> response = new HashMap<>();
		response.put("deleted", Boolean.TRUE);
		return ResponseEntity.ok(response);
	}*/
}
