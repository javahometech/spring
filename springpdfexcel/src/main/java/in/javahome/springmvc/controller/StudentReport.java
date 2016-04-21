package in.javahome.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.View;

import in.javahome.springmvc.view.StudentExcelView;
import in.javahome.springmvc.view.StudentPDFView;

@Controller
public class StudentReport {
	@RequestMapping(value = "/excel")
	public View excelReport() {
		
		return new StudentExcelView();
	}
	
	@RequestMapping(value = "/pdf")
	public View pdfReport() {
		
		return new StudentPDFView();
	}
}
