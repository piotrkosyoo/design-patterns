package construction.singleton;

public class SingletonSimple {

	private static volatile SingletonSimple instance = null;

	private int counter = 0;

	private SingletonSimple() {
		System.out.println("Create Singleton");
		counter++;
	}

	public void someTest() {
		System.out.println("Counter :" + counter);
	}

	public static SingletonSimple getInstance() {
		if (instance == null) {
			synchronized (SingletonSimple.class) {
				if (instance == null) {
					instance = new SingletonSimple();
				}
			}
		}
		return instance;
	}
	
	
}
