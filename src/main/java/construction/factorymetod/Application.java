package construction.factorymetod;

import java.util.ArrayList;
import java.util.List;

import construction.factorymetod.product.Document;

public abstract class Application {
	
	private List<Document> docs = new ArrayList<>();
	
	// this is a factory metod because this metod create objects
	// the type is outside
	public abstract Document createDocument();
	
	public Document newDocument() {
		System.out.println("New document " + this.getClass().getSimpleName());
		Document doc =  createDocument();
		docs.add(doc);
		return doc.open();
	}
	
	public Document openDocument() {
		System.out.println();
		System.out.println("Open document " + this.getClass().getSimpleName());
		Document doc =  createDocument();
		docs.add(doc);
		return doc.open();
	}
	
	public void removeDocument(Document doc) {
		System.out.println("Remove document " + this.getClass().getSimpleName());
		if (docs.contains(doc)) {
			docs.remove(doc);
			doc.remove();
		}
	}

}
