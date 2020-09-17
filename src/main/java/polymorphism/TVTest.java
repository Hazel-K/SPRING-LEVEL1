package polymorphism;

public class TVTest {
	
	public static void main(String[] args) {
		BeanFactory bean = new BeanFactory();
		
		Tv tv = (Tv)bean.getBean(args[0]);
		tv.powerOn();
		tv.volumeUp();
		tv.volumeDown();
		tv.powerOff();
	}
	
}
