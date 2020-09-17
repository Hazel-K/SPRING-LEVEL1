package polymorphism;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("tv") // 빈 등록
public class LGTV implements Tv{
	@Autowired // 중복 불가, 자리에 들어갈 bean이 있으면 자동으로 인식
	@Qualifier("tmaxSpeaker")
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
