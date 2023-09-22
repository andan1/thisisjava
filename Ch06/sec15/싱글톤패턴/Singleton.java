package Ch06.sec15.싱글톤패턴;

public class Singleton {
	// private 접근 권한을 갖는 정적 필드 선언과 초기화
	private static Singleton singleton = new Singleton();
	
	// private 접근 권한을 갖는 생성자 선언
	private Singleton() {
	}
	
	// public 접근 권한을 갖는 정적 메소드 선언
	public static Singleton getInstance() {
		return singleton;
	}
}
// 싱글톤 패턴 : 생성자를 private 접근 제한해서 외부에서 new 연산자로 생성자를 호출할 수 없도록 막는 것
// 생성자를 호출할 수 없으니 외부에서 마음대로 객체를 생성하는 것이 불가능
// 싱글톤 패턴은 정적 메소드를 통해 간접적으로 객체를 얻을 수 있다
// 외부에서 객체를 얻는 방법은 getInstance() 메소드 호출
// private 클래스() {}