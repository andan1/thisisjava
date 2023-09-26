package Ch08.sec02.인터페이스와구현클래스선언;

public class Television implements RemoteControl {
	@Override
	public void turnOn() {
		System.out.println("TV를 켭니다.");
	}
}
