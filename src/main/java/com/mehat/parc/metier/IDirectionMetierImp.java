package com.mehat.parc.metier;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Controller;

import com.mehat.parc.dao.DirectionRepository;
import com.mehat.parc.entities.Direction;

@Controller
public class IDirectionMetierImp implements IDirectionMetier{

	@Autowired
	private DirectionRepository dRepo;
	
	@Override
	public Direction getDirectionById(long id) {
		// TODO Auto-generated method stub
		return dRepo.getOne(id);
	}

	@Override
	public Direction getDirectionByLibelle(String id) {
		// TODO Auto-generated method stub
		return dRepo.findDirectionByLibele(id);
	}

	@Override
	public List<Direction> getDirections() {
		// TODO Auto-generated method stub
		return dRepo.findAll();
	}

	@Override
	public Page<Direction> getDirectionsPages(int page, int size) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Direction ajouterDirection(Direction v) {
		// TODO Auto-generated method stub
		return dRepo.save(v);
	}

	@Override
	public Direction updateDirection(Direction v) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void supprimerDirection(long id) {
		// TODO Auto-generated method stub
		dRepo.deleteById(id);
	}

}
