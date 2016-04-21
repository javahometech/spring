package in.javahome.springmvc.view;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.springframework.web.servlet.view.document.AbstractXlsView;

public class StudentExcelView extends AbstractXlsView {

	@Override
	protected void buildExcelDocument(Map<String, Object> map, Workbook book, HttpServletRequest req,
			HttpServletResponse resp) throws Exception {
		Sheet sheet = book.createSheet("JavaHome-Students");
		Row header = sheet.createRow(0);
		header.createCell(0).setCellValue("Name");
		header.createCell(1).setCellValue("Phone");
		for (int i = 1; i <= 50; i++) {
			Row dataRow = sheet.createRow(i);
			dataRow.createCell(0).setCellValue("Name-" + i);
			dataRow.createCell(1).setCellValue("Phone-" + i);
		}

	}

}
