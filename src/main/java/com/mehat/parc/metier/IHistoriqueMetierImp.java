package com.mehat.parc.metier;

import java.util.Date;
import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.stereotype.Controller;

import com.mehat.parc.entities.Historique;

@Controller
public class IHistoriqueMetierImp implements IHistoriqueMetier{

	@Override
	public Historique getHistoriqueById(long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Historique> getHistoriques() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Page<Historique> getHistoriquesPages(int page, int size) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Page<Historique> getHistoriquesByDate(Date date, int page, int size) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Historique ajouterHistorique(Historique v) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Historique updateHistorique(Historique v) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void supprimerHistorique(long id) {
		// TODO Auto-generated method stub
		
	}

}
