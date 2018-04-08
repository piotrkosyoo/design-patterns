package construction.prototyp;

public class Client {

	public Document prototype;

	public Client(Document prototype) {
		this.prototype = prototype;
	}

	public Document makeDocument() {
		return (Document) prototype.clone();
	}
}
