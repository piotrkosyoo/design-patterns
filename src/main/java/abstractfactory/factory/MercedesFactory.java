package abstractfactory.factory;

import abstractfactory.products.BikeType;
import abstractfactory.products.BikeTypeMercedes;
import abstractfactory.products.CarType;
import abstractfactory.products.CarTypeMercedes;

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
