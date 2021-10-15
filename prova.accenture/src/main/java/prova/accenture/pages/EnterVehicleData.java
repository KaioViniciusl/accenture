package prova.accenture.pages;

import prova.accenture.core.BasePage;

public class EnterVehicleData extends BasePage {


	public void make() {
		selecionarCombo("make", "Ford");
	}
	
	public void model() {
		selecionarCombo("model", "Moped");
	}
	
	public void cylinderCapacity() {
		escreve("cylindercapacity", "444");
	}

	public void enginePerformance() {
		escreve("engineperformance", "2.500");
	}

	public void dateManufacture() {
		escreve("dateofmanufacture", "09/12/2020");
	}

	public void numberSeats() {
		selecionarCombo("numberofseats", "3");
	}
	
	public void rightHand() {
		clicarRadioJS("righthanddriveyes");;
	}
	
	public void numberSeats2() {
		selecionarCombo("numberofseatsmotorcycle", "3");
	}

	public void fuelType() {
		selecionarCombo("fuel", "Gas");
	}
	
	public void payLoad() {
		escreve("payload", "50");
	}
	
	public void totalWeight() {
		escreve("totalweight", "500");
	}

	public void listPrice() {
		escreve("listprice", "50000");
	}

	public void licensePlate() {
		escreve("licenseplatenumber", "54254");
	}

	public void annualMileage() {
		escreve("annualmileage", "1000");
	}

	public void nextBotao() {
		clicarBotao("nextenterinsurantdata");
	}
	
}
