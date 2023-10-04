package projeto.aula.pages;

import projeto.aula.elementos.ElementosDeTestes;
import projeto.aula.metodos.MetodosDeTestes;

public class HomePage {
	
	MetodosDeTestes metodo = new MetodosDeTestes();
	
	
	public void buscarCep(String dadosDeBusca) {
		metodo.escrever(ElementosDeTestes.buscarCepEndereco,dadosDeBusca);
		metodo.submit(ElementosDeTestes.buscarCepEndereco);
	}
	
	public void validarDadosDeEndereco(String logradouro_Nome, String bairro_Distrito, String localidade_UF,String cep ) {
		metodo.mudarAba();
		metodo.validarTexto(ElementosDeTestes.logradouro_nome,logradouro_Nome);
		metodo.validarTexto(ElementosDeTestes.bairro_distrito,bairro_Distrito);
		metodo.validarTexto(ElementosDeTestes.localidade_uf,localidade_UF);
		metodo.validarTexto(ElementosDeTestes.cep,cep);
	}
	

}
