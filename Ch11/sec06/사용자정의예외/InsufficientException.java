package Ch11.sec06.사용자정의예외;

public class InsufficientException extends Exception {
	public InsufficientException() {
	}
	
	public InsufficientException(String message) {
		super(message);
	}
}
// 사용자 정의 예외 : 일반예외나 실행예외로 선언 가능