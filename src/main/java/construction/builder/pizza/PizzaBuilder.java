package construction.builder.pizza;

public abstract class PizzaBuilder {
	
	protected Pizza pizza;

	public Pizza getPizza() {
		return pizza;
	}

	protected void createNewPizzaProduct() {
		pizza = new Pizza();
	}

	public abstract void buildDough();

	public abstract void buildSauce();

	public abstract void buildTopping();
}
