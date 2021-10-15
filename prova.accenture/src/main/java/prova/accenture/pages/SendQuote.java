package prova.accenture.pages;

import prova.accenture.core.BasePage;

public class SendQuote extends BasePage {

	public void email() {
		escreve("email", "kaio@accenture.com");
	}

	public void phone() {
		escreve("phone", "112545254");
	}

	public void username() {
		escreve("username", "kaccenture");
	}

	public void password() {
		escreve("password", "Accenture159@");
	}

	public void confirmPassword() {
		escreve("confirmpassword", "Accenture159@");
	}

	public void comments() {
		escreve("Comments", "Sera um prazer fazer parte do time Accenture!");
	}

	public void send() {
		clicarBotaoJS("sendemail");
	}

	public void sendingEmailSucess() {
		validacaoMsg();
	}

	public void ButtonSendSucess() {
		clicarBotaoSendSucess();
	}

}
