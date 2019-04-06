package com.mehat.parc.entities;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Historique {

	@Id @GeneratedValue
	private long id;
	
	private String libelle;
	
	private Date dateOpération;
	
	private String typeopération;
	
	private String commentaire;
	
	@ManyToOne
	@JoinColumn(name="voiture_id")
	private Vehicule vehicle_hist;

	public Historique() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Historique(String libelle, Date dateOpération, String typeopération, String commentaire,
			Vehicule vehicle_hist) {
		super();
		this.libelle = libelle;
		this.dateOpération = dateOpération;
		this.typeopération = typeopération;
		this.commentaire = commentaire;
		this.vehicle_hist = vehicle_hist;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getLibelle() {
		return libelle;
	}

	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}

	public Date getDateOpération() {
		return dateOpération;
	}

	public void setDateOpération(Date dateOpération) {
		this.dateOpération = dateOpération;
	}

	public String getTypeopération() {
		return typeopération;
	}

	public void setTypeopération(String typeopération) {
		this.typeopération = typeopération;
	}

	public String getCommentaire() {
		return commentaire;
	}

	public void setCommentaire(String commentaire) {
		this.commentaire = commentaire;
	}

	public Vehicule getVehicle_hist() {
		return vehicle_hist;
	}

	public void setVehicle_hist(Vehicule vehicle_hist) {
		this.vehicle_hist = vehicle_hist;
	}
	
	
}
