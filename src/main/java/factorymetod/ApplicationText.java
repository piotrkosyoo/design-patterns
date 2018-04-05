package factorymetod;

import factorymetod.product.Document;
import factorymetod.product.TextDocument;

public class ApplicationText extends Application {

	@Override
	public Document createDocument() {
		System.out.println("CreateDocument ApplicationText");
		return new TextDocument();
	}
	
}
