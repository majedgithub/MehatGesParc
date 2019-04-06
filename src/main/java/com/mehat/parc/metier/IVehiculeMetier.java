package com.mehat.parc.metier;

import java.util.List;

import org.springframework.data.domain.Page;

import com.mehat.parc.entities.Direction;
import com.mehat.parc.entities.Employe;
import com.mehat.parc.entities.Vehicule;

public interface IVehiculeMetier {

	public Vehicule getVehiculeById(long id);
	public Vehicule getVehiculeByRef(String id);
	public List<Vehicule> getVehicules();
	public Page<Vehicule> getVehiculesPages(int page, int size);
	public Page<Vehicule> getVehiculesByMarque(String marque, int page, int size);
	public Page<Vehicule> getVehiculesByModele(String modele, int page, int size);
	
	public Vehicule ajouterVehicule(Vehicule v);
	public Vehicule updateVehicule(Vehicule v);
	public void supprimerVehicule(long id);
	public boolean AffecterVehicule(Vehicule v, Employe e, Direction d);
	public boolean DelAffecterVehicule(Vehicule v, Employe e, Direction d);
}
