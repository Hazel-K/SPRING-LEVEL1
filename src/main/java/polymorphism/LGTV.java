package polymorphism;

public class LGTV implements Tv{
	private Speaker speaker;
	
	
	public void setSpeaker(Speaker speaker) {
		this.speaker = speaker;
	}
	

	public LGTV() {
		System.out.println("LGTV 객체화");
	}
	
	public LGTV(Speaker speaker) {
		this.speaker = speaker;
	}
	
	public LGTV(Speaker speaker, int a) { // String이랑 같이 있으면 String이 생성됨
		this.speaker = speaker;
		System.out.println("개수 : " + a);
	}
	
	@Override
	public void powerOn() {
		System.out.println("LGTV --- 전원 켠다.");
	}
	@Override
	public void powerOff() {
		System.out.println("LGTV --- 전원 끈다.");
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
