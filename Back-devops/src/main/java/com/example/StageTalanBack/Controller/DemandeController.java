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
import com.example.StageTalanBack.Model.Demande;
import com.example.StageTalanBack.Service.DemandeService;


@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/demande/")
public class DemandeController {

	
	@Autowired
	private DemandeService demandeService;
	
	// get all demandes
	@GetMapping("/demandes")
	public List<Demande> getAllDemande()
	{
		return demandeService.ListDemande();
	}		
	
	// create demande rest api
	@PostMapping("/demande")
	public Demande creerDemande( @RequestBody Demande demande)
	{
		demandeService.saveDemande(demande);
		return demande;
	}
	
	// get demande by id rest api
	@GetMapping("/demandes/{id}")
	public Optional<Demande> findDemande(@PathVariable (value="id") String id){
		return demandeService.findDemande(Long.parseLong(id));
	}
	
	// update demande rest api
	
	@PutMapping("/demandes/{id}")
	public String UpdateDemande( @RequestBody Demande demande)  
	
	{
		demandeService.saveDemande(demande);
		return "alerte Updated Successfully !";
	}
	
	// delete demande rest api
	/**
	 * @param id
	 * @return
	 * 
	 */
	@DeleteMapping("/demandes/{id}")
	public ResponseEntity<Map<String, Boolean>> deleteDemande(@PathVariable Long id){
		final Demande demande = demandeService.findDemande(id)
				.orElseThrow(() -> new RessourceNotFoundException("Demande not exist with id :" + id));
		
		demandeService.removeDemande(id);
		Map<String, Boolean> response = new HashMap<>();
		response.put("deleted", Boolean.TRUE);
		return ResponseEntity.ok(response);
	}
}
