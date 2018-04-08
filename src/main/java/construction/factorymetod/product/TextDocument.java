package construction.factorymetod.product;

public class TextDocument extends Document {

	@Override
	public Document open() {
		System.out.println("Open document type: " + this.getClass().getSimpleName());
		return this;
	}

	@Override
	public void close() {
		System.out.println("Close document type: " + this.getClass().getSimpleName());
	}

}
