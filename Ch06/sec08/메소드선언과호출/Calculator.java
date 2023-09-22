package Ch06.sec08.메소드선언과호출;

public class Calculator {
	// 리턴값이 없는 메소드 선언
	void powerOn() {
		System.out.println("전원을 켭니다.");
	}
	void powerOff() {
		System.out.println("전원을 끕니다.");
	}
	
	// 호출 시 두 정수 값을 전달받고, 호출한 곳으로 결과값 리턴하는 메소드 선언
	int plus(int x, int y) {
		int result = x + y;
		return result;
	}
	double divide(int x, int y) {
		double result = (double) x / (double) y;
		return result;
	}
	
}
// 메소드 선언 : 리턴타입 메소드명 (매개변수, ...) {실행 블록}
// 리턴 타입 : 메소드가 실행한 후 호출한 곳으로 전달하는 결과값의 타입
// 리턴값이 없으면 void로 작성
// 메소드명 : 첫 문자를 소문자로 시작, 캐멀 스타일
// 매개변수 : 메소드를 호출할 때 전달한 매개값을 받기 위해 사용
// 실행블록 : 메소드 호출 시 실행되는 부분