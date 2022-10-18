package stepsDefinition;

import static org.junit.Assert.assertTrue;
import static utils.Utils.*;

import org.openqa.selenium.By;

import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import pageObjects.CadastrarUsuarioPage;
import pageObjects.TelaAutenticacaoPage;
import pageObjects.TelaInicialPage;

public class CadastrarUsuarioSteps {
	
	@Dado("que eu esteja no campo Create an Account")
	public void queEuEstejaNoCampoCreateAnAccount() {
	    
	}

	@Quando("que eu clique no botao Sign in")
	public void queEuCliqueNoBotOSignIn() {
	    Na(TelaInicialPage.class).acionarBotaoEntrar();
	}
	
	@Quando("preencher o campo email Create com {string}")
	public void preencherOCampoEmailAdressCom(String email) {
		Na(TelaAutenticacaoPage.class).preencherCampoEmailCreate(email);
	}
	
	@Quando("clicar no botao Create an account")
	public void clicarNoBotaoCreateAnAccount() {
	    Na(TelaAutenticacaoPage.class).acionarBotaoCriarConta();
	}
	
	@Quando("preencher o campo First Name com {string}")
	public void preencherOCampoFirstNameCom(String firstname) {
	    Na(CadastrarUsuarioPage.class).preencherCampoFirstName(firstname);
	}

	@Quando("preencher o campo Last Name com {string}")
	public void preencherOCampoLastNameCom(String lastname) {
		Na(CadastrarUsuarioPage.class).preencherCampoLastName(lastname);
	}

	@Quando("preencher o campo Password com {string}")
	public void preencherOCampoPasswordCom(String password) {
		Na(CadastrarUsuarioPage.class).preencherCampoPasswordCadastro(password);
	}

	@Quando("preenhcer o campo Adress com {string}")
	public void preenhcerOCampoAdressCom(String adress) {
		Na(CadastrarUsuarioPage.class).preencherCampoAdress(adress);
	}

	@Quando("preencher o campo City com {string}")
	public void preencherOCampoCityCom(String city) {
		Na(CadastrarUsuarioPage.class).preencherCampoCity(city);
	}

	@Quando("preencher o campo Zip\\/Postal Code com {string}")
	public void preencherOCampoZipPostalCodeCom(String zipPostal) {
		Na(CadastrarUsuarioPage.class).preencherCampoZipPostal(zipPostal);
	}
	
	@Quando("preencher o campo Country com a opcao United States")
	public void preencherOCampoCountryComAOpcaoUnitedStates() {
		Na(CadastrarUsuarioPage.class).preencherCampoCountryUSA();
	}
	
	@Quando("preencher o campo State com a opcao Alabama")
	public void preencherOCampoStateComAOpcaoAlabama() {
		Na(CadastrarUsuarioPage.class).preencherCampoStateAlabama();
	}

	@Quando("preencher o campo Mobile Phone com {string}")
	public void preencherOCampoMobilePhoneCom(String phoneNumber) {
		Na(CadastrarUsuarioPage.class).preencherCampoMobilePhone(phoneNumber);
	}

	@Quando("clicar no botao Register")
	public void clicarNoBotaoRegister() {
		Na(CadastrarUsuarioPage.class).acionarBotaoRegister();
	}
	
	@Entao("o sistema cadastra o usuario {string}")
	public void oSistemaCadastraOUsuario(String username) {
		assertTrue(driver.findElement(By.xpath("//span[text()='" +username+ "']")).isDisplayed());
	}
}
