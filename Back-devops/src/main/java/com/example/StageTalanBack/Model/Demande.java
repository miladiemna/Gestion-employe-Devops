package com.example.StageTalanBack.Model;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.*;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;



@Entity
@Table(name = "demande")
public class Demande {
    @Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;

    
    @ManyToMany(mappedBy = "EmployeeDemande")
		Set<Employee> likes;

	@ManyToOne
		@JoinColumn(name="typeDemande_id", nullable=false)
		private TypeDemande type_Demande;
	
	@OneToMany(mappedBy = "id", fetch = FetchType.LAZY,
		cascade = CascadeType.ALL)
        private Set<FileDB> files;

	public Demande(long id, Set<Employee> likes, TypeDemande type_Demande, Set<FileDB> files) {
		super();
		this.id = id;
		this.likes = likes;
		this.type_Demande = type_Demande;
		this.files = files;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public Set<Employee> getLikes() {
		return likes;
	}

	public void setLikes(Set<Employee> likes) {
		this.likes = likes;
	}

	public TypeDemande getType_Demande() {
		return type_Demande;
	}

	public void setType_Demande(TypeDemande type_Demande) {
		this.type_Demande = type_Demande;
	}

	public Set<FileDB> getFiles() {
		return files;
	}

	public void setFiles(Set<FileDB> files) {
		this.files = files;
	}

	@Override
	public String toString() {
		return "Demande [id=" + id + ", likes=" + likes + ", type_Demande=" + type_Demande + ", files=" + files + "]";
	}

	public Demande() {
		super();
	}

	
}
