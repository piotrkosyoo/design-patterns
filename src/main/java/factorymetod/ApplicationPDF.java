package factorymetod;

import factorymetod.product.Document;
import factorymetod.product.PDFDocument;

public class ApplicationPDF extends Application {

	@Override
	public Document createDocument() {
		System.out.println("CreateDocument ApplicationPDF");
		return new PDFDocument();
	}

}
