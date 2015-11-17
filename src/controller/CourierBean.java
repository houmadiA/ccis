package controller;

import java.util.List;

import model.Courier;

import org.primefaces.model.StreamedContent;

import service.CourierService;
import service.DistinataireService;
import service.DistinataireServiceImpl;
import service.RecepteurService;
import service.RecepteurServiceImpl;

public class CourierBean {

	CourierService courierService;
	DistinataireService disService = new DistinataireServiceImpl();
	RecepteurService recService = new RecepteurServiceImpl();
	Courier courier = new Courier();
	List<Courier> couriers;
	Integer recepteur, distinataire;
	StreamedContent file;

	public StreamedContent getFile() {
		return file;
	}

	public void setFile(StreamedContent file) {
		this.file = file;
	}

	public Integer getRecepteur() {
		return recepteur;
	}

	public void setRecepteur(Integer recepteur) {
		this.recepteur = recepteur;
	}

	public Integer getDistinataire() {
		return distinataire;
	}

	public void setDistinataire(Integer distinataire) {
		this.distinataire = distinataire;
	}

	public CourierService getCourierService() {
		return courierService;
	}

	public void setCourierService(CourierService courierService) {
		this.courierService = courierService;
	}

	public Courier getCourier() {
		return courier;
	}

	public void setCourier(Courier courier) {
		this.courier = courier;
	}

	public List<Courier> getCouriers() {
		couriers = courierService.getAll();
		return couriers;
	}

	public void setCouriers(List<Courier> couriers) {
		this.couriers = couriers;
	}

	public void add(Courier cou) {
		cou.setDistinataire(disService.getById(distinataire));
		cou.setRecepteur(recService.getById(recepteur));
		courierService.add(cou);
	}

	public void delete(int id) {
		courierService.delete(id);
	}

}
