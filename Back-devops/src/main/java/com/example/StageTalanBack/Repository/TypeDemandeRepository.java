package com.example.StageTalanBack.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.StageTalanBack.Model.TypeDemande;

@Repository
public interface TypeDemandeRepository extends JpaRepository <TypeDemande,Long>{
    
}
