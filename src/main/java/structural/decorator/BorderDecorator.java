package structural.decorator;

public class BorderDecorator extends Decorator {

	public BorderDecorator(IWindow window) {
		super(window);
	}

	@Override
	public void draw() {
		window.draw();
		drawBorder();
	}

	@Override
	public void resize() {
		window.resize();
		drawBorder();
	}

	public void drawBorder() {
		System.out.println("Add draw border operation");
	}

}
