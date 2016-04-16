package in.javahome.ioc;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class LifeCycleMain {
	public static void main(String[] args) {
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("javahome-ioc.xml");
		context.registerShutdownHook();

		LifeCycleBean bean = context.getBean(LifeCycleBean.class);
		bean.myService();
		bean.myService();
		bean.myService();
		bean.myService();
		bean.myService();
		
	}
}
