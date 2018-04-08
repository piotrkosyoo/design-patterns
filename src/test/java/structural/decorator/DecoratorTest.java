package structural.decorator;

import org.junit.Test;

public class DecoratorTest {

	@Test
	public void test() {
		IWindow wn = new Window();
		wn.draw();
	}
	
	@Test
	public void testDecorator() {
		IWindow wn = new ScrollWindow(new BorderDecorator(new Window()));
		wn.draw();
	}
	
	@Test
	public void testDropFileWindowDecorator() {
		IWindow wn = new DropFileDecorator(new ScrollWindow(new BorderDecorator(new Window())));
		wn.draw();
	}

}
