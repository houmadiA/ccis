package controller;

import java.io.Serializable;
import java.util.List;

import model.Departement;
import service.DepartementService;

public class DepartementBean implements Serializable {

	DepartementService departementService;
	Departement departement = new Departement();
	List<Departement> departements;

	public List<Departement> getDepartements() {
		departements = departementService.getAll();
		return departements;
	}

	public void setDepartements(List<Departement> departements) {
		this.departements = departements;
	}

	public DepartementService getDepartementService() {
		return departementService;
	}

	public void setDepartementService(DepartementService departementService) {
		this.departementService = departementService;
	}

	public Departement getDepartement() {
		return departement;
	}

	public void setDepartement(Departement departement) {
		this.departement = departement;
	}

	public void add(Departement dep) {
		departementService.add(dep);
		System.out.println("nombre des departements ================= "
				+ departementService.getAll().size());
	}
	
	public void delete(int id){
		departementService.delete(id);
	}
}
