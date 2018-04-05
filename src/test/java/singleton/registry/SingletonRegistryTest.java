package singleton.registry;

import org.junit.Assert;
import org.junit.Test;

public class SingletonRegistryTest {

	@Test
	public void test() {
		Factory factoryDoc = SingletonRegistry.lookup("DocumentFactory");
		Factory factoryDoc2 = SingletonRegistry.lookup("DocumentFactory");
		factoryDoc.name();
		
		Assert.assertEquals(factoryDoc, factoryDoc2);
		
		Factory factoryWin = (WindowFactory) SingletonRegistry.lookup("WindowFactory");
		Factory factoryWin2 = (WindowFactory) SingletonRegistry.lookup("WindowFactory");
		factoryWin.name();
		
		Assert.assertEquals(factoryWin, factoryWin2);
	}
}
