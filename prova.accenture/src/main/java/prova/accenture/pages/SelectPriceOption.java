package prova.accenture.pages;

import prova.accenture.core.BasePage;

public class SelectPriceOption extends BasePage {

	public void gold() {
		clicarRadioJS("selectgold");
	}

	public void next() {
		clicarBotaoJS("nextsendquote");
	}

}
