package in.javahome.ioc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class WelcomeTest {
public static void main(String[] args) {
	ApplicationContext context = new AnnotationConfigApplicationContext(MyIOC.class);
	Car c = context.getBean(Car.class);
	c.start();
	c.drive();
	c.stop();
	
}
}
