package construction.abstractfactory.factory;

import construction.abstractfactory.products.BikeTypBMW;
import construction.abstractfactory.products.BikeType;
import construction.abstractfactory.products.CarType;
import construction.abstractfactory.products.CarTypeBMW;

public class BMWFactory extends AbstractFactory {

	@Override
	public BikeType createBike() {
		return new BikeTypBMW();
	}

	@Override
	public CarType createCar() {
		return new CarTypeBMW();
	}

}
