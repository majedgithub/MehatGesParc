package com.mehat.parc.entities;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Direction {

	@Id @GeneratedValue
	private long id;
	
	private String libele;
	
	@OneToMany(mappedBy="direction")
	private List<Vehicule> lesVehicules;

	public Direction() {
		super();
		this.lesVehicules = new ArrayList();
		// TODO Auto-generated constructor stub
	}

	public Direction(String libele) {
		super();
		this.libele = libele;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getLibele() {
		return libele;
	}

	public void setLibele(String libele) {
		this.libele = libele;
	}

	public List<Vehicule> getLesVehicules() {
		return lesVehicules;
	}

	public void setLesVehicules(List<Vehicule> lesVehicules) {
		this.lesVehicules = lesVehicules;
	}
	
	
	
}
