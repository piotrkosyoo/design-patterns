package abstractfactory;

import org.junit.Test;

import abstractfactory.factory.AbstractFactory;
import abstractfactory.factory.Brand;

public class AbstractFactoryTest {

	@Test
	public void BMWClient() {
		AbstractFactory factory = AbstractFactory.getFactory(Brand.BMW);
		factory.createCar().carType();
		factory.createBike().bikeType();
	}
	
	@Test
	public void MercedesClient() {
		AbstractFactory factory = AbstractFactory.getFactory(Brand.MERCEDES);
		factory.createCar().carType();
		factory.createBike().bikeType();
	}
}
