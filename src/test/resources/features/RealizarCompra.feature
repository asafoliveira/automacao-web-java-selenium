#language: pt
#encoding: UTF-8
@RealizarCompra
Funcionalidade: Realizar a compra de um item ou mais itens

  Contexto: Adicionar um item ao carrinho
    Dado que eu esteja logado no sistema
    Quando eu acione o botao Home
    E que eu mova o mouse para um item e acione o botao More

  @ComprarUmItem
  Cenario: Compra de um item
 	  Dado que eu acione o botao Add to cart
    Quando que eu acione o botao Proceed to checkout
    E que eu acione novamente o botao Proceed to checkout
    E que eu acione mais uma vez o botao Proceed to checkout
    E que eu aceite os Termos de Servico
    E que eu acione outra vez o botao Proceed to checkout
    E que eu selecione a opcao Pay by bank wire
    E que eu acione a opcao I confirme my order
    Entao o sistema exibe a mensagem de que o pedido foi realizado
    
   @ComprarUmItemCorDiferente
   Cenario: Comprar um item mudando a cor
    Dado que eu selecione outra cor para o item
    Quando que eu acione o botao Add to cart
    E que eu acione o botao Proceed to checkout
    E que eu acione novamente o botao Proceed to checkout
    E que eu acione mais uma vez o botao Proceed to checkout
    E que eu aceite os Termos de Servico
    E que eu acione outra vez o botao Proceed to checkout
    E que eu selecione a opcao Pay by bank wire
    E que eu acione a opcao I confirme my order
    Entao o sistema exibe a mensagem de que o pedido foi realizado
   
   @ComprarDoisItens
   Cenario: Comprar dois itens
   	Dado que eu tenha adicionado um item ao carrinho
   	Quando que eu acione o botao Continue shopping
   	E que eu acione o botao Return to Home
   	E que eu que eu mova o mouse para um segundo item e acione o botao More
   	E que eu acione o botao Add to cart
    E que eu acione o botao Proceed to checkout
    E que eu acione novamente o botao Proceed to checkout
    E que eu acione mais uma vez o botao Proceed to checkout
    E que eu aceite os Termos de Servico
    E que eu acione outra vez o botao Proceed to checkout
    E que eu selecione a opcao Pay by bank wire
    E que eu acione a opcao I confirme my order
    Entao o sistema exibe a mensagem de que o pedido foi realizado
   
   @ComprarTresItens 
   Cenario: Comprar tres itens
   	Dado que eu tenha adicionado dois itens ao carrinho
   	Quando que eu acione o botao Continue shopping
   	E que eu acione o botao Return to Home
   	E que eu que eu mova o mouse para um terceiro item e acione o botao More
   	E que eu acione o botao Add to cart
    E que eu acione o botao Proceed to checkout
    E que eu acione novamente o botao Proceed to checkout
    E que eu acione mais uma vez o botao Proceed to checkout
    E que eu aceite os Termos de Servico
    E que eu acione outra vez o botao Proceed to checkout
    E que eu selecione a opcao Pay by bank wire
    E que eu acione a opcao I confirme my order
    Entao o sistema exibe a mensagem de que o pedido foi realizado
   
   @ComprarTresItensCorDiferente
   Cenario: Comprar tres itens mudando a cor
   
