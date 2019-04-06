package com.mehat.parc.metier;

import java.util.List;

import org.springframework.data.domain.Page;

import com.mehat.parc.entities.Direction;
import com.mehat.parc.entities.Employe;

public interface IDirectionMetier {

	public Direction getDirectionById(long id);
	public Direction getDirectionByLibelle(String id);
	public List<Direction> getDirections();
	public Page<Direction> getDirectionsPages(int page, int size);
	
	public Direction ajouterDirection(Direction v);
	public Direction updateDirection(Direction v);
	public void supprimerDirection(long id);
}
