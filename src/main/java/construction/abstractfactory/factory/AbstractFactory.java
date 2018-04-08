package construction.abstractfactory.factory;

import construction.abstractfactory.products.BikeType;
import construction.abstractfactory.products.Brand;
import construction.abstractfactory.products.CarType;

public abstract class AbstractFactory {
		
	public static AbstractFactory getFactory(Brand brand) {
		return FactorySingleton.getFactory(brand);
	}

	public abstract BikeType createBike();
	public abstract CarType createCar();
	
}
