package com.mehat.parc.dao;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.mehat.parc.entities.Vehicule;

public interface VehiculeRepository extends JpaRepository<Vehicule, Long>{

	public Vehicule findVehiculeByRef(String ref);
	public Vehicule findVehiculeByMarque(String marque);
	
	@Query("select e from Vehicule e")
	public Page<Vehicule> getVehiculesPage(Pageable page);
	
	@Query("select e from Vehicule e where e.marque =:x")
	public Page<Vehicule> getVehiculesPageByMarque(@Param("x") String marque, Pageable page);

	@Query("select e from Vehicule e where e.modele =:modele")
	public Page<Vehicule> getVehiculesPageByModele(@Param("modele") String modele, Pageable page);

}
