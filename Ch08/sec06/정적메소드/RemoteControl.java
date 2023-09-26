package Ch08.sec06.정적메소드;

public interface RemoteControl {
	int MAX_VOLUME = 10;
	int MIN_VOLUME = 0;
	
	void turnOn();
	void turnOff();
	void setVolume(int volume);
	
	default void setMute(boolean mute) {
		if (mute) {
			System.out.println("무음 처리합니다.");
			setVolume(MIN_VOLUME);
		} else {
			System.out.println("무음 해제합니다.");
		}
	}
	static void changeBattery() {
		System.out.println("리모콘 건전지를 교환합니다.");
	}
}
// 인터페이스는 정적 메소드도 선언이 가능
// 추상메소드와 디폴트메소드는 구현 객체가 필요하지만
// 정적메소드는 인터페이스만으로 호출 가능