
package com.example.StageTalanBack.Service;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.example.StageTalanBack.Model.Employee;
import com.example.StageTalanBack.Repository.EmployeeRepository;

@Service
@Transactional
public class EmployeeService  {
@Autowired 
  EmployeeRepository employeeRepository;
	

	public List<Employee>ListEmployee(){
		
		return employeeRepository.findAll();
	}
			

	public void saveEmployee(Employee a) {
		employeeRepository.save(a);
	}
			

	public void removeEmployee(Long id) {
		employeeRepository.deleteById(id);
	}
			
	public void updateEmployee (Employee a)
	{
		employeeRepository.save(a);
	}

	public Optional<Employee> findEmployee(Long Id) {
		return employeeRepository.findById(Id);
	}


}