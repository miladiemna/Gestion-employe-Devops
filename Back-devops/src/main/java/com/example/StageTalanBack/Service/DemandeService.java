
package com.example.StageTalanBack.Service;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.StageTalanBack.Model.Demande;
import com.example.StageTalanBack.Repository.DemandeRepository;


@Service
@Transactional
public class DemandeService  {
@Autowired 
  DemandeRepository demandeRepository;
	

	public List<Demande>ListDemande(){
		
		return demandeRepository.findAll();
	}
			

	public void saveDemande(Demande a) {
		demandeRepository.save(a);
	}
			

	public void removeDemande(Long id) {
		demandeRepository.deleteById(id);
	}
			
	public void updateDemande (Demande a)
	{
		demandeRepository.save(a);
	}

	public Optional<Demande> findDemande(Long Id) {
		return demandeRepository.findById(Id);
	}


}