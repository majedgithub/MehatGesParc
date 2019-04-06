package com.mehat.parc.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mehat.parc.entities.Historique;
import com.mehat.parc.entities.Vehicule;

public interface HistoriqueRepository extends JpaRepository<Historique, Long>{

}
