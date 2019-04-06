package com.mehat.parc.entities;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class Employe {

	@Id @GeneratedValue
	private long id;
	
	private String nomPrenom;
	
	private String grade;
	
	private String fonction;
	
	private Date dateNaiss;
	
	private Date dateRecrutement;
		
	private int tel;
	
	@OneToOne(fetch=FetchType.LAZY, mappedBy="employe")
	private Vehicule vehicule;

	public Employe() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Employe(String nom_Prenom, String grade, String fonction, Date dateNaiss, Date dateRecrutement, int tel) {
		super();
		this.nomPrenom = nom_Prenom;
		this.grade = grade;
		this.fonction = fonction;
		this.dateNaiss = dateNaiss;
		this.dateRecrutement = dateRecrutement;
		this.tel = tel;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getNom_Prenom() {
		return nomPrenom;
	}

	public void setNom_Prenom(String nom_Prenom) {
		this.nomPrenom = nom_Prenom;
	}

	public String getGrade() {
		return grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}

	public String getFonction() {
		return fonction;
	}

	public void setFonction(String fonction) {
		this.fonction = fonction;
	}

	public Date getDateNaiss() {
		return dateNaiss;
	}

	public void setDateNaiss(Date dateNaiss) {
		this.dateNaiss = dateNaiss;
	}

	public Date getDateRecrutement() {
		return dateRecrutement;
	}

	public void setDateRecrutement(Date dateRecrutement) {
		this.dateRecrutement = dateRecrutement;
	}

	public int getTel() {
		return tel;
	}

	public void setTel(int tel) {
		this.tel = tel;
	}

	public Vehicule getVehicule() {
		return vehicule;
	}

	public void setVehicule(Vehicule vehicule) {
		this.vehicule = vehicule;
	}
	
	
}
