package abstractfactory.factory;

import abstractfactory.products.Brand;

public final class FactorySingleton {

	private static AbstractFactory bmw;

	private static AbstractFactory mercedes;

	private static AbstractFactory instanceOfBMWFacotry() {
		if (bmw == null) {
			bmw = new BMWFactory();
		}
		return bmw;
	}

	private static AbstractFactory instanceOfMercedesFacotry() {
		if (mercedes == null) {
			mercedes = new MercedesFactory();
		}
		return mercedes;
	}

	public static AbstractFactory getFactory(Brand brand) {
		switch (brand) {
		case BMW:
			return FactorySingleton.instanceOfBMWFacotry();
		case MERCEDES:
			return FactorySingleton.instanceOfMercedesFacotry();
		default:
			throw new RuntimeException("Error init factory");
		}
	}
}
