package prova.accenture.pages;

import prova.accenture.core.BasePage;

public class EnterInsurantData extends BasePage {

	public void fistName() {
		escreve("firstname", "Kaio");
	}

	public void lastName() {
		escreve("lastname", "Vinicius");
	}

	public void dateOfBirth() {
		selecionarData("21-April-1998", "opendateofbirthcalender");
	}

	public void gender() {
		clicarRadioJS("gendermale");
	}

	public void streetAddress() {
		escreve("streetaddress", "Rua Accenture");
	}

	public void country() {
		selecionarCombo("country", "Brazil");
	}

	public void zipCode() {
		escreve("zipcode", "0625452");
	}

	public void city() {
		escreve("city", "Senior");
	}

	public void ocuppation() {
		selecionarCombo("occupation", "Farmer");
	}

	public void hobbies() {
		clicarRadioJS("speeding");
		clicarRadioJS("other");
	}

	public void webSite() {
		escreve("website", "www.accenture.com");
	}

	public void picture() {
		fazerUpload("picture", "./foto/foto.png");
	}

	public void next() {
		clicarBotao("nextenterproductdata");
	}

}
