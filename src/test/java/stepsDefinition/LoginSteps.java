package stepsDefinition;

import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import pageObjects.TelaAutenticacaoPage;
import pageObjects.TelaInicialPage;

import static org.junit.Assert.assertTrue;
import static utils.Utils.*;

import org.openqa.selenium.By;

public class LoginSteps {
	
	@Dado("que eu esteja no Campo Already Registred")
	public void queEuEstejaNoCampoAlreadyRegistred() {
	    
	}
	
	@Quando("que eu acione o botao Sign in")
	public void queEuCliqueNoBotOSignIn() {
	    Na(TelaInicialPage.class).acionarBotaoEntrar();
	}
	
	@Quando("que eu preencha o campo email Adress com {string}")
	public void queEuPreenchaOCampoEmailAdressCom(String email) {
	    Na(TelaAutenticacaoPage.class).preencherCampoEmailLogin(email);
	}
	
	@Quando("que eu preencha o campo Password com {string}")
	public void queEuPreenchaOCampoPasswordCom(String password) {
		Na(TelaAutenticacaoPage.class).preencherCampoPasswordLogin(password);
	}

	@Quando("clicar no botao Sign In")
	public void clicarNoBotaoSignIn() {
		Na(TelaAutenticacaoPage.class).acionarBotaoLogin();
	}

	@Entao("o sistema exibe o usuario {string} logado")
	public void oSistemaExibeOUsuarioLogado(String username) {
		assertTrue(driver.findElement(By.xpath("//span[text()='" +username+ "']")).isDisplayed());
	}

}
