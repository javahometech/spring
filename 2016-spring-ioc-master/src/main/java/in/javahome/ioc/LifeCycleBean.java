package in.javahome.ioc;

public class LifeCycleBean {
	
	public void myInit(){
		System.out.println("initialize resources");
	}
	
	public void myService(){
		System.out.println("process requests");
	}
	
	public void myDestroy(){
		System.out.println("cleaning up resources");
	}
}
