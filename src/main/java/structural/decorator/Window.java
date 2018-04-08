package structural.decorator;

public class Window implements IWindow {

	@Override
	public void draw() {
		System.out.println("Draw window");
	}

	@Override
	public void resize() {
		System.out.println("Resize window");
	}

}
