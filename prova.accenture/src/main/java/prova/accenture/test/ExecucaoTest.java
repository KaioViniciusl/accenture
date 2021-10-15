package prova.accenture.test;

import prova.accenture.core.BasePage;
import prova.accenture.pages.EnterInsurantData;
import prova.accenture.pages.EnterProductData;
import prova.accenture.pages.EnterVehicleData;
import prova.accenture.pages.SelectPriceOption;
import prova.accenture.pages.SendQuote;

public class ExecucaoTest extends BasePage{
	
	
	public static void main(String[] args) {
		
	EnterVehicleData enterVehicle = new EnterVehicleData();
	EnterInsurantData enterInsurant = new EnterInsurantData();
	EnterProductData enterProduct = new EnterProductData();
	SelectPriceOption selectPrice = new SelectPriceOption();
	SendQuote sendQuote = new SendQuote();
	
	// Aba 1
	
	enterVehicle.acessarTela();
	enterVehicle.make();
	enterVehicle.model();
	enterVehicle.cylinderCapacity();
	enterVehicle.enginePerformance();
	enterVehicle.dateManufacture();
	enterVehicle.numberSeats();
	enterVehicle.rightHand();
	enterVehicle.numberSeats2();
	enterVehicle.fuelType();
	enterVehicle.payLoad();
	enterVehicle.totalWeight();
	enterVehicle.listPrice();
	enterVehicle.licensePlate();
	enterVehicle.annualMileage();
	enterVehicle.nextBotao();
	
	// Aba 2
	
	enterInsurant.fistName();
	enterInsurant.lastName();
	enterInsurant.dateOfBirth();
	enterInsurant.gender();
	enterInsurant.streetAddress();
	enterInsurant.country();
	enterInsurant.zipCode();
	enterInsurant.city();
	enterInsurant.ocuppation();
	enterInsurant.hobbies();
	enterInsurant.webSite();
	enterInsurant.picture();
	enterInsurant.next();
	
	// Aba 3
	
	enterProduct.startDate();
	enterProduct.insuranceSum();
	enterProduct.meritRating();
	enterProduct.damageInsurance();
	enterProduct.optionalProducts();
	enterProduct.courtesyCar();
	enterProduct.next();

	// Aba 4
	
	selectPrice.gold();
	selectPrice.next();
	
	// Aba 5
	
	sendQuote.email();
	sendQuote.phone();
	sendQuote.username();
	sendQuote.password();
	sendQuote.confirmPassword();
	sendQuote.comments();
	sendQuote.send();
	sendQuote.validacaoMsg();
	sendQuote.ButtonSendSucess();
	
	}

}
