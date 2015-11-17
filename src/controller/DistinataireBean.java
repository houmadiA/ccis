package controller;

import java.util.List;

import model.Distinataire;
import service.DistinataireService;

public class DistinataireBean {

	DistinataireService distinataireService;
	Distinataire distinataire = new Distinataire();
	List<Distinataire> distinataires;

	public DistinataireService getDistinataireService() {
		return distinataireService;
	}

	public void setDistinataireService(DistinataireService distinataireService) {
		this.distinataireService = distinataireService;
	}

	public Distinataire getDistinataire() {
		return distinataire;
	}

	public void setDistinataire(Distinataire distinataire) {
		this.distinataire = distinataire;
	}

	public List<Distinataire> getDistinataires() {
		distinataires = distinataireService.getAll();
		return distinataires;
	}

	public void setDistinataires(List<Distinataire> distinataires) {
		this.distinataires = distinataires;
	}
	
	public void add(Distinataire dis){
		distinataireService.add(dis);
	}
	
	public void delete(int id){
		distinataireService.delete(id);
	}
	
	
}
