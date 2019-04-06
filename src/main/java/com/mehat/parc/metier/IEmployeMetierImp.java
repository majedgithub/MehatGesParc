package com.mehat.parc.metier;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.mehat.parc.dao.EmployeRepository;
import com.mehat.parc.entities.Employe;

@Service
@Transactional
public class IEmployeMetierImp implements IEmployeMetier{

	@Autowired
	EmployeRepository empR;
	
	@Override
	public Employe getEmployeById(long id) {
		// TODO Auto-generated method stub
		return empR.getOne(id);
	}

	@Override
	public Employe getEmployeBynom(String id) {
		// TODO Auto-generated method stub
		return empR.findEmployeByNomPrenom(id);
	}

	@Override
	public List<Employe> getEmployes() {
		// TODO Auto-generated method stub
		return empR.findAll();
	}

	@Override
	public Page<Employe> getEmployesPages(int page, int size) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Employe ajouterEmploye(Employe v) {
		// TODO Auto-generated method stub
		return empR.save(v);
	}

	@Override
	public Employe updateEmploye(Employe v) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void supprimerEmploye(long id) {
		// TODO Auto-generated method stub
		
	}

}
