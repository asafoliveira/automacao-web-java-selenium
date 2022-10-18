package stepsDefinition;

import static utils.Utils.*;

import io.cucumber.core.api.Scenario;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import pageObjects.TelaAutenticacaoPage;

public class Hooks {
	
	@Before(value = "@Login")
	public void funcionalidadeLogin() {
		acessarSistema();
	}
	
	@Before(value = "@CadastrarUsuario")
	public void funcionalidadeCadastro() {
		acessarSistema();
	}
	
	@Before(value = "@TestarCamposCadastro")
	public void funcionalidadeCamposCadastro() {
		acessarSistema();
	}
	
	@Before(value = "@RealizarCompra")
	public void funcionalidadeRealizarCompra() {
		acessarSistema();
		Na(TelaAutenticacaoPage.class).realizarLogin("exemplo1222@mail.com", "12345");
	}
	
	@Before
	public void setUp() {
		acessarSistema();
	}
	
	@After
	public void tearDown(Scenario scenario) {	
		capturarTela(scenario);
		driver.quit();
	}

}
