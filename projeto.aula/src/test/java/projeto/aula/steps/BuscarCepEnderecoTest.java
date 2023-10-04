package projeto.aula.steps;

import io.cucumber.java.Before;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import projeto.aula.config.InicializacaoTestes;
import projeto.aula.pages.HomePage;

public class BuscarCepEnderecoTest {

	HomePage home = new HomePage();

	@Before
	public void iniciarTeste() {
		InicializacaoTestes.configurarAmbiente();
	}
	

	@When("buscar um cep ou endereco")
	public void buscarUmCepOuEndereco() {
		home.buscarCep("06544-300");
	}

	@Then("valido o resultado da busca")
	public void validoOResultadoDaBusca() {
		home.validarDadosDeEndereco("Avenida dos Parques (Alphasítio)", "Tamboré", "Santana de Parnaíba/SP", "06544-300");
	}

}
