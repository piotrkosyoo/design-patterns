package structural.adapter.compositeclass;

/**
 * Composite (object) adapter
 */
public class Adapter implements Target {

	private Adaptee adaptee;

	public Adapter(Adaptee adaptee) {
		this.adaptee = adaptee;
	}

	@Override
	public void newRequaiments() {
		System.out.println("todo something new things");
		adaptee.oldSpecificRequest("");
	}

}
