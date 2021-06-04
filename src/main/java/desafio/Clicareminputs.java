package desafio;

import org.junit.Test;

public class Clicareminputs extends hooks {
	
	
	PaginaTeste hp = new  PaginaTeste();
	Cadastrarelementos cdp = new Cadastrarelementos();
	
	@Test
	public void clicareminputscomSucesso() {
		hp.clicarnobuscaelementos();
		cdp.cadastrarNovoImput("Fernando","Lima","123456","fernando@hotmail.com", "Fernando");
	
	
}

}
