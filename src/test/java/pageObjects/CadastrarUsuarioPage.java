package pageObjects;

import static utils.Utils.*;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CadastrarUsuarioPage extends TelaAutenticacaoPage {
	
	//Campos
	
	@FindBy(xpath = "//input[@id='customer_firstname']")
	private WebElement campoFirstName;
	
	@FindBy(id = "customer_lastname")
	private WebElement campoLastName;
	
	@FindBy(xpath = "//input[contains(@type,'password')]")
	private WebElement campoPassword;
	
	@FindBy(id = "address1")
	private WebElement campoAdress;
	
	@FindBy(id = "city")
	private WebElement campoCity;
	
	@FindBy(id = "postcode")
	private WebElement campoZipPostal;
	
	@FindBy(id = "id_country")
	private WebElement campoCountry;
	
	@FindBy(xpath = "//select[@id='id_country']//option[@value='21']")
	private WebElement opcaoCountryUSA;
	
	@FindBy(xpath = "//select[@id='id_country']//option[@value='']")
	private WebElement opcaoCountryVazio;
	
	@FindBy(xpath = "//select[@id='id_state']")
	private WebElement campoState;
	
	@FindBy(xpath = "//select[@id='id_state']//option[@value='1']")
	private WebElement opcaoStateAlabama;
	
	@FindBy(xpath = "//select[@id='id_state']//option[@value='17']")
	private WebElement opcaoStateKentucky;
	
	@FindBy(xpath = "//select[@id='id_state']//option[@value='26']")
	private WebElement opcaoStateMinessota;
	
	@FindBy(xpath = "//select[@id='id_state']//option[@value='43']")
	private WebElement opcaoStateTexas;

	@FindBy(id = "phone_mobile")
	private WebElement campoMobilePhone;	
	
	@FindBy(id = "submitAccount")
	private WebElement botaoRegister;
	
	@FindBy(xpath = "//div[@class='columns-container']")
	private WebElement ladoEsquerdoTela;
	
	@FindBy(id = "email")
	private WebElement campoEmail;
	
	@FindBy(className = "account_creation")
	private WebElement createAccount;
	
	//Metodos
	
	public void preencherCampoFirstName(String firstname) {
		campoFirstName.sendKeys(firstname);
	}
	
	public void preencherCampoLastName(String lastname) {
		campoLastName.sendKeys(lastname);
	}

	public void preencherCampoPasswordCadastro(String password) {
		esperarElemento(createAccount);
		campoPassword.sendKeys(password);
	} 
	
	public void preencherCampoAdress(String adress) {
		campoAdress.sendKeys(adress);
	}
	
	public void preencherCampoCity(String city) {
		campoCity.sendKeys(city);
	}
	
	public void preencherCampoZipPostal(String zipPostal) {
		campoZipPostal.sendKeys(zipPostal);
	}
	
	public void preencherCampoCountryUSA() {
		campoCountry.click();
		opcaoCountryUSA.click();
	}
	
	public void preencherCampoCountryVazio() {
		campoCountry.click();
		opcaoCountryVazio.click();
	}
	
	public void preencherCampoStateAlabama() {
		campoState.click();
		opcaoStateAlabama.click();
	}
	
	public void preencherCampoState(String state) {
		campoState.click();
		driver.findElement(By.xpath("//select[@id='id_state']//option[contains(text(),'" +state+ "')]")).click();
	}
	
	public void preencherCampoMobilePhone(String phoneNumber) {
		campoMobilePhone.sendKeys(phoneNumber);
	}
	
	public void acionarBotaoRegister() {
		botaoRegister.click();
	}
	
	public void clicarForaDoCampo() {
		ladoEsquerdoTela.click();
	}

}
