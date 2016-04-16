package in.javahome.ioc;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component(value="engine")
@Scope(value="prototype")
public class Engine {
	
  void start(){
	  System.out.println("Engine started ");
  }
  void stop(){
	  System.out.println("Engine stopped ");
  }
}
