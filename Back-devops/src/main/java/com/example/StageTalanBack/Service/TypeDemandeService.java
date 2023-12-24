
package com.example.StageTalanBack.Service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.example.StageTalanBack.Model.TypeDemande;
import com.example.StageTalanBack.Repository.TypeDemandeRepository;

@Service
@Transactional
public class TypeDemandeService  {
@Autowired 
  TypeDemandeRepository typeDemandeRepository;
	

	public List<TypeDemande>ListTypeDemande(){
		
		return typeDemandeRepository.findAll();
	}
}