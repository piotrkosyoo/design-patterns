package builder.pizza;

import org.junit.Test;

public class WaiterTest {

	@Test
	public void testPizzaHawaiianWaiter() {
		Waiter waiter = new Waiter(new HawaiianPizzaBuilder());
		waiter.constructPizza();
		Pizza pizza = waiter.getPizza();
	}

	@Test
	public void testPizzaSpicyWaiter() {
		Waiter waiter = new Waiter(new SpicyPizzaBuilder());
		waiter.constructPizza();
		Pizza pizza = waiter.getPizza();
	}

}
