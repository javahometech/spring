package in.javahome.springmvc.view;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.view.document.AbstractPdfView;

import com.lowagie.text.Document;
import com.lowagie.text.pdf.PdfPTable;
import com.lowagie.text.pdf.PdfWriter;

public class StudentPDFView extends AbstractPdfView {
	@Override
	protected void buildPdfDocument(Map<String, Object> arg0, Document document, PdfWriter arg2,
			HttpServletRequest arg3, HttpServletResponse arg4) throws Exception {
		PdfPTable table = new PdfPTable(2);
        table.addCell("Name");
        table.addCell("Phone");
        
        for (int i = 0; i <50; i++) {
        	table.addCell("Name-"+i);
        	table.addCell("Phone-"+i);
		}
        
        document.add(table);
	}
}
