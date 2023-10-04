# Projeto de Automação de Testes - Consulta de CEP nos Correios

Este é um projeto de automação de testes para a funcionalidade de consulta de CEP no site dos Correios. O projeto é desenvolvido em Java, utilizando as seguintes tecnologias:

- Cucumber: Para escrever cenários de teste em linguagem natural.
- Selenium: Para automatizar a interação com o site dos Correios.
- WebDriverManager: Para gerenciar a instalação e configuração do WebDriver.
- Padrão Page Objects: Para organizar e estruturar os elementos da interface do usuário em páginas.

## Configuração do Ambiente

Antes de executar os testes, é necessário configurar o ambiente de desenvolvimento. Certifique-se de ter as seguintes ferramentas instaladas:

- Java Development Kit (JDK)
- Maven
- Git

- Realizar as configurações de variáveis de ambiente 

## Instalação e Execução

Siga os passos abaixo para instalar e executar os testes:

1. Clone o repositório para o seu ambiente local:
2. Navegue até a raiz do projeto e executando o comaneto: mvn test -Dtest=Executa.java

## Relatório de Testes

Após a execução dos testes de automação, você pode acessar o relatório de testes gerado para obter informações detalhadas sobre os resultados dos testes. O relatório inclui informações sobre testes bem-sucedidos, falhas e estatísticas de execução.

Para acessar o relatório de testes, siga estas etapas:

1. Após a execução dos testes, verifique a pasta `target` no diretório raiz do projeto.

2. Dentro da pasta `target`, você encontrará um diretório chamado `cucumber-reports`.

3. Abra o diretório `cucumber-reports` para acessar os relatórios gerados.

Dentro do diretório `cucumber-reports`, você encontrará arquivos de relatório em diferentes formatos, como HTML, JSON ou outros, dependendo da configuração definida no seu arquivo `Executa.java`.

- O arquivo `cucumber-reports.html` é um relatório em formato HTML que pode ser visualizado em um navegador da web para obter uma visão detalhada dos resultados dos testes.

Certifique-se de revisar o relatório para obter informações sobre o progresso e os resultados dos testes de automação. Os relatórios ajudam a identificar qualquer problema ou falha que possa ter ocorrido durante a execução dos testes.


