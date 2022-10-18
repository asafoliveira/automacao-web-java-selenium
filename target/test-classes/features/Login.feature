#language: pt
#encoding: UTF-8

@Login
Funcionalidade: Realizar Login

	@LoginValido
	Cenario: Login Valido
		Dado que eu acione o botao Sign in
		Quando que eu esteja no campo Create an Account
		E que eu preencha o campo email Adress com "exemplo1222@mail.com"
		E que eu preencha o campo Password com "12345"
		E clicar no botao Sign In
		Entao o sistema exibe o usuario "Asaf Oliveira" logado
