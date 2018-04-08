package construction.abstractfactory;

import org.junit.Test;

import construction.abstractfactory.factory.AbstractFactory;
import construction.abstractfactory.products.Brand;

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
