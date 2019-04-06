package com.mehat.parc.metier;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.stereotype.Controller;

import com.mehat.parc.entities.Direction;
import com.mehat.parc.entities.Employe;
import com.mehat.parc.entities.PieceRechange;

@Controller
public class IPieceRechangeMetierImp implements IPieceRechangeMetier{

	@Override
	public PieceRechange getPieceRechangeById(long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public PieceRechange getPieceRechangeByRef(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<PieceRechange> getPieceRechanges() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Page<PieceRechange> getPieceRechangesPages(int page, int size) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Page<PieceRechange> getPieceRechangesByMarque(String marque, int page, int size) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Page<PieceRechange> getPieceRechangesByModele(String modele, int page, int size) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public PieceRechange ajouterPieceRechange(PieceRechange v) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public PieceRechange updatePieceRechange(PieceRechange v) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void supprimerPieceRechange(long id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean AffecterPieceRechange(PieceRechange v, Employe e, Direction d) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean DelAffecterPieceRechange(PieceRechange v, Employe e, Direction d) {
		// TODO Auto-generated method stub
		return false;
	}

	
}
