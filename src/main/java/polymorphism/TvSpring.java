package polymorphism;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class TvSpring {
	
	public static void main(String[] args) {
		AbstractApplicationContext factory = new GenericXmlApplicationContext("applicationContext.xml");
		
		Tv tv = (Tv)factory.getBean("tv");
		tv.powerOn();
		tv.volumeUp();
		tv.volumeDown();
		tv.powerOff();
		
//		System.out.println("tv : " + tv );
//		Tv tv2 = (Tv)factory.getBean("tv");
//		System.out.println("tv2 : " + tv2);
	}

}
