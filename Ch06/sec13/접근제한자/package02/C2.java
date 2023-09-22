package Ch06.sec13.접근제한자.package02;

import Ch06.sec13.접근제한자.package01.A2;

public class C2 {
	public C2() {
		// 객체 생성
		A2 a = new A2();
		
		// 필드값 변경
		a.field1 = 1;
		// a.field2 = 1;	-> default 필드 접근 불가
		// a.field3 = 1;	-> private 필드 접근 불가
		
		// 메소드 호출
		a.method1();
		// a.method2();		-> default 메소드 접근 불가
		// a.method3();		-> private 메소드 접근 불가
	}
}
