package Ch08.sec02.인터페이스와구현클래스선언;

public class RemoteControlExample {

	public static void main(String[] args) {
		RemoteControl rc;
		rc = new Television();
		rc.turnOn();
		
		rc = new Audio();
		rc.turnOn();
	}

}
// 인터페이스도 하나의 타입이므로 변수의 타입으로 사용할 수 있다
// null을 대입 가능