package com.example.StageTalanBack.Model;

import java.util.Set;

import javax.persistence.*;


@Entity
@Table(name = "TypeDemande")
public class TypeDemande {
    @Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id; 
    
    @Column(name = "nomTypeDemande")
	private String nomTypeDemande; 
	
	@OneToMany(mappedBy = "id", fetch = FetchType.LAZY,
            cascade = CascadeType.ALL)
    private Set<Demande> demandes;
    
}
