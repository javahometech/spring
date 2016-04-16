package in.javahome.ioc;

import org.springframework.stereotype.Component;

@Component
public class Author {
	void info(){
		System.out.println(" Name ->Kathy Sierra");
		System.out.println("Mail-->kathy@sun.com");
		System.out.println("Experience -> 25 yrs");
	}
}
