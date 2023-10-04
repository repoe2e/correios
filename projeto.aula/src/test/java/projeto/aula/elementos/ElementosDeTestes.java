package projeto.aula.elementos;

import org.openqa.selenium.By;

public class ElementosDeTestes {

	public static By buscarCepEndereco = By.id("relaxation");
	public static By logradouro_nome = By.xpath("//td[@data-th='Logradouro/Nome']");
	public static By bairro_distrito = By.xpath("//td[@data-th='Bairro/Distrito']");
	public static By localidade_uf = By.xpath("//td[@data-th='Localidade/UF']");
	public static By cep = By.xpath("//td[@data-th='CEP']");
	
	
}

