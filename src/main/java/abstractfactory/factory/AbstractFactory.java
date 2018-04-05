package abstractfactory.factory;

import abstractfactory.products.BikeType;
import abstractfactory.products.CarType;

public abstract class AbstractFactory {
		
	public static AbstractFactory getFactory(Brand brand) {
		return FactorySingleton.getFactory(brand);
	}

	public abstract BikeType createBike();
	public abstract CarType createCar();
	
}
