package projeto.aula.metodos;

import static org.junit.Assert.assertEquals;
import java.util.Set;
import org.openqa.selenium.By;
import projeto.aula.drivers.DriversFactory;

public class MetodosDeTestes extends DriversFactory {

	public void clicar(By locators) {
		try {

		} catch (Exception e) {
			// Captura outras exceções genéricas
			System.err.println("Exceção ao clicar no elemento: " + e.getMessage());
		}
	}

	public void escrever(By locators, String texto) {
		try {
			driver.findElement(locators).sendKeys(texto);
		} catch (Exception e) {
			// Captura outras exceções genéricas
			System.err.println("Exceção ao clicar no elemento: " + e.getMessage());
		}

	}
	

	public void submit(By locators) {
		try {
			driver.findElement(locators).submit();;
		} catch (Exception e) {
			// Captura outras exceções genéricas
			System.err.println("Exceção ao clicar no elemento: " + e.getMessage());
		}
		
	}

	public void validarTexto(By locators, String textoEsperado) {
		try {
			String textocapturado = driver.findElement(locators).getText();		
			assertEquals(textoEsperado, textocapturado);
		} catch (Exception e) {
			// Captura outras exceções genéricas
			System.err.println("Exceção ao clicar no elemento: " + e.getMessage());
		}
		
	}
	
	
	public void mudarAba() {
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String janelaPrincial = driver.getWindowHandle();
		Set<String> janelaFilha = driver.getWindowHandles();
		
		for(String janela : janelaFilha) {
			if(!janela.equals(janelaPrincial)) {
				driver.switchTo().window(janela);
			}
		}
		
	}

}
