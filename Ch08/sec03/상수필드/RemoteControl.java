package Ch08.sec03.상수필드;

public interface RemoteControl {
	int MAX_VOLUME = 10;
	int MIN_VOLUME = 0;
}
// 인터페이스에 선언된 필드는 모두 public static final 특성을 갖기 때문에
// 생략하더라도 컴파일 과정에서 붙게 된다