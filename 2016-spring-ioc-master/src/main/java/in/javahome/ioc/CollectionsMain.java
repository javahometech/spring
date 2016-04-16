package in.javahome.ioc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CollectionsMain {
	public static void main(String[] args) {
		ApplicationContext context1 = new ClassPathXmlApplicationContext("javahome-ioc.xml");
		
		College c = context1.getBean(College.class);
		c.showDetails();
	}
}
