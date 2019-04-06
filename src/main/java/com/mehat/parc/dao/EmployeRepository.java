package com.mehat.parc.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mehat.parc.entities.Employe;
import com.mehat.parc.entities.Vehicule;

public interface EmployeRepository extends JpaRepository<Employe, Long>{

	
	Employe findEmployeByNomPrenom(String nom);

}
