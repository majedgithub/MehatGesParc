package com.mehat.parc.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mehat.parc.entities.PieceRechange;
import com.mehat.parc.entities.Vehicule;

public interface PieceRechangeRepository extends JpaRepository<PieceRechange, Long>{

}
