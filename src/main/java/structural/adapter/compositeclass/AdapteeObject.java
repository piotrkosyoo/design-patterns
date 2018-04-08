package structural.adapter.compositeclass;

public class AdapteeObject implements Adaptee {

	@Override
	public void oldSpecificRequest(Object data) {
		System.out.println("oldSpecificRequest, todo old things");
	}

}
