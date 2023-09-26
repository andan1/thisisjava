package Ch09.sec02.인스턴스멤버클래스;

public class AExample {

	public static void main(String[] args) {
		A a = new A();
		
		A.B b = a.new B();
	}

}
// A 객체를 생성한 다음 B 객체를 생성해야함