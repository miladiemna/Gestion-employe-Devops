package com.example.StageTalanBack;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.StageTalanBack.Model.Employee;
import com.example.StageTalanBack.Repository.EmployeeRepository;

@SpringBootApplication
public class StageTalanBackApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(StageTalanBackApplication.class, args);
	}
	 @Autowired
	    private EmployeeRepository userRepository;

	    @Override
	    public void run(String...args) throws Exception {
	        this.userRepository.save(new Employee("Emna", "Miladi", "emna@gmail.com"));
	        this.userRepository.save(new Employee("Oumaima", "Miladi", "oumaima@gmail.com"));
	        this.userRepository.save(new Employee("Houssain", "Ajroudi", "ajroudi@gmail.com"));
	    }
}
