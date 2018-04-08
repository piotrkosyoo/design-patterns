package construction.prototyp;

import org.junit.Test;

public class ClientPrototypTest {

	@Test
	public void testClientPrototypePdf() {
		Document prototypePdf = new PdfDocument();
		Client client = new Client(prototypePdf);
		Document docClone = client.makeDocument();
		System.out.println("testClientPrototypePdf: " + docClone.getClass().getSimpleName());
	}
	
	@Test
	public void testClientPrototypeText() {
		Document prototypeText = new TextDocument();
		Client client = new Client(prototypeText);
		Document docClone = client.makeDocument();
		System.out.println("testClientPrototypeText: " + docClone.getClass().getSimpleName());
	}
}
