package com.mehat.parc.metier;

import java.util.List;

import org.springframework.data.domain.Page;

import com.mehat.parc.entities.Employe;


public interface IEmployeMetier {

	public Employe getEmployeById(long id);
	public Employe getEmployeBynom(String id);
	public List<Employe> getEmployes();
	public Page<Employe> getEmployesPages(int page, int size);
	public Employe ajouterEmploye(Employe v);
	public Employe updateEmploye(Employe v);
	public void supprimerEmploye(long id);
}
