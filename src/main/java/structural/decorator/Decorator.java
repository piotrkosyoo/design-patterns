package structural.decorator;

public abstract class Decorator implements IWindow {
	
	protected IWindow window;
	
	public Decorator(IWindow window) {
		this.window = window;
	}
}
