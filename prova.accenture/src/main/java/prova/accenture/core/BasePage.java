package prova.accenture.core;

import java.io.File;
import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage {

	public void acessarTela() {
		DriverFactory.getDriver().get("http://sampleapp.tricentis.com/101/app.php");
	}

	public void escreve(By by, String texto) {

		DriverFactory.getDriver().findElement(by).clear();
		DriverFactory.getDriver().findElement(by).sendKeys(texto);
	}

	public void escreve(String id_campo, String texto) {

		escreve(By.id(id_campo), texto);
	}

	public void selecionarData(String data, String id) {
		String dataEsperada = data;
		String eMes = dataEsperada.split("-")[1];
		String eAno = dataEsperada.split("-")[2];
		String eData = dataEsperada.split("-")[0];

		WebElement dataBotao = DriverFactory.getDriver().findElement(By.xpath("(//button[@id='" + id + "'])[1]"));
		dataBotao.click();

		String cMes = DriverFactory.getDriver().findElement(By.xpath("(//span[@class='ui-datepicker-month'])[1]"))
				.getText().trim();
		String cAno = DriverFactory.getDriver().findElement(By.xpath("(//span[@class='ui-datepicker-year'])[1]"))
				.getText().trim();
		WebElement next;

		while ((!cMes.equals(eMes)) || (!cAno.equals(eAno))) {
			next = DriverFactory.getDriver().findElement(By.xpath("//span[.='Prev']"));
			JavascriptExecutor executor = (JavascriptExecutor) DriverFactory.getDriver();
			executor.executeScript("arguments[0].click();", next);

			cMes = DriverFactory.getDriver().findElement(By.xpath("(//span[@class='ui-datepicker-month'])[1]"))
					.getText().trim();
			cAno = DriverFactory.getDriver().findElement(By.xpath("(//span[@class='ui-datepicker-year'])[1]")).getText()
					.trim();

		}

		List<WebElement> datas = DriverFactory.getDriver().findElements(By.xpath("//a[@class='ui-state-default']"));

		for (WebElement e : datas) {
			if (e.getText().trim().equals(eData)) {
				JavascriptExecutor executor = (JavascriptExecutor) DriverFactory.getDriver();
				executor.executeScript("arguments[0].click();", e);
				break;
			}
		}

	}

	public void selecionarCombo(String id, String valor) {
		WebElement element = DriverFactory.getDriver().findElement(By.id(id));
		Select combo = new Select(element);
		combo.selectByVisibleText(valor);

	}

	public void clicarRadio(By by) {
		DriverFactory.getDriver().findElement(by).click();
	}

	public void clicarRadio(String id) {
		clicarRadio(By.id(id));
	}

	public void clicarRadioJS(String id) {

		// Método utilizado com JavaScript, pois no firefox, não clicava no radio.
		// Então com o JavascriptExecutor o clique acontece diretamente sobre o
		// elemento.

		WebElement ele = DriverFactory.getDriver().findElement(By.id(id));
		JavascriptExecutor executor = (JavascriptExecutor) DriverFactory.getDriver();
		executor.executeScript("arguments[0].click();", ele);
	}

	public void clicarBotao(By by) {
		DriverFactory.getDriver().findElement(by).click();
	}

	public void clicarBotao(String id) {
		clicarBotao(By.id(id));
	}

	public void clicarBotaoJS(String id) {
		WebElement ele = DriverFactory.getDriver().findElement(By.id(id));
		JavascriptExecutor executor = (JavascriptExecutor) DriverFactory.getDriver();
		executor.executeScript("arguments[0].click();", ele);
	}

	public void fazerUpload(String id, String caminho) {
		WebElement elemento = DriverFactory.getDriver().findElement(By.id(id));
		File foto = new File(caminho);
		elemento.sendKeys(foto.getAbsolutePath());
	}

	public void validacaoMsg() {

		WebDriverWait wait = new WebDriverWait(DriverFactory.getDriver(), 10);
		Boolean validarMsg = wait.until(
				ExpectedConditions.textToBe(By.xpath("//h2[.='Sending e-mail success!']"), "Sending e-mail success!"));

		Assert.assertTrue(validarMsg);
		
		System.out.println("Mensagem de Sucesso Validada!");

	}

	public void clicarBotaoSendSucess() {

		WebDriverWait wait = new WebDriverWait(DriverFactory.getDriver(), 10);
		WebElement dataBotao = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[.='OK']")));
		dataBotao.click();

		System.out.println("Teste finalizado com Sucesso!");
	}

}
