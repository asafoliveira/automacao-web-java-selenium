package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class TelaAutenticacaoPage extends TelaInicialPage {
	
	//A tela de Cadastrado e Login � a mesma, 
	//portanto criei uma �nica classe da Tela de Autenticacao
	
	//Campos Criar Conta
	
	@FindBy(id = "email_create")
	private WebElement campoEmailCreate;
	
	@FindBy(xpath = "//button[@id='SubmitCreate']")
	private WebElement botaoCriarConta;
	
	//Campos Realizar Login
	
	@FindBy(id = "email")
	private WebElement campoEmailLogin;
	
	@FindBy(id = "passwd")
	private WebElement campoPassword;
	
	@FindBy(id = "SubmitLogin")
	private WebElement botaoLogin;

	//M�todos Criar Conta
	
	public void preencherCampoEmailCreate(String email) {
		campoEmailCreate.sendKeys(email);
	}
	
	public void acionarBotaoCriarConta() {
		botaoCriarConta.click();
	}
	
	//M�todos Realizar Login
	
	public void preencherCampoEmailLogin(String email) {
		campoEmailLogin.sendKeys(email);
	}
	
	public void preencherCampoPasswordLogin(String password) {
		campoPassword.sendKeys(password);
	}
	
	public void acionarBotaoLogin() {
		botaoLogin.click();
	}
	
	public void realizarLogin(String email, String password) {
		botaoEntrar.click();
		campoEmailLogin.sendKeys(email);
		campoPassword.sendKeys(password);
		botaoLogin.click();
	}
	
	public void acessarTelaDeCadastro(String email) {
		acionarBotaoEntrar();
		preencherCampoEmailCreate(email);
		acionarBotaoCriarConta();
	}

}
