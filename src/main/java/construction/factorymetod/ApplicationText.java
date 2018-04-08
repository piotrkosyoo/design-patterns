package construction.factorymetod;

import construction.factorymetod.product.Document;
import construction.factorymetod.product.TextDocument;

public class ApplicationText extends Application {

	@Override
	public Document createDocument() {
		System.out.println("CreateDocument ApplicationText");
		return new TextDocument();
	}
	
}
