package com.example.StageTalanBack.Model;

import java.util.Set;

import javax.persistence.*;
@Entity
@Table(name = "employees")
public class Employee {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@Column(name = "first_name")
	private String firstName;

	@Column(name = "last_name")
	private String lastName;
	
	@Column(name = "email_id")
	private String emailId;

    @Column(name = "cin")
	private String cin;

    @Column(name = "numPasseport")
	private String numPasseport;

	@ManyToMany
		@JoinTable(
		name = "demande_employee", 
		joinColumns = @JoinColumn(name = "employee_id"), 
		inverseJoinColumns = @JoinColumn(name = "Demande_id"))
		Set<Demande> EmployeeDemande;
	
	public Employee(String firstName, String lastName, String emailId, String cin, String numPasseport) {
        super();
        this.firstName = firstName;
        this.lastName = lastName;
        this.emailId = emailId;
        this.cin = cin;
        this.numPasseport = numPasseport;
    }

    public void setCin(String cin) {
        this.cin = cin;
    }

    public void setNumPasseport(String numPasseport) {
        this.numPasseport = numPasseport;
    }

    public String getCin() {
        return cin;
    }

    public String getNumPasseport() {
        return numPasseport;
    }

    public Employee() {
		
	}
	
	public Employee(String firstName, String lastName, String emailId) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.emailId = emailId;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
}