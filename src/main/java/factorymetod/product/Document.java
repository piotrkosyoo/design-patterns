package factorymetod.product;

public abstract class Document {

	public abstract Document open();

	public abstract void close();

	public void save() {
		System.out.println("Save document type: " + this.getClass().getSimpleName());
	}

	public void revert() {
		System.out.println("Revert document type: " + this.getClass().getSimpleName());
	}
	
	public void remove() {
		System.out.println("Remove document type: " + this.getClass().getSimpleName());
	}
}
