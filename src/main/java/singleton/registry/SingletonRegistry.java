package singleton.registry;

import java.util.HashMap;
import java.util.Map;

public class SingletonRegistry {
	
	private static Map<String, Object> registry = new HashMap<>();
	
	private SingletonRegistry() {
		
	}
	
	static {
		register("DocumentFactory", new DocumentFactory());
		register("WindowFactory", new WindowFactory());
	}

	public static void register(String name, Object object) {
		if (!registry.containsValue(object) && !registry.containsKey(name)) {
			registry.put(name, object);
		}
	}
	
	public static Factory lookup(String name) {
		return (registry.containsKey(name)) ? (Factory)registry.get(name) : null;
	}
}
