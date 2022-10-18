#language: pt
#encoding: UTF-8
@TestarCamposCadastro
Funcionalidade: Testar campos da Tela de Cadastro individualmente

  Contexto: 
    Dado que eu acione o botao Sign In
    Quando que eu mova o mouse para o Campo Already Registred

  @CampoEmailVazio
  Cenario: Testar Campo email Adress vazio
    E acionar o botao Create an account
    Entao o sistema exibe a mensagem de erro email invalido

  @CampoEmailApenasCaracteres
  Cenario: Testar Campo email Adress somente com caracteres
    Dado que eu acione o botao Sign In
    Quando que eu mova o mouse para o Campo Already Registred
    E que eu preencha o campo email Create com "TestesAutomatizados123"
    E acionar o botao Create an account
    Entao o sistema exibe a mensagem de erro email invalido

  @CampoEmailArroba
  Cenario: Testar Campo email Adress somente com caracteres e arroba
    Dado que eu acione o botao Sign In
    Quando que eu mova o mouse para o Campo Already Registred
    E que eu preencha o campo email Create com "Testes123@"
    E acionar o botao Create an account
    Entao o sistema exibe a mensagem de erro email invalido

  @CampoEmailArrobaECaracteres
  Cenario: Testar Campo email Adress somente com caracteres e arroba caracteres
    Dado que eu acione o botao Sign In
    Quando que eu mova o mouse para o Campo Already Registred
    E que eu preencha o campo email Create com "Testes123@aaa123"
    E acionar o botao Create an account
    Entao o sistema exibe a mensagem de erro email invalido

  @CampoEmailArrobaCaracteresPontoCom
  Cenario: Testar Campo email Adress no padrão correto
    Dado que eu acione o botao Sign In
    Quando que eu mova o mouse para o Campo Already Registred
    E que eu preencha o campo email Create com "Testes123@aaaa1234.com"
    E acionar o botao Create an account
    Entao o sistema exibe a Tela de Cadastro


