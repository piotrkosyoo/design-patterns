package construction.abstractfactory.factory;

import construction.abstractfactory.products.BikeType;
import construction.abstractfactory.products.BikeTypeMercedes;
import construction.abstractfactory.products.CarType;
import construction.abstractfactory.products.CarTypeMercedes;

public class MercedesFactory extends AbstractFactory {

	@Override
	public BikeType createBike() {
		return new BikeTypeMercedes();
	}

	@Override
	public CarType createCar() {
		return new CarTypeMercedes();
	}
}
