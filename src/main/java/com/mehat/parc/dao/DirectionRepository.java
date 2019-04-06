package com.mehat.parc.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mehat.parc.entities.Direction;
import com.mehat.parc.entities.Vehicule;

public interface DirectionRepository extends JpaRepository<Direction, Long>{

	public Direction findDirectionByLibele( String libele);
	
}
