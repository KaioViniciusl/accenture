package prova.accenture.pages;

import prova.accenture.core.BasePage;

public class EnterProductData extends BasePage {

	public void startDate() {
		escreve("startdate", "01/05/2022");
	}

	public void insuranceSum() {
		selecionarCombo("insurancesum", "10.000.000,00");
	}

	public void meritRating() {
		selecionarCombo("meritrating", "Bonus 4");
	}

	public void damageInsurance() {
		selecionarCombo("damageinsurance", "No Coverage");
	}

	public void optionalProducts() {
		clicarRadioJS("LegalDefenseInsurance");
	}

	public void courtesyCar() {
		selecionarCombo("courtesycar", "Yes");
	}

	public void next() {
		clicarBotao("nextselectpriceoption");
	}

}
