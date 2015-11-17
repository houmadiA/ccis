package test;

import service.DepartementServiceImpl;
import model.Departement;
import model.Recepteur;
import dao.DepartementImpl;
import dao.RecepteurDao;
import dao.RecepteurImpl;

public class Test {

	public static void main(String[] args) {
		Departement dep = new Departement("ali");
		DepartementImpl depser = new DepartementImpl();
		
		depser.getAll().size();

	}

}
