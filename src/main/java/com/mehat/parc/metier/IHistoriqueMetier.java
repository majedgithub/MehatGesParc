package com.mehat.parc.metier;

import java.util.Date;
import java.util.List;

import org.springframework.data.domain.Page;

import com.mehat.parc.entities.Direction;
import com.mehat.parc.entities.Employe;
import com.mehat.parc.entities.Historique;

public interface IHistoriqueMetier {

	public Historique getHistoriqueById(long id);
	public List<Historique> getHistoriques();
	public Page<Historique> getHistoriquesPages(int page, int size);
	public Page<Historique> getHistoriquesByDate(Date date, int page, int size);
	
	public Historique ajouterHistorique(Historique v);
	public Historique updateHistorique(Historique v);
	public void supprimerHistorique(long id);
}
