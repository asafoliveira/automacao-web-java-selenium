package stepsDefinition;

import static org.junit.Assert.assertEquals;
import static utils.Utils.*;

import org.openqa.selenium.By;

import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import pageObjects.RealizarCompraPage;

public class RealizarCompraSteps {
	
	@Dado("que eu esteja logado no sistema")
	public void queEuEstejaLogadoNoSistema() {
	    
	}
	
	@Dado("que eu tenha adicionado dois itens ao carrinho")
	public void queEuTenhaAdicionadoDoisItensAoCarrinho() {
		Na(RealizarCompraPage.class).adicionar02ItensAoCarrinho();
	}

	@Quando("eu acione o botao Home")
	public void euAcioneOBotaoHome() {
	    Na(RealizarCompraPage.class).acionarBotaoHome();
	}

	@Quando("que eu mova o mouse para um item e acione o botao More")
	public void queEuAcioneOBotaoMore() {
	    Na(RealizarCompraPage.class).acionarBotaoMoreItem01();
	}
	
	@Quando("que eu que eu mova o mouse para um segundo item e acione o botao More")
	public void queEuQueEuMovaOMouseParaUmSegundoItemEAcioneOBotaoMore() {
		Na(RealizarCompraPage.class).acionarBotaoMoreItem02();
	}
	
	@Quando("que eu que eu mova o mouse para um terceiro item e acione o botao More")
	public void queEuQueEuMovaOMouseParaUmTerceiroItemEAcioneOBotaoMore() {
		Na(RealizarCompraPage.class).acionarBotaoMoreItem03();
	}

	@Quando("que eu acione o botao Add to cart")
	public void queEuMovaOMouseParaUmItemEAcioneOBotaoAddToCart() {
		Na(RealizarCompraPage.class).acionarBotaoAddToCart();
	}
	
	@Quando("que eu selecione outra cor para o item")
	public void queEuSelecioneOutraCorParaOItem() {
		Na(RealizarCompraPage.class).acionarBotaoCorAzul();
	}
	
	@Quando("que eu tenha adicionado um item ao carrinho")
	public void queEuTenhaAdicionadoUmItemAoCarrinho() {
		Na(RealizarCompraPage.class).adicionar01ItemAoCarrinho();
	}

	@Quando("que eu acione o botao Continue shopping")
	public void queEuAcioneOBotaoContinueShopping() {
	    Na(RealizarCompraPage.class).acionarBotaoContinueShopping();    
	}

	@Quando("que eu acione o botao Return to Home")
	public void queEuAcioneOBotaoReturnToHome() {
		Na(RealizarCompraPage.class).acionarBotaoReturnToHome();  
	}

	@Quando("que eu acione o botao Proceed to checkout")
	public void queEuAcioneOBotaoProceedToCheckout() {
		Na(RealizarCompraPage.class).acionarBotaoProceedToCheckout01();
	}

	@Quando("que eu acione novamente o botao Proceed to checkout")
	public void queEuAcioneNovamenteOBotaoProceedToCheckout() {
		Na(RealizarCompraPage.class).acionarBotaoProceedToCheckout02();
	}

	@Quando("que eu acione mais uma vez o botao Proceed to checkout")
	public void queEuAcioneMaisUmaVezOBotaoProceedToCheckout() {
		Na(RealizarCompraPage.class).acionarBotaoProceedToCheckout03();
	}

	@Quando("que eu aceite os Termos de Servico")
	public void queEuMarqueAOpcaoDeTerAceitadoOsTermosDeServico() {
		Na(RealizarCompraPage.class).marcarCheckboxTermosDeServico();
	}

	@Quando("que eu acione outra vez o botao Proceed to checkout")
	public void queEuAcioneOutraVezOBotaoProceedToCheckout() {
		Na(RealizarCompraPage.class).acionarBotaoProceedToCheckout04();
	}

	@Quando("que eu selecione a opcao Pay by bank wire")
	public void queEuSelecioneAOpcaoPayByBankWire() {
		Na(RealizarCompraPage.class).acionarCampoPayByBankWire();
	}

	@Quando("que eu acione a opcao I confirme my order")
	public void queEuAcioneAOpcaoIConfirmeMyOrder() {
		Na(RealizarCompraPage.class).acionarBotaoIConfirmMyOrder();
	}

	@Entao("o sistema exibe a mensagem de que o pedido foi realizado")
	public void oSistemaExibeAMensagemDeQueOPedidoFoiRealizado() {
	    assertEquals("Your order on My Store is complete.", driver.findElement(By.xpath("//p[@class='cheque-indent']")).getText());
	}

}
