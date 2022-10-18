#language: pt
#encoding: UTF-8
@CadastrarUsuario
Funcionalidade: Cadastrar um usuario no Sistema

  @CadastroValido
  Cenario: Cadastrar usuario
    Dado que eu clique no botao Sign in
    Quando que eu esteja no Campo Already Registred
    E preencher o campo email Create com "e4476xemplo1244@mail.com"
    E clicar no botao Create an account
    E preencher o campo First Name com "Asaf"
    E preencher o campo Last Name com "Oliveira"
    E preencher o campo Password com "12345"
    E preenhcer o campo Adress com "Rua 00 Quadra 00 Lote 00"
    E preencher o campo City com "Valparadise"
    E preencher o campo Zip/Postal Code com "01234"
    E preencher o campo Country com a opcao United States
    E preencher o campo State com a opcao Alabama
    E preencher o campo Mobile Phone com "999999999"
    E clicar no botao Register
    Entao o sistema cadastra o usuario "Asaf Oliveira"
