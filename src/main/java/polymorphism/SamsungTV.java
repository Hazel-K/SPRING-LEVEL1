package polymorphism;

public class SamsungTV implements Tv {
	private Speaker speaker;
	
	
	public void setSpeaker(Speaker speaker) {
		this.speaker = speaker;
	}
	
	
	public SamsungTV() {
		System.out.println("SamsungTV 객체화");
	}
	
	public SamsungTV(Speaker speaker) {
		this.speaker = speaker;
	}
	
	public SamsungTV(Speaker speaker, int a) { // String이랑 같이 있으면 String이 생성됨
		this.speaker = speaker;
		System.out.println("개수 : " + a);
	}
	
	@Override
	public void powerOn() {
		System.out.println("SamsungTV --- 전원 켠다.");
	}
	@Override
	public void powerOff() {
		System.out.println("SamsungTV --- 전원 끈다.");
	}
	@Override
	public void volumeUp() {
		speaker.volumeUp();
	}
	@Override
	public void volumeDown() {
		speaker.volumeDown();
	}
}
