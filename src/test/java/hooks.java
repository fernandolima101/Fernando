import org.junit.After;
import org.junit.Before;

public class hooks {
	
	PaginaBase bp = new PaginaBase();
	
	@Before
	public void antes() {
		bp.iniciarChrome();
		
	}
	@After
	public void depois() {
		//bp.finalizarChrome();
	}

}
