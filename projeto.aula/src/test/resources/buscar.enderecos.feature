
@regressao
Feature: Validar a busca de cep e endereco
  Como usuario do correios
  Quero buscar um cep ou endereco
  Para validar as informacoes retornadas pela aplicacao

  @tag1
  Scenario: Buscar cep
	  When buscar um cep ou endereco
	  Then valido o resultado da busca