package stepsDefinition;

import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import pageObjects.CadastrarUsuarioPage;
import pageObjects.TelaAutenticacaoPage;
import pageObjects.TelaInicialPage;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertTrue;
import static utils.Utils.*;

import org.openqa.selenium.By;

public class TestarCamposCadastroSteps {
	
	//Steps
	
	@Dado("que eu acione o botao Sign In")
	public void queEuAcioneOBotaoSignIn() {
	    Na(TelaInicialPage.class).acionarBotaoEntrar();
	}
	
	@Quando("que eu mova o mouse para o Campo Already Registred")
	public void queEuMovaOMouseParaOCampoAlreadyRegistred() {
	    
	}

	@Quando("que eu preencha o campo email Create com {string}")
	public void queEuPreenchaOCampoEmailCreateCom(String email) {
		Na(TelaAutenticacaoPage.class).preencherCampoEmailCreate(email);
	}
	
	@Quando("acionar o botao Create an account")
	public void acionarOBotaoCreateAnAccount() {
		Na(TelaAutenticacaoPage.class).acionarBotaoCriarConta();
	}
	
	@Dado("que eu utilize o email {string} para acessar a Tela de Cadastro")
	public void queEuUtilizeOEmailParaAcessarATelaDeCadastro(String email) {
	    Na(TelaAutenticacaoPage.class).acessarTelaDeCadastro(email);
	}

	@Quando("que eu preencha o campo First Name com {string}")
	public void queEuPreenchaOCampoFirstNameCom(String firstname) {
	    Na(CadastrarUsuarioPage.class).preencherCampoFirstName(firstname);
	}
	
	@Quando("que eu preencha o campo Last Name com {string}")
	public void queEuPreenchaOCampoLastNameCom(String lastname) {
		Na(CadastrarUsuarioPage.class).preencherCampoLastName(lastname);
	}
	
	@Quando("que eu preencha o Campo Password com {string}")
	public void queEuPreenchaOCampoPasswordCom(String password) {
		Na(CadastrarUsuarioPage.class).preencherCampoPasswordCadastro(password);	
	}
	
	@Dado("que eu preencha o campo Adress com {string}")
	public void queEuPreenchaOCampoAdressCom(String adress) {
		Na(CadastrarUsuarioPage.class).preencherCampoAdress(adress);
	}

	@Quando("que eu clique fora do campo")
	public void queEuCliqueForaDoCampo() {
		Na(CadastrarUsuarioPage.class).clicarForaDoCampo();
	}
	
	@Quando("que eu acione o botao Register")
	public void queEuAcioneOBotaoRegister() {
		Na(CadastrarUsuarioPage.class).acionarBotaoRegister();
	}
	
	@Quando("que eu preencha o campo Country com a opcao vazio")
	public void queEuPreenchaOCampoCountryComAOpcaoVazio() {
	    Na(CadastrarUsuarioPage.class).preencherCampoCountryVazio();
	}
	
	@Quando("que eu preencha o campo City com {string}")
	public void queEuPreenchaOCampoCityCom(String city) {
		Na(CadastrarUsuarioPage.class).preencherCampoCity(city);
	}
	
	@Quando("que eu preencha o campo Country com a opcao United States")
	public void queEuPreenchaOCampoCountryComAOpcaoUnitedStates() {
		Na(CadastrarUsuarioPage.class).preencherCampoCountryUSA();
	}
	
	@Quando("que eu preencha o campo State com a opcao {string}")
	public void queEuPreenchaOCampoStateComAOpcao(String state) {
	    Na(CadastrarUsuarioPage.class).preencherCampoState(state);
	}
	
	@Quando("que eu preencha o campo Mobile Phone com {string}")
	public void queEuPreenchaOCampoMobilePhoneCom(String mobilePhone) {
	    Na(CadastrarUsuarioPage.class).preencherCampoMobilePhone(mobilePhone);
	}
	
	@Quando("que eu preencha o Zip Postal com {string}")
	public void queEuPreenchaOZipPostalCom(String zipPostal) {
		Na(CadastrarUsuarioPage.class).preencherCampoZipPostal(zipPostal);
	}
	
	//Validacoes
	
	@Entao("o sistema exibe a Tela de Cadastro")
	public void oSistemaExibeATelaDeCadastro() {
	    assertEquals("CREATE AN ACCOUNT", driver.findElement(By.xpath("//h1[contains(text(),'Create an account')]")).getText());
	}

	@Entao("o sistema exibe a mensagem de erro email invalido")
	public void oSistemaExibeAMensagemDeErroEmailInvalido() {
	    assertEquals("Invalid email address.", driver.findElement(By.xpath("//li[text()='Invalid email address.']")).getText());
	}

	@Entao("o sistema exibe que o campo esta ok")
	public void oSistemaExibeQueOCampoEstaOk() {
	    assertTrue(driver.findElement(By.xpath("//div[@class='required form-group form-ok']")).isDisplayed());
	}
	
	
	@Entao("o sistema exibe a mensagem de erro do campo")
	public void oSistemaExibeQueAMensagemDeErroDoCampo() {
		assertTrue(driver.findElement(By.xpath("//div[@class='required form-group form-error']")).isDisplayed());
	}
	
	@Entao("o sistema exibe que o campo password esta ok")
	public void oSistemaExibeQueOCampoPasswordEstaOk() {
		assertTrue(driver.findElement(By.xpath("//div[@class='required password form-group form-ok']")).isDisplayed());
	}
	
	@Entao("o sistema exibe a mensagem de erro do campo password")
	public void oSistemaExibeAMensagemDeErroDoCampoPassword() {
		assertTrue(driver.findElement(By.xpath("//div[@class='required password form-group form-error']")).isDisplayed());
	}
	
	@Entao("o sistema nao exibe a mensagem de erro do campo")
	public void oSistemaNaoExibeAMensagemDeErroDoCampo() {
	    assertNotEquals("There are 8 errors", driver.findElement(By.xpath("//p[text()='There are 7 errors']")).isDisplayed());
	}
	
	@Entao("o sistema mostra as duas mensagens de erro da opcao selecionada")
	public void oSistemaMostraAMensagemDeErroDoCampoCountry() {
		assertTrue(driver.findElement(By.xpath("//li[text()='Country cannot be loaded with address->id_country']")).isDisplayed());
		assertTrue(driver.findElement(By.xpath("//li[text()='Country is invalid']")).isDisplayed());
	}
	
	@Entao("o sistema mostra a mensagem de que precisa preencher o campo State")
	public void oSistemaMostraAMensagemDeQuePrecisaPreencherOCampoState() {
		assertTrue(driver.findElement(By.xpath("//li[text()='This country requires you to choose a State.']")).isDisplayed());
	}

	@Entao("o sistema exibe a mensagem de erro do campo Mobile Phone")
	public void oSistemaExibeAMensagemDeErroDoCampoMobilePhone() {
		assertTrue(driver.findElement(By.xpath("//b[text()='phone_mobile']")).isDisplayed());
	}
	
	@Entao("o sistema exibe a mensagem de erro do campo ZipPostal")
	public void oSistemaExibeAMensagemDeErroDoCampoZipPostal() {
		assertTrue(driver.findElement(By.xpath("//li[contains(text(),'The Zip/Postal')]")).isDisplayed());
	}

}
