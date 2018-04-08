package structural.decorator;

public class ScrollWindow extends Decorator {

	public ScrollWindow(IWindow window) {
		super(window);
	}

	@Override
	public void draw() {
		window.draw();
		drawScroll();
	}

	@Override
	public void resize() {
		window.resize();
		drawScroll();
	}

	public void drawScroll() {
		System.out.println("Add scroll window listner operation");
	}
	
}
