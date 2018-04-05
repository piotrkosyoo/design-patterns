package abstractfactory.factory;

import abstractfactory.products.BikeTypBMW;
import abstractfactory.products.BikeType;
import abstractfactory.products.CarType;
import abstractfactory.products.CarTypeBMW;

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
