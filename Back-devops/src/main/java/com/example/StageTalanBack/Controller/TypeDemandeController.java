package com.example.StageTalanBack.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.StageTalanBack.Model.TypeDemande;
import com.example.StageTalanBack.Service.TypeDemandeService;


@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/typedemande/")
public class TypeDemandeController {

	
	@Autowired
	private TypeDemandeService typeDemandeService;
	
	// get all employees
	@GetMapping("/getAll")
	public List<TypeDemande> getAllTypeDemande()
	{
		return typeDemandeService.ListTypeDemande();
	}
}	