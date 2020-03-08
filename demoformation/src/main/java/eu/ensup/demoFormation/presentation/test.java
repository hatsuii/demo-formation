package eu.ensup.demoFormation.presentation;

import eu.ensup.demoFormation.service.FormationService;

public class test {

	public static void main(String[] args) {
		FormationService fs = new FormationService();
		fs.lireTouteFormation().forEach(System.out::println);
		fs.closeemf();
	}

}
