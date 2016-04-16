package in.javahome.ioc.pojo;

import org.springframework.stereotype.Component;

@Component
public class Welcome {
	public void hello(){
		System.out.println("Welcome to spring annotations");
	}
}
