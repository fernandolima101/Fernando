package desafio;

import org.junit.After;
import org.junit.Before;

public class hooks {
	
	PaginaPrincipal bp = new PaginaPrincipal();
	
	@Before
	public void antes() {
		bp.iniciarChrome();
		
	}
	@After
	public void depois() {
		//bp.finalizarChrome();
	}

}



