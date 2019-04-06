package com.mehat.parc;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.mehat.parc.entities.Employe;
import com.mehat.parc.entities.Vehicule;
import com.mehat.parc.metier.IEmployeMetier;
import com.mehat.parc.metier.IVehiculeMetier;

@SpringBootApplication
public class GesParcMehatApplication implements CommandLineRunner{

	@Autowired
	private IEmployeMetier empM;
	
	@Autowired
	private IVehiculeMetier vM;
	
	public static void main(String[] args) {
		SpringApplication.run(GesParcMehatApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
	Employe e1= empM.ajouterEmploye(new Employe("majed ben ali", "Ingénieur principale", "ChefService",	new Date(), new Date(), 2521));
	Employe e2 = empM.ajouterEmploye(new Employe("mongi ben ali", "Ingénieur", "ChefService",new Date(1990, 04, 11), new Date(), 2424));
	
	Vehicule v1 = vM.ajouterVehicule(new Vehicule("x522x666", "13-12563","locan","dacia",new Date(2019,4,11),"diesel",5,5)); 
	Vehicule v2 = vM.ajouterVehicule(new Vehicule("x522x525", "13-45455","lux","mazda",new Date(2019,4,11),"diesel",6,6)); 

	vM.AffecterVehicule(v1, e1, null);
	
	
	}

}
