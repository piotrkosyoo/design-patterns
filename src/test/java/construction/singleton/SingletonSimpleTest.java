package construction.singleton;

import org.junit.Test;

public class SingletonSimpleTest {
	
	@Test
	public void test() {
		SingletonSimple singleton = SingletonSimple.getInstance();
		singleton.someTest();
		singleton = SingletonSimple.getInstance();
		singleton.someTest();
	}

}
