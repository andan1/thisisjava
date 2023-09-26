package Ch09.sec02.인스턴스멤버클래스;

public class A1 {
	// 인스턴스 필드
	class B {
		// 인스턴스 필드
		int field1 = 1;
		// 정적 필드
		static int field2 = 2;
		
		// 생성자
		B() {
			System.out.println("B-생성자 실행");
		}
		
		// 인스턴스 메소드
		void method1() {
			System.out.println("B-method1 실행");
		}
		
		// 정적 메소드
		static void method2() {
			System.out.println("B-method2 실행");
		}
	
	}
	// 인스턴스 메소드
	void useB() {
		B b = new B();
		System.out.println(b.field1);
		b.method1();
		
		System.out.println(B.field2);
		B.method2();
	}
}
