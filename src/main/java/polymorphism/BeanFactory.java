package polymorphism;

public class BeanFactory {
	public Object getBean(String beanName) {
		switch(beanName) {
		case "samsung":
			return new SamsungTV();
		case "LG":
			return new LGTV();
		}
		return null;
	}
}
