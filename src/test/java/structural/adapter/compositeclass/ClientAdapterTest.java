package structural.adapter.compositeclass;

import org.junit.Test;

public class ClientAdapterTest {

	@Test
	public void testClient() {
		Adaptee adaptee = new AdapteeObject();
		Adapter adapter = new Adapter(adaptee);
		adapter.newRequaiments();
	}
}
