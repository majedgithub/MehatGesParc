package com.mehat.parc.metier;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Controller;

import com.mehat.parc.dao.EmployeRepository;
import com.mehat.parc.dao.VehiculeRepository;
import com.mehat.parc.entities.Direction;
import com.mehat.parc.entities.Employe;
import com.mehat.parc.entities.Vehicule;

@Controller
public class IVehiculeMetierImp implements IVehiculeMetier{

	@Autowired
	private VehiculeRepository vRepo;
	
	@Autowired
	private EmployeRepository empRepo;
	
	@Override
	public Vehicule getVehiculeById(long id) {
		// TODO Auto-generated method stub
		return vRepo.getOne(id);
	}

	@Override
	public Vehicule getVehiculeByRef(String id) {
		// TODO Auto-generated method stub
		return vRepo.findVehiculeByRef(id);
	}

	@Override
	public List<Vehicule> getVehicules() {
		// TODO Auto-generated method stub
		return vRepo.findAll();
	}

	@Override
	public Page<Vehicule> getVehiculesPages(int page, int size) {
		// TODO Auto-generated method stub
		return vRepo.getVehiculesPage(new PageRequest(page, size));
	}

	@Override
	public Page<Vehicule> getVehiculesByMarque(String marque, int page, int size) {
		// TODO Auto-generated method stub
		return vRepo.getVehiculesPageByMarque(marque, new PageRequest(page, size));
	}

	@Override
	public Page<Vehicule> getVehiculesByModele(String modele, int page, int size) {
		// TODO Auto-generated method stub
		return vRepo.getVehiculesPageByModele(modele, new PageRequest(page, size));
	}

	@Override
	public Vehicule ajouterVehicule(Vehicule v) {
		// TODO Auto-generated method stub
		return vRepo.save(v);
	}

	@Override
	public Vehicule updateVehicule(Vehicule v) {

		if(v!= null && vRepo.existsById(v.getId())) {
			return vRepo.save(v);
		}
		return null;
		
	}

	@Override
	public void supprimerVehicule(long id) {
		// TODO Auto-generated method stub
		if(vRepo.existsById(id)) {
			 vRepo.deleteById(id);
		}
	}

	@Override
	public boolean AffecterVehicule(Vehicule v, Employe e, Direction d) {
		
		if(v != null && e !=null && v.getEmploye() == null && v.getDirection() ==null && e.getVehicule() == null) {
			
			v.setEmploye(e);
			e.setVehicule(v);
			vRepo.save(v);
			empRepo.save(e);
			return true;
		}
		
		if(v != null && d !=null && v.getEmploye() == null && v.getDirection() ==null) {
			
			v.setDirection(d);
			d.getLesVehicules().add(v);
			vRepo.save(v);
			empRepo.save(e);
			return true;
		}
		return false;
	}

	@Override
	public boolean DelAffecterVehicule(Vehicule v, Employe e, Direction d) {

		if(v != null && e !=null && v.getEmploye() != null && v.getDirection() ==null && e.getVehicule() != null) {
			
			v.setEmploye(null);
			e.setVehicule(null);
			vRepo.save(v);
			empRepo.save(e);
			return true;
		}
		
		if(v != null && d !=null && v.getEmploye() == null && v.getDirection() !=null && d.getLesVehicules() != null) {
			
			v.setDirection(null);
			d.getLesVehicules().remove(v);
			vRepo.save(v);
			empRepo.save(e);
			return true;
		}
		return false;
	}

}
