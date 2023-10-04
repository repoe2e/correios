package projeto.aula.config;

import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import projeto.aula.drivers.DriversFactory;

public class InicializacaoTestes extends DriversFactory {

	public static void configurarAmbiente() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.correios.com.br/");
		driver.manage().window().maximize();
	}

}