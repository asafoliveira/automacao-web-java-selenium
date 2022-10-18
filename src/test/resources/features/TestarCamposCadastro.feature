#language: pt
#encoding: UTF-8
@TestarCamposCadastro
Funcionalidade: Testar campos da Tela de Cadastro individualmente

  Contexto: 
    Dado que eu utilize o email "Testes123@aaa123.com" para acessar a Tela de Cadastro

  @CampoFirstNameApenasLetras
  Cenario: Testar Campo First Name somente com letras
    Quando que eu preencha o campo First Name com "AAAAA"
    E que eu clique fora do campo
    Entao o sistema exibe que o campo esta ok

  @CampoFirstNameApenasNumeros
  Cenario: Testar Campo First Name somente com numeros
    Quando que eu preencha o campo First Name com "12345"
    E que eu clique fora do campo
    Entao o sistema exibe a mensagem de erro do campo

  @CampoFirstNameCaracteres
  Cenario: Testar Campo First Name com caracteres
    Quando que eu preencha o campo First Name com "AAAAA123"
    E que eu clique fora do campo
    Entao o sistema exibe a mensagem de erro do campo

  @CampoLastNameApenasLetras
  Cenario: Testar Campo Last Name somente com letras
    Quando que eu preencha o campo Last Name com "ABCDE"
    E que eu clique fora do campo
    Entao o sistema exibe que o campo esta ok

  @CampoLastNameApenasNumeros
  Cenario: Testar Campo Last Name somente com numeros
    Quando que eu preencha o campo Last Name com "07943"
    E que eu clique fora do campo
    Entao o sistema exibe a mensagem de erro do campo

  @CampoLastNameCaracteres
  Cenario: Testar Campo Last Name com caracteres
    Quando que eu preencha o campo Last Name com "A71Jk"
    E que eu clique fora do campo
    Entao o sistema exibe a mensagem de erro do campo

  @CampoPassword04Caracteres
  Cenario: Testar Campo Password com menos de cinco caracteres
    Quando que eu preencha o Campo Password com "A1j7"
    E que eu clique fora do campo
    Entao o sistema exibe a mensagem de erro do campo password

  @CampoPassword05Caracteres
  Cenario: Testar Campo Password com cinco caracteres
    Quando que eu preencha o Campo Password com "A1j7y"
    E que eu clique fora do campo
    Entao o sistema exibe que o campo password esta ok

  @CampoPasswordMaisDe05Caracteres
  Cenario: Testar Campo Password com mais de cinco caracteres
    Quando que eu preencha o Campo Password com "A1j7y3W"
    E que eu clique fora do campo
    Entao o sistema exibe que o campo password esta ok

  @CampoAdressApenasLetras
  Cenario: Testar Campo Adress somente com letras
    Quando que eu preencha o campo Adress com "ABCDE"
    E que eu acione o botao Register
    Entao o sistema nao exibe a mensagem de erro do campo

  @CampoAdressApenasNumeros
  Cenario: Testar Campo Adress somente com numeros
    Quando que eu preencha o campo Adress com "07943"
    E que eu acione o botao Register
    Entao o sistema nao exibe a mensagem de erro do campo

  @CampoAdressCaracteres
  Cenario: Testar Campo Adress com caracteres
    Quando que eu preencha o campo Adress com "A71Jk"
    E que eu acione o botao Register
    Entao o sistema nao exibe a mensagem de erro do campo

  @CampoCityApenasLetras
  Cenario: Testar Campo City somente com letras
    Quando que eu preencha o campo City com "ABCDE"
    E que eu acione o botao Register
    Entao o sistema nao exibe a mensagem de erro do campo

  @CampoCityApenasNumeros
  Cenario: Testar Campo City somente com numeros
    Quando que eu preencha o campo City com "07943"
    E que eu acione o botao Register
    Entao o sistema nao exibe a mensagem de erro do campo
    
  @CampoCityCaracteres
  Cenario: Testar Campo City com caracteres
    Quando que eu preencha o campo City com "A71Jk"
    E que eu acione o botao Register
    Entao o sistema nao exibe a mensagem de erro do campo
    
  @CampoZipPostal04Digitos
  Cenario: Testar Campo Zip Postal com menos de cinco digitos
    Quando que eu preencha o Zip Postal com "1234"
    E que eu acione o botao Register
    Entao o sistema exibe a mensagem de erro do campo ZipPostal

  @CampoZipPostal05Digitos
  Cenario: Testar Campo Zip Postal com cinco digitos
    Quando que eu preencha o Zip Postal com "12345"
    E que eu acione o botao Register
    Entao o sistema nao exibe a mensagem de erro do campo

  @CampoZipPostalMaisde05Digitos
  Cenario: Testar Campo Zip Postal com mais de cinco digitos
    Quando que eu preencha o Zip Postal com "123456"
    E que eu acione o botao Register
    Entao o sistema exibe a mensagem de erro do campo ZipPostal
    
  @CampoZipPostalCaracteres
  Cenario: Testar Campo Zip Postal com caracteres
    Quando que eu preencha o Zip Postal com "A71Jk"
   E que eu acione o botao Register
    Entao o sistema exibe a mensagem de erro do campo ZipPostal

  @CampoCountryOpcaoVazio
  Cenario: Testar Campo Country somente com letras
    Quando que eu preencha o campo Country com a opcao vazio
    E que eu acione o botao Register
    Entao o sistema mostra as duas mensagens de erro da opcao selecionada

  @CampoCountryUnitedStates
  Cenario: Testar Campo Country somente com letras
    Quando que eu preencha o campo Country com a opcao United States
    E que eu acione o botao Register
    Entao o sistema mostra a mensagem de que precisa preencher o campo State

  @CampoState
  Esquema do Cenario: Preencher o campo State com diferentes opcoes
    Quando que eu preencha o campo State com a opcao "<state>"
    E que eu acione o botao Register
    Entao o sistema nao exibe a mensagem de erro do campo

    Exemplos: 
      | state     |
      | Kentucky  |
      | Minnesota |
      | Texas     |

  @CampoMobilePhoneApenasLetras
  Cenario: Testar Campo Mobile Phone somente com letras
    Quando que eu preencha o campo Mobile Phone com "ABCDE"
    E que eu acione o botao Register
    Entao o sistema exibe a mensagem de erro do campo Mobile Phone

  @CampoMobilePhoneApenasNumeros
  Cenario: Testar Campo Mobile Phone somente com numeros
    Quando que eu preencha o campo Mobile Phone com "07943"
    E que eu acione o botao Register
    Entao o sistema nao exibe a mensagem de erro do campo

  @CampoMobilePhoneCaracteres
  Cenario: Testar Campo Mobile Phone com caracteres
    Quando que eu preencha o campo Mobile Phone com "A71Jk"
    E que eu acione o botao Register
    Entao o sistema exibe a mensagem de erro do campo Mobile Phone
