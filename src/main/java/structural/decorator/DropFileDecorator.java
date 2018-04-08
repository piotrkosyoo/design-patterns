package structural.decorator;

public class DropFileDecorator extends Decorator {

	public DropFileDecorator(IWindow window) {
		super(window);
	}

	@Override
	public void draw() {
		window.draw();
		dropFile();
	}

	@Override
	public void resize() {
		window.resize();
		dropFile();
	}
	
	public void dropFile() {
		System.out.println("Add drop file operation");
	}

}
