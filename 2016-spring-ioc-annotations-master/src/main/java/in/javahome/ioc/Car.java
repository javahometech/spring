package in.javahome.ioc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Car {
	@Autowired
	@Qualifier(value="engine")
	private Engine engine;
	
	public void start(){
		engine.start();
		System.out.println("car started...");
	}
	public void drive(){
		System.out.println("car moving..");
	}
	public void stop(){
		engine.stop();
		System.out.println("car stopped..");
	}
}
