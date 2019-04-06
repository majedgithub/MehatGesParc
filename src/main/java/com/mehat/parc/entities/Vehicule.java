package com.mehat.parc.entities;

import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Vehicule {

	@Id @GeneratedValue
	private long id;
	
	private String ref;
	
	private String matricule;
	
	private String modele;
	
	private String marque;
	
	private Date dateAchat;
	
	private String typeCarburant;
	
	private int nbrChevaux;
	
	private int nbrVitesse;
	
	@ManyToOne
	@JoinColumn(name="direction_id")
	private Direction direction;
	
	@OneToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="employe_id")
	private Employe employe;
	
	@OneToMany(fetch=FetchType.LAZY, mappedBy="vehicle_hist")
	private List<Historique> lesHistoriques;
	
	@OneToMany(fetch=FetchType.LAZY, mappedBy="vehicule_piece")
	private List<PieceRechange> lesPiecesRechanges;
	

	public Vehicule() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Vehicule(String ref, String matricule, String modele, String marque, Date dateAchat, String typeCarburant, int nbrChevaux,
			int nbrVitesse) {
		super();
		this.ref = ref;
		this.modele = modele;
		this.marque = marque;
		this.dateAchat = dateAchat;
		this.typeCarburant = typeCarburant;
		this.nbrChevaux = nbrChevaux;
		this.nbrVitesse = nbrVitesse;
		this.matricule = matricule;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getRef() {
		return ref;
	}

	public void setRef(String ref) {
		this.ref = ref;
	}

	public String getModele() {
		return modele;
	}

	public void setModele(String modele) {
		this.modele = modele;
	}

	public String getMarque() {
		return marque;
	}

	public void setMarque(String marque) {
		this.marque = marque;
	}

	public Date getDateAchat() {
		return dateAchat;
	}

	public void setDateAchat(Date dateAchat) {
		this.dateAchat = dateAchat;
	}

	public String getTypeCarburant() {
		return typeCarburant;
	}

	public void setTypeCarburant(String typeCarburant) {
		this.typeCarburant = typeCarburant;
	}

	public int getNbrChevaux() {
		return nbrChevaux;
	}

	public void setNbrChevaux(int nbrChevaux) {
		this.nbrChevaux = nbrChevaux;
	}

	public int getNbrVitesse() {
		return nbrVitesse;
	}

	public void setNbrVitesse(int nbrVitesse) {
		this.nbrVitesse = nbrVitesse;
	}

	public Direction getDirection() {
		return direction;
	}

	public void setDirection(Direction direction) {
		this.direction = direction;
	}

	public Employe getEmploye() {
		return employe;
	}

	public void setEmploye(Employe employe) {
		this.employe = employe;
	}

	public List<Historique> getLesHistoriques() {
		return lesHistoriques;
	}

	public void setLesHistoriques(List<Historique> lesHistoriques) {
		this.lesHistoriques = lesHistoriques;
	}

	public List<PieceRechange> getLesPiecesRechanges() {
		return lesPiecesRechanges;
	}

	public void setLesPiecesRechanges(List<PieceRechange> lesPiecesRechanges) {
		this.lesPiecesRechanges = lesPiecesRechanges;
	}

	public String getMatricule() {
		return matricule;
	}

	public void setMatricule(String matricule) {
		this.matricule = matricule;
	}
	
	
	
	
}
