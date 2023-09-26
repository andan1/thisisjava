package Ch08.sec04.추상메소드;

public interface RemoteControl {
	int MAX_VOLUME = 10;
	int MIN_VOLUME = 0;
	
	void turnOn();
	void turnOff();
	void setVolume(int volume);
}
// 인터페이스는 추상메소드를 멤버로 가질 수 있다
// 추상메소드 : 리턴타입, 메소드명, 매개변수만 기술되고 중괄호를 붙이지 않는 메소드
// public abstract는 생략 가능