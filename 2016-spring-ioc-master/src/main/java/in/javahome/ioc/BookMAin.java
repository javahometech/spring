package in.javahome.ioc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BookMAin {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("javahome-ioc.xml");
		Book book = context.getBean(Book.class);
		book.info();
	}
}
