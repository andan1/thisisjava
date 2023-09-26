package Ch08.sec05.디폴트메소드;

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
}
// 디폴트 메소드 : 구현 객체가 필요한 메소드
// 디폴트 메소드의 실행부는 상수필드를 읽거나 추상메소드 호출하는 코드를 작성할 수 있다
// 디폴트 메소드를 재정의할 때 public 붙이고 default 생략해야 함
// 인터페이스 내부에서 기본적인 구현을 제공할 수 있다