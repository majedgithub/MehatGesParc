package com.mehat.parc.entities;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class PieceRechange {

	@Id @GeneratedValue
	private long id;
	
	private String ref;
	
	private String modele;
	
	private String marque;
	
	private Date dateAchat;
	
	private int quantite;
	
	@ManyToOne
	@JoinColumn(name="vehicule_id")
	private Vehicule vehicule_piece;

	public PieceRechange() {
		super();
		// TODO Auto-generated constructor stub
	}

	public PieceRechange(String ref, String modele, String marque, Date dateAchat, int quantite) {
		super();
		this.ref = ref;
		this.modele = modele;
		this.marque = marque;
		this.dateAchat = dateAchat;
		this.quantite = quantite;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getRef() {
		return ref;
	}

	public void setRef(String ref) {
		this.ref = ref;
	}

	public String getModele() {
		return modele;
	}

	public void setModele(String modele) {
		this.modele = modele;
	}

	public String getMarque() {
		return marque;
	}

	public void setMarque(String marque) {
		this.marque = marque;
	}

	public Date getDateAchat() {
		return dateAchat;
	}

	public void setDateAchat(Date dateAchat) {
		this.dateAchat = dateAchat;
	}

	public int getQuantite() {
		return quantite;
	}

	public void setQuantite(int quantite) {
		this.quantite = quantite;
	}

	public Vehicule getVehicule_piece() {
		return vehicule_piece;
	}

	public void setVehicule_piece(Vehicule vehicule_piece) {
		this.vehicule_piece = vehicule_piece;
	}
	
	
	
}
