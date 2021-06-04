package desafio;

import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;


public class PaginaPrincipal {
	
	
	

		
		public static WebDriver driver;
	    @Test
		public void iniciarChrome() {
			System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
			ChromeOptions chr = new ChromeOptions();
			chr.addArguments("--start-maximized");
			chr.addArguments("--lang=pt-BR");
			driver = new ChromeDriver(chr);
			driver.manage().timeouts().implicitlyWait(1000, TimeUnit.MINUTES);
			driver.get("https://automacaocombatista.herokuapp.com/treinamento/home");
		}

		public void finalizarChrome() {
			driver.quit();
		}

		
		}



