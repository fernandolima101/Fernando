import org.openqa.selenium.By;

public class Pagina1 extends  PaginaBase{
	
	
	public void clicarnobuscaelementos() {
		driver.findElement(By.linkText("Busca de elementos")).click();
	}
             public void clicaremlinks() {		
		
		driver.findElement(By.linkText("Links")).click();
             }
		
             public void clicaremok200()  {
		 driver.findElement(By.linkText("Ok 200 - Sucess")).click();
             }
		 
		 public void clicarEmerro404() {
			 
			 driver.findElement(By.linkText("Erro 400 - Bad Request")).click();
		 }
		 
		public void clicarEmpagenotfound() {
			driver.findElement(By.linkText("Erro 404 - Page not found")).click();
			
		}
		
		public void clicarEmerro500() {
			driver.findElement(By.linkText("Erro 500 - Internal Server Error")).click();
		}
		 
	    }
       
		 
	
       
       
		
       


