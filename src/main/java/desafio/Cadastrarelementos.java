package desafio;

import org.openqa.selenium.By;

public class  Cadastrarelementos extends PaginaPrincipal {
	
	
	
	void preencherPrimeironome(String nome ) {
		
		   driver.findElement(By.id("first_name")).sendKeys(nome);
	}
	
	void preencherUltimoNome(String Ultimonome)  {
		driver.findElement(By.id("last_name")).sendKeys(Ultimonome);
	}
	
	 void preencherCamposenha(String senha) {
		 driver.findElement(By.id("password")).sendKeys(senha);
	 }
	 
	 void preencherCampoemail(String email) {
		 driver.findElement(By.id("email")).sendKeys(email);
		 
     }  
	 
	 void preencherCampoTextaArea (String textaArea) {
		 driver.findElement(By.className("materialize-textarea")).sendKeys(textaArea);
		 
	 }
	 public void cadastrarNovoImput(String nome, String Ultimonome, String senha, String email, String textaarea) {
		 preencherPrimeironome(nome);
		 preencherUltimoNome(Ultimonome);
		 preencherCamposenha(senha);
		 preencherCampoemail(email);
		 preencherCampoTextaArea(textaarea);
	 
	 }
}
	 
	 


