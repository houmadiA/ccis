package controller;

import java.io.Serializable;
import java.util.List;

import model.Service;
import service.DepartementService;
import service.DepartementServiceImpl;
import service.ServiceService;

public class ServiceBean implements Serializable {

	ServiceService serviceService;
	DepartementService depService = new DepartementServiceImpl();
	Service service = new Service();
	List<Service> services;
	Integer departement;

	public ServiceService getServiceService() {
		return serviceService;
	}

	public Integer getDepartement() {
		return departement;
	}

	public void setDepartement(Integer departement) {
		this.departement = departement;
	}

	public void setServiceService(ServiceService serviceService) {
		this.serviceService = serviceService;
	}

	public Service getService() {
		return service;
	}

	public void setService(Service service) {
		this.service = service;
	}

	public List<Service> getServices() {
		services = serviceService.getAll();
		return services;
	}

	public void setServices(List<Service> services) {
		this.services = services;
	}

	public void add(Service ser) {
		System.err.println("==================" + departement);
		ser.setDepartement(depService.getById(departement));
		System.err.println("=================="
				+ depService.getById(departement).getLibelle());
		serviceService.add(ser);
	}

	public void delete(int id) {
		serviceService.delete(id);
	}

}
