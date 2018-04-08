package construction.factorymetod;

import construction.factorymetod.product.Document;
import construction.factorymetod.product.PDFDocument;

public class ApplicationPDF extends Application {

	@Override
	public Document createDocument() {
		System.out.println("CreateDocument ApplicationPDF");
		return new PDFDocument();
	}

}
