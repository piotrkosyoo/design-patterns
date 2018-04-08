package construction.factorymetod;

import org.junit.Test;

public class ApplicationTest {
	
	@Test
	public void testPDFApplicationDocument() {
		// we know the type in runtime
		Application app = new ApplicationPDF();
		app.openDocument();
	}
	
	@Test
	public void testTextApplicationDocument() {
		// we know the type in runtime
		Application app = new ApplicationText();
		app.openDocument();
	}

}
