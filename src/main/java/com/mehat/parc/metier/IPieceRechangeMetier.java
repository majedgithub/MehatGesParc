package com.mehat.parc.metier;

import java.util.List;

import org.springframework.data.domain.Page;

import com.mehat.parc.entities.Direction;
import com.mehat.parc.entities.Employe;
import com.mehat.parc.entities.PieceRechange;

public interface IPieceRechangeMetier {

	public PieceRechange getPieceRechangeById(long id);
	public PieceRechange getPieceRechangeByRef(String id);
	public List<PieceRechange> getPieceRechanges();
	public Page<PieceRechange> getPieceRechangesPages(int page, int size);
	public Page<PieceRechange> getPieceRechangesByMarque(String marque, int page, int size);
	public Page<PieceRechange> getPieceRechangesByModele(String modele, int page, int size);
	public PieceRechange ajouterPieceRechange(PieceRechange v);
	public PieceRechange updatePieceRechange(PieceRechange v);
	public void supprimerPieceRechange(long id);
	public boolean AffecterPieceRechange(PieceRechange v, Employe e, Direction d);
	public boolean DelAffecterPieceRechange(PieceRechange v, Employe e, Direction d);
}
