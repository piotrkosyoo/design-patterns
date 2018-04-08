package structural.adapter.inherit;

import org.junit.Test;

public class ClientAdapterTest {

	@Test
	public void testClient() {
		AdapterInheritAdaptee adapter = new AdapterInheritAdaptee();
		adapter.newRequaiments();
	}
}
