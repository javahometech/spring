package in.javahome.ioc;

import java.util.Set;

public class Car {
	public Car() {
		System.out.println("Car object created");
	}
	private Engine engine;
	private Set<String> tyres;
	
public void setTyres(Set<String> tyres) {
		this.tyres = tyres;
	}
	//	spring calls this method to inject engine object
	public void setEngine(Engine engine) {
		this.engine = engine;
	}
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
