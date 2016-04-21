package in.javahome.springmvc.controller;

import java.sql.SQLException;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class GlobalExceptionHandler {
	@ExceptionHandler(value=Exception.class)
	public String handelException(Exception e){
		e.printStackTrace();
		return "error.jsp";
	}
	
	@ExceptionHandler(value=SQLException.class)
	public String handelSQLException(Exception e){
		e.printStackTrace();
		return "sqlError.jsp";
	}
}