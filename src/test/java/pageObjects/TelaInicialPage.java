package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class TelaInicialPage {
	
	@FindBy(xpath = "//a[@class='login']")
	protected WebElement botaoEntrar;
	
	public void acionarBotaoEntrar() {
		botaoEntrar.click();
	}
	
}
