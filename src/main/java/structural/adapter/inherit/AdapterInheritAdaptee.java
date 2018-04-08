package structural.adapter.inherit;

import structural.adapter.compositeclass.AdapteeObject;
import structural.adapter.compositeclass.Target;

/**
 * Class adapter
 */
public class AdapterInheritAdaptee extends AdapteeObject implements Target {

	@Override
	public void newRequaiments() {
		System.out.println("todo something new things");
		oldSpecificRequest("");
	}
}
