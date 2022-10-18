package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import static utils.Utils.*;

public class RealizarCompraPage {

	Actions actions = new Actions(driver);
	
	//Campos
	
	@FindBy(linkText = "Home")
	private WebElement botaoHome;

	@FindBy(xpath = "//img[@alt='Faded Short Sleeve T-shirts']")
	private WebElement imagemItem01;
	
	@FindBy(xpath = "//img[@src='http://automationpractice.com/img/p/1/0/10-home_default.jpg']")
	private WebElement imagemItem02; 
	
	@FindBy(xpath = "//img[@src='http://automationpractice.com/img/p/1/6/16-home_default.jpg']")
	private WebElement imagemItem03; 

	@FindBy(xpath = "(//div[@class='right-block'][1])[1]/div[@class='button-container']/a/span[contains(text(),'More')]")
	private WebElement botaoMore01;
	
	@FindBy(xpath = "(//div[@class='right-block'][1])[4]/div[@class='button-container']/a/span[contains(text(),'More')]")
	private WebElement botaoMore02;
	
	@FindBy(xpath = "(//div[@class='right-block'][1])[6]/div[@class='button-container']/a/span[contains(text(),'More')]")
	private WebElement botaoMore03;
	
	@FindBy(id = "color_14")
	private WebElement botaoCorAzul;
	
	@FindBy(xpath = "//span[text()='Add to cart']")
	private WebElement botaoAddToCart;
	
	@FindBy(xpath = "//span[@class='continue btn btn-default button exclusive-medium']")
	private WebElement botaoContinueShopping;
	
	@FindBy(xpath = "//a[@class='home']")
	private WebElement botaoReturnToHome;
	
	@FindBy(xpath = "//a[@title='Proceed to checkout']")
	private WebElement botaoProceedToCheckout01;

	@FindBy(xpath = "//a[@class='button btn btn-default standard-checkout button-medium']")
	private WebElement botaoProceedToCheckout02;

	@FindBy(xpath = "//button[@class='button btn btn-default button-medium']")
	private WebElement botaoProceedToCheckout03;
	
	@FindBy(id = "cgv")
	private WebElement checkboxTermosDeServico;
	
	@FindBy(xpath = "//button[@class='button btn btn-default standard-checkout button-medium']")
	private WebElement botaoProceedToCheckout04;
	
	@FindBy(xpath = "//a[@class='bankwire']")
	private WebElement campoPayByBankWire;
	
	@FindBy(xpath = "//button[@class='button btn btn-default button-medium']")
	private WebElement botaoIConfirmMyOrder;
	
	//Metodos
	
	public void acionarBotaoHome() {
		botaoHome.click();
	}

	public void acionarBotaoMoreItem01() {
		actions.moveToElement(imagemItem01).build().perform();
		botaoMore01.click();
	}
	
	public void acionarBotaoMoreItem02() {
		actions.moveToElement(imagemItem02).build().perform();
		botaoMore02.click();
	} 
	
	public void acionarBotaoMoreItem03() {
		actions.moveToElement(imagemItem03).build().perform();
		botaoMore03.click();
	} 

	public void acionarBotaoAddToCart() {
		botaoAddToCart.click();
	}
	
	public void acionarBotaoCorAzul() {
		botaoCorAzul.click();
	}

	public void acionarBotaoProceedToCheckout01() {
		botaoProceedToCheckout01.click();
	}

	public void acionarBotaoProceedToCheckout02() {
		botaoProceedToCheckout02.click();
	}
	
	public void acionarBotaoProceedToCheckout03() {
		botaoProceedToCheckout03.click();
	}
	
	public void marcarCheckboxTermosDeServico() {
		checkboxTermosDeServico.click();
	}
	
	public void acionarBotaoProceedToCheckout04() {
		botaoProceedToCheckout04.click();
	}
	
	public void acionarCampoPayByBankWire() {
		campoPayByBankWire.click();
	}
	
	public void acionarBotaoIConfirmMyOrder() {
		botaoIConfirmMyOrder.click();
	}
	
	public void acionarBotaoContinueShopping() {
		botaoContinueShopping.click();
	}
	
	public void acionarBotaoReturnToHome() {
		botaoReturnToHome.click();
	}
	
	public void adicionar01ItemAoCarrinho() {
		acionarBotaoAddToCart();
	}
	
	public void adicionar02ItensAoCarrinho() {
		acionarBotaoAddToCart();
		acionarBotaoReturnToHome();
		acionarBotaoMoreItem02();
		acionarBotaoAddToCart();
	}

}
