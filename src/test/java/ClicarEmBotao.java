import org.junit.Test;

public class ClicarEmBotao extends hooks {
	
	
	Pagina1 hp = new  Pagina1();
	CadastrarUsuario cdp = new CadastrarUsuario();
	
	@Test
	public void clicareminputscomSucesso() {
		hp.clicarnobuscaelementos();
		hp.clicaremlinks();
        hp.clicaremok200();
        hp.clicaremlinks();
		hp.clicarEmerro404();	
		hp.clicaremlinks();
		hp.clicarEmpagenotfound();
		hp.clicaremlinks();
		hp.clicarEmerro500();
		hp.clicaremlinks();
	
	
	
}
}